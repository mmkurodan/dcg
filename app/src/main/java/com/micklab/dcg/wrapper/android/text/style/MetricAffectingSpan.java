// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class MetricAffectingSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MetricAffectingSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan wrap(android.text.style.MetricAffectingSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.MetricAffectingSpan getReal() {
        return (android.text.style.MetricAffectingSpan) real;
    }

    public android.text.style.MetricAffectingSpan unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan getUnderlying() {
        return com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan.wrap(((android.text.style.MetricAffectingSpan) real).getUnderlying());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.MetricAffectingSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

}
