// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class LineBreaker {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LineBreaker(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker wrap(android.graphics.text.LineBreaker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.text.LineBreaker getReal() {
        return (android.graphics.text.LineBreaker) real;
    }

    public android.graphics.text.LineBreaker unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result computeLineBreaks(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0, com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.ParagraphConstraints arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result.wrap(((android.graphics.text.LineBreaker) real).computeLineBreaks(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static final int BREAK_STRATEGY_BALANCED = android.graphics.text.LineBreaker.BREAK_STRATEGY_BALANCED;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = android.graphics.text.LineBreaker.BREAK_STRATEGY_HIGH_QUALITY;
    public static final int BREAK_STRATEGY_SIMPLE = android.graphics.text.LineBreaker.BREAK_STRATEGY_SIMPLE;
    public static final int HYPHENATION_FREQUENCY_FULL = android.graphics.text.LineBreaker.HYPHENATION_FREQUENCY_FULL;
    public static final int HYPHENATION_FREQUENCY_NONE = android.graphics.text.LineBreaker.HYPHENATION_FREQUENCY_NONE;
    public static final int HYPHENATION_FREQUENCY_NORMAL = android.graphics.text.LineBreaker.HYPHENATION_FREQUENCY_NORMAL;
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_CHARACTER;
    public static final int JUSTIFICATION_MODE_INTER_WORD = android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;
    public static final int JUSTIFICATION_MODE_NONE = android.graphics.text.LineBreaker.JUSTIFICATION_MODE_NONE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder wrap(android.graphics.text.LineBreaker.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.text.LineBreaker.Builder getReal() {
            return (android.graphics.text.LineBreaker.Builder) real;
        }

        public android.graphics.text.LineBreaker.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.graphics.text.LineBreaker.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker build() {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.wrap(((android.graphics.text.LineBreaker.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(((android.graphics.text.LineBreaker.Builder) real).setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(((android.graphics.text.LineBreaker.Builder) real).setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setIndents(int[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(((android.graphics.text.LineBreaker.Builder) real).setIndents(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(((android.graphics.text.LineBreaker.Builder) real).setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(((android.graphics.text.LineBreaker.Builder) real).setUseBoundsForWidth(arg0));
        }

    }
    public static final class ParagraphConstraints {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ParagraphConstraints(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.ParagraphConstraints wrap(android.graphics.text.LineBreaker.ParagraphConstraints real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.ParagraphConstraints(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.text.LineBreaker.ParagraphConstraints getReal() {
            return (android.graphics.text.LineBreaker.ParagraphConstraints) real;
        }

        public android.graphics.text.LineBreaker.ParagraphConstraints unwrap() {
            return getReal();
        }

        public ParagraphConstraints() {
            this(new android.graphics.text.LineBreaker.ParagraphConstraints(), (__DcgwBridgeToken) null);
        }

        public float getDefaultTabStop() {
            return ((android.graphics.text.LineBreaker.ParagraphConstraints) real).getDefaultTabStop();
        }

        public float getFirstWidth() {
            return ((android.graphics.text.LineBreaker.ParagraphConstraints) real).getFirstWidth();
        }

        public int getFirstWidthLineCount() {
            return ((android.graphics.text.LineBreaker.ParagraphConstraints) real).getFirstWidthLineCount();
        }

        public float[] getTabStops() {
            return ((android.graphics.text.LineBreaker.ParagraphConstraints) real).getTabStops();
        }

        public float getWidth() {
            return ((android.graphics.text.LineBreaker.ParagraphConstraints) real).getWidth();
        }

        public void setIndent(float arg0, int arg1) {
            ((android.graphics.text.LineBreaker.ParagraphConstraints) real).setIndent(arg0, arg1);
        }

        public void setTabStops(float[] arg0, float arg1) {
            ((android.graphics.text.LineBreaker.ParagraphConstraints) real).setTabStops(arg0, arg1);
        }

        public void setWidth(float arg0) {
            ((android.graphics.text.LineBreaker.ParagraphConstraints) real).setWidth(arg0);
        }

    }
    public static final class Result {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Result(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result wrap(android.graphics.text.LineBreaker.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.text.LineBreaker.Result getReal() {
            return (android.graphics.text.LineBreaker.Result) real;
        }

        public android.graphics.text.LineBreaker.Result unwrap() {
            return getReal();
        }

        public int getEndLineHyphenEdit(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).getEndLineHyphenEdit(arg0);
        }

        public float getLineAscent(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).getLineAscent(arg0);
        }

        public int getLineBreakOffset(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).getLineBreakOffset(arg0);
        }

        public int getLineCount() {
            return ((android.graphics.text.LineBreaker.Result) real).getLineCount();
        }

        public float getLineDescent(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).getLineDescent(arg0);
        }

        public float getLineWidth(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).getLineWidth(arg0);
        }

        public int getStartLineHyphenEdit(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).getStartLineHyphenEdit(arg0);
        }

        public boolean hasLineTab(int arg0) {
            return ((android.graphics.text.LineBreaker.Result) real).hasLineTab(arg0);
        }

    }
}
