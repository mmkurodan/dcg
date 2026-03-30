// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class RectEvaluator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RectEvaluator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.RectEvaluator wrap(android.animation.RectEvaluator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.RectEvaluator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.RectEvaluator getReal() {
        return (android.animation.RectEvaluator) real;
    }

    public android.animation.RectEvaluator unwrap() {
        return getReal();
    }

    public RectEvaluator() {
        this(new android.animation.RectEvaluator(), (__DcgwBridgeToken) null);
    }

    public RectEvaluator(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.animation.RectEvaluator(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect evaluate(float arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.animation.RectEvaluator) real).evaluate(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

}
