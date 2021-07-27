package com.dubizzle.core.di.module.application;

import java.lang.System;

/**
 * **
 * Retrofit Module
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dubizzle/core/di/module/application/RetrofitModule;", "", "()V", "retrofitModules", "Lorg/koin/core/module/Module;", "getGson", "Lcom/google/gson/Gson;", "getGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "load", "", "core_devDebug"})
public final class RetrofitModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.core.di.module.application.RetrofitModule INSTANCE = null;
    private static final org.koin.core.module.Module retrofitModules = null;
    
    private RetrofitModule() {
        super();
    }
    
    public final void load() {
    }
    
    private final retrofit2.converter.gson.GsonConverterFactory getGsonConverterFactory() {
        return null;
    }
    
    private final com.google.gson.Gson getGson() {
        return null;
    }
}