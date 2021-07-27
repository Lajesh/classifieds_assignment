package com.dubizzle.classifieds.di.module

import com.dubizzle.classifieds.presentation.view.MainViewModel
import com.dubizzle.core.viewmodel.SharedViewModel
import com.dubizzle.core.viewmodel.ToolbarPropertyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

/****
 * DI module which provides all the viewmodel instances
 * Author: Lajesh Dineshkumar
 *****/
object ViewModelModule {
    fun load() {
        loadKoinModules(module {
            viewModel {
                MainViewModel()
            }

            viewModel {
                ToolbarPropertyViewModel()
            }

            viewModel {
                SharedViewModel()
            }

        })
    }
}