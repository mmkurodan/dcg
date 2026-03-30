// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Paint {
    private final android.graphics.Paint real;

    public Paint(android.graphics.Paint real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Paint wrap(android.graphics.Paint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint(real);
    }

    public android.graphics.Paint unwrap() {
        return real;
    }

    public Paint() {
        this(new android.graphics.Paint());
    }

    public Paint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        this(new android.graphics.Paint(arg0 == null ? null : arg0.unwrap()));
    }

    public Paint(int arg0) {
        this(new android.graphics.Paint(arg0));
    }

    public float ascent() {
        return real.ascent();
    }

    public int breakText(java.lang.String arg0, boolean arg1, float arg2, float[] arg3) {
        return real.breakText(arg0, arg1, arg2, arg3);
    }

    public int breakText(char[] arg0, int arg1, int arg2, float arg3, float[] arg4) {
        return real.breakText(arg0, arg1, arg2, arg3, arg4);
    }

    public int breakText(java.lang.CharSequence arg0, int arg1, int arg2, boolean arg3, float arg4, float[] arg5) {
        return real.breakText(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void clearShadowLayer() {
        real.clearShadowLayer();
    }

    public float descent() {
        return real.descent();
    }

    public boolean equalsForTextMeasurement(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        return real.equalsForTextMeasurement(arg0 == null ? null : arg0.unwrap());
    }

    public int getAlpha() {
        return real.getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getBlendMode());
    }

    public int getColor() {
        return real.getColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.getColorFilter());
    }

    public long getColorLong() {
        return real.getColorLong();
    }

    public int getEndHyphenEdit() {
        return real.getEndHyphenEdit();
    }

    public boolean getFillPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        return real.getFillPath(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int getFlags() {
        return real.getFlags();
    }

    public java.lang.String getFontFeatureSettings() {
        return real.getFontFeatureSettings();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics getFontMetrics() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics.wrap(real.getFontMetrics());
    }

    public float getFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
        return real.getFontMetrics(arg0 == null ? null : arg0.unwrap());
    }

    public void getFontMetricsForLocale(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
        real.getFontMetricsForLocale(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt getFontMetricsInt() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt.wrap(real.getFontMetricsInt());
    }

    public int getFontMetricsInt(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg0) {
        return real.getFontMetricsInt(arg0 == null ? null : arg0.unwrap());
    }

    public void getFontMetricsInt(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg6) {
        real.getFontMetricsInt(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void getFontMetricsInt(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg6) {
        real.getFontMetricsInt(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void getFontMetricsIntForLocale(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg0) {
        real.getFontMetricsIntForLocale(arg0 == null ? null : arg0.unwrap());
    }

    public float getFontSpacing() {
        return real.getFontSpacing();
    }

    public java.lang.String getFontVariationSettings() {
        return real.getFontVariationSettings();
    }

    public int getHinting() {
        return real.getHinting();
    }

    public float getLetterSpacing() {
        return real.getLetterSpacing();
    }

    public com.micklab.dcg.wrapper.android.graphics.MaskFilter getMaskFilter() {
        return com.micklab.dcg.wrapper.android.graphics.MaskFilter.wrap(real.getMaskFilter());
    }

    public int getOffsetForAdvance(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6) {
        return real.getOffsetForAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int getOffsetForAdvance(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6) {
        return real.getOffsetForAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public com.micklab.dcg.wrapper.android.graphics.PathEffect getPathEffect() {
        return com.micklab.dcg.wrapper.android.graphics.PathEffect.wrap(real.getPathEffect());
    }

    public float getRunAdvance(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        return real.getRunAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public float getRunAdvance(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        return real.getRunAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public float getRunCharacterAdvance(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, float[] arg7, int arg8) {
        return real.getRunCharacterAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public float getRunCharacterAdvance(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, float[] arg7, int arg8) {
        return real.getRunCharacterAdvance(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader getShader() {
        return com.micklab.dcg.wrapper.android.graphics.Shader.wrap(real.getShader());
    }

    public int getShadowLayerColor() {
        return real.getShadowLayerColor();
    }

    public long getShadowLayerColorLong() {
        return real.getShadowLayerColorLong();
    }

    public float getShadowLayerDx() {
        return real.getShadowLayerDx();
    }

    public float getShadowLayerDy() {
        return real.getShadowLayerDy();
    }

    public float getShadowLayerRadius() {
        return real.getShadowLayerRadius();
    }

    public int getStartHyphenEdit() {
        return real.getStartHyphenEdit();
    }

    public float getStrikeThruPosition() {
        return real.getStrikeThruPosition();
    }

    public float getStrikeThruThickness() {
        return real.getStrikeThruThickness();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Cap getStrokeCap() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Cap.wrap(real.getStrokeCap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Join getStrokeJoin() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Join.wrap(real.getStrokeJoin());
    }

    public float getStrokeMiter() {
        return real.getStrokeMiter();
    }

    public float getStrokeWidth() {
        return real.getStrokeWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Style getStyle() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Style.wrap(real.getStyle());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.Align getTextAlign() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.Align.wrap(real.getTextAlign());
    }

    public void getTextBounds(java.lang.String arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3) {
        real.getTextBounds(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void getTextBounds(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3) {
        real.getTextBounds(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void getTextBounds(char[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3) {
        real.getTextBounds(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public java.util.Locale getTextLocale() {
        return real.getTextLocale();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getTextLocales());
    }

    public void getTextPath(java.lang.String arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Path arg5) {
        real.getTextPath(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void getTextPath(char[] arg0, int arg1, int arg2, float arg3, float arg4, com.micklab.dcg.wrapper.android.graphics.Path arg5) {
        real.getTextPath(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public float getTextRunAdvances(char[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        return real.getTextRunAdvances(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public int getTextRunCursor(java.lang.CharSequence arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        return real.getTextRunCursor(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public int getTextRunCursor(char[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        return real.getTextRunCursor(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public float getTextScaleX() {
        return real.getTextScaleX();
    }

    public float getTextSize() {
        return real.getTextSize();
    }

    public float getTextSkewX() {
        return real.getTextSkewX();
    }

    public int getTextWidths(java.lang.String arg0, float[] arg1) {
        return real.getTextWidths(arg0, arg1);
    }

    public int getTextWidths(java.lang.CharSequence arg0, int arg1, int arg2, float[] arg3) {
        return real.getTextWidths(arg0, arg1, arg2, arg3);
    }

    public int getTextWidths(java.lang.String arg0, int arg1, int arg2, float[] arg3) {
        return real.getTextWidths(arg0, arg1, arg2, arg3);
    }

    public int getTextWidths(char[] arg0, int arg1, int arg2, float[] arg3) {
        return real.getTextWidths(arg0, arg1, arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.getTypeface());
    }

    public float getUnderlinePosition() {
        return real.getUnderlinePosition();
    }

    public float getUnderlineThickness() {
        return real.getUnderlineThickness();
    }

    public float getWordSpacing() {
        return real.getWordSpacing();
    }

    public com.micklab.dcg.wrapper.android.graphics.Xfermode getXfermode() {
        return com.micklab.dcg.wrapper.android.graphics.Xfermode.wrap(real.getXfermode());
    }

    public boolean hasGlyph(java.lang.String arg0) {
        return real.hasGlyph(arg0);
    }

    public boolean isAntiAlias() {
        return real.isAntiAlias();
    }

    public boolean isDither() {
        return real.isDither();
    }

    public boolean isElegantTextHeight() {
        return real.isElegantTextHeight();
    }

    public boolean isFakeBoldText() {
        return real.isFakeBoldText();
    }

    public boolean isFilterBitmap() {
        return real.isFilterBitmap();
    }

    public boolean isLinearText() {
        return real.isLinearText();
    }

    public boolean isStrikeThruText() {
        return real.isStrikeThruText();
    }

    public boolean isSubpixelText() {
        return real.isSubpixelText();
    }

    public boolean isUnderlineText() {
        return real.isUnderlineText();
    }

    public float measureText(java.lang.String arg0) {
        return real.measureText(arg0);
    }

    public float measureText(java.lang.String arg0, int arg1, int arg2) {
        return real.measureText(arg0, arg1, arg2);
    }

    public float measureText(char[] arg0, int arg1, int arg2) {
        return real.measureText(arg0, arg1, arg2);
    }

    public float measureText(java.lang.CharSequence arg0, int arg1, int arg2) {
        return real.measureText(arg0, arg1, arg2);
    }

    public void reset() {
        real.reset();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void setARGB(int arg0, int arg1, int arg2, int arg3) {
        real.setARGB(arg0, arg1, arg2, arg3);
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setAntiAlias(boolean arg0) {
        real.setAntiAlias(arg0);
    }

    public void setBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setColor(long arg0) {
        real.setColor(arg0);
    }

    public void setColor(int arg0) {
        real.setColor(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.setColorFilter(arg0 == null ? null : arg0.unwrap()));
    }

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setElegantTextHeight(boolean arg0) {
        real.setElegantTextHeight(arg0);
    }

    public void setEndHyphenEdit(int arg0) {
        real.setEndHyphenEdit(arg0);
    }

    public void setFakeBoldText(boolean arg0) {
        real.setFakeBoldText(arg0);
    }

    public void setFilterBitmap(boolean arg0) {
        real.setFilterBitmap(arg0);
    }

    public void setFlags(int arg0) {
        real.setFlags(arg0);
    }

    public void setFontFeatureSettings(java.lang.String arg0) {
        real.setFontFeatureSettings(arg0);
    }

    public boolean setFontVariationSettings(java.lang.String arg0) {
        return real.setFontVariationSettings(arg0);
    }

    public void setHinting(int arg0) {
        real.setHinting(arg0);
    }

    public void setLetterSpacing(float arg0) {
        real.setLetterSpacing(arg0);
    }

    public void setLinearText(boolean arg0) {
        real.setLinearText(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.MaskFilter setMaskFilter(com.micklab.dcg.wrapper.android.graphics.MaskFilter arg0) {
        return com.micklab.dcg.wrapper.android.graphics.MaskFilter.wrap(real.setMaskFilter(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.PathEffect setPathEffect(com.micklab.dcg.wrapper.android.graphics.PathEffect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.PathEffect.wrap(real.setPathEffect(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader setShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Shader.wrap(real.setShader(arg0 == null ? null : arg0.unwrap()));
    }

    public void setShadowLayer(float arg0, float arg1, float arg2, int arg3) {
        real.setShadowLayer(arg0, arg1, arg2, arg3);
    }

    public void setShadowLayer(float arg0, float arg1, float arg2, long arg3) {
        real.setShadowLayer(arg0, arg1, arg2, arg3);
    }

    public void setStartHyphenEdit(int arg0) {
        real.setStartHyphenEdit(arg0);
    }

    public void setStrikeThruText(boolean arg0) {
        real.setStrikeThruText(arg0);
    }

    public void setStrokeCap(com.micklab.dcg.wrapper.android.graphics.Paint.Cap arg0) {
        real.setStrokeCap(arg0 == null ? null : arg0.unwrap());
    }

    public void setStrokeJoin(com.micklab.dcg.wrapper.android.graphics.Paint.Join arg0) {
        real.setStrokeJoin(arg0 == null ? null : arg0.unwrap());
    }

    public void setStrokeMiter(float arg0) {
        real.setStrokeMiter(arg0);
    }

    public void setStrokeWidth(float arg0) {
        real.setStrokeWidth(arg0);
    }

    public void setStyle(com.micklab.dcg.wrapper.android.graphics.Paint.Style arg0) {
        real.setStyle(arg0 == null ? null : arg0.unwrap());
    }

    public void setSubpixelText(boolean arg0) {
        real.setSubpixelText(arg0);
    }

    public void setTextAlign(com.micklab.dcg.wrapper.android.graphics.Paint.Align arg0) {
        real.setTextAlign(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextLocale(java.util.Locale arg0) {
        real.setTextLocale(arg0);
    }

    public void setTextLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        real.setTextLocales(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextScaleX(float arg0) {
        real.setTextScaleX(arg0);
    }

    public void setTextSize(float arg0) {
        real.setTextSize(arg0);
    }

    public void setTextSkewX(float arg0) {
        real.setTextSkewX(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface setTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.setTypeface(arg0 == null ? null : arg0.unwrap()));
    }

    public void setUnderlineText(boolean arg0) {
        real.setUnderlineText(arg0);
    }

    public void setWordSpacing(float arg0) {
        real.setWordSpacing(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Xfermode setXfermode(com.micklab.dcg.wrapper.android.graphics.Xfermode arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Xfermode.wrap(real.setXfermode(arg0 == null ? null : arg0.unwrap()));
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

    public static final class Align {
        private final android.graphics.Paint.Align real;

        public Align(android.graphics.Paint.Align real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Align wrap(android.graphics.Paint.Align real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Align(real);
        }

        public android.graphics.Paint.Align unwrap() {
            return real;
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
        private final android.graphics.Paint.Cap real;

        public Cap(android.graphics.Paint.Cap real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Cap wrap(android.graphics.Paint.Cap real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Cap(real);
        }

        public android.graphics.Paint.Cap unwrap() {
            return real;
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
        private final android.graphics.Paint.FontMetrics real;

        public FontMetrics(android.graphics.Paint.FontMetrics real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics wrap(android.graphics.Paint.FontMetrics real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics(real);
        }

        public android.graphics.Paint.FontMetrics unwrap() {
            return real;
        }

        public FontMetrics() {
            this(new android.graphics.Paint.FontMetrics());
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
    public static final class FontMetricsInt {
        private final android.graphics.Paint.FontMetricsInt real;

        public FontMetricsInt(android.graphics.Paint.FontMetricsInt real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt wrap(android.graphics.Paint.FontMetricsInt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt(real);
        }

        public android.graphics.Paint.FontMetricsInt unwrap() {
            return real;
        }

        public FontMetricsInt() {
            this(new android.graphics.Paint.FontMetricsInt());
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void set(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg0) {
            real.set(arg0 == null ? null : arg0.unwrap());
        }

        public void set(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            real.set(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
    public static final class Join {
        private final android.graphics.Paint.Join real;

        public Join(android.graphics.Paint.Join real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Join wrap(android.graphics.Paint.Join real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Join(real);
        }

        public android.graphics.Paint.Join unwrap() {
            return real;
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
        private final android.graphics.Paint.Style real;

        public Style(android.graphics.Paint.Style real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Paint.Style wrap(android.graphics.Paint.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Paint.Style(real);
        }

        public android.graphics.Paint.Style unwrap() {
            return real;
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
