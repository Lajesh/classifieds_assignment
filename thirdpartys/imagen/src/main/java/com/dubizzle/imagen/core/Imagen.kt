package com.dubizzle.imagen.core

import android.content.Context
import android.graphics.Bitmap
import android.widget.ImageView
import com.dubizzle.imagen.cache.DiskCache
import com.dubizzle.imagen.cache.ImageCache
import com.dubizzle.imagen.cache.InMemoryCache
import com.dubizzle.imagen.common.Config
import com.dubizzle.imagen.common.Constants
import java.util.concurrent.Executors
import java.util.concurrent.Future

/****
 * The Image builder class to load an image into a bitmap
 * Author: Lajesh Dineshkumar
 * Company: Nagarro MENA
 * Email: lajesh.dineshkumar@nagarro.com
 * Created on: 7/27/21
 * Modified on: 7/27/21
 *****/
class Imagen private constructor(
    private val url: String,
    private val imageview: ImageView,
    private val placeHolder: Int?,
    private val context: Context,
    private val cacheStrategy: Int = 1
) {
    var cache: ImageCache = if (cacheStrategy == Constants.CachingStrategy.DISK) {
        DiskCache(context)
    } else {
        InMemoryCache(Config.defaultCacheSize)
    }
    private val executorService =
        Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
    private val mRunningDownloadList: HashMap<String, Future<Bitmap?>> = hashMapOf()

    fun displayImage() {
        var bitmap = cache.get(url)
        bitmap?.let {
            imageview.setImageBitmap(it)
            return
        }
            ?: run {
                imageview.tag = url
                if (placeHolder != null)
                    imageview.setImageResource(placeHolder)
                addDownloadImageTask(url, DownloadImageTask(url, imageview, cache))
            }

    }

    private fun addDownloadImageTask(url: String, downloadTask: DownloadTask<Bitmap?>) {
        mRunningDownloadList[url] = executorService.submit(downloadTask)
    }

    private fun clearcache() {
        cache.clear()
    }

    fun cancelTask(url: String) {
        synchronized(this) {
            mRunningDownloadList.forEach {
                if (it.key == url && !it.value.isDone)
                    it.value.cancel(true)
            }
        }
    }

    fun cancelAll() {
        synchronized(this) {
            mRunningDownloadList.forEach {
                if (!it.value.isDone)
                    it.value.cancel(true)
            }
            mRunningDownloadList.clear()
        }
    }

    data class Builder(
        var url: String? = "",
        var view: ImageView? = null,
        var placeHolder: Int? = null,
        var context: Context? = null,
        var cacheStrategy: Int? = 1
    ) {
        fun load(url: String) = apply { this.url = url }
        fun placeHolder(resId: Int) = apply { this.placeHolder = resId }
        fun context(context: Context) = apply { this.context = context }
        fun cachingStrategy(strategy: Int) = apply { this.cacheStrategy = strategy }
        fun into(view: ImageView): Imagen {
            this.view = view
            val imagen = Imagen(url.toString(), view, placeHolder, context!!, cacheStrategy!!)
            imagen.displayImage()
            return imagen
        }
    }
}