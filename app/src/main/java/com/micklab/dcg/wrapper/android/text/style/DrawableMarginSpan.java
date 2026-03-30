// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class DrawableMarginSpan {
    private final android.text.style.DrawableMarginSpan real;

    public DrawableMarginSpan(android.text.style.DrawableMarginSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.DrawableMarginSpan wrap(android.text.style.DrawableMarginSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.DrawableMarginSpan(real);
    }

    public android.text.style.DrawableMarginSpan unwrap() {
        return real;
    }

    public DrawableMarginSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        this(new android.text.style.DrawableMarginSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public DrawableMarginSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        this(new android.text.style.DrawableMarginSpan(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5) {
        real.chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        real.drawLeadingMargin(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDrawable());
    }

    public int getLeadingMargin(boolean arg0) {
        return real.getLeadingMargin(arg0);
    }

    public int getPadding() {
        return real.getPadding();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
