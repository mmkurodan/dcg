// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class PointFEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PointFEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.PointFEvaluator wrap(android.animation.PointFEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.PointFEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.PointFEvaluator getReal() {
        return (android.animation.PointFEvaluator) real;
    }

    public android.animation.PointFEvaluator unwrap() {
        return getReal();
    }

    public PointFEvaluator() {
        this(new android.animation.PointFEvaluator(), (__DcgwBridgeToken) null);
    }

    public PointFEvaluator(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
        this(new android.animation.PointFEvaluator(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF evaluate(float arg0, com.micklab.dcg.wrapper.android.graphics.PointF arg1, com.micklab.dcg.wrapper.android.graphics.PointF arg2) {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(((android.animation.PointFEvaluator) real).evaluate(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

}
