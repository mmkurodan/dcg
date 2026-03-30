// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Layout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Layout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Layout wrap(android.text.Layout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout(real, (__DcgwBridgeToken) null);
    }

    public android.text.Layout getReal() {
        return (android.text.Layout) real;
    }

    public android.text.Layout unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF computeDrawingBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.text.Layout) real).computeDrawingBoundingBox());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.text.Layout) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, com.micklab.dcg.wrapper.android.graphics.Paint arg2, int arg3) {
        ((android.text.Layout) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void drawBackground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.text.Layout) real).drawBackground(arg0 == null ? null : arg0.getReal());
    }

    public void drawText(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.text.Layout) real).drawText(arg0 == null ? null : arg0.getReal());
    }

    public void fillCharacterBounds(int arg0, int arg1, float[] arg2, int arg3) {
        ((android.text.Layout) real).fillCharacterBounds(arg0, arg1, arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Alignment getAlignment() {
        return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(((android.text.Layout) real).getAlignment());
    }

    public int getBottomPadding() {
        return ((android.text.Layout) real).getBottomPadding();
    }

    public int getBreakStrategy() {
        return ((android.text.Layout) real).getBreakStrategy();
    }

    public void getCursorPath(int arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, java.lang.CharSequence arg2) {
        ((android.text.Layout) real).getCursorPath(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static float getDesiredWidth(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1) {
        return android.text.Layout.getDesiredWidth(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static float getDesiredWidth(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3) {
        return android.text.Layout.getDesiredWidth(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public int getEllipsisCount(int arg0) {
        return ((android.text.Layout) real).getEllipsisCount(arg0);
    }

    public int getEllipsisStart(int arg0) {
        return ((android.text.Layout) real).getEllipsisStart(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt getEllipsize() {
        return com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(((android.text.Layout) real).getEllipsize());
    }

    public int getEllipsizedWidth() {
        return ((android.text.Layout) real).getEllipsizedWidth();
    }

    public int getHeight() {
        return ((android.text.Layout) real).getHeight();
    }

    public int getHyphenationFrequency() {
        return ((android.text.Layout) real).getHyphenationFrequency();
    }

    public int getJustificationMode() {
        return ((android.text.Layout) real).getJustificationMode();
    }

    public int[] getLeftIndents() {
        return ((android.text.Layout) real).getLeftIndents();
    }

    public int getLineAscent(int arg0) {
        return ((android.text.Layout) real).getLineAscent(arg0);
    }

    public int getLineBaseline(int arg0) {
        return ((android.text.Layout) real).getLineBaseline(arg0);
    }

    public int getLineBottom(int arg0) {
        return ((android.text.Layout) real).getLineBottom(arg0);
    }

    public int getLineBottom(int arg0, boolean arg1) {
        return ((android.text.Layout) real).getLineBottom(arg0, arg1);
    }

    public int getLineBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.text.Layout) real).getLineBounds(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(((android.text.Layout) real).getLineBreakConfig());
    }

    public boolean getLineContainsTab(int arg0) {
        return ((android.text.Layout) real).getLineContainsTab(arg0);
    }

    public int getLineCount() {
        return ((android.text.Layout) real).getLineCount();
    }

    public int getLineDescent(int arg0) {
        return ((android.text.Layout) real).getLineDescent(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Directions getLineDirections(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Directions.wrap(((android.text.Layout) real).getLineDirections(arg0));
    }

    public int getLineEnd(int arg0) {
        return ((android.text.Layout) real).getLineEnd(arg0);
    }

    public int getLineForOffset(int arg0) {
        return ((android.text.Layout) real).getLineForOffset(arg0);
    }

    public int getLineForVertical(int arg0) {
        return ((android.text.Layout) real).getLineForVertical(arg0);
    }

    public float getLineLeft(int arg0) {
        return ((android.text.Layout) real).getLineLeft(arg0);
    }

    public int getLineLetterSpacingUnitCount(int arg0, boolean arg1) {
        return ((android.text.Layout) real).getLineLetterSpacingUnitCount(arg0, arg1);
    }

    public float getLineMax(int arg0) {
        return ((android.text.Layout) real).getLineMax(arg0);
    }

    public float getLineRight(int arg0) {
        return ((android.text.Layout) real).getLineRight(arg0);
    }

    public float getLineSpacingAmount() {
        return ((android.text.Layout) real).getLineSpacingAmount();
    }

    public float getLineSpacingMultiplier() {
        return ((android.text.Layout) real).getLineSpacingMultiplier();
    }

    public int getLineStart(int arg0) {
        return ((android.text.Layout) real).getLineStart(arg0);
    }

    public int getLineTop(int arg0) {
        return ((android.text.Layout) real).getLineTop(arg0);
    }

    public int getLineVisibleEnd(int arg0) {
        return ((android.text.Layout) real).getLineVisibleEnd(arg0);
    }

    public float getLineWidth(int arg0) {
        return ((android.text.Layout) real).getLineWidth(arg0);
    }

    public int getMaxLines() {
        return ((android.text.Layout) real).getMaxLines();
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics getMinimumFontMetrics() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics.wrap(((android.text.Layout) real).getMinimumFontMetrics());
    }

    public int getOffsetForHorizontal(int arg0, float arg1) {
        return ((android.text.Layout) real).getOffsetForHorizontal(arg0, arg1);
    }

    public int getOffsetToLeftOf(int arg0) {
        return ((android.text.Layout) real).getOffsetToLeftOf(arg0);
    }

    public int getOffsetToRightOf(int arg0) {
        return ((android.text.Layout) real).getOffsetToRightOf(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.TextPaint getPaint() {
        return com.micklab.dcg.wrapper.android.text.TextPaint.wrap(((android.text.Layout) real).getPaint());
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Alignment getParagraphAlignment(int arg0) {
        return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(((android.text.Layout) real).getParagraphAlignment(arg0));
    }

    public int getParagraphDirection(int arg0) {
        return ((android.text.Layout) real).getParagraphDirection(arg0);
    }

    public int getParagraphLeft(int arg0) {
        return ((android.text.Layout) real).getParagraphLeft(arg0);
    }

    public int getParagraphRight(int arg0) {
        return ((android.text.Layout) real).getParagraphRight(arg0);
    }

    public float getPrimaryHorizontal(int arg0) {
        return ((android.text.Layout) real).getPrimaryHorizontal(arg0);
    }

    public int[] getRangeForRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.text.SegmentFinder arg1, com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy arg2) {
        return ((android.text.Layout) real).getRangeForRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int[] getRightIndents() {
        return ((android.text.Layout) real).getRightIndents();
    }

    public float getSecondaryHorizontal(int arg0) {
        return ((android.text.Layout) real).getSecondaryHorizontal(arg0);
    }

    public void getSelectionPath(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        ((android.text.Layout) real).getSelectionPath(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean getShiftDrawingOffsetForStartOverhang() {
        return ((android.text.Layout) real).getShiftDrawingOffsetForStartOverhang();
    }

    public float getSpacingAdd() {
        return ((android.text.Layout) real).getSpacingAdd();
    }

    public float getSpacingMultiplier() {
        return ((android.text.Layout) real).getSpacingMultiplier();
    }

    public java.lang.CharSequence getText() {
        return ((android.text.Layout) real).getText();
    }

    public com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic getTextDirectionHeuristic() {
        return com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(((android.text.Layout) real).getTextDirectionHeuristic());
    }

    public int getTopPadding() {
        return ((android.text.Layout) real).getTopPadding();
    }

    public boolean getUseBoundsForWidth() {
        return ((android.text.Layout) real).getUseBoundsForWidth();
    }

    public int getWidth() {
        return ((android.text.Layout) real).getWidth();
    }

    public void increaseWidthTo(int arg0) {
        ((android.text.Layout) real).increaseWidthTo(arg0);
    }

    public boolean isFallbackLineSpacingEnabled() {
        return ((android.text.Layout) real).isFallbackLineSpacingEnabled();
    }

    public boolean isFontPaddingIncluded() {
        return ((android.text.Layout) real).isFontPaddingIncluded();
    }

    public boolean isRtlCharAt(int arg0) {
        return ((android.text.Layout) real).isRtlCharAt(arg0);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Alignment(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Alignment wrap(android.text.Layout.Alignment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.Alignment(real, (__DcgwBridgeToken) null);
        }

        public android.text.Layout.Alignment getReal() {
            return (android.text.Layout.Alignment) real;
        }

        public android.text.Layout.Alignment unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Builder wrap(android.text.Layout.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.text.Layout.Builder getReal() {
            return (android.text.Layout.Builder) real;
        }

        public android.text.Layout.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.TextPaint arg3, int arg4) {
            this(new android.text.Layout.Builder(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.text.Layout build() {
            return com.micklab.dcg.wrapper.android.text.Layout.wrap(((android.text.Layout.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setAlignment(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setAlignment(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setEllipsize(com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setEllipsize(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setEllipsizedWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setEllipsizedWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setFallbackLineSpacingEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setFallbackLineSpacingEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setFontPaddingIncluded(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setFontPaddingIncluded(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLeftIndents(int[] arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setLeftIndents(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setLineBreakConfig(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLineSpacingAmount(float arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setLineSpacingAmount(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setLineSpacingMultiplier(float arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setLineSpacingMultiplier(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setMaxLines(int arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setMaxLines(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setMinimumFontMetrics(com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setMinimumFontMetrics(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setRightIndents(int[] arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setRightIndents(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setShiftDrawingOffsetForStartOverhang(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setShiftDrawingOffsetForStartOverhang(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setTextDirectionHeuristic(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setTextDirectionHeuristic(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.Layout.Builder.wrap(((android.text.Layout.Builder) real).setUseBoundsForWidth(arg0));
        }

    }
    public static final class Directions {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Directions(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.Directions wrap(android.text.Layout.Directions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.Directions(real, (__DcgwBridgeToken) null);
        }

        public android.text.Layout.Directions getReal() {
            return (android.text.Layout.Directions) real;
        }

        public android.text.Layout.Directions unwrap() {
            return getReal();
        }

    }
    public static final class TextInclusionStrategy {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TextInclusionStrategy(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy wrap(android.text.Layout.TextInclusionStrategy real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy(real, (__DcgwBridgeToken) null);
        }

        public android.text.Layout.TextInclusionStrategy getReal() {
            return (android.text.Layout.TextInclusionStrategy) real;
        }

        public android.text.Layout.TextInclusionStrategy unwrap() {
            return getReal();
        }

        public boolean isSegmentInside(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
            return ((android.text.Layout.TextInclusionStrategy) real).isSegmentInside(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
