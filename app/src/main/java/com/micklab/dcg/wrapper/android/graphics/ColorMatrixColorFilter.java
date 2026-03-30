// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorMatrixColorFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorMatrixColorFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorMatrixColorFilter wrap(android.graphics.ColorMatrixColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorMatrixColorFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ColorMatrixColorFilter getReal() {
        return (android.graphics.ColorMatrixColorFilter) real;
    }

    public android.graphics.ColorMatrixColorFilter unwrap() {
        return getReal();
    }

    public ColorMatrixColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        this(new android.graphics.ColorMatrixColorFilter(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ColorMatrixColorFilter(float[] arg0) {
        this(new android.graphics.ColorMatrixColorFilter(arg0), (__DcgwBridgeToken) null);
    }

    public void getColorMatrix(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        ((android.graphics.ColorMatrixColorFilter) real).getColorMatrix(arg0 == null ? null : arg0.getReal());
    }

}
