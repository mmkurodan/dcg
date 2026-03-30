// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class BatchResultCallback {
    private final android.app.appsearch.BatchResultCallback real;

    public BatchResultCallback(android.app.appsearch.BatchResultCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.BatchResultCallback wrap(android.app.appsearch.BatchResultCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.BatchResultCallback(real);
    }

    public android.app.appsearch.BatchResultCallback unwrap() {
        return real;
    }

    public void onSystemError(java.lang.Throwable arg0) {
        real.onSystemError(arg0);
    }

}
