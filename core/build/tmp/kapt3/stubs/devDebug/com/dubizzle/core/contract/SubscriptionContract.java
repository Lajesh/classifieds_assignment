package com.dubizzle.core.contract;

import java.lang.System;

/**
 * **
 * Subscription contract. Wherever you want to subcribe for the network response
 * or navigation event, implement this interface
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/dubizzle/core/contract/SubscriptionContract;", "", "subscribeNavigationEvent", "", "subscribeNetworkResponse", "core_devDebug"})
public abstract interface SubscriptionContract {
    
    public abstract void subscribeNetworkResponse();
    
    public abstract void subscribeNavigationEvent();
    
    /**
     * **
     * Subscription contract. Wherever you want to subcribe for the network response
     * or navigation event, implement this interface
     * Author: Lajesh Dineshkumar
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void subscribeNetworkResponse(@org.jetbrains.annotations.NotNull()
        com.dubizzle.core.contract.SubscriptionContract $this) {
        }
        
        public static void subscribeNavigationEvent(@org.jetbrains.annotations.NotNull()
        com.dubizzle.core.contract.SubscriptionContract $this) {
        }
    }
}