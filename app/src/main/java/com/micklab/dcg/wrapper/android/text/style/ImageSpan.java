// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ImageSpan {
    private final android.text.style.ImageSpan real;

    public ImageSpan(android.text.style.ImageSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ImageSpan wrap(android.text.style.ImageSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ImageSpan(real);
    }

    public android.text.style.ImageSpan unwrap() {
        return real;
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.String arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.String arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public ImageSpan(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, int arg2) {
        this(new android.text.style.ImageSpan(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDrawable());
    }

    public java.lang.String getSource() {
        return real.getSource();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
