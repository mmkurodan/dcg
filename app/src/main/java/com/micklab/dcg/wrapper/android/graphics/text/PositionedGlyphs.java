// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class PositionedGlyphs {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PositionedGlyphs(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs wrap(android.graphics.text.PositionedGlyphs real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.PositionedGlyphs(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.text.PositionedGlyphs getReal() {
        return (android.graphics.text.PositionedGlyphs) real;
    }

    public android.graphics.text.PositionedGlyphs unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).equals(arg0);
    }

    public float getAdvance() {
        return ((android.graphics.text.PositionedGlyphs) real).getAdvance();
    }

    public float getAscent() {
        return ((android.graphics.text.PositionedGlyphs) real).getAscent();
    }

    public float getDescent() {
        return ((android.graphics.text.PositionedGlyphs) real).getDescent();
    }

    public boolean getFakeBold(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getFakeBold(arg0);
    }

    public boolean getFakeItalic(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getFakeItalic(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.fonts.Font getFont(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.fonts.Font.wrap(((android.graphics.text.PositionedGlyphs) real).getFont(arg0));
    }

    public int getGlyphId(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getGlyphId(arg0);
    }

    public float getGlyphX(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getGlyphX(arg0);
    }

    public float getGlyphY(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getGlyphY(arg0);
    }

    public float getItalicOverride(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getItalicOverride(arg0);
    }

    public float getOffsetX() {
        return ((android.graphics.text.PositionedGlyphs) real).getOffsetX();
    }

    public float getOffsetY() {
        return ((android.graphics.text.PositionedGlyphs) real).getOffsetY();
    }

    public float getWeightOverride(int arg0) {
        return ((android.graphics.text.PositionedGlyphs) real).getWeightOverride(arg0);
    }

    public int glyphCount() {
        return ((android.graphics.text.PositionedGlyphs) real).glyphCount();
    }

    public int hashCode() {
        return ((android.graphics.text.PositionedGlyphs) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.graphics.text.PositionedGlyphs) real).toString();
    }

    public static final float NO_OVERRIDE = android.graphics.text.PositionedGlyphs.NO_OVERRIDE;

}
