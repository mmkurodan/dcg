// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class IconMarginSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IconMarginSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.IconMarginSpan wrap(android.text.style.IconMarginSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.IconMarginSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.IconMarginSpan getReal() {
        return (android.text.style.IconMarginSpan) real;
    }

    public android.text.style.IconMarginSpan unwrap() {
        return getReal();
    }

    public IconMarginSpan(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.text.style.IconMarginSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public IconMarginSpan(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1) {
        this(new android.text.style.IconMarginSpan(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5) {
        ((android.text.style.IconMarginSpan) real).chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        ((android.text.style.IconMarginSpan) real).drawLeadingMargin(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.text.style.IconMarginSpan) real).getBitmap());
    }

    public int getLeadingMargin(boolean arg0) {
        return ((android.text.style.IconMarginSpan) real).getLeadingMargin(arg0);
    }

    public int getPadding() {
        return ((android.text.style.IconMarginSpan) real).getPadding();
    }

    public java.lang.String toString() {
        return ((android.text.style.IconMarginSpan) real).toString();
    }

}
