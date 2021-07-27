package com.dubizzle.core.listeners;

import java.lang.System;

/**
 * Back press listener for handling back navigation in activity/fragments
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/dubizzle/core/listeners/BackPressListener;", "", "onBackPress", "", "core_devDebug"})
public abstract interface BackPressListener {
    
    public abstract boolean onBackPress();
}