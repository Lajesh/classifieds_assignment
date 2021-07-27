package com.dubizzle.products.common;

import java.lang.System;

/**
 * **
 * Keep all static binding adapters here
 * Author: Lajesh Dineshkumar
 * Created on: 7/27/21
 * Modified on: 7/27/21
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/dubizzle/products/common/BindingAdpaters;", "", "()V", "formatCreatedDate", "", "view", "Landroid/widget/TextView;", "uid", "", "formatReleaseDate", "date", "Ljava/util/Date;", "loadImageUrl", "Landroid/widget/ImageView;", "urls", "", "products_devDebug"})
public final class BindingAdpaters {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.products.common.BindingAdpaters INSTANCE = null;
    
    private BindingAdpaters() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadImage"})
    public static final void loadImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> urls) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat", "SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"releaseDate"})
    public static final void formatReleaseDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.util.Date date) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"uid"})
    public static final void formatCreatedDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String uid) {
    }
}