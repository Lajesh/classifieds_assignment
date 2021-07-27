package com.dubizzle.core.viewmodel;

import java.lang.System;

/**
 * **
 * Tool bar Property ViewModel
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "backButtonAction", "Lcom/dubizzle/core/arc/SingleLiveEvent;", "", "getBackButtonAction", "()Lcom/dubizzle/core/arc/SingleLiveEvent;", "closeButtonAction", "getCloseButtonAction", "showBack", "Landroidx/lifecycle/MutableLiveData;", "getShowBack", "()Landroidx/lifecycle/MutableLiveData;", "setShowBack", "(Landroidx/lifecycle/MutableLiveData;)V", "showClose", "getShowClose", "setShowClose", "toolbarTitle", "", "getToolbarTitle", "setToolbarTitle", "core_devDebug"})
public final class ToolbarPropertyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showBack;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showClose;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> toolbarTitle;
    @org.jetbrains.annotations.NotNull()
    private final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> closeButtonAction = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> backButtonAction = null;
    
    public ToolbarPropertyViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowBack() {
        return null;
    }
    
    public final void setShowBack(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowClose() {
        return null;
    }
    
    public final void setShowClose(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToolbarTitle() {
        return null;
    }
    
    public final void setToolbarTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> getCloseButtonAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> getBackButtonAction() {
        return null;
    }
}