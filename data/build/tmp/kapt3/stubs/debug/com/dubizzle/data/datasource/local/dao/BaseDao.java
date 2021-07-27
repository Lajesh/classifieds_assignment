package com.dubizzle.data.datasource.local.dao;

import java.lang.System;

/**
 * **
 * All the DAO should be extended from this base class.
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/dubizzle/data/datasource/local/dao/BaseDao;", "T", "", "delete", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "obj", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Ljava/lang/Void;", "data_debug"})
public abstract interface BaseDao<T extends java.lang.Object> {
    
    /**
     * Insert an object in the database.
     *
     * @param obj the object to be inserted.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(T obj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    /**
     * Update an object from the database.
     *
     * @param obj the object to be updated
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(T obj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Void> p1);
    
    /**
     * Delete an object from the database
     *
     * @param obj the object to be deleted
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
}