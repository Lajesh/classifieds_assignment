package com.dubizzle.core.config;

import java.lang.System;

/**
 * **
 * Keep all the common configurations here
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/dubizzle/core/config/Configuration;", "", "()V", "CALL_TIMEOUT", "", "CONNECT_TIMEOUT", "DEV", "", "DEV_URL", "PILOT", "PILOT_URL", "PROD", "PROD_URL", "READ_TIMEOUT", "SIT", "SIT_URL", "UAT", "UAT_URL", "baseURL", "getBaseURL", "()Ljava/lang/String;", "core_devDebug"})
public final class Configuration {
    @org.jetbrains.annotations.NotNull()
    public static final com.dubizzle.core.config.Configuration INSTANCE = null;
    private static final java.lang.String DEV = "dev";
    private static final java.lang.String SIT = "sit";
    private static final java.lang.String UAT = "uat";
    private static final java.lang.String PROD = "prod";
    private static final java.lang.String PILOT = "pilot";
    private static final java.lang.String DEV_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/";
    private static final java.lang.String SIT_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/sit/";
    private static final java.lang.String UAT_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/uat/";
    private static final java.lang.String PROD_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/prod/";
    private static final java.lang.String PILOT_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/pilot/";
    public static final long CONNECT_TIMEOUT = 60L;
    public static final long READ_TIMEOUT = 60L;
    public static final long CALL_TIMEOUT = 60L;
    
    private Configuration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseURL() {
        return null;
    }
}