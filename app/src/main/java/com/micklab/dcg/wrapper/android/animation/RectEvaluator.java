// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class RectEvaluator {
    private final android.animation.RectEvaluator real;

    public RectEvaluator(android.animation.RectEvaluator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.RectEvaluator wrap(android.animation.RectEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.RectEvaluator(real);
    }

    public android.animation.RectEvaluator unwrap() {
        return real;
    }

    public RectEvaluator() {
        this(new android.animation.RectEvaluator());
    }

    public RectEvaluator(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.animation.RectEvaluator(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect evaluate(float arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.evaluate(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

}
