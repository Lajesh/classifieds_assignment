package com.dubizzle.core.di.module.application

import com.dubizzle.data.datasource.remote.api.IProductApi
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import retrofit2.Retrofit

/****
 * API Module ehich provides the instance of API Endpoints
 * Author: Lajesh Dineshkumar
 *****/
object ApiModule {
    fun load(){
        loadKoinModules(apiModules)
    }

    val apiModules = module {
        single {
            get<Retrofit>().create(IProductApi::class.java)
        }
    }
}