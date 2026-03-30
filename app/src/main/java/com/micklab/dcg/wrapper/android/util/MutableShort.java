// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableShort {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableShort(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableShort wrap(android.util.MutableShort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableShort(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableShort getReal() {
        return (android.util.MutableShort) real;
    }

    public android.util.MutableShort unwrap() {
        return getReal();
    }

    public MutableShort(short arg0) {
        this(new android.util.MutableShort(arg0), (__DcgwBridgeToken) null);
    }


}
