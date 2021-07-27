package com.dubizzle.domain.entity.response.products

import java.util.*

/*******
 * Products Entity
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
sealed class ProductsEntity {

    data class ProductsListResponse(
        val products: List<Product> = emptyList(),
        val pagination: Pagination
    ) : ProductsEntity()

    data class Product(
        val createdAt: Date?,
        val price: String?,
        val uid: String?,
        val name: String?,
        val imageURLs: List<String?>,
        val thumbnailImageUrls: List<String?>
    ) : ProductsEntity()

    data class Pagination(
        val key: String?
    ) : ProductsEntity()


}
