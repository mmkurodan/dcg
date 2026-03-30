// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchBatchResult {
    private final android.app.appsearch.AppSearchBatchResult real;

    public AppSearchBatchResult(android.app.appsearch.AppSearchBatchResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult wrap(android.app.appsearch.AppSearchBatchResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult(real);
    }

    public android.app.appsearch.AppSearchBatchResult unwrap() {
        return real;
    }

    public boolean isSuccess() {
        return real.isSuccess();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.app.appsearch.AppSearchBatchResult.Builder real;

        public Builder(android.app.appsearch.AppSearchBatchResult.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult.Builder wrap(android.app.appsearch.AppSearchBatchResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult.Builder(real);
        }

        public android.app.appsearch.AppSearchBatchResult.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.AppSearchBatchResult.Builder());
        }

    }
}
