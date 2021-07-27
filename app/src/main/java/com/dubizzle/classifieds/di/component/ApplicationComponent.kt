package com.dubizzle.classifieds.di.component

import com.dubizzle.classifieds.di.module.DbModule
import com.dubizzle.classifieds.di.module.ViewModelModule
import com.dubizzle.core.di.module.application.RetrofitModule
import com.dubizzle.core.di.module.application.ApiModule
import com.dubizzle.core.di.module.application.ApplicationModule
import com.dubizzle.core.di.module.application.OkhttpModule
import com.dubizzle.data.di.RepositoryModule
import com.dubizzle.domain.di.UseCaseModule
import com.dubizzle.products.di.OnboardingViewModelModule

/****
 * Application component which loads all the Koin Modules
 * Author: Lajesh Dineshkumar
 *****/
object ApplicationComponent {
    fun loadAllModules(){
        RetrofitModule.load()
        OkhttpModule.load()
        RepositoryModule.load()
        UseCaseModule.load()
        ApiModule.load()
        ApplicationModule.load()
        ViewModelModule.load()
        OnboardingViewModelModule.load()
        DbModule.load()

    }
}