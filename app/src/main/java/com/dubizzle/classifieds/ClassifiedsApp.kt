package com.dubizzle.classifieds

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.dubizzle.classifieds.di.AppInjector
import com.dubizzle.classifieds.di.component.ApplicationComponent.loadAllModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/****
 * Application class
 * Author: Lajesh Dineshkumar
 *****/
@SuppressLint("StaticFieldLeak")
class ClassifiedsApp : Application() {

    private var localeContext: Context? = null

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: ClassifiedsApp

        private var isAppVisible: Boolean = false

        fun applicationContext(): Context {
            return instance.applicationContext
        }

        fun localeContext(): Context {
            return instance.localeContext ?: instance.applicationContext
        }

        fun getInstance(): ClassifiedsApp {
            return instance
        }

        fun setInstance(application: ClassifiedsApp) {
            instance = application
        }

        fun isApplicationVisible(): Boolean {
            return isAppVisible
        }

        fun setAppVisible(isVisible: Boolean) {
            isAppVisible = isVisible
        }
    }

    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)

        startKoin {
            androidContext(this@ClassifiedsApp)
        }

        loadAllModules()
    }

    fun setLocaleContext(context: Context) {
        this.localeContext = context
    }
}