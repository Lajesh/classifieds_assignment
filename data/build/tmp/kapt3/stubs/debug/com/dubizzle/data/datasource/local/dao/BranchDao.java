package com.dubizzle.data.datasource.local.dao;

import java.lang.System;

/**
 * **
 * DAO for bank branches
 * Author: Lajesh Dineshkumar
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0003\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/dubizzle/data/datasource/local/dao/BranchDao;", "Lcom/dubizzle/data/datasource/local/dao/BaseDao;", "Lcom/dubizzle/data/datasource/local/entity/Branch;", "delete", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBranches", "", "insert", "", "obj", "(Lcom/dubizzle/data/datasource/local/entity/Branch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface BranchDao extends com.dubizzle.data.datasource.local.dao.BaseDao<com.dubizzle.data.datasource.local.entity.Branch> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM branches")
    public abstract java.lang.Object getBranches(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dubizzle.data.datasource.local.entity.Branch>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    @java.lang.Override()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.dubizzle.data.datasource.local.entity.Branch obj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM branches")
    @java.lang.Override()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
}