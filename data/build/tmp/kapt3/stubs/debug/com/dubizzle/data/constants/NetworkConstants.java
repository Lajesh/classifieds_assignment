package com.dubizzle.data.constants;

import java.lang.System;

/**
 * Keep all the network related constants here
 * Created by Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/dubizzle/data/constants/NetworkConstants;", "", "()V", "NETWORK_ERROR_CODES", "NETWORK_ERROR_MESSAGES", "data_debug"})
public final class NetworkConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.data.constants.NetworkConstants INSTANCE = null;
    
    private NetworkConstants() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {500, 501, 502, 503, 504})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/dubizzle/data/constants/NetworkConstants$NETWORK_ERROR_CODES;", "", "Companion", "data_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface NETWORK_ERROR_CODES {
        @org.jetbrains.annotations.NotNull()
        public static final com.dubizzle.data.constants.NetworkConstants.NETWORK_ERROR_CODES.Companion Companion = null;
        public static final int SERVICE_UNAVAILABLE = 500;
        public static final int MALFORMED_JSON = 501;
        public static final int NO_INTERNET = 502;
        public static final int UNEXPECTED_ERROR = 503;
        public static final int HTML_RESPONSE_ERROR = 504;
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dubizzle/data/constants/NetworkConstants$NETWORK_ERROR_CODES$Companion;", "", "()V", "HTML_RESPONSE_ERROR", "", "MALFORMED_JSON", "NO_INTERNET", "SERVICE_UNAVAILABLE", "UNEXPECTED_ERROR", "data_debug"})
        public static final class Companion {
            public static final int SERVICE_UNAVAILABLE = 500;
            public static final int MALFORMED_JSON = 501;
            public static final int NO_INTERNET = 502;
            public static final int UNEXPECTED_ERROR = 503;
            public static final int HTML_RESPONSE_ERROR = 504;
            
            private Companion() {
                super();
            }
        }
    }
    
    @androidx.annotation.StringDef(value = {"System temporarily unavailable, please try again later", "Oops! We hit an error. Try again later.", "Oh! You are not connected to a wifi or cellular data network. Please connect and try again", "Something went wrong"})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/dubizzle/data/constants/NetworkConstants$NETWORK_ERROR_MESSAGES;", "", "Companion", "data_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface NETWORK_ERROR_MESSAGES {
        @org.jetbrains.annotations.NotNull()
        public static final com.dubizzle.data.constants.NetworkConstants.NETWORK_ERROR_MESSAGES.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SERVICE_UNAVAILABLE = "System temporarily unavailable, please try again later";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MALFORMED_JSON = "Oops! We hit an error. Try again later.";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NO_INTERNET = "Oh! You are not connected to a wifi or cellular data network. Please connect and try again";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNEXPECTED_ERROR = "Something went wrong";
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dubizzle/data/constants/NetworkConstants$NETWORK_ERROR_MESSAGES$Companion;", "", "()V", "MALFORMED_JSON", "", "NO_INTERNET", "SERVICE_UNAVAILABLE", "UNEXPECTED_ERROR", "data_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SERVICE_UNAVAILABLE = "System temporarily unavailable, please try again later";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String MALFORMED_JSON = "Oops! We hit an error. Try again later.";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String NO_INTERNET = "Oh! You are not connected to a wifi or cellular data network. Please connect and try again";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String UNEXPECTED_ERROR = "Something went wrong";
            
            private Companion() {
                super();
            }
        }
    }
}