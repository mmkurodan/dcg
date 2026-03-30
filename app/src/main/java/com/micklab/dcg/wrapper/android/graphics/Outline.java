// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Outline {
    private final android.graphics.Outline real;

    public Outline(android.graphics.Outline real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Outline wrap(android.graphics.Outline real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Outline(real);
    }

    public android.graphics.Outline unwrap() {
        return real;
    }

    public Outline() {
        this(new android.graphics.Outline());
    }

    public Outline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        this(new android.graphics.Outline(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean canClip() {
        return real.canClip();
    }

    public float getAlpha() {
        return real.getAlpha();
    }

    public float getRadius() {
        return real.getRadius();
    }

    public boolean getRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void offset(int arg0, int arg1) {
        real.offset(arg0, arg1);
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

    public void setConvexPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        real.setConvexPath(arg0 == null ? null : arg0.unwrap());
    }

    public void setEmpty() {
        real.setEmpty();
    }

    public void setOval(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setOval(arg0 == null ? null : arg0.unwrap());
    }

    public void setOval(int arg0, int arg1, int arg2, int arg3) {
        real.setOval(arg0, arg1, arg2, arg3);
    }

    public void setPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        real.setPath(arg0 == null ? null : arg0.unwrap());
    }

    public void setRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setRect(arg0 == null ? null : arg0.unwrap());
    }

    public void setRect(int arg0, int arg1, int arg2, int arg3) {
        real.setRect(arg0, arg1, arg2, arg3);
    }

    public void setRoundRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, float arg1) {
        real.setRoundRect(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setRoundRect(int arg0, int arg1, int arg2, int arg3, float arg4) {
        real.setRoundRect(arg0, arg1, arg2, arg3, arg4);
    }

}
