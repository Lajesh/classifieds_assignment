package com.dubizzle.imagen.common

/****
 * Configuration class
 * Author: Lajesh Dineshkumar
 * Created on: 7/27/21
 * Modified on: 7/27/21
 *****/
class Config {
    companion object {
        val maxMemory = Runtime.getRuntime().maxMemory() /1024
        val defaultCacheSize = (maxMemory /4).toInt()
    }
}