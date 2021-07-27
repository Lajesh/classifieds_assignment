package com.dubizzle.core.viewmodel;

import java.lang.System;

/**
 * **
 * Shared view model for data sharing between fragments
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dubizzle/core/viewmodel/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "product", "Lcom/dubizzle/domain/entity/response/products/ProductsEntity$Product;", "getProduct", "()Lcom/dubizzle/domain/entity/response/products/ProductsEntity$Product;", "setProduct", "(Lcom/dubizzle/domain/entity/response/products/ProductsEntity$Product;)V", "core_devDebug"})
public class SharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.dubizzle.domain.entity.response.products.ProductsEntity.Product product;
    
    public SharedViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dubizzle.domain.entity.response.products.ProductsEntity.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.Nullable()
    com.dubizzle.domain.entity.response.products.ProductsEntity.Product p0) {
    }
}