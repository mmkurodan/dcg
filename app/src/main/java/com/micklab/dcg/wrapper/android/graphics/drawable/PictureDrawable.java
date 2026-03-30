// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class PictureDrawable {
    private final android.graphics.drawable.PictureDrawable real;

    public PictureDrawable(android.graphics.drawable.PictureDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.PictureDrawable wrap(android.graphics.drawable.PictureDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.PictureDrawable(real);
    }

    public android.graphics.drawable.PictureDrawable unwrap() {
        return real;
    }

    public PictureDrawable(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        this(new android.graphics.drawable.PictureDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Picture getPicture() {
        return com.micklab.dcg.wrapper.android.graphics.Picture.wrap(real.getPicture());
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setPicture(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        real.setPicture(arg0 == null ? null : arg0.unwrap());
    }

}
