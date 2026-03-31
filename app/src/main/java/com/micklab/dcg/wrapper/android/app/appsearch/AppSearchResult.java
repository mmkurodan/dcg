// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSearchResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchResult wrap(android.app.appsearch.AppSearchResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchResult(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.AppSearchResult getReal() {
        return (android.app.appsearch.AppSearchResult) real;
    }

    public android.app.appsearch.AppSearchResult unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.AppSearchResult) real).equals(arg0);
    }

    public java.lang.String getErrorMessage() {
        return ((android.app.appsearch.AppSearchResult) real).getErrorMessage();
    }

    public int getResultCode() {
        return ((android.app.appsearch.AppSearchResult) real).getResultCode();
    }

    public java.lang.Object getResultValue() {
        return ((android.app.appsearch.AppSearchResult) real).getResultValue();
    }

    public int hashCode() {
        return ((android.app.appsearch.AppSearchResult) real).hashCode();
    }

    public boolean isSuccess() {
        return ((android.app.appsearch.AppSearchResult) real).isSuccess();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.AppSearchResult) real).toString();
    }

    public static final int RESULT_ALREADY_EXISTS = android.app.appsearch.AppSearchResult.RESULT_ALREADY_EXISTS;
    public static final int RESULT_DENIED = android.app.appsearch.AppSearchResult.RESULT_DENIED;
    public static final int RESULT_INTERNAL_ERROR = android.app.appsearch.AppSearchResult.RESULT_INTERNAL_ERROR;
    public static final int RESULT_INVALID_ARGUMENT = android.app.appsearch.AppSearchResult.RESULT_INVALID_ARGUMENT;
    public static final int RESULT_INVALID_SCHEMA = android.app.appsearch.AppSearchResult.RESULT_INVALID_SCHEMA;
    public static final int RESULT_IO_ERROR = android.app.appsearch.AppSearchResult.RESULT_IO_ERROR;
    public static final int RESULT_NOT_FOUND = android.app.appsearch.AppSearchResult.RESULT_NOT_FOUND;
    public static final int RESULT_OK = android.app.appsearch.AppSearchResult.RESULT_OK;
    public static final int RESULT_OUT_OF_SPACE = android.app.appsearch.AppSearchResult.RESULT_OUT_OF_SPACE;
    public static final int RESULT_RATE_LIMITED = android.app.appsearch.AppSearchResult.RESULT_RATE_LIMITED;
    public static final int RESULT_SECURITY_ERROR = android.app.appsearch.AppSearchResult.RESULT_SECURITY_ERROR;
    public static final int RESULT_UNKNOWN_ERROR = android.app.appsearch.AppSearchResult.RESULT_UNKNOWN_ERROR;

}
