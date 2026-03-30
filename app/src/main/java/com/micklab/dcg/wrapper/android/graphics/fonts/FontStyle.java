// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class FontStyle {
    private final android.graphics.fonts.FontStyle real;

    public FontStyle(android.graphics.fonts.FontStyle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle wrap(android.graphics.fonts.FontStyle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle(real);
    }

    public android.graphics.fonts.FontStyle unwrap() {
        return real;
    }

    public FontStyle() {
        this(new android.graphics.fonts.FontStyle());
    }

    public FontStyle(int arg0, int arg1) {
        this(new android.graphics.fonts.FontStyle(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getSlant() {
        return real.getSlant();
    }

    public int getWeight() {
        return real.getWeight();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int FONT_SLANT_ITALIC = android.graphics.fonts.FontStyle.FONT_SLANT_ITALIC;
    public static final int FONT_SLANT_UPRIGHT = android.graphics.fonts.FontStyle.FONT_SLANT_UPRIGHT;
    public static final int FONT_WEIGHT_BLACK = android.graphics.fonts.FontStyle.FONT_WEIGHT_BLACK;
    public static final int FONT_WEIGHT_BOLD = android.graphics.fonts.FontStyle.FONT_WEIGHT_BOLD;
    public static final int FONT_WEIGHT_EXTRA_BOLD = android.graphics.fonts.FontStyle.FONT_WEIGHT_EXTRA_BOLD;
    public static final int FONT_WEIGHT_EXTRA_LIGHT = android.graphics.fonts.FontStyle.FONT_WEIGHT_EXTRA_LIGHT;
    public static final int FONT_WEIGHT_LIGHT = android.graphics.fonts.FontStyle.FONT_WEIGHT_LIGHT;
    public static final int FONT_WEIGHT_MAX = android.graphics.fonts.FontStyle.FONT_WEIGHT_MAX;
    public static final int FONT_WEIGHT_MEDIUM = android.graphics.fonts.FontStyle.FONT_WEIGHT_MEDIUM;
    public static final int FONT_WEIGHT_MIN = android.graphics.fonts.FontStyle.FONT_WEIGHT_MIN;
    public static final int FONT_WEIGHT_NORMAL = android.graphics.fonts.FontStyle.FONT_WEIGHT_NORMAL;
    public static final int FONT_WEIGHT_SEMI_BOLD = android.graphics.fonts.FontStyle.FONT_WEIGHT_SEMI_BOLD;
    public static final int FONT_WEIGHT_THIN = android.graphics.fonts.FontStyle.FONT_WEIGHT_THIN;
    public static final int FONT_WEIGHT_UNSPECIFIED = android.graphics.fonts.FontStyle.FONT_WEIGHT_UNSPECIFIED;

}
