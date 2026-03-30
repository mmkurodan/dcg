// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class NinePatch {
    private final android.graphics.NinePatch real;

    public NinePatch(android.graphics.NinePatch real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.NinePatch wrap(android.graphics.NinePatch real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.NinePatch(real);
    }

    public android.graphics.NinePatch unwrap() {
        return real;
    }

    public NinePatch(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, byte[] arg1) {
        this(new android.graphics.NinePatch(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public NinePatch(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, byte[] arg1, java.lang.String arg2) {
        this(new android.graphics.NinePatch(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getBitmap());
    }

    public int getDensity() {
        return real.getDensity();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(real.getPaint());
    }

    public com.micklab.dcg.wrapper.android.graphics.Region getTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Region.wrap(real.getTransparentRegion(arg0 == null ? null : arg0.unwrap()));
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean hasAlpha() {
        return real.hasAlpha();
    }

    public static boolean isNinePatchChunk(byte[] arg0) {
        return android.graphics.NinePatch.isNinePatchChunk(arg0);
    }

    public void setPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        real.setPaint(arg0 == null ? null : arg0.unwrap());
    }

}
