package com.dubizzle.products.listeners;

import java.lang.System;

/**
 * *****
 * File Description
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dubizzle/products/listeners/ProductClickListener;", "", "select", "", "product", "Lcom/dubizzle/domain/entity/response/products/ProductsEntity$Product;", "products_devDebug"})
public abstract interface ProductClickListener {
    
    public abstract void select(@org.jetbrains.annotations.NotNull()
    com.dubizzle.domain.entity.response.products.ProductsEntity.Product product);
}