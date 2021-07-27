package com.dubizzle.data.repository;

import java.lang.System;

/**
 * **
 * BaseRepositoryImpl
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ]\u0010\f\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015JI\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/dubizzle/data/repository/BaseRepositoryImpl;", "", "()V", "logFormatter", "", "apiCall", "Lcom/dubizzle/domain/common/ResultState;", "T", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apiCallIO", "timesValue", "", "initialDelay", "", "maxDelay", "factor", "", "block", "(IJJDLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apiCallRetry", "times", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getError", "Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$ErrorResponse;", "responseBody", "Lokhttp3/ResponseBody;", "handleError", "Lcom/dubizzle/domain/entity/common/ErrorEntity$Error;", "throwable", "", "data_debug"})
public abstract class BaseRepositoryImpl {
    private final java.lang.String logFormatter = "%s | %s";
    
    public BaseRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>java.lang.Object apiCall(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dubizzle.domain.common.ResultState<T>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>java.lang.Object apiCallRetry(int times, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dubizzle.domain.common.ResultState<T>> p2) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object apiCallIO(int timesValue, long initialDelay, long maxDelay, double factor, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, kotlin.coroutines.Continuation<? super T> p5) {
        return null;
    }
    
    private final com.dubizzle.domain.entity.common.ErrorEntity.Error handleError(java.lang.Throwable throwable) {
        return null;
    }
    
    /**
     * This method serializes the errorbody to ErrorDto class
     */
    private final com.dubizzle.data.datasource.remote.dto.ErrorDto.ErrorResponse getError(okhttp3.ResponseBody responseBody) {
        return null;
    }
}