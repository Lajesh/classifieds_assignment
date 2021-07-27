package com.dubizzle.classifieds.di

import okhttp3.mockwebserver.MockWebServer
import org.koin.dsl.module

/****
 * Creates Mockwebserver instance for testing
 * Author: Lajesh Dineshkumar
 *****/

val mockwebserverDITest = module {
    factory {
        MockWebServer()
    }
}