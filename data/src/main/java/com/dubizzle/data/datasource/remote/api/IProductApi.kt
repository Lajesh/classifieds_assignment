package com.dubizzle.data.datasource.remote.api

import com.dubizzle.data.datasource.remote.dto.ProductsDto
import retrofit2.http.GET

/****
 * API endpoint of Authentication related service calls
 * Author: Lajesh Dineshkumar
 *****/
interface IProductApi {

    @GET("default/dynamodb-writer")
    suspend fun getProducts() : ProductsDto.ProductsListResponse
}