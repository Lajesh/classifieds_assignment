package com.dubizzle.domain.repository

import com.dubizzle.domain.common.ResultState
import com.dubizzle.domain.entity.response.products.ProductsEntity
import kotlinx.coroutines.flow.Flow

/*******
 * Abstraction of Products repository
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
interface IProductsRepository {
    fun getProducts() : Flow<ResultState<ProductsEntity.ProductsListResponse>>
}