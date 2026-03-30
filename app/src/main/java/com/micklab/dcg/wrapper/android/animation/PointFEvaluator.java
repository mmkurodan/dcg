// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class PointFEvaluator {
    private final android.animation.PointFEvaluator real;

    public PointFEvaluator(android.animation.PointFEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.PointFEvaluator wrap(android.animation.PointFEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.PointFEvaluator(real);
    }

    public android.animation.PointFEvaluator unwrap() {
        return real;
    }

    public PointFEvaluator() {
        this(new android.animation.PointFEvaluator());
    }

    public PointFEvaluator(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
        this(new android.animation.PointFEvaluator(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF evaluate(float arg0, com.micklab.dcg.wrapper.android.graphics.PointF arg1, com.micklab.dcg.wrapper.android.graphics.PointF arg2) {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.evaluate(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

}
