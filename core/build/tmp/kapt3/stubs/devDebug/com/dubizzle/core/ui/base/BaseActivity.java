package com.dubizzle.core.ui.base;

import java.lang.System;

/**
 * **
 * All the activity should be extended from this parent class.
 * All the common functionalities across activities should be kept here
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\rH\u0016J\b\u0010\'\u001a\u00020(H\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000)H$J\b\u0010*\u001a\u00020%H\u0002J\u0017\u0010+\u001a\u00020%2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010(\u00a2\u0006\u0002\u0010-J\b\u0010.\u001a\u00020%H\u0016J\u0012\u0010/\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u00020%2\u0006\u0010&\u001a\u00020\rH\u0016J\u0018\u00103\u001a\u00020%2\u0006\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020(J\u0015\u00107\u001a\u00020%2\b\u00108\u001a\u0004\u0018\u00010(\u00a2\u0006\u0002\u0010-R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000f8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\"\u00a8\u00069"}, d2 = {"Lcom/dubizzle/core/ui/base/BaseActivity;", "V", "Landroidx/lifecycle/ViewModel;", "D", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/dubizzle/core/listeners/BackButtonHandlerListener;", "clazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "backClickListenersList", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/dubizzle/core/listeners/BackPressListener;", "bindingVariable", "", "getBindingVariable", "()I", "dataBinding", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "layoutRes", "getLayoutRes", "toolbarModel", "Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;", "getToolbarModel", "()Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;", "toolbarModel$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModel$delegate", "addBackpressListener", "", "listner", "fragmentsBackKeyIntercept", "", "Ljava/lang/Class;", "initializeDataBinding", "logout", "showConfirm", "(Ljava/lang/Boolean;)V", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "removeBackpressListener", "setUpLocale", "lngCode", "", "isSelected", "showLoading", "it", "core_devDebug"})
public abstract class BaseActivity<V extends androidx.lifecycle.ViewModel, D extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity implements com.dubizzle.core.listeners.BackButtonHandlerListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy toolbarModel$delegate = null;
    public D dataBinding;
    private final java.util.ArrayList<java.lang.ref.WeakReference<com.dubizzle.core.listeners.BackPressListener>> backClickListenersList = null;
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<V> clazz) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final V getViewModel() {
        return null;
    }
    
    private final com.dubizzle.core.viewmodel.ToolbarPropertyViewModel getToolbarModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final D getDataBinding() {
        return null;
    }
    
    public final void setDataBinding(@org.jetbrains.annotations.NotNull()
    D p0) {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutRes();
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<V> getViewModel();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeDataBinding() {
    }
    
    public final void logout(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean showConfirm) {
    }
    
    /**
     * Showing progress bar over screen
     */
    public final void showLoading(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean it) {
    }
    
    public final void setUpLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String lngCode, boolean isSelected) {
    }
    
    /**
     * Methods which handles the hardware back button / navigation back view
     */
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    /**
     * Add the back navigation listener here.
     * Call this method from onAttach of your fragment
     * @param listner - back navigation listener
     */
    @java.lang.Override()
    public void addBackpressListener(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.listeners.BackPressListener listner) {
    }
    
    /**
     * remove the back navigation listener here.
     * Call this method from onDetach of your fragment
     * @param listner - back navigation listener
     */
    @java.lang.Override()
    public void removeBackpressListener(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.listeners.BackPressListener listner) {
    }
    
    /**
     * This method checks if any frgament is overriding the back button behavior or not
     * @return true/false
     */
    private final boolean fragmentsBackKeyIntercept() {
        return false;
    }
}