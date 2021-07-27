package com.dubizzle.classifieds;

import java.lang.System;

/**
 * **
 * Application class
 * Author: Lajesh Dineshkumar
 */
@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dubizzle/classifieds/ClassifiedsApp;", "Landroid/app/Application;", "()V", "localeContext", "Landroid/content/Context;", "onCreate", "", "setLocaleContext", "context", "Companion", "app_devDebug"})
public final class ClassifiedsApp extends android.app.Application {
    private android.content.Context localeContext;
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.classifieds.ClassifiedsApp.Companion Companion = null;
    private static com.dubizzle.classifieds.ClassifiedsApp instance;
    private static boolean isAppVisible = false;
    
    public ClassifiedsApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void setLocaleContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/dubizzle/classifieds/ClassifiedsApp$Companion;", "", "()V", "instance", "Lcom/dubizzle/classifieds/ClassifiedsApp;", "isAppVisible", "", "applicationContext", "Landroid/content/Context;", "getInstance", "isApplicationVisible", "localeContext", "setAppVisible", "", "isVisible", "setInstance", "application", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context applicationContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context localeContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.classifieds.ClassifiedsApp getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.dubizzle.classifieds.ClassifiedsApp application) {
        }
        
        public final boolean isApplicationVisible() {
            return false;
        }
        
        public final void setAppVisible(boolean isVisible) {
        }
    }
}