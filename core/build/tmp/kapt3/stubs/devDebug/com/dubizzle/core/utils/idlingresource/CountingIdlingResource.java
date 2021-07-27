package com.dubizzle.core.utils.idlingresource;

import java.lang.System;

/**
 * A simple counter implementation of that determines idleness by
 * maintaining an internal counter. When the counter is 0 - it is considered to be idle, when it is
 * non-zero it is not idle. This is very similar to the way a Semaphore
 * behaves.
 * This class can then be used to wrap up operations that while in progress should block tests from
 * accessing the UI.
 * Created by Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dubizzle/core/utils/idlingresource/CountingIdlingResource;", "Landroidx/test/espresso/IdlingResource;", "resourceName", "", "(Ljava/lang/String;)V", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "name", "resourceCallback", "Landroidx/test/espresso/IdlingResource$ResourceCallback;", "decrement", "", "getName", "increment", "isIdleNow", "", "registerIdleTransitionCallback", "callback", "core_devDebug"})
public final class CountingIdlingResource implements androidx.test.espresso.IdlingResource {
    private final java.lang.String name = null;
    private final java.util.concurrent.atomic.AtomicInteger counter = null;
    private volatile androidx.test.espresso.IdlingResource.ResourceCallback resourceCallback;
    
    public CountingIdlingResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isIdleNow() {
        return false;
    }
    
    @java.lang.Override()
    public void registerIdleTransitionCallback(@org.jetbrains.annotations.Nullable()
    androidx.test.espresso.IdlingResource.ResourceCallback callback) {
    }
    
    /**
     * Increments the count of in-flight transactions to the resource being monitored.
     */
    public final void increment() {
    }
    
    /**
     * Decrements the count of in-flight transactions to the resource being monitored.
     *
     * If this operation results in the counter falling below 0 - an exception is raised.
     *
     * @throws IllegalStateException if the counter is below 0.
     */
    public final void decrement() {
    }
}