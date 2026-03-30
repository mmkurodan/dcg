// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableFloat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableFloat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableFloat wrap(android.util.MutableFloat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableFloat(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableFloat getReal() {
        return (android.util.MutableFloat) real;
    }

    public android.util.MutableFloat unwrap() {
        return getReal();
    }

    public MutableFloat(float arg0) {
        this(new android.util.MutableFloat(arg0), (__DcgwBridgeToken) null);
    }


}
