// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InflateException {
    private final android.view.InflateException real;

    public InflateException(android.view.InflateException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InflateException wrap(android.view.InflateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InflateException(real);
    }

    public android.view.InflateException unwrap() {
        return real;
    }

    public InflateException() {
        this(new android.view.InflateException());
    }

    public InflateException(java.lang.Throwable arg0) {
        this(new android.view.InflateException(arg0));
    }

    public InflateException(java.lang.String arg0) {
        this(new android.view.InflateException(arg0));
    }

    public InflateException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.view.InflateException(arg0, arg1));
    }

}
