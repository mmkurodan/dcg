// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorMatrixColorFilter {
    private final android.graphics.ColorMatrixColorFilter real;

    public ColorMatrixColorFilter(android.graphics.ColorMatrixColorFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorMatrixColorFilter wrap(android.graphics.ColorMatrixColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorMatrixColorFilter(real);
    }

    public android.graphics.ColorMatrixColorFilter unwrap() {
        return real;
    }

    public ColorMatrixColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        this(new android.graphics.ColorMatrixColorFilter(arg0 == null ? null : arg0.unwrap()));
    }

    public ColorMatrixColorFilter(float[] arg0) {
        this(new android.graphics.ColorMatrixColorFilter(arg0));
    }

    public void getColorMatrix(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        real.getColorMatrix(arg0 == null ? null : arg0.unwrap());
    }

}
