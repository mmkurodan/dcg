// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class PositionedGlyphs {
    private final android.graphics.text.PositionedGlyphs real;

    public PositionedGlyphs(android.graphics.text.PositionedGlyphs real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs wrap(android.graphics.text.PositionedGlyphs real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs(real);
    }

    public android.graphics.text.PositionedGlyphs unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getAdvance() {
        return real.getAdvance();
    }

    public float getAscent() {
        return real.getAscent();
    }

    public float getDescent() {
        return real.getDescent();
    }

    public boolean getFakeBold(int arg0) {
        return real.getFakeBold(arg0);
    }

    public boolean getFakeItalic(int arg0) {
        return real.getFakeItalic(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.fonts.Font getFont(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.fonts.Font.wrap(real.getFont(arg0));
    }

    public int getGlyphId(int arg0) {
        return real.getGlyphId(arg0);
    }

    public float getGlyphX(int arg0) {
        return real.getGlyphX(arg0);
    }

    public float getGlyphY(int arg0) {
        return real.getGlyphY(arg0);
    }

    public float getItalicOverride(int arg0) {
        return real.getItalicOverride(arg0);
    }

    public float getOffsetX() {
        return real.getOffsetX();
    }

    public float getOffsetY() {
        return real.getOffsetY();
    }

    public float getWeightOverride(int arg0) {
        return real.getWeightOverride(arg0);
    }

    public int glyphCount() {
        return real.glyphCount();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final float NO_OVERRIDE = android.graphics.text.PositionedGlyphs.NO_OVERRIDE;

}
