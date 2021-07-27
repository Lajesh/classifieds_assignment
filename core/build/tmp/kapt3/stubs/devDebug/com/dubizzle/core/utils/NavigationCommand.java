package com.dubizzle.core.utils;

import java.lang.System;

/**
 * **
 * The app will be using command pattern to handle navigation within the app
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/dubizzle/core/utils/NavigationCommand;", "", "()V", "Back", "BackTo", "To", "ToByDeepLink", "Lcom/dubizzle/core/utils/NavigationCommand$To;", "Lcom/dubizzle/core/utils/NavigationCommand$Back;", "Lcom/dubizzle/core/utils/NavigationCommand$BackTo;", "Lcom/dubizzle/core/utils/NavigationCommand$ToByDeepLink;", "core_devDebug"})
public abstract class NavigationCommand {
    
    private NavigationCommand() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/dubizzle/core/utils/NavigationCommand$To;", "Lcom/dubizzle/core/utils/NavigationCommand;", "directions", "Landroidx/navigation/NavDirections;", "(Landroidx/navigation/NavDirections;)V", "getDirections", "()Landroidx/navigation/NavDirections;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_devDebug"})
    public static final class To extends com.dubizzle.core.utils.NavigationCommand {
        @org.jetbrains.annotations.NotNull()
        private final androidx.navigation.NavDirections directions = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.core.utils.NavigationCommand.To copy(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDirections directions) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public To(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDirections directions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections getDirections() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/dubizzle/core/utils/NavigationCommand$Back;", "Lcom/dubizzle/core/utils/NavigationCommand;", "()V", "core_devDebug"})
    public static final class Back extends com.dubizzle.core.utils.NavigationCommand {
        @org.jetbrains.annotations.NotNull()
        public static final com.dubizzle.core.utils.NavigationCommand.Back INSTANCE = null;
        
        private Back() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/dubizzle/core/utils/NavigationCommand$BackTo;", "Lcom/dubizzle/core/utils/NavigationCommand;", "destinationId", "", "(I)V", "getDestinationId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "core_devDebug"})
    public static final class BackTo extends com.dubizzle.core.utils.NavigationCommand {
        private final int destinationId = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.core.utils.NavigationCommand.BackTo copy(int destinationId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public BackTo(int destinationId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getDestinationId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/dubizzle/core/utils/NavigationCommand$ToByDeepLink;", "Lcom/dubizzle/core/utils/NavigationCommand;", "deepLink", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getDeepLink", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_devDebug"})
    public static final class ToByDeepLink extends com.dubizzle.core.utils.NavigationCommand {
        @org.jetbrains.annotations.NotNull()
        private final android.net.Uri deepLink = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.core.utils.NavigationCommand.ToByDeepLink copy(@org.jetbrains.annotations.NotNull()
        android.net.Uri deepLink) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ToByDeepLink(@org.jetbrains.annotations.NotNull()
        android.net.Uri deepLink) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getDeepLink() {
            return null;
        }
    }
}