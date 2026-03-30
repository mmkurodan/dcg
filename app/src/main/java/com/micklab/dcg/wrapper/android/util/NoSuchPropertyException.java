// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class NoSuchPropertyException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NoSuchPropertyException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.NoSuchPropertyException wrap(android.util.NoSuchPropertyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.NoSuchPropertyException(real, (__DcgwBridgeToken) null);
    }

    public android.util.NoSuchPropertyException getReal() {
        return (android.util.NoSuchPropertyException) real;
    }

    public android.util.NoSuchPropertyException unwrap() {
        return getReal();
    }

    public NoSuchPropertyException(java.lang.String arg0) {
        this(new android.util.NoSuchPropertyException(arg0), (__DcgwBridgeToken) null);
    }

}
