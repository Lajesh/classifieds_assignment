package com.dubizzle.data.datasource.remote.dto;

import java.lang.System;

/**
 * *****
 * Products DTO
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ProductsDto;", "", "()V", "Pagination", "Product", "ProductsListResponse", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$ProductsListResponse;", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Product;", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Pagination;", "data_debug"})
public abstract class ProductsDto {
    
    private ProductsDto() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$ProductsListResponse;", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto;", "products", "", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Product;", "pagination", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Pagination;", "(Ljava/util/List;Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Pagination;)V", "getPagination", "()Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Pagination;", "getProducts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_debug"})
    public static final class ProductsListResponse extends com.dubizzle.data.datasource.remote.dto.ProductsDto {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "results")
        private final java.util.List<com.dubizzle.data.datasource.remote.dto.ProductsDto.Product> products = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "pagination")
        private final com.dubizzle.data.datasource.remote.dto.ProductsDto.Pagination pagination = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ProductsDto.ProductsListResponse copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.dubizzle.data.datasource.remote.dto.ProductsDto.Product> products, @org.jetbrains.annotations.NotNull()
        com.dubizzle.data.datasource.remote.dto.ProductsDto.Pagination pagination) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductsListResponse(@org.jetbrains.annotations.NotNull()
        java.util.List<com.dubizzle.data.datasource.remote.dto.ProductsDto.Product> products, @org.jetbrains.annotations.NotNull()
        com.dubizzle.data.datasource.remote.dto.ProductsDto.Pagination pagination) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.dubizzle.data.datasource.remote.dto.ProductsDto.Product> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.dubizzle.data.datasource.remote.dto.ProductsDto.Product> getProducts() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ProductsDto.Pagination component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ProductsDto.Pagination getPagination() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u00c6\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Product;", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto;", "createdAt", "Ljava/util/Date;", "price", "", "uid", "name", "imageURLs", "", "thumbnailImageUrls", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCreatedAt", "()Ljava/util/Date;", "getImageURLs", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPrice", "getThumbnailImageUrls", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_debug"})
    public static final class Product extends com.dubizzle.data.datasource.remote.dto.ProductsDto {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "created_at")
        private final java.util.Date createdAt = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "price")
        private final java.lang.String price = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "uid")
        private final java.lang.String uid = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "name")
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "image_urls")
        private final java.util.List<java.lang.String> imageURLs = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "image_urls_thumbnails")
        private final java.util.List<java.lang.String> thumbnailImageUrls = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ProductsDto.Product copy(@org.jetbrains.annotations.Nullable()
        java.util.Date createdAt, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        java.lang.String uid, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> imageURLs, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> thumbnailImageUrls) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Product(@org.jetbrains.annotations.Nullable()
        java.util.Date createdAt, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        java.lang.String uid, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> imageURLs, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> thumbnailImageUrls) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getCreatedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUid() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getImageURLs() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getThumbnailImageUrls() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ProductsDto$Pagination;", "Lcom/dubizzle/data/datasource/remote/dto/ProductsDto;", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_debug"})
    public static final class Pagination extends com.dubizzle.data.datasource.remote.dto.ProductsDto {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "key")
        private final java.lang.String key = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ProductsDto.Pagination copy(@org.jetbrains.annotations.Nullable()
        java.lang.String key) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Pagination(@org.jetbrains.annotations.Nullable()
        java.lang.String key) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getKey() {
            return null;
        }
    }
}