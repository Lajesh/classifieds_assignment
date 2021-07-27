package com.dubizzle.products.common

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.dubizzle.imagen.common.Constants
import com.dubizzle.imagen.core.Imagen
import com.dubizzle.products.R
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

/****
 * Keep all static binding adapters here
 * Author: Lajesh Dineshkumar
 * Created on: 7/27/21
 * Modified on: 7/27/21
 *****/
object BindingAdpaters {
    @JvmStatic
    @BindingAdapter("loadImage")
    fun loadImageUrl(view: ImageView, urls: List<String?>) {
        if (urls.isNotEmpty()) {
            if (!urls[0].isNullOrEmpty())
                Imagen.Builder().load(urls[0].toString())
                    .placeHolder(R.drawable.bg_placeholder)
                    .context(view.context)
                    .cachingStrategy(Constants.CachingStrategy.DISK)
                    .into(view)

        }
    }


    @SuppressLint("SimpleDateFormat", "SetTextI18n")
    @JvmStatic
    @BindingAdapter("releaseDate")
    fun formatReleaseDate(view: TextView, date: Date?) {
        val dateFormatter = SimpleDateFormat("yyyy-mm-dd hh:mm")
        try {
            view.text =
                view.context.getString(R.string.title_created_at) + dateFormatter.format(date)
        } catch (ex: Exception) {
            view.text = ""
        }
    }

    @SuppressLint("SetTextI18n")
    @JvmStatic
    @BindingAdapter("uid")
    fun formatCreatedDate(view: TextView, uid: String?) {
        view.text = view.context.getString(R.string.title_uid) + uid
    }
}