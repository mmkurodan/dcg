// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class PaintDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PaintDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.PaintDrawable wrap(android.graphics.drawable.PaintDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.PaintDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.PaintDrawable getReal() {
        return (android.graphics.drawable.PaintDrawable) real;
    }

    public android.graphics.drawable.PaintDrawable unwrap() {
        return getReal();
    }

    public PaintDrawable() {
        this(new android.graphics.drawable.PaintDrawable(), (__DcgwBridgeToken) null);
    }

    public PaintDrawable(int arg0) {
        this(new android.graphics.drawable.PaintDrawable(arg0), (__DcgwBridgeToken) null);
    }

    public void setCornerRadii(float[] arg0) {
        ((android.graphics.drawable.PaintDrawable) real).setCornerRadii(arg0);
    }

    public void setCornerRadius(float arg0) {
        ((android.graphics.drawable.PaintDrawable) real).setCornerRadius(arg0);
    }

}
