// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableLong {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableLong(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableLong wrap(android.util.MutableLong real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableLong(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableLong getReal() {
        return (android.util.MutableLong) real;
    }

    public android.util.MutableLong unwrap() {
        return getReal();
    }

    public MutableLong(long arg0) {
        this(new android.util.MutableLong(arg0), (__DcgwBridgeToken) null);
    }


}
