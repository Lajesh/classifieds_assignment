package com.dubizzle.products.view.fragment.products;

import java.lang.System;

/**
 * **
 * File Description
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/dubizzle/products/view/fragment/products/ProductListingViewModel;", "Lcom/dubizzle/core/viewmodel/base/BaseViewModel;", "Lcom/dubizzle/products/listeners/ProductClickListener;", "productsUseCase", "Lcom/dubizzle/domain/usecases/products/IProductsUseCase;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/dubizzle/domain/usecases/products/IProductsUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "isSwipeRefresh", "", "()Z", "setSwipeRefresh", "(Z)V", "itemBinding", "Lme/tatarka/bindingcollectionadapter2/ItemBinding;", "Lcom/dubizzle/domain/entity/response/products/ProductsEntity$Product;", "getItemBinding", "()Lme/tatarka/bindingcollectionadapter2/ItemBinding;", "productsList", "Landroidx/databinding/ObservableArrayList;", "getProductsList", "()Landroidx/databinding/ObservableArrayList;", "getProducts", "", "select", "product", "products_devDebug"})
public final class ProductListingViewModel extends com.dubizzle.core.viewmodel.base.BaseViewModel implements com.dubizzle.products.listeners.ProductClickListener {
    private final com.dubizzle.domain.usecases.products.IProductsUseCase productsUseCase = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private boolean isSwipeRefresh = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableArrayList<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> productsList = null;
    @org.jetbrains.annotations.NotNull()
    private final me.tatarka.bindingcollectionadapter2.ItemBinding<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> itemBinding = null;
    
    public ProductListingViewModel(@org.jetbrains.annotations.NotNull()
    com.dubizzle.domain.usecases.products.IProductsUseCase productsUseCase, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    public final boolean isSwipeRefresh() {
        return false;
    }
    
    public final void setSwipeRefresh(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> getProductsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.tatarka.bindingcollectionadapter2.ItemBinding<com.dubizzle.domain.entity.response.products.ProductsEntity.Product> getItemBinding() {
        return null;
    }
    
    public final void getProducts() {
    }
    
    @java.lang.Override()
    public void select(@org.jetbrains.annotations.NotNull()
    com.dubizzle.domain.entity.response.products.ProductsEntity.Product product) {
    }
}