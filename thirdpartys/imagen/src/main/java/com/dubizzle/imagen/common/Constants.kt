package com.dubizzle.imagen.common

import androidx.annotation.IntDef
import com.dubizzle.imagen.common.Constants.CachingStrategy.Companion.DISK
import com.dubizzle.imagen.common.Constants.CachingStrategy.Companion.MEMORY

/****
 * Keep constants here
 * Author: Lajesh Dineshkumar
 * Created on: 7/27/21
 * Modified on: 7/27/21
 *****/

object Constants{
    @Retention(AnnotationRetention.SOURCE)
    @IntDef(DISK, MEMORY)
    annotation class CachingStrategy {
        companion object {
            const val DISK = 1
            const val MEMORY = 2
        }
    }

}

