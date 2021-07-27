package com.dubizzle.products.view.fragment.products

import android.os.Bundle
import android.view.View
import com.dubizzle.core.ui.base.BaseFragment
import com.dubizzle.products.R
import com.dubizzle.products.BR
import com.dubizzle.products.databinding.FragmentProductListingBinding

/****
 * ProductListingFragment
 * Author: Lajesh Dineshkumar
 *****/
class ProductListingFragment : BaseFragment<ProductListingViewModel, FragmentProductListingBinding>(
    ProductListingViewModel::class
) {
    override val layoutRes: Int
        get() = R.layout.fragment_product_listing
    override val bindingVariable: Int
        get() = BR.viewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.pullRefreshLayout.run {
            setOnRefreshListener {
                viewModel.isSwipeRefresh = true
                viewModel.getProducts()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        dataBinding.shimmerContainer.startShimmer()
    }
}