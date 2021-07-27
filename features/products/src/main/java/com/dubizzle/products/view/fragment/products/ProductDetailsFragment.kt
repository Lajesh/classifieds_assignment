package com.dubizzle.products.view.fragment.products

import com.dubizzle.core.ui.base.BaseFragment
import com.dubizzle.products.BR
import com.dubizzle.products.R
import com.dubizzle.products.databinding.FragmentProductDetailsBinding

/*******
 * ProductDetailsFragment
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
class ProductDetailsFragment :
    BaseFragment<ProductDetailsViewModel, FragmentProductDetailsBinding>(ProductDetailsViewModel::class) {
    override val layoutRes: Int
        get() = R.layout.fragment_product_details
    override val bindingVariable: Int
        get() = BR.viewModel
}