// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class DiscretePathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DiscretePathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.DiscretePathEffect wrap(android.graphics.DiscretePathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.DiscretePathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.DiscretePathEffect getReal() {
        return (android.graphics.DiscretePathEffect) real;
    }

    public android.graphics.DiscretePathEffect unwrap() {
        return getReal();
    }

    public DiscretePathEffect(float arg0, float arg1) {
        this(new android.graphics.DiscretePathEffect(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
