// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class DynamicDrawableSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DynamicDrawableSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.DynamicDrawableSpan wrap(android.text.style.DynamicDrawableSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.DynamicDrawableSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.DynamicDrawableSpan getReal() {
        return (android.text.style.DynamicDrawableSpan) real;
    }

    public android.text.style.DynamicDrawableSpan unwrap() {
        return getReal();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, java.lang.CharSequence arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, com.micklab.dcg.wrapper.android.graphics.Paint arg8) {
        ((android.text.style.DynamicDrawableSpan) real).draw(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.text.style.DynamicDrawableSpan) real).getDrawable());
    }

    public int getSize(com.micklab.dcg.wrapper.android.graphics.Paint arg0, java.lang.CharSequence arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg4) {
        return ((android.text.style.DynamicDrawableSpan) real).getSize(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public int getVerticalAlignment() {
        return ((android.text.style.DynamicDrawableSpan) real).getVerticalAlignment();
    }

    public java.lang.String toString() {
        return ((android.text.style.DynamicDrawableSpan) real).toString();
    }

    public static final int ALIGN_BASELINE = android.text.style.DynamicDrawableSpan.ALIGN_BASELINE;
    public static final int ALIGN_BOTTOM = android.text.style.DynamicDrawableSpan.ALIGN_BOTTOM;
    public static final int ALIGN_CENTER = android.text.style.DynamicDrawableSpan.ALIGN_CENTER;

}
