// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchResult {
    private final android.app.appsearch.AppSearchResult real;

    public AppSearchResult(android.app.appsearch.AppSearchResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchResult wrap(android.app.appsearch.AppSearchResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchResult(real);
    }

    public android.app.appsearch.AppSearchResult unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getErrorMessage() {
        return real.getErrorMessage();
    }

    public int getResultCode() {
        return real.getResultCode();
    }

    public java.lang.Object getResultValue() {
        return real.getResultValue();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isSuccess() {
        return real.isSuccess();
    }

    public java.lang.String toString() {
        return real.toString();
    }

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
