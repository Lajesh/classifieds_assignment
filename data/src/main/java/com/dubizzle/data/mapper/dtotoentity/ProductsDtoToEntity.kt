package com.dubizzle.data.mapper.dtotoentity

import com.dubizzle.data.datasource.remote.dto.ProductsDto
import com.dubizzle.domain.entity.response.products.ProductsEntity
import java.util.*
import kotlin.collections.ArrayList

/*******
 * KEEP all product DTO to entity mapping here
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/


fun ProductsDto.Product.map() = ProductsEntity.Product(
    createdAt = createdAt,
    price = price,
    uid = uid,
    name = name,
    imageURLs = imageURLs,
    thumbnailImageUrls = thumbnailImageUrls
)

fun ProductsDto.Pagination.map() = ProductsEntity.Pagination(
    key = key
)

fun List<ProductsDto.Product>.map(): List<ProductsEntity.Product> {
    val productsList = ArrayList<ProductsEntity.Product>()
    forEach { item ->
        productsList.add(
            ProductsEntity.Product(
                createdAt = item.createdAt,
                price = item.price,
                uid = item.uid,
                name = item.name?.capitalize(Locale.ROOT),
                imageURLs = item.imageURLs,
                thumbnailImageUrls = item.thumbnailImageUrls

            )
        )
    }
    return productsList
}


fun ProductsDto.ProductsListResponse.map() = ProductsEntity.ProductsListResponse(
    products = products.map(),
    pagination = pagination.map()

)