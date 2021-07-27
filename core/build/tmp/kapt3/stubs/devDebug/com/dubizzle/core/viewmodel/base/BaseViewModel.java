package com.dubizzle.core.viewmodel.base;

import java.lang.System;

/**
 * **
 * Base view model. All the common implementation of viewmodel goes here
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J\u000e\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020.J\r\u0010/\u001a\u00020\'H\u0000\u00a2\u0006\u0002\b0J\u0015\u00101\u001a\u00020\'2\u0006\u00102\u001a\u000203H\u0000\u00a2\u0006\u0002\b4J\u000e\u00105\u001a\u00020\'2\u0006\u00106\u001a\u00020\u000bJ\u0010\u00107\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u00108\u001a\u00020\'2\b\u00109\u001a\u0004\u0018\u00010\bJ\u000e\u0010:\u001a\u00020\'2\u0006\u00106\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006;"}, d2 = {"Lcom/dubizzle/core/viewmodel/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "()V", "callbacks", "Landroidx/databinding/PropertyChangeRegistry;", "errorEvent", "Lcom/dubizzle/core/arc/SingleLiveEvent;", "Lcom/dubizzle/domain/entity/common/ErrorEntity$Error;", "hideKeyboard", "Landroidx/lifecycle/MutableLiveData;", "", "getHideKeyboard", "()Landroidx/lifecycle/MutableLiveData;", "isSharedViewModelInitialized", "()Z", "loadingEvent", "getLoadingEvent", "()Lcom/dubizzle/core/arc/SingleLiveEvent;", "logoutClickEvent", "getLogoutClickEvent", "setLogoutClickEvent", "(Lcom/dubizzle/core/arc/SingleLiveEvent;)V", "navigationCommands", "Lcom/dubizzle/core/utils/NavigationCommand;", "getNavigationCommands", "sharedViewModel", "Lcom/dubizzle/core/viewmodel/SharedViewModel;", "getSharedViewModel", "()Lcom/dubizzle/core/viewmodel/SharedViewModel;", "setSharedViewModel", "(Lcom/dubizzle/core/viewmodel/SharedViewModel;)V", "toolbarPropertyViewModel", "Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;", "getToolbarPropertyViewModel", "()Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;", "setToolbarPropertyViewModel", "(Lcom/dubizzle/core/viewmodel/ToolbarPropertyViewModel;)V", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "getError", "getLoading", "navigate", "directions", "Landroidx/navigation/NavDirections;", "notifyChange", "notifyChange$core_devDebug", "notifyPropertyChanged", "fieldId", "", "notifyPropertyChanged$core_devDebug", "postLoading", "show", "removeOnPropertyChangedCallback", "setError", "error", "showLoading", "core_devDebug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    
    /**
     * Live data to handle loading
     */
    @org.jetbrains.annotations.NotNull()
    private final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> loadingEvent = null;
    
    /**
     * Live data to handle error
     */
    private final com.dubizzle.core.arc.SingleLiveEvent<com.dubizzle.domain.entity.common.ErrorEntity.Error> errorEvent = null;
    
    /**
     * Set the Logout Click to true for showing confirmation before logout
     */
    @org.jetbrains.annotations.NotNull()
    private com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> logoutClickEvent;
    @org.jetbrains.annotations.NotNull()
    private final com.dubizzle.core.arc.SingleLiveEvent<com.dubizzle.core.utils.NavigationCommand> navigationCommands = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideKeyboard = null;
    public com.dubizzle.core.viewmodel.SharedViewModel sharedViewModel;
    private final androidx.databinding.PropertyChangeRegistry callbacks = null;
    @org.jetbrains.annotations.NotNull()
    private com.dubizzle.core.viewmodel.ToolbarPropertyViewModel toolbarPropertyViewModel;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> getLoadingEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> getLogoutClickEvent() {
        return null;
    }
    
    public final void setLogoutClickEvent(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<com.dubizzle.core.utils.NavigationCommand> getNavigationCommands() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideKeyboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.viewmodel.SharedViewModel getSharedViewModel() {
        return null;
    }
    
    public final void setSharedViewModel(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.viewmodel.SharedViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.viewmodel.ToolbarPropertyViewModel getToolbarPropertyViewModel() {
        return null;
    }
    
    public final void setToolbarPropertyViewModel(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.viewmodel.ToolbarPropertyViewModel p0) {
    }
    
    public final boolean isSharedViewModelInitialized() {
        return false;
    }
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    /**
     * Notifies observers that all properties of this instance have changed.
     */
    public final void notifyChange$core_devDebug() {
    }
    
    /**
     * Notifies observers that a specific property has changed. The getter for the
     * property that changes should be marked with the @Bindable annotation to
     * generate a field in the BR class to be used as the fieldId parameter.
     *
     * @param fieldId The generated BR id for the Bindable field.
     */
    public final void notifyPropertyChanged$core_devDebug(int fieldId) {
    }
    
    public final void showLoading(boolean show) {
    }
    
    public final void postLoading(boolean show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.arc.SingleLiveEvent<com.dubizzle.domain.entity.common.ErrorEntity.Error> getError() {
        return null;
    }
    
    /**
     * Method call to handle error
     */
    public final void setError(@org.jetbrains.annotations.Nullable()
    com.dubizzle.domain.entity.common.ErrorEntity.Error error) {
    }
    
    public final void navigate(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections directions) {
    }
}