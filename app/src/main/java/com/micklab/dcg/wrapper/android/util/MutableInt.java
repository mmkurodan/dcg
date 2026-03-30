// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableInt {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableInt(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableInt wrap(android.util.MutableInt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableInt(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableInt getReal() {
        return (android.util.MutableInt) real;
    }

    public android.util.MutableInt unwrap() {
        return getReal();
    }

    public MutableInt(int arg0) {
        this(new android.util.MutableInt(arg0), (__DcgwBridgeToken) null);
    }


}
