// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class DashPathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DashPathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.DashPathEffect wrap(android.graphics.DashPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.DashPathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.DashPathEffect getReal() {
        return (android.graphics.DashPathEffect) real;
    }

    public android.graphics.DashPathEffect unwrap() {
        return getReal();
    }

    public DashPathEffect(float[] arg0, float arg1) {
        this(new android.graphics.DashPathEffect(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
