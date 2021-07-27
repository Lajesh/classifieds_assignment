package com.dubizzle.products.listeners

import com.dubizzle.domain.entity.response.products.ProductsEntity

/*******
 * File Description
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
interface ProductClickListener {
    fun select(product: ProductsEntity.Product)
}