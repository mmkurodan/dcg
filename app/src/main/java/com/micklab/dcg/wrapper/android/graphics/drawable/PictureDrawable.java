// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class PictureDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PictureDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.PictureDrawable wrap(android.graphics.drawable.PictureDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.PictureDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.PictureDrawable getReal() {
        return (android.graphics.drawable.PictureDrawable) real;
    }

    public android.graphics.drawable.PictureDrawable unwrap() {
        return getReal();
    }

    public PictureDrawable(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        this(new android.graphics.drawable.PictureDrawable(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.PictureDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.PictureDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.PictureDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.PictureDrawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Picture getPicture() {
        return com.micklab.dcg.wrapper.android.graphics.Picture.wrap(((android.graphics.drawable.PictureDrawable) real).getPicture());
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.PictureDrawable) real).setAlpha(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.PictureDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        ((android.graphics.drawable.PictureDrawable) real).setPicture(arg0 == null ? null : arg0.getReal());
    }

}
