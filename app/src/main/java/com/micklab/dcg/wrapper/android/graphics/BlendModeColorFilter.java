// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BlendModeColorFilter {
    private final android.graphics.BlendModeColorFilter real;

    public BlendModeColorFilter(android.graphics.BlendModeColorFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BlendModeColorFilter wrap(android.graphics.BlendModeColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BlendModeColorFilter(real);
    }

    public android.graphics.BlendModeColorFilter unwrap() {
        return real;
    }

    public BlendModeColorFilter(int arg0, com.micklab.dcg.wrapper.android.graphics.BlendMode arg1) {
        this(new android.graphics.BlendModeColorFilter(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getColor() {
        return real.getColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getMode());
    }

    public int hashCode() {
        return real.hashCode();
    }

}
