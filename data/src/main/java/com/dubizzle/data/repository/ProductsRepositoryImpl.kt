package com.dubizzle.data.repository

import com.dubizzle.data.datasource.remote.api.IProductApi
import com.dubizzle.data.mapper.dtotoentity.map
import com.dubizzle.domain.common.ResultState
import com.dubizzle.domain.entity.response.products.ProductsEntity
import com.dubizzle.domain.repository.IProductsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/*******
 * ProductRepository Implementation
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
class ProductsRepositoryImpl(private val productsApi: IProductApi) : BaseRepositoryImpl(),
    IProductsRepository {
    override fun getProducts(): Flow<ResultState<ProductsEntity.ProductsListResponse>> = flow {
        emit(apiCall { productsApi.getProducts().map() })
    }

}