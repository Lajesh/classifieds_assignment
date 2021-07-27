package com.dubizzle.products.di

import com.dubizzle.products.view.fragment.products.ProductDetailsViewModel
import com.dubizzle.products.view.fragment.products.ProductListingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

/****
 * File Description
 * Author: Lajesh Dineshkumar
 *****/
object OnboardingViewModelModule {
    fun load() {
        loadKoinModules(module {

            viewModel {
                ProductListingViewModel(get())
            }

            viewModel {
                ProductDetailsViewModel()
            }

        })
    }
}