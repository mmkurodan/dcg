// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Paint {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Paint(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Paint wrap(android.graphics.Paint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Paint getReal() {
        return (android.graphics.Paint) real;
    }

    public android.graphics.Paint unwrap() {
        return getReal();
    }

    public Paint() {
        this(new android.graphics.Paint(), (__DcgwBridgeToken) null);
    }

    public Paint(int arg0) {
        this(new android.graphics.Paint(arg0), (__DcgwBridgeToken) null);
    }

    public Paint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        this(new android.graphics.Paint(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public float ascent() {
        return ((android.graphics.Paint) real).ascent();
    }

    public int breakText(java.lang.String arg0, boolean arg1, float arg2, float[] arg3) {
        return ((android.graphics.Paint) real).breakText(arg0, arg1, arg2, arg3);
    }

    public int breakText(char[] arg0, int arg1, int arg2, float arg3, float[] arg4) {
        return ((android.graphics.Paint) real).breakText(arg0, arg1, arg2, arg3, arg4);
    }

    public int breakText(java.lang.CharSequence arg0, int arg1, int arg2, boolean arg3, float arg4, float[] arg5) {
        return ((android.graphics.Paint) real).breakText(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void clearShadowLayer() {
        ((android.graphics.Paint) real).clearShadowLayer();
    }

    public float descent() {
        return ((android.graphics.Paint) real).descent();
    }

    public boolean equalsForTextMeasurement(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        return ((android.graphics.Paint) real).equalsForTextMeasurement(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.Paint) real).getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.graphics.Paint) real).getBlendMode());
    }

    public int getColor() {
        return ((android.graphics.Paint) real).getColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.Paint) real).getColorFilter());
    }

    public long getColorLong() {
        return ((android.graphics.Paint) real).getColorLong();
    }

    public int getEndHyphenEdit() {
        return ((android.graphics.Paint) real).getEndHyphenEdit();
    }

    public boolean getFillPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        return ((android.graphics.Paint) real).getFillPath(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int getFlags() {
        return ((android.graphics.Paint) real).getFlags();
    }

    public java.lang.String getFontFeatureSettings() {
        return ((android.graphics.Paint) real).getFontFeatureSettings();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics getFontMetrics() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics.wrap(((android.graphics.Paint) real).getFontMetrics());
    }

    public float getFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
        return ((android.graphics.Paint) real).getFontMetrics(arg0 == null ? null : arg0.getReal());
    }

    public void getFontMetricsForLocale(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
        ((android.graphics.Paint) real).getFontMetricsForLocale(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt getFontMetricsInt() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt.wrap(((android.graphics.Paint) real).getFontMetricsInt());
    }

    public int getFontMetricsInt(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg0) {
        return ((android.graphics.Paint) real).getFontMetricsInt(arg0 == null ? null : arg0.getReal());
    }

    public void getFontMetricsInt(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg6) {
        ((android.graphics.Paint) real).getFontMetricsInt(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void getFontMetricsInt(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg6) {
        ((android.graphics.Paint) real).getFontMetricsInt(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void getFontMetricsIntForLocale(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg0) {
        ((android.graphics.Paint) real).getFontMetricsIntForLocale(arg0 == null ? null : arg0.getReal());
    }

    public float getFontSpacing() {
        return ((android.graphics.Paint) real).getFontSpacing();
    }

    public java.lang.String getFontVariationSettings() {
        return ((android.graphics.Paint) real).getFontVariationSettings();
    }

    public int getHinting() {
        return ((android.graphics.Paint) real).getHinting();
    }

    public float getLetterSpacing() {
        return ((android.graphics.Paint) real).getLetterSpacing();
    }

    public com.micklab.dcg.wrapper.android.graphics.MaskFilter getMaskFilter() {
        return com.micklab.dcg.wrapper.android.graphics.MaskFilter.wrap(((android.graphics.Paint) real).getMaskFilter());
    }

    public int getOffsetForAdvance(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6) {
        return ((android.graphics.Paint) real).getOffsetForAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int getOffsetForAdvance(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6) {
        return ((android.graphics.Paint) real).getOffsetForAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public com.micklab.dcg.wrapper.android.graphics.PathEffect getPathEffect() {
        return com.micklab.dcg.wrapper.android.graphics.PathEffect.wrap(((android.graphics.Paint) real).getPathEffect());
    }

    public float getRunAdvance(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        return ((android.graphics.Paint) real).getRunAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public float getRunAdvance(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        return ((android.graphics.Paint) real).getRunAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public float getRunCharacterAdvance(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, float[] arg7, int arg8) {
        return ((android.graphics.Paint) real).getRunCharacterAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public float getRunCharacterAdvance(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, float[] arg7, int arg8) {
        return ((android.graphics.Paint) real).getRunCharacterAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader getShader() {
        return com.micklab.dcg.wrapper.android.graphics.Shader.wrap(((android.graphics.Paint) real).getShader());
    }

    public int getShadowLayerColor() {
        return ((android.graphics.Paint) real).getShadowLayerColor();
    }

    public long getShadowLayerColorLong() {
        return ((android.graphics.Paint) real).getShadowLayerColorLong();
    }

    public float getShadowLayerDx() {
        return ((android.graphics.Paint) real).getShadowLayerDx();
    }

    public float getShadowLayerDy() {
        return ((android.graphics.Paint) real).getShadowLayerDy();
    }

    public float getShadowLayerRadius() {
        return ((android.graphics.Paint) real).getShadowLayerRadius();
    }

    public int getStartHyphenEdit() {
        return ((android.graphics.Paint) real).getStartHyphenEdit();
    }

    public float getStrikeThruPosition() {
        return ((android.graphics.Paint) real).getStrikeThruPosition();
    }

    public float getStrikeThruThickness() {
        return ((android.graphics.Paint) real).getStrikeThruThickness();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Cap getStrokeCap() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Cap.wrap(((android.graphics.Paint) real).getStrokeCap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Join getStrokeJoin() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Join.wrap(((android.graphics.Paint) real).getStrokeJoin());
    }

    public float getStrokeMiter() {
        return ((android.graphics.Paint) real).getStrokeMiter();
    }

    public float getStrokeWidth() {
        return ((android.graphics.Paint) real).getStrokeWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Style getStyle() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Style.wrap(((android.graphics.Paint) real).getStyle());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Align getTextAlign() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Align.wrap(((android.graphics.Paint) real).getTextAlign());
    }

    public void getTextBounds(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3) {
        ((android.graphics.Paint) real).getTextBounds(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void getTextBounds(java.lang.String arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3) {
        ((android.graphics.Paint) real).getTextBounds(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void getTextBounds(char[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3) {
        ((android.graphics.Paint) real).getTextBounds(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public java.util.Locale getTextLocale() {
        return ((android.graphics.Paint) real).getTextLocale();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.graphics.Paint) real).getTextLocales());
    }

    public void getTextPath(java.lang.String arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Path arg5) {
        ((android.graphics.Paint) real).getTextPath(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void getTextPath(char[] arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Path arg5) {
        ((android.graphics.Paint) real).getTextPath(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public float getTextRunAdvances(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        return ((android.graphics.Paint) real).getTextRunAdvances(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public int getTextRunCursor(java.lang.CharSequence arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        return ((android.graphics.Paint) real).getTextRunCursor(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public int getTextRunCursor(char[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        return ((android.graphics.Paint) real).getTextRunCursor(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public float getTextScaleX() {
        return ((android.graphics.Paint) real).getTextScaleX();
    }

    public float getTextSize() {
        return ((android.graphics.Paint) real).getTextSize();
    }

    public float getTextSkewX() {
        return ((android.graphics.Paint) real).getTextSkewX();
    }

    public int getTextWidths(java.lang.String arg0, float[] arg1) {
        return ((android.graphics.Paint) real).getTextWidths(arg0, arg1);
    }

    public int getTextWidths(java.lang.String arg0, int arg1, int arg2, float[] arg3) {
        return ((android.graphics.Paint) real).getTextWidths(arg0, arg1, arg2, arg3);
    }

    public int getTextWidths(java.lang.CharSequence arg0, int arg1, int arg2, float[] arg3) {
        return ((android.graphics.Paint) real).getTextWidths(arg0, arg1, arg2, arg3);
    }

    public int getTextWidths(char[] arg0, int arg1, int arg2, float[] arg3) {
        return ((android.graphics.Paint) real).getTextWidths(arg0, arg1, arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.graphics.Paint) real).getTypeface());
    }

    public float getUnderlinePosition() {
        return ((android.graphics.Paint) real).getUnderlinePosition();
    }

    public float getUnderlineThickness() {
        return ((android.graphics.Paint) real).getUnderlineThickness();
    }

    public float getWordSpacing() {
        return ((android.graphics.Paint) real).getWordSpacing();
    }

    public com.micklab.dcg.wrapper.android.graphics.Xfermode getXfermode() {
        return com.micklab.dcg.wrapper.android.graphics.Xfermode.wrap(((android.graphics.Paint) real).getXfermode());
    }

    public boolean hasGlyph(java.lang.String arg0) {
        return ((android.graphics.Paint) real).hasGlyph(arg0);
    }

    public boolean isAntiAlias() {
        return ((android.graphics.Paint) real).isAntiAlias();
    }

    public boolean isDither() {
        return ((android.graphics.Paint) real).isDither();
    }

    public boolean isElegantTextHeight() {
        return ((android.graphics.Paint) real).isElegantTextHeight();
    }

    public boolean isFakeBoldText() {
        return ((android.graphics.Paint) real).isFakeBoldText();
    }

    public boolean isFilterBitmap() {
        return ((android.graphics.Paint) real).isFilterBitmap();
    }

    public boolean isLinearText() {
        return ((android.graphics.Paint) real).isLinearText();
    }

    public boolean isStrikeThruText() {
        return ((android.graphics.Paint) real).isStrikeThruText();
    }

    public boolean isSubpixelText() {
        return ((android.graphics.Paint) real).isSubpixelText();
    }

    public boolean isUnderlineText() {
        return ((android.graphics.Paint) real).isUnderlineText();
    }

    public float measureText(java.lang.String arg0) {
        return ((android.graphics.Paint) real).measureText(arg0);
    }

    public float measureText(java.lang.String arg0, int arg1, int arg2) {
        return ((android.graphics.Paint) real).measureText(arg0, arg1, arg2);
    }

    public float measureText(char[] arg0, int arg1, int arg2) {
        return ((android.graphics.Paint) real).measureText(arg0, arg1, arg2);
    }

    public float measureText(java.lang.CharSequence arg0, int arg1, int arg2) {
        return ((android.graphics.Paint) real).measureText(arg0, arg1, arg2);
    }

    public void reset() {
        ((android.graphics.Paint) real).reset();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        ((android.graphics.Paint) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void setARGB(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Paint) real).setARGB(arg0, arg1, arg2, arg3);
    }

    public void setAlpha(int arg0) {
        ((android.graphics.Paint) real).setAlpha(arg0);
    }

    public void setAntiAlias(boolean arg0) {
        ((android.graphics.Paint) real).setAntiAlias(arg0);
    }

    public void setBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.Paint) real).setBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setColor(int arg0) {
        ((android.graphics.Paint) real).setColor(arg0);
    }

    public void setColor(long arg0) {
        ((android.graphics.Paint) real).setColor(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.Paint) real).setColorFilter(arg0 == null ? null : arg0.getReal()));
    }

    public void setDither(boolean arg0) {
        ((android.graphics.Paint) real).setDither(arg0);
    }

    public void setElegantTextHeight(boolean arg0) {
        ((android.graphics.Paint) real).setElegantTextHeight(arg0);
    }

    public void setEndHyphenEdit(int arg0) {
        ((android.graphics.Paint) real).setEndHyphenEdit(arg0);
    }

    public void setFakeBoldText(boolean arg0) {
        ((android.graphics.Paint) real).setFakeBoldText(arg0);
    }

    public void setFilterBitmap(boolean arg0) {
        ((android.graphics.Paint) real).setFilterBitmap(arg0);
    }

    public void setFlags(int arg0) {
        ((android.graphics.Paint) real).setFlags(arg0);
    }

    public void setFontFeatureSettings(java.lang.String arg0) {
        ((android.graphics.Paint) real).setFontFeatureSettings(arg0);
    }

    public boolean setFontVariationSettings(java.lang.String arg0) {
        return ((android.graphics.Paint) real).setFontVariationSettings(arg0);
    }

    public void setHinting(int arg0) {
        ((android.graphics.Paint) real).setHinting(arg0);
    }

    public void setLetterSpacing(float arg0) {
        ((android.graphics.Paint) real).setLetterSpacing(arg0);
    }

    public void setLinearText(boolean arg0) {
        ((android.graphics.Paint) real).setLinearText(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.MaskFilter setMaskFilter(com.micklab.dcg.wrapper.android.graphics.MaskFilter arg0) {
        return com.micklab.dcg.wrapper.android.graphics.MaskFilter.wrap(((android.graphics.Paint) real).setMaskFilter(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.PathEffect setPathEffect(com.micklab.dcg.wrapper.android.graphics.PathEffect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.PathEffect.wrap(((android.graphics.Paint) real).setPathEffect(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader setShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Shader.wrap(((android.graphics.Paint) real).setShader(arg0 == null ? null : arg0.getReal()));
    }

    public void setShadowLayer(float arg0, float arg1, float arg2, int arg3) {
        ((android.graphics.Paint) real).setShadowLayer(arg0, arg1, arg2, arg3);
    }

    public void setShadowLayer(float arg0, float arg1, float arg2, long arg3) {
        ((android.graphics.Paint) real).setShadowLayer(arg0, arg1, arg2, arg3);
    }

    public void setStartHyphenEdit(int arg0) {
        ((android.graphics.Paint) real).setStartHyphenEdit(arg0);
    }

    public void setStrikeThruText(boolean arg0) {
        ((android.graphics.Paint) real).setStrikeThruText(arg0);
    }

    public void setStrokeCap(com.micklab.dcg.wrapper.android.graphics.Paint.Cap arg0) {
        ((android.graphics.Paint) real).setStrokeCap(arg0 == null ? null : arg0.getReal());
    }

    public void setStrokeJoin(com.micklab.dcg.wrapper.android.graphics.Paint.Join arg0) {
        ((android.graphics.Paint) real).setStrokeJoin(arg0 == null ? null : arg0.getReal());
    }

    public void setStrokeMiter(float arg0) {
        ((android.graphics.Paint) real).setStrokeMiter(arg0);
    }

    public void setStrokeWidth(float arg0) {
        ((android.graphics.Paint) real).setStrokeWidth(arg0);
    }

    public void setStyle(com.micklab.dcg.wrapper.android.graphics.Paint.Style arg0) {
        ((android.graphics.Paint) real).setStyle(arg0 == null ? null : arg0.getReal());
    }

    public void setSubpixelText(boolean arg0) {
        ((android.graphics.Paint) real).setSubpixelText(arg0);
    }

    public void setTextAlign(com.micklab.dcg.wrapper.android.graphics.Paint.Align arg0) {
        ((android.graphics.Paint) real).setTextAlign(arg0 == null ? null : arg0.getReal());
    }

    public void setTextLocale(java.util.Locale arg0) {
        ((android.graphics.Paint) real).setTextLocale(arg0);
    }

    public void setTextLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        ((android.graphics.Paint) real).setTextLocales(arg0 == null ? null : arg0.getReal());
    }

    public void setTextScaleX(float arg0) {
        ((android.graphics.Paint) real).setTextScaleX(arg0);
    }

    public void setTextSize(float arg0) {
        ((android.graphics.Paint) real).setTextSize(arg0);
    }

    public void setTextSkewX(float arg0) {
        ((android.graphics.Paint) real).setTextSkewX(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface setTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.graphics.Paint) real).setTypeface(arg0 == null ? null : arg0.getReal()));
    }

    public void setUnderlineText(boolean arg0) {
        ((android.graphics.Paint) real).setUnderlineText(arg0);
    }

    public void setWordSpacing(float arg0) {
        ((android.graphics.Paint) real).setWordSpacing(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Xfermode setXfermode(com.micklab.dcg.wrapper.android.graphics.Xfermode arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Xfermode.wrap(((android.graphics.Paint) real).setXfermode(arg0 == null ? null : arg0.getReal()));
    }

    public static final int ANTI_ALIAS_FLAG = android.graphics.Paint.ANTI_ALIAS_FLAG;
    public static final int CURSOR_AFTER = android.graphics.Paint.CURSOR_AFTER;
    public static final int CURSOR_AT = android.graphics.Paint.CURSOR_AT;
    public static final int CURSOR_AT_OR_AFTER = android.graphics.Paint.CURSOR_AT_OR_AFTER;
    public static final int CURSOR_AT_OR_BEFORE = android.graphics.Paint.CURSOR_AT_OR_BEFORE;
    public static final int CURSOR_BEFORE = android.graphics.Paint.CURSOR_BEFORE;
    public static final int DEV_KERN_TEXT_FLAG = android.graphics.Paint.DEV_KERN_TEXT_FLAG;
    public static final int DITHER_FLAG = android.graphics.Paint.DITHER_FLAG;
    public static final int EMBEDDED_BITMAP_TEXT_FLAG = android.graphics.Paint.EMBEDDED_BITMAP_TEXT_FLAG;
    public static final int END_HYPHEN_EDIT_INSERT_ARMENIAN_HYPHEN = android.graphics.Paint.END_HYPHEN_EDIT_INSERT_ARMENIAN_HYPHEN;
    public static final int END_HYPHEN_EDIT_INSERT_HYPHEN = android.graphics.Paint.END_HYPHEN_EDIT_INSERT_HYPHEN;
    public static final int END_HYPHEN_EDIT_INSERT_MAQAF = android.graphics.Paint.END_HYPHEN_EDIT_INSERT_MAQAF;
    public static final int END_HYPHEN_EDIT_INSERT_UCAS_HYPHEN = android.graphics.Paint.END_HYPHEN_EDIT_INSERT_UCAS_HYPHEN;
    public static final int END_HYPHEN_EDIT_INSERT_ZWJ_AND_HYPHEN = android.graphics.Paint.END_HYPHEN_EDIT_INSERT_ZWJ_AND_HYPHEN;
    public static final int END_HYPHEN_EDIT_NO_EDIT = android.graphics.Paint.END_HYPHEN_EDIT_NO_EDIT;
    public static final int END_HYPHEN_EDIT_REPLACE_WITH_HYPHEN = android.graphics.Paint.END_HYPHEN_EDIT_REPLACE_WITH_HYPHEN;
    public static final int FAKE_BOLD_TEXT_FLAG = android.graphics.Paint.FAKE_BOLD_TEXT_FLAG;
    public static final int FILTER_BITMAP_FLAG = android.graphics.Paint.FILTER_BITMAP_FLAG;
    public static final int HINTING_OFF = android.graphics.Paint.HINTING_OFF;
    public static final int HINTING_ON = android.graphics.Paint.HINTING_ON;
    public static final int LINEAR_TEXT_FLAG = android.graphics.Paint.LINEAR_TEXT_FLAG;
    public static final int START_HYPHEN_EDIT_INSERT_HYPHEN = android.graphics.Paint.START_HYPHEN_EDIT_INSERT_HYPHEN;
    public static final int START_HYPHEN_EDIT_INSERT_ZWJ = android.graphics.Paint.START_HYPHEN_EDIT_INSERT_ZWJ;
    public static final int START_HYPHEN_EDIT_NO_EDIT = android.graphics.Paint.START_HYPHEN_EDIT_NO_EDIT;
    public static final int STRIKE_THRU_TEXT_FLAG = android.graphics.Paint.STRIKE_THRU_TEXT_FLAG;
    public static final int SUBPIXEL_TEXT_FLAG = android.graphics.Paint.SUBPIXEL_TEXT_FLAG;
    public static final int TEXT_RUN_FLAG_LEFT_EDGE = android.graphics.Paint.TEXT_RUN_FLAG_LEFT_EDGE;
    public static final int TEXT_RUN_FLAG_RIGHT_EDGE = android.graphics.Paint.TEXT_RUN_FLAG_RIGHT_EDGE;
    public static final int UNDERLINE_TEXT_FLAG = android.graphics.Paint.UNDERLINE_TEXT_FLAG;
    public static final int VERTICAL_TEXT_FLAG = android.graphics.Paint.VERTICAL_TEXT_FLAG;

    public static final class Align {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Align(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Align wrap(android.graphics.Paint.Align real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Align(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Paint.Align getReal() {
            return (android.graphics.Paint.Align) real;
        }

        public android.graphics.Paint.Align unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Align valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Paint.Align.wrap(android.graphics.Paint.Align.valueOf(arg0));
        }

        public static android.graphics.Paint.Align[] values() {
            return android.graphics.Paint.Align.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Align CENTER = com.micklab.dcg.wrapper.android.graphics.Paint.Align.wrap(android.graphics.Paint.Align.CENTER);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Align LEFT = com.micklab.dcg.wrapper.android.graphics.Paint.Align.wrap(android.graphics.Paint.Align.LEFT);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Align RIGHT = com.micklab.dcg.wrapper.android.graphics.Paint.Align.wrap(android.graphics.Paint.Align.RIGHT);

    }
    public static final class Cap {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Cap(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Cap wrap(android.graphics.Paint.Cap real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Cap(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Paint.Cap getReal() {
            return (android.graphics.Paint.Cap) real;
        }

        public android.graphics.Paint.Cap unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Cap valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Paint.Cap.wrap(android.graphics.Paint.Cap.valueOf(arg0));
        }

        public static android.graphics.Paint.Cap[] values() {
            return android.graphics.Paint.Cap.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Cap BUTT = com.micklab.dcg.wrapper.android.graphics.Paint.Cap.wrap(android.graphics.Paint.Cap.BUTT);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Cap ROUND = com.micklab.dcg.wrapper.android.graphics.Paint.Cap.wrap(android.graphics.Paint.Cap.ROUND);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Cap SQUARE = com.micklab.dcg.wrapper.android.graphics.Paint.Cap.wrap(android.graphics.Paint.Cap.SQUARE);

    }
    public static final class FontMetrics {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FontMetrics(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics wrap(android.graphics.Paint.FontMetrics real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Paint.FontMetrics getReal() {
            return (android.graphics.Paint.FontMetrics) real;
        }

        public android.graphics.Paint.FontMetrics unwrap() {
            return getReal();
        }

        public FontMetrics() {
            this(new android.graphics.Paint.FontMetrics(), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.graphics.Paint.FontMetrics) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.graphics.Paint.FontMetrics) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.graphics.Paint.FontMetrics) real).toString();
        }


    }
    public static final class FontMetricsInt {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FontMetricsInt(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt wrap(android.graphics.Paint.FontMetricsInt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Paint.FontMetricsInt getReal() {
            return (android.graphics.Paint.FontMetricsInt) real;
        }

        public android.graphics.Paint.FontMetricsInt unwrap() {
            return getReal();
        }

        public FontMetricsInt() {
            this(new android.graphics.Paint.FontMetricsInt(), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.graphics.Paint.FontMetricsInt) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.graphics.Paint.FontMetricsInt) real).hashCode();
        }

        public void set(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg0) {
            ((android.graphics.Paint.FontMetricsInt) real).set(arg0 == null ? null : arg0.getReal());
        }

        public void set(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            ((android.graphics.Paint.FontMetricsInt) real).set(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.String toString() {
            return ((android.graphics.Paint.FontMetricsInt) real).toString();
        }


    }
    public static final class Join {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Join(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Join wrap(android.graphics.Paint.Join real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Join(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Paint.Join getReal() {
            return (android.graphics.Paint.Join) real;
        }

        public android.graphics.Paint.Join unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Join valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Paint.Join.wrap(android.graphics.Paint.Join.valueOf(arg0));
        }

        public static android.graphics.Paint.Join[] values() {
            return android.graphics.Paint.Join.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Join BEVEL = com.micklab.dcg.wrapper.android.graphics.Paint.Join.wrap(android.graphics.Paint.Join.BEVEL);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Join MITER = com.micklab.dcg.wrapper.android.graphics.Paint.Join.wrap(android.graphics.Paint.Join.MITER);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Join ROUND = com.micklab.dcg.wrapper.android.graphics.Paint.Join.wrap(android.graphics.Paint.Join.ROUND);

    }
    public static final class Style {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Style(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Style wrap(android.graphics.Paint.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Style(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Paint.Style getReal() {
            return (android.graphics.Paint.Style) real;
        }

        public android.graphics.Paint.Style unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Style valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Paint.Style.wrap(android.graphics.Paint.Style.valueOf(arg0));
        }

        public static android.graphics.Paint.Style[] values() {
            return android.graphics.Paint.Style.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Style FILL = com.micklab.dcg.wrapper.android.graphics.Paint.Style.wrap(android.graphics.Paint.Style.FILL);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Style FILL_AND_STROKE = com.micklab.dcg.wrapper.android.graphics.Paint.Style.wrap(android.graphics.Paint.Style.FILL_AND_STROKE);
        public static final com.micklab.dcg.wrapper.android.graphics.Paint.Style STROKE = com.micklab.dcg.wrapper.android.graphics.Paint.Style.wrap(android.graphics.Paint.Style.STROKE);

    }
}
