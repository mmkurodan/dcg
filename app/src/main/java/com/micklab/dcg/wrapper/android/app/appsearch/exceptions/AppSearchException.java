// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.exceptions;

public final class AppSearchException {
    private final android.app.appsearch.exceptions.AppSearchException real;

    public AppSearchException(android.app.appsearch.exceptions.AppSearchException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.exceptions.AppSearchException wrap(android.app.appsearch.exceptions.AppSearchException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.exceptions.AppSearchException(real);
    }

    public android.app.appsearch.exceptions.AppSearchException unwrap() {
        return real;
    }

    public AppSearchException(int arg0) {
        this(new android.app.appsearch.exceptions.AppSearchException(arg0));
    }

    public AppSearchException(int arg0, java.lang.String arg1) {
        this(new android.app.appsearch.exceptions.AppSearchException(arg0, arg1));
    }

    public AppSearchException(int arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.app.appsearch.exceptions.AppSearchException(arg0, arg1, arg2));
    }

    public int getResultCode() {
        return real.getResultCode();
    }

}
