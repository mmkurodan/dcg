// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BlendModeColorFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlendModeColorFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BlendModeColorFilter wrap(android.graphics.BlendModeColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BlendModeColorFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.BlendModeColorFilter getReal() {
        return (android.graphics.BlendModeColorFilter) real;
    }

    public android.graphics.BlendModeColorFilter unwrap() {
        return getReal();
    }

    public BlendModeColorFilter(int arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        this(new android.graphics.BlendModeColorFilter(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.BlendModeColorFilter) real).equals(arg0);
    }

    public int getColor() {
        return ((android.graphics.BlendModeColorFilter) real).getColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.graphics.BlendModeColorFilter) real).getMode());
    }

    public int hashCode() {
        return ((android.graphics.BlendModeColorFilter) real).hashCode();
    }

}
