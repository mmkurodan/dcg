// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class LightingColorFilter {
    private final android.graphics.LightingColorFilter real;

    public LightingColorFilter(android.graphics.LightingColorFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.LightingColorFilter wrap(android.graphics.LightingColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.LightingColorFilter(real);
    }

    public android.graphics.LightingColorFilter unwrap() {
        return real;
    }

    public LightingColorFilter(int arg0, int arg1) {
        this(new android.graphics.LightingColorFilter(arg0, arg1));
    }

    public int getColorAdd() {
        return real.getColorAdd();
    }

    public int getColorMultiply() {
        return real.getColorMultiply();
    }

}
