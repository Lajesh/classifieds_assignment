package com.dubizzle.data.datasource.remote.dto

import com.google.gson.annotations.SerializedName
import java.util.*

/*******
 * Products DTO
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
sealed class ProductsDto {
    data class ProductsListResponse(
        @SerializedName("results") val products: List<Product> = emptyList(),
        @SerializedName("pagination") val pagination: Pagination

    ) : ProductsDto()

    data class Product(
        @SerializedName("created_at") val createdAt: Date?,
        @SerializedName("price") val price: String?,
        @SerializedName("uid") val uid: String?,
        @SerializedName("name") val name: String?,
        @SerializedName("image_urls") val imageURLs: List<String?>,
        @SerializedName("image_urls_thumbnails") val thumbnailImageUrls: List<String?>
    ) : ProductsDto()

    data class Pagination(
        @SerializedName("key") val key: String?
    ) : ProductsDto()
}