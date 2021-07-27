package com.dubizzle.data.di

import com.dubizzle.data.repository.ProductsRepositoryImpl
import com.dubizzle.domain.repository.IProductsRepository
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

/****
 * DI module which provides the factory repository instances
 * Author: Lajesh Dineshkumar
 *****/
object RepositoryModule {
    fun load() {
        loadKoinModules(repositoryModules)
    }

    val repositoryModules = module {
        factory<IProductsRepository>{ ProductsRepositoryImpl(productsApi = get()) }
    }
}