// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ReplacementSpan {
    private final android.text.style.ReplacementSpan real;

    public ReplacementSpan(android.text.style.ReplacementSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ReplacementSpan wrap(android.text.style.ReplacementSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ReplacementSpan(real);
    }

    public android.text.style.ReplacementSpan unwrap() {
        return real;
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, java.lang.CharSequence arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap());
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getSize(com.micklab.dcg.wrapper.android.graphics.Paint arg0, java.lang.CharSequence arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg4) {
        return real.getSize(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateMeasureState(arg0 == null ? null : arg0.unwrap());
    }

}
