package com.dubizzle.core.interceptors;

import java.lang.System;

/**
 * **
 * Retrofit interceptor to add all the common headers
 * Author: Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002\u00a8\u0006\r"}, d2 = {"Lcom/dubizzle/core/interceptors/HeaderInterceptor;", "Lokhttp3/Interceptor;", "()V", "addCommonHeaders", "Lokhttp3/Request$Builder;", "requestBuilder", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isHtmlResponse", "", "response", "core_devDebug"})
public final class HeaderInterceptor implements okhttp3.Interceptor {
    
    public HeaderInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    /**
     * Add the common set of headers
     */
    private final okhttp3.Request.Builder addCommonHeaders(okhttp3.Request.Builder requestBuilder) {
        return null;
    }
    
    private final boolean isHtmlResponse(okhttp3.Response response) {
        return false;
    }
}