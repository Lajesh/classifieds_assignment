package com.dubizzle.core.listeners;

import java.lang.System;

/**
 * Back button handler interface. Add/remove listener functionality
 * Created by Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/dubizzle/core/listeners/BackButtonHandlerListener;", "", "addBackpressListener", "", "listner", "Lcom/dubizzle/core/listeners/BackPressListener;", "removeBackpressListener", "core_devDebug"})
public abstract interface BackButtonHandlerListener {
    
    public abstract void addBackpressListener(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.listeners.BackPressListener listner);
    
    public abstract void removeBackpressListener(@org.jetbrains.annotations.NotNull()
    com.dubizzle.core.listeners.BackPressListener listner);
}