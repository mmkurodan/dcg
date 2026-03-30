// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class CornerPathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CornerPathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.CornerPathEffect wrap(android.graphics.CornerPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.CornerPathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.CornerPathEffect getReal() {
        return (android.graphics.CornerPathEffect) real;
    }

    public android.graphics.CornerPathEffect unwrap() {
        return getReal();
    }

    public CornerPathEffect(float arg0) {
        this(new android.graphics.CornerPathEffect(arg0), (__DcgwBridgeToken) null);
    }

}
