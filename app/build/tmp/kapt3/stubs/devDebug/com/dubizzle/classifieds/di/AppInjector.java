package com.dubizzle.classifieds.di;

import java.lang.System;

/**
 * Helper class to automatically inject fragments if they implement [Injectable].
 * Created by Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dubizzle/classifieds/di/AppInjector;", "", "()V", "paused", "", "resumed", "init", "", "ecommerceApp", "Lcom/dubizzle/classifieds/ClassifiedsApp;", "app_devDebug"})
public final class AppInjector {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.classifieds.di.AppInjector INSTANCE = null;
    private static int resumed = 0;
    private static int paused = 0;
    
    private AppInjector() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    com.dubizzle.classifieds.ClassifiedsApp ecommerceApp) {
    }
}