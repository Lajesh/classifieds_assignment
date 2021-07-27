package com.dubizzle.classifieds.di

import com.dubizzle.core.di.module.application.ApiModule
import com.dubizzle.data.di.RepositoryModule
import com.dubizzle.domain.di.UseCaseModule

/****
 * Main Koin DI component which helps to configure
 * Mockwebserver, Usecase and repository
 * Author: Lajesh Dineshkumar
 *****/

fun configureTestAppComponent(baseApi: String) = listOf(
    mockwebserverDITest,
    configureNetworkModuleForTest(baseApi),
    ApiModule.apiModules,
    UseCaseModule.productsUsecasModule,
    RepositoryModule.repositoryModules
)