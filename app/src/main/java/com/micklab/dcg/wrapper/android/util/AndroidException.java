// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AndroidException {
    private final android.util.AndroidException real;

    public AndroidException(android.util.AndroidException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AndroidException wrap(android.util.AndroidException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AndroidException(real);
    }

    public android.util.AndroidException unwrap() {
        return real;
    }

    public AndroidException() {
        this(new android.util.AndroidException());
    }

    public AndroidException(java.lang.Exception arg0) {
        this(new android.util.AndroidException(arg0));
    }

    public AndroidException(java.lang.String arg0) {
        this(new android.util.AndroidException(arg0));
    }

    public AndroidException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.util.AndroidException(arg0, arg1));
    }

}
