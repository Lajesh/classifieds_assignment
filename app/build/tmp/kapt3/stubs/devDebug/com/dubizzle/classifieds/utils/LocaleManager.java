package com.dubizzle.classifieds.utils;

import java.lang.System;

/**
 * **
 * Localization manager class which handles the locale change within the application
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/dubizzle/classifieds/utils/LocaleManager;", "", "()V", "sharedPreference", "Landroid/content/SharedPreferences;", "getCurrentLanguage", "", "context", "Landroid/content/Context;", "getCurrentLocaleInfo", "Lcom/dubizzle/classifieds/utils/LocaleManager$LocaleInfo;", "getLanguageFromShortName", "fullName", "getLanguageFullName", "shortName", "getLocale", "isArabic", "", "notifyLanguageChange", "", "activity", "Landroid/app/Activity;", "persistLanguagePreference", "language", "setLocale", "setNewLocale", "updateCalligraphyViewPump", "updateResources", "LocaleInfo", "app_devDebug"})
public final class LocaleManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.classifieds.utils.LocaleManager INSTANCE = null;
    private static android.content.SharedPreferences sharedPreference;
    
    private LocaleManager() {
        super();
    }
    
    /**
     * This method sets the application locale based on device display language.
     * If the device display language is arabic/french and the app is opening for the first time,
     * then this method will update the resources with the current device language
     */
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context setLocale(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    /**
     * This method is used to set the new locale.
     * Say if you want to set the locale from UI, use this method
     * @param context : Activity Context
     * @param language: Language code of the selected language
     */
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context setNewLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    /**
     * This method will return the current language which is already set.
     * If not set, it will return english by default
     * @param context: Activity Context
     */
    private final java.lang.String getCurrentLanguage(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getLocale() {
        return null;
    }
    
    public final boolean isArabic() {
        return false;
    }
    
    /**
     * This method will saveClick the user selected language on shared preference
     * @param context : Activity Context
     * @param language: Language code
     */
    public final void persistLanguagePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    /**
     * This method will update the resources based on language code passed in.
     * @param context : Context
     * @param language: Language code selected
     */
    private final android.content.Context updateResources(android.content.Context context, java.lang.String language) {
        return null;
    }
    
    public final void notifyLanguageChange(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    private final void updateCalligraphyViewPump() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.classifieds.utils.LocaleManager.LocaleInfo getCurrentLocaleInfo(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.classifieds.utils.LocaleManager.LocaleInfo getLanguageFullName(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.classifieds.utils.LocaleManager.LocaleInfo getLanguageFromShortName(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/dubizzle/classifieds/utils/LocaleManager$LocaleInfo;", "", "localeShortName", "", "localeFullName", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocaleFullName", "()Ljava/lang/String;", "getLocaleShortName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_devDebug"})
    public static final class LocaleInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String localeShortName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String localeFullName = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.classifieds.utils.LocaleManager.LocaleInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String localeShortName, @org.jetbrains.annotations.Nullable()
        java.lang.String localeFullName) {
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
        
        public LocaleInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String localeShortName, @org.jetbrains.annotations.Nullable()
        java.lang.String localeFullName) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLocaleShortName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLocaleFullName() {
            return null;
        }
    }
}