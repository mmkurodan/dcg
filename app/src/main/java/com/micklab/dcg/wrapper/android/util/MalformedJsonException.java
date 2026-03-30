// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MalformedJsonException {
    private final android.util.MalformedJsonException real;

    public MalformedJsonException(android.util.MalformedJsonException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MalformedJsonException wrap(android.util.MalformedJsonException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MalformedJsonException(real);
    }

    public android.util.MalformedJsonException unwrap() {
        return real;
    }

    public MalformedJsonException(java.lang.String arg0) {
        this(new android.util.MalformedJsonException(arg0));
    }

}
