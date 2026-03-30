// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Picture {
    private final android.graphics.Picture real;

    public Picture(android.graphics.Picture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Picture wrap(android.graphics.Picture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Picture(real);
    }

    public android.graphics.Picture unwrap() {
        return real;
    }

    public Picture() {
        this(new android.graphics.Picture());
    }

    public Picture(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        this(new android.graphics.Picture(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas beginRecording(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(real.beginRecording(arg0, arg1));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public void endRecording() {
        real.endRecording();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean requiresHardwareAcceleration() {
        return real.requiresHardwareAcceleration();
    }

}
