// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MalformedJsonException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MalformedJsonException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MalformedJsonException wrap(android.util.MalformedJsonException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MalformedJsonException(real, (__DcgwBridgeToken) null);
    }

    public android.util.MalformedJsonException getReal() {
        return (android.util.MalformedJsonException) real;
    }

    public android.util.MalformedJsonException unwrap() {
        return getReal();
    }

    public MalformedJsonException(java.lang.String arg0) {
        this(new android.util.MalformedJsonException(arg0), (__DcgwBridgeToken) null);
    }

}
