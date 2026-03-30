// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class NinePatch {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NinePatch(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.NinePatch wrap(android.graphics.NinePatch real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.NinePatch(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.NinePatch getReal() {
        return (android.graphics.NinePatch) real;
    }

    public android.graphics.NinePatch unwrap() {
        return getReal();
    }

    public NinePatch(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, byte[] arg1) {
        this(new android.graphics.NinePatch(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public NinePatch(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, byte[] arg1, java.lang.String arg2) {
        this(new android.graphics.NinePatch(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        ((android.graphics.NinePatch) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        ((android.graphics.NinePatch) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2) {
        ((android.graphics.NinePatch) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.NinePatch) real).getBitmap());
    }

    public int getDensity() {
        return ((android.graphics.NinePatch) real).getDensity();
    }

    public int getHeight() {
        return ((android.graphics.NinePatch) real).getHeight();
    }

    public java.lang.String getName() {
        return ((android.graphics.NinePatch) real).getName();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(((android.graphics.NinePatch) real).getPaint());
    }

    public com.micklab.dcg.wrapper.android.graphics.Region getTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Region.wrap(((android.graphics.NinePatch) real).getTransparentRegion(arg0 == null ? null : arg0.getReal()));
    }

    public int getWidth() {
        return ((android.graphics.NinePatch) real).getWidth();
    }

    public boolean hasAlpha() {
        return ((android.graphics.NinePatch) real).hasAlpha();
    }

    public static boolean isNinePatchChunk(byte[] arg0) {
        return android.graphics.NinePatch.isNinePatchChunk(arg0);
    }

    public void setPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        ((android.graphics.NinePatch) real).setPaint(arg0 == null ? null : arg0.getReal());
    }

}
