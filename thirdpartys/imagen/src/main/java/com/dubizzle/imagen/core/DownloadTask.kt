package com.dubizzle.imagen.core

import java.util.concurrent.Callable

/****
 * Download task interface
 * Author: Lajesh Dineshkumar
 * Created on: 7/27/21
 * Modified on: 7/27/21
 *****/
abstract class DownloadTask<T> : Callable<T> {
    abstract fun download(url: String): T
}