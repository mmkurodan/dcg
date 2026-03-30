// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Layout {
    private final android.text.Layout real;

    public Layout(android.text.Layout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Layout wrap(android.text.Layout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout(real);
    }

    public android.text.Layout unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF computeDrawingBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.computeDrawingBoundingBox());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2, int arg3) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void drawBackground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.drawBackground(arg0 == null ? null : arg0.unwrap());
    }

    public void drawText(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.drawText(arg0 == null ? null : arg0.unwrap());
    }

    public void fillCharacterBounds(int arg0, int arg1, float[] arg2, int arg3) {
        real.fillCharacterBounds(arg0, arg1, arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Alignment getAlignment() {
        return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(real.getAlignment());
    }

    public int getBottomPadding() {
        return real.getBottomPadding();
    }

    public int getBreakStrategy() {
        return real.getBreakStrategy();
    }

    public void getCursorPath(int arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, java.lang.CharSequence arg2) {
        real.getCursorPath(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static float getDesiredWidth(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1) {
        return android.text.Layout.getDesiredWidth(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static float getDesiredWidth(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3) {
        return android.text.Layout.getDesiredWidth(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public int getEllipsisCount(int arg0) {
        return real.getEllipsisCount(arg0);
    }

    public int getEllipsisStart(int arg0) {
        return real.getEllipsisStart(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt getEllipsize() {
        return com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(real.getEllipsize());
    }

    public int getEllipsizedWidth() {
        return real.getEllipsizedWidth();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getHyphenationFrequency() {
        return real.getHyphenationFrequency();
    }

    public int getJustificationMode() {
        return real.getJustificationMode();
    }

    public int[] getLeftIndents() {
        return real.getLeftIndents();
    }

    public int getLineAscent(int arg0) {
        return real.getLineAscent(arg0);
    }

    public int getLineBaseline(int arg0) {
        return real.getLineBaseline(arg0);
    }

    public int getLineBottom(int arg0) {
        return real.getLineBottom(arg0);
    }

    public int getLineBottom(int arg0, boolean arg1) {
        return real.getLineBottom(arg0, arg1);
    }

    public int getLineBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return real.getLineBounds(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(real.getLineBreakConfig());
    }

    public boolean getLineContainsTab(int arg0) {
        return real.getLineContainsTab(arg0);
    }

    public int getLineCount() {
        return real.getLineCount();
    }

    public int getLineDescent(int arg0) {
        return real.getLineDescent(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Directions getLineDirections(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Directions.wrap(real.getLineDirections(arg0));
    }

    public int getLineEnd(int arg0) {
        return real.getLineEnd(arg0);
    }

    public int getLineForOffset(int arg0) {
        return real.getLineForOffset(arg0);
    }

    public int getLineForVertical(int arg0) {
        return real.getLineForVertical(arg0);
    }

    public float getLineLeft(int arg0) {
        return real.getLineLeft(arg0);
    }

    public int getLineLetterSpacingUnitCount(int arg0, boolean arg1) {
        return real.getLineLetterSpacingUnitCount(arg0, arg1);
    }

    public float getLineMax(int arg0) {
        return real.getLineMax(arg0);
    }

    public float getLineRight(int arg0) {
        return real.getLineRight(arg0);
    }

    public float getLineSpacingAmount() {
        return real.getLineSpacingAmount();
    }

    public float getLineSpacingMultiplier() {
        return real.getLineSpacingMultiplier();
    }

    public int getLineStart(int arg0) {
        return real.getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return real.getLineTop(arg0);
    }

    public int getLineVisibleEnd(int arg0) {
        return real.getLineVisibleEnd(arg0);
    }

    public float getLineWidth(int arg0) {
        return real.getLineWidth(arg0);
    }

    public int getMaxLines() {
        return real.getMaxLines();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics getMinimumFontMetrics() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics.wrap(real.getMinimumFontMetrics());
    }

    public int getOffsetForHorizontal(int arg0, float arg1) {
        return real.getOffsetForHorizontal(arg0, arg1);
    }

    public int getOffsetToLeftOf(int arg0) {
        return real.getOffsetToLeftOf(arg0);
    }

    public int getOffsetToRightOf(int arg0) {
        return real.getOffsetToRightOf(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.TextPaint getPaint() {
        return com.micklab.dcg.wrapper.android.text.TextPaint.wrap(real.getPaint());
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Alignment getParagraphAlignment(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(real.getParagraphAlignment(arg0));
    }

    public int getParagraphDirection(int arg0) {
        return real.getParagraphDirection(arg0);
    }

    public int getParagraphLeft(int arg0) {
        return real.getParagraphLeft(arg0);
    }

    public int getParagraphRight(int arg0) {
        return real.getParagraphRight(arg0);
    }

    public float getPrimaryHorizontal(int arg0) {
        return real.getPrimaryHorizontal(arg0);
    }

    public int[] getRangeForRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.text.SegmentFinder arg1, com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy arg2) {
        return real.getRangeForRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public int[] getRightIndents() {
        return real.getRightIndents();
    }

    public float getSecondaryHorizontal(int arg0) {
        return real.getSecondaryHorizontal(arg0);
    }

    public void getSelectionPath(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        real.getSelectionPath(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean getShiftDrawingOffsetForStartOverhang() {
        return real.getShiftDrawingOffsetForStartOverhang();
    }

    public float getSpacingAdd() {
        return real.getSpacingAdd();
    }

    public float getSpacingMultiplier() {
        return real.getSpacingMultiplier();
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic getTextDirectionHeuristic() {
        return com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(real.getTextDirectionHeuristic());
    }

    public int getTopPadding() {
        return real.getTopPadding();
    }

    public boolean getUseBoundsForWidth() {
        return real.getUseBoundsForWidth();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public void increaseWidthTo(int arg0) {
        real.increaseWidthTo(arg0);
    }

    public boolean isFallbackLineSpacingEnabled() {
        return real.isFallbackLineSpacingEnabled();
    }

    public boolean isFontPaddingIncluded() {
        return real.isFontPaddingIncluded();
    }

    public boolean isRtlCharAt(int arg0) {
        return real.isRtlCharAt(arg0);
    }

    public static final int BREAK_STRATEGY_BALANCED = android.text.Layout.BREAK_STRATEGY_BALANCED;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = android.text.Layout.BREAK_STRATEGY_HIGH_QUALITY;
    public static final int BREAK_STRATEGY_SIMPLE = android.text.Layout.BREAK_STRATEGY_SIMPLE;
    public static final float DEFAULT_LINESPACING_ADDITION = android.text.Layout.DEFAULT_LINESPACING_ADDITION;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = android.text.Layout.DEFAULT_LINESPACING_MULTIPLIER;
    public static final int DIR_LEFT_TO_RIGHT = android.text.Layout.DIR_LEFT_TO_RIGHT;
    public static final int DIR_RIGHT_TO_LEFT = android.text.Layout.DIR_RIGHT_TO_LEFT;
    public static final int HYPHENATION_FREQUENCY_FULL = android.text.Layout.HYPHENATION_FREQUENCY_FULL;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = android.text.Layout.HYPHENATION_FREQUENCY_FULL_FAST;
    public static final int HYPHENATION_FREQUENCY_NONE = android.text.Layout.HYPHENATION_FREQUENCY_NONE;
    public static final int HYPHENATION_FREQUENCY_NORMAL = android.text.Layout.HYPHENATION_FREQUENCY_NORMAL;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = android.text.Layout.HYPHENATION_FREQUENCY_NORMAL_FAST;
    public static final com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_ANY_OVERLAP = com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy.wrap(android.text.Layout.INCLUSION_STRATEGY_ANY_OVERLAP);
    public static final com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_ALL = com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy.wrap(android.text.Layout.INCLUSION_STRATEGY_CONTAINS_ALL);
    public static final com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_CENTER = com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy.wrap(android.text.Layout.INCLUSION_STRATEGY_CONTAINS_CENTER);
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = android.text.Layout.JUSTIFICATION_MODE_INTER_CHARACTER;
    public static final int JUSTIFICATION_MODE_INTER_WORD = android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;
    public static final int JUSTIFICATION_MODE_NONE = android.text.Layout.JUSTIFICATION_MODE_NONE;

    public static final class Alignment {
        private final android.text.Layout.Alignment real;

        public Alignment(android.text.Layout.Alignment real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Alignment wrap(android.text.Layout.Alignment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.Alignment(real);
        }

        public android.text.Layout.Alignment unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Alignment valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(android.text.Layout.Alignment.valueOf(arg0));
        }

        public static android.text.Layout.Alignment[] values() {
            return android.text.Layout.Alignment.values();
        }

        public static final com.micklab.dcg.wrapper.android.text.Layout.Alignment ALIGN_CENTER = com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(android.text.Layout.Alignment.ALIGN_CENTER);
        public static final com.micklab.dcg.wrapper.android.text.Layout.Alignment ALIGN_NORMAL = com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(android.text.Layout.Alignment.ALIGN_NORMAL);
        public static final com.micklab.dcg.wrapper.android.text.Layout.Alignment ALIGN_OPPOSITE = com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(android.text.Layout.Alignment.ALIGN_OPPOSITE);

    }
    public static final class Builder {
        private final android.text.Layout.Builder real;

        public Builder(android.text.Layout.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Builder wrap(android.text.Layout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.Builder(real);
        }

        public android.text.Layout.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3, int arg4) {
            this(new android.text.Layout.Builder(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4));
        }

        public com.micklab.dcg.wrapper.android.text.Layout build() {
            return com.micklab.dcg.wrapper.android.text.Layout.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setAlignment(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setAlignment(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setEllipsize(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setEllipsizedWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setEllipsizedWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setFallbackLineSpacingEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setFallbackLineSpacingEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setFontPaddingIncluded(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setFontPaddingIncluded(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLeftIndents(int[] arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setLeftIndents(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setLineBreakConfig(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLineSpacingAmount(float arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setLineSpacingAmount(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLineSpacingMultiplier(float arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setLineSpacingMultiplier(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setMaxLines(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setMaxLines(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setMinimumFontMetrics(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setRightIndents(int[] arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setRightIndents(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setShiftDrawingOffsetForStartOverhang(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setShiftDrawingOffsetForStartOverhang(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setTextDirectionHeuristic(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setTextDirectionHeuristic(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(real.setUseBoundsForWidth(arg0));
        }

    }
    public static final class Directions {
        private final android.text.Layout.Directions real;

        public Directions(android.text.Layout.Directions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Directions wrap(android.text.Layout.Directions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.Directions(real);
        }

        public android.text.Layout.Directions unwrap() {
            return real;
        }

    }
    public static final class TextInclusionStrategy {
        private final android.text.Layout.TextInclusionStrategy real;

        public TextInclusionStrategy(android.text.Layout.TextInclusionStrategy real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy wrap(android.text.Layout.TextInclusionStrategy real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy(real);
        }

        public android.text.Layout.TextInclusionStrategy unwrap() {
            return real;
        }

        public boolean isSegmentInside(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
            return real.isSegmentInside(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
