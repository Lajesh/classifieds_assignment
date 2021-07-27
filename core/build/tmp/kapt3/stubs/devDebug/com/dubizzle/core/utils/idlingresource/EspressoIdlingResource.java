package com.dubizzle.core.utils.idlingresource;

import java.lang.System;

/**
 * Espresso idling resource which is exposing all the functionalities required
 * for managing application idle states
 * Created by Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dubizzle/core/utils/idlingresource/EspressoIdlingResource;", "", "()V", "RESOURCE", "", "countingIdlingResource", "Lcom/dubizzle/core/utils/idlingresource/CountingIdlingResource;", "decrement", "", "getIdlingResource", "increment", "core_devDebug"})
public final class EspressoIdlingResource {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.core.utils.idlingresource.EspressoIdlingResource INSTANCE = null;
    private static final java.lang.String RESOURCE = "GLOBAL";
    private static final com.dubizzle.core.utils.idlingresource.CountingIdlingResource countingIdlingResource = null;
    
    private EspressoIdlingResource() {
        super();
    }
    
    /**
     * This method needs to be called before starting any long running process in the app.
     * If the counter is greater than zero, then espresso tests will wait until the app is in idle state
     */
    public final void increment() {
    }
    
    /**
     * This method needs to be called after finishing the long running operation.
     * now that the data has been loaded, we can mark the app as idle
     * first, make sure the app is still marked as busy then decrement, there might be cases
     * when other components finished their asynchronous tasks and marked the app as idle
     */
    public final void decrement() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dubizzle.core.utils.idlingresource.CountingIdlingResource getIdlingResource() {
        return null;
    }
}