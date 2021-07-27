package com.dubizzle.imagen.cache

import android.graphics.Bitmap

/****
 * Caching Interface
 * Author: Lajesh Dineshkumar
 * Created on: 7/27/21
 * Modified on: 7/27/21
 *****/
interface ImageCache {
    fun put(url: String, bitmap: Bitmap)
    fun get(url: String): Bitmap?
    fun clear()
}