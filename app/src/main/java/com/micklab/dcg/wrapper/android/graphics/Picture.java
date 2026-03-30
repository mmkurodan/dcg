// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Picture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Picture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Picture wrap(android.graphics.Picture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Picture(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Picture getReal() {
        return (android.graphics.Picture) real;
    }

    public android.graphics.Picture unwrap() {
        return getReal();
    }

    public Picture() {
        this(new android.graphics.Picture(), (__DcgwBridgeToken) null);
    }

    public Picture(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        this(new android.graphics.Picture(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas beginRecording(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.graphics.Picture) real).beginRecording(arg0, arg1));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.Picture) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public void endRecording() {
        ((android.graphics.Picture) real).endRecording();
    }

    public int getHeight() {
        return ((android.graphics.Picture) real).getHeight();
    }

    public int getWidth() {
        return ((android.graphics.Picture) real).getWidth();
    }

    public boolean requiresHardwareAcceleration() {
        return ((android.graphics.Picture) real).requiresHardwareAcceleration();
    }

}
