package com.dubizzle.data.datasource.remote.dto;

import java.lang.System;

/**
 * ERROR DTO Class
 * Created by Lajesh Dineshkumar
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ErrorDto;", "", "()V", "Error", "ErrorResponse", "FieldErrors", "data_debug"})
public abstract class ErrorDto {
    
    private ErrorDto() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$ErrorResponse;", "", "error", "Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$Error;", "(Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$Error;)V", "getError", "()Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$Error;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_debug"})
    public static final class ErrorResponse {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "error")
        private final com.dubizzle.data.datasource.remote.dto.ErrorDto.Error error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ErrorDto.ErrorResponse copy(@org.jetbrains.annotations.Nullable()
        com.dubizzle.data.datasource.remote.dto.ErrorDto.Error error) {
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
        
        public ErrorResponse() {
            super();
        }
        
        public ErrorResponse(@org.jetbrains.annotations.Nullable()
        com.dubizzle.data.datasource.remote.dto.ErrorDto.Error error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.dubizzle.data.datasource.remote.dto.ErrorDto.Error component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.dubizzle.data.datasource.remote.dto.ErrorDto.Error getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$Error;", "", "type", "", "code", "errorUserMsg", "fieldErrors", "", "Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$FieldErrors;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/Object;", "getErrorUserMsg", "()Ljava/lang/String;", "setErrorUserMsg", "(Ljava/lang/String;)V", "getFieldErrors", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
    public static final class Error {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "type")
        private final java.lang.String type = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "code")
        private final java.lang.Object code = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "error_user_msg")
        private java.lang.String errorUserMsg;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "field_errors")
        private final java.util.List<com.dubizzle.data.datasource.remote.dto.ErrorDto.FieldErrors> fieldErrors = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ErrorDto.Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.String type, @org.jetbrains.annotations.Nullable()
        java.lang.Object code, @org.jetbrains.annotations.Nullable()
        java.lang.String errorUserMsg, @org.jetbrains.annotations.Nullable()
        java.util.List<com.dubizzle.data.datasource.remote.dto.ErrorDto.FieldErrors> fieldErrors) {
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
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String type, @org.jetbrains.annotations.Nullable()
        java.lang.Object code, @org.jetbrains.annotations.Nullable()
        java.lang.String errorUserMsg, @org.jetbrains.annotations.Nullable()
        java.util.List<com.dubizzle.data.datasource.remote.dto.ErrorDto.FieldErrors> fieldErrors) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorUserMsg() {
            return null;
        }
        
        public final void setErrorUserMsg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.dubizzle.data.datasource.remote.dto.ErrorDto.FieldErrors> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.dubizzle.data.datasource.remote.dto.ErrorDto.FieldErrors> getFieldErrors() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/dubizzle/data/datasource/remote/dto/ErrorDto$FieldErrors;", "", "code", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
    public static final class FieldErrors {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "code")
        private final java.lang.String code = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "message")
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.dubizzle.data.datasource.remote.dto.ErrorDto.FieldErrors copy(@org.jetbrains.annotations.Nullable()
        java.lang.String code, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
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
        
        public FieldErrors() {
            super();
        }
        
        public FieldErrors(@org.jetbrains.annotations.Nullable()
        java.lang.String code, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
    }
}