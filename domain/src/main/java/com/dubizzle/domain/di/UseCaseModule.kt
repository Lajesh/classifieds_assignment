package com.dubizzle.domain.di

import com.dubizzle.domain.usecases.products.IProductsUseCase
import com.dubizzle.domain.usecases.products.ProductsUseCaseImpl
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module


/****
 * Module which provides the factory instance of Usecase
 * Author: Lajesh Dineshkumar
 *****/
object UseCaseModule {
    fun load(){
        loadKoinModules(productsUsecasModule)
    }

    val productsUsecasModule = module {
        factory<IProductsUseCase> { ProductsUseCaseImpl(productsRepository = get()) }
    }
}