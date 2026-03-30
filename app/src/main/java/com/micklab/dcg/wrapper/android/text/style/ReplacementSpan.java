// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ReplacementSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReplacementSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ReplacementSpan wrap(android.text.style.ReplacementSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ReplacementSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.ReplacementSpan getReal() {
        return (android.text.style.ReplacementSpan) real;
    }

    public android.text.style.ReplacementSpan unwrap() {
        return getReal();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, java.lang.CharSequence arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.text.style.ReplacementSpan) real).draw(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.text.style.ReplacementSpan) real).getContentDescription();
    }

    public int getSize(com.micklab.dcg.wrapper.android.graphics.Paint arg0, java.lang.CharSequence arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg4) {
        return ((android.text.style.ReplacementSpan) real).getSize(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        ((android.text.style.ReplacementSpan) real).setContentDescription(arg0);
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.ReplacementSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.ReplacementSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

}
