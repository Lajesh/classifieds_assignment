package com.dubizzle.domain.usecases.products

import com.dubizzle.domain.common.ResultState
import com.dubizzle.domain.entity.response.products.ProductsEntity
import com.dubizzle.domain.repository.IProductsRepository
import kotlinx.coroutines.flow.Flow

/*******
 * Implementation of products use case
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
class ProductsUseCaseImpl constructor(private val productsRepository: IProductsRepository) :
    IProductsUseCase {
    override fun getProducts(): Flow<ResultState<ProductsEntity.ProductsListResponse>> {
        return productsRepository.getProducts()
    }
}