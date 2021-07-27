package com.dubizzle.domain.usecases.products

import com.dubizzle.domain.common.ResultState
import com.dubizzle.domain.entity.response.products.ProductsEntity
import com.dubizzle.domain.usecases.base.BaseUseCase
import kotlinx.coroutines.flow.Flow

/*******
 * Keep all products related usecases over here
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
interface IProductsUseCase : BaseUseCase {
    fun getProducts() : Flow<ResultState<ProductsEntity.ProductsListResponse>>
}