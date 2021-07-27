package com.dubizzle.data.repository;

import java.lang.System;

/**
 * *****
 * ProductRepository Implementation
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dubizzle/data/repository/ProductsRepositoryImpl;", "Lcom/dubizzle/data/repository/BaseRepositoryImpl;", "Lcom/dubizzle/domain/repository/IProductsRepository;", "productsApi", "Lcom/dubizzle/data/datasource/remote/api/IProductApi;", "(Lcom/dubizzle/data/datasource/remote/api/IProductApi;)V", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dubizzle/domain/common/ResultState;", "Lcom/dubizzle/domain/entity/response/products/ProductsEntity$ProductsListResponse;", "data_debug"})
public final class ProductsRepositoryImpl extends com.dubizzle.data.repository.BaseRepositoryImpl implements com.dubizzle.domain.repository.IProductsRepository {
    private final com.dubizzle.data.datasource.remote.api.IProductApi productsApi = null;
    
    public ProductsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.dubizzle.data.datasource.remote.api.IProductApi productsApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dubizzle.domain.common.ResultState<com.dubizzle.domain.entity.response.products.ProductsEntity.ProductsListResponse>> getProducts() {
        return null;
    }
}