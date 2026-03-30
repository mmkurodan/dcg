// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class MetricAffectingSpan {
    private final android.text.style.MetricAffectingSpan real;

    public MetricAffectingSpan(android.text.style.MetricAffectingSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan wrap(android.text.style.MetricAffectingSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan(real);
    }

    public android.text.style.MetricAffectingSpan unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan getUnderlying() {
        return com.micklab.dcg.wrapper.android.text.style.MetricAffectingSpan.wrap(real.getUnderlying());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateMeasureState(arg0 == null ? null : arg0.unwrap());
    }

}
