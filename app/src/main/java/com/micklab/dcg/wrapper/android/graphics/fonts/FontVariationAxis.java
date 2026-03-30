// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class FontVariationAxis {
    private final android.graphics.fonts.FontVariationAxis real;

    public FontVariationAxis(android.graphics.fonts.FontVariationAxis real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.FontVariationAxis wrap(android.graphics.fonts.FontVariationAxis real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.FontVariationAxis(real);
    }

    public android.graphics.fonts.FontVariationAxis unwrap() {
        return real;
    }

    public FontVariationAxis(java.lang.String arg0, float arg1) {
        this(new android.graphics.fonts.FontVariationAxis(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static android.graphics.fonts.FontVariationAxis[] fromFontVariationSettings(java.lang.String arg0) {
        return android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(arg0);
    }

    public float getStyleValue() {
        return real.getStyleValue();
    }

    public java.lang.String getTag() {
        return real.getTag();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static java.lang.String toFontVariationSettings(android.graphics.fonts.FontVariationAxis[] arg0) {
        return android.graphics.fonts.FontVariationAxis.toFontVariationSettings(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
