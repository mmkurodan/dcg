// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ImageSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImageSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ImageSpan wrap(android.text.style.ImageSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ImageSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.ImageSpan getReal() {
        return (android.text.style.ImageSpan) real;
    }

    public android.text.style.ImageSpan unwrap() {
        return getReal();
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.String arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.String arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.text.style.ImageSpan) real).getDrawable());
    }

    public java.lang.String getSource() {
        return ((android.text.style.ImageSpan) real).getSource();
    }

    public java.lang.String toString() {
        return ((android.text.style.ImageSpan) real).toString();
    }

}
