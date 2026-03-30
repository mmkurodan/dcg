// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class SumPathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SumPathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.SumPathEffect wrap(android.graphics.SumPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SumPathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.SumPathEffect getReal() {
        return (android.graphics.SumPathEffect) real;
    }

    public android.graphics.SumPathEffect unwrap() {
        return getReal();
    }

    public SumPathEffect(com.micklab.dcg.wrapper.android.graphics.PathEffect arg0, com.micklab.dcg.wrapper.android.graphics.PathEffect arg1) {
        this(new android.graphics.SumPathEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

}
