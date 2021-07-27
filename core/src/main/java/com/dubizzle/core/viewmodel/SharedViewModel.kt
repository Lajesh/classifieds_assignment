package com.dubizzle.core.viewmodel

import androidx.lifecycle.ViewModel
import com.dubizzle.domain.entity.response.products.ProductsEntity

/****
 * Shared view model for data sharing between fragments
 * Author: Lajesh Dineshkumar
 *****/
open class SharedViewModel : ViewModel() {

    var product: ProductsEntity.Product? = null

}