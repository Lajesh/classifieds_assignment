package com.dubizzle.core.ui.base;

import java.lang.System;

/**
 * **
 * Parent for all the UI fragments. All the common things to be kept here
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0013\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nJ\u0010\u00100\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u000101J\n\u00102\u001a\u0004\u0018\u000103H\u0004J\b\u00104\u001a\u000205H\u0002J\u0012\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u0018H\u0016J\u0012\u0010=\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000108H\u0016J\"\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u000eH\u0016J&\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010I\u001a\u000205H\u0016J\b\u0010J\u001a\u000205H\u0016J\b\u0010K\u001a\u000205H\u0016J\u001a\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020D2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u000e\u0010N\u001a\u0002052\u0006\u0010O\u001a\u00020PJ\u0012\u0010Q\u001a\u0002052\b\u0010R\u001a\u0004\u0018\u000103H\u0014J\u0012\u0010S\u001a\u0002052\b\u0010T\u001a\u0004\u0018\u00010PH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0018X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001fX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010\'R\u0016\u0010(\u001a\u0004\u0018\u00010)X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001b\u0010,\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b-\u0010.\u00a8\u0006U"}, d2 = {"Lcom/dubizzle/core/ui/base/BaseFragment;", "V", "Landroidx/lifecycle/ViewModel;", "D", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/dubizzle/core/di/Injectable;", "Lcom/dubizzle/core/listeners/BackPressListener;", "clazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "backButtonHandler", "Lcom/dubizzle/core/listeners/BackButtonHandlerListener;", "bindingVariable", "", "getBindingVariable", "()I", "dataBinding", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "isBackDisabled", "", "()Z", "setBackDisabled", "(Z)V", "layoutRes", "getLayoutRes", "sharedModel", "Lcom/dubizzle/core/viewmodel/SharedViewModel;", "getSharedModel", "()Lcom/dubizzle/core/viewmodel/SharedViewModel;", "sharedModel$delegate", "Lkotlin/Lazy;", "sharedViewModel", "getSharedViewModel", "setSharedViewModel", "(Lcom/dubizzle/core/viewmodel/SharedViewModel;)V", "subscriptionContract", "Lcom/dubizzle/core/contract/SubscriptionContract;", "getSubscriptionContract", "()Lcom/dubizzle/core/contract/SubscriptionContract;", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModel$delegate", "getBaseActivity", "Lcom/dubizzle/core/ui/base/BaseActivity;", "getToolbarProperty", "Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;", "initViewSubscriptions", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onBackPress", "onCreate", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onPause", "onResume", "onViewCreated", "view", "setAppLocale", "lngCode", "", "setupToolbar", "toolbarProperty", "showErrorDialog", "message", "core_devDebug"})
public abstract class BaseFragment<V extends androidx.lifecycle.ViewModel, D extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment implements com.dubizzle.core.di.Injectable, com.dubizzle.core.listeners.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy sharedModel$delegate = null;
    public com.dubizzle.core.viewmodel.SharedViewModel sharedViewModel;
    protected D dataBinding;
    @org.jetbrains.annotations.Nullable()
    private final com.dubizzle.core.contract.SubscriptionContract subscriptionContract = null;
    private boolean isBackDisabled = false;
    private com.dubizzle.core.listeners.BackButtonHandlerListener backButtonHandler;
    
    public BaseFragment(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<V> clazz) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final V getViewModel() {
        return null;
    }
    
    private final com.dubizzle.core.viewmodel.SharedViewModel getSharedModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.dubizzle.core.viewmodel.SharedViewModel getSharedViewModel() {
        return null;
    }
    
    public void setSharedViewModel(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.viewmodel.SharedViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final D getDataBinding() {
        return null;
    }
    
    protected final void setDataBinding(@org.jetbrains.annotations.NotNull()
    D p0) {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutRes();
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.Nullable()
    public com.dubizzle.core.contract.SubscriptionContract getSubscriptionContract() {
        return null;
    }
    
    protected final boolean isBackDisabled() {
        return false;
    }
    
    protected final void setBackDisabled(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Method to override the back press behaviour on indivitual fragment
     */
    @java.lang.Override()
    public boolean onBackPress() {
        return false;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewSubscriptions() {
    }
    
    /**
     * Method to show service related error messages
     */
    private final void showErrorDialog(java.lang.String message) {
    }
    
    protected void setupToolbar(@org.jetbrains.annotations.Nullable()
    com.dubizzle.core.viewmodel.ToolbarPropertyViewModel toolbarProperty) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.dubizzle.core.viewmodel.ToolbarPropertyViewModel getToolbarProperty() {
        return null;
    }
    
    /**
     * setting up locally
     */
    public final void setAppLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String lngCode) {
    }
    
    /**
     * Return the base activity
     */
    @org.jetbrains.annotations.Nullable()
    public final com.dubizzle.core.ui.base.BaseActivity<?, ?> getBaseActivity() {
        return null;
    }
    
    /**
     * Setting the layer type to HARDWARE for better animation performance
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.animation.Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }
}