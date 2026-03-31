// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchBatchResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSearchBatchResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult wrap(android.app.appsearch.AppSearchBatchResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.AppSearchBatchResult getReal() {
        return (android.app.appsearch.AppSearchBatchResult) real;
    }

    public android.app.appsearch.AppSearchBatchResult unwrap() {
        return getReal();
    }

    public boolean isSuccess() {
        return ((android.app.appsearch.AppSearchBatchResult) real).isSuccess();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.AppSearchBatchResult) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult.Builder wrap(android.app.appsearch.AppSearchBatchResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.AppSearchBatchResult.Builder getReal() {
            return (android.app.appsearch.AppSearchBatchResult.Builder) real;
        }

        public android.app.appsearch.AppSearchBatchResult.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.AppSearchBatchResult.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult arg0) {
            this(new android.app.appsearch.AppSearchBatchResult.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

    }
}
