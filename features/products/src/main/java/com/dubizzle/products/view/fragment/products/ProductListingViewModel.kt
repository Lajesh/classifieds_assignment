package com.dubizzle.products.view.fragment.products

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.viewModelScope
import com.dubizzle.core.utils.NavigationCommand
import com.dubizzle.core.viewmodel.base.BaseViewModel
import com.dubizzle.domain.common.ResultState
import com.dubizzle.domain.entity.response.products.ProductsEntity
import com.dubizzle.domain.usecases.products.IProductsUseCase
import com.dubizzle.products.BR
import com.dubizzle.products.R
import com.dubizzle.products.listeners.ProductClickListener
import com.dubizzle.core.utils.idlingresource.EspressoIdlingResource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import me.tatarka.bindingcollectionadapter2.ItemBinding

/****
 * File Description
 * Author: Lajesh Dineshkumar
 *****/
class ProductListingViewModel constructor(
    private val productsUseCase: IProductsUseCase,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main
) : BaseViewModel(), ProductClickListener {

    var isSwipeRefresh : Boolean = false
    val productsList = ObservableArrayList<ProductsEntity.Product>()
    val itemBinding  :ItemBinding<ProductsEntity.Product> = ItemBinding.of<ProductsEntity.Product>(
        BR.itemViewModel,
        R.layout.item_layout_product
    ).bindExtra(BR.listener, this)

    init {
        getProducts()
    }

    fun getProducts(){
        EspressoIdlingResource.increment()
        productsList.clear()
        showLoading(true)
        viewModelScope.launch {
            productsUseCase.getProducts()
                .collect { state ->
                    when(state){
                        is ResultState.Success -> {
                           showLoading(false)
                           isSwipeRefresh = false
                           productsList.addAll(state.data.products)
                            EspressoIdlingResource.decrement()
                        }

                        is ResultState.Error -> {
                            setError(error = state.error)
                            showLoading(false)
                            isSwipeRefresh = false
                            EspressoIdlingResource.decrement()
                        }
                    }

                }
        }
    }



    override fun select(product: ProductsEntity.Product) {
        sharedViewModel.product = product
        navigationCommands.value = NavigationCommand.To(ProductListingFragmentDirections.actionListingToDetails())
    }
}