// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class LightingColorFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LightingColorFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.LightingColorFilter wrap(android.graphics.LightingColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.LightingColorFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.LightingColorFilter getReal() {
        return (android.graphics.LightingColorFilter) real;
    }

    public android.graphics.LightingColorFilter unwrap() {
        return getReal();
    }

    public LightingColorFilter(int arg0, int arg1) {
        this(new android.graphics.LightingColorFilter(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int getColorAdd() {
        return ((android.graphics.LightingColorFilter) real).getColorAdd();
    }

    public int getColorMultiply() {
        return ((android.graphics.LightingColorFilter) real).getColorMultiply();
    }

}
