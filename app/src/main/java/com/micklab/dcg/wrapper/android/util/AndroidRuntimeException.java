// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AndroidRuntimeException {
    private final android.util.AndroidRuntimeException real;

    public AndroidRuntimeException(android.util.AndroidRuntimeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AndroidRuntimeException wrap(android.util.AndroidRuntimeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AndroidRuntimeException(real);
    }

    public android.util.AndroidRuntimeException unwrap() {
        return real;
    }

    public AndroidRuntimeException() {
        this(new android.util.AndroidRuntimeException());
    }

    public AndroidRuntimeException(java.lang.Exception arg0) {
        this(new android.util.AndroidRuntimeException(arg0));
    }

    public AndroidRuntimeException(java.lang.String arg0) {
        this(new android.util.AndroidRuntimeException(arg0));
    }

    public AndroidRuntimeException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.util.AndroidRuntimeException(arg0, arg1));
    }

}
