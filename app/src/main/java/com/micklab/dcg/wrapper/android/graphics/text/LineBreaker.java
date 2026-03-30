// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class LineBreaker {
    private final android.graphics.text.LineBreaker real;

    public LineBreaker(android.graphics.text.LineBreaker real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker wrap(android.graphics.text.LineBreaker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker(real);
    }

    public android.graphics.text.LineBreaker unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result computeLineBreaks(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0, com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.ParagraphConstraints arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result.wrap(real.computeLineBreaks(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
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
        private final android.graphics.text.LineBreaker.Builder real;

        public Builder(android.graphics.text.LineBreaker.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder wrap(android.graphics.text.LineBreaker.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder(real);
        }

        public android.graphics.text.LineBreaker.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.graphics.text.LineBreaker.Builder());
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker build() {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setBreakStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(real.setBreakStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setHyphenationFrequency(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(real.setHyphenationFrequency(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setIndents(int[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(real.setIndents(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setJustificationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(real.setJustificationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder setUseBoundsForWidth(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Builder.wrap(real.setUseBoundsForWidth(arg0));
        }

    }
    public static final class ParagraphConstraints {
        private final android.graphics.text.LineBreaker.ParagraphConstraints real;

        public ParagraphConstraints(android.graphics.text.LineBreaker.ParagraphConstraints real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.ParagraphConstraints wrap(android.graphics.text.LineBreaker.ParagraphConstraints real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.ParagraphConstraints(real);
        }

        public android.graphics.text.LineBreaker.ParagraphConstraints unwrap() {
            return real;
        }

        public ParagraphConstraints() {
            this(new android.graphics.text.LineBreaker.ParagraphConstraints());
        }

        public float getDefaultTabStop() {
            return real.getDefaultTabStop();
        }

        public float getFirstWidth() {
            return real.getFirstWidth();
        }

        public int getFirstWidthLineCount() {
            return real.getFirstWidthLineCount();
        }

        public float[] getTabStops() {
            return real.getTabStops();
        }

        public float getWidth() {
            return real.getWidth();
        }

        public void setIndent(float arg0, int arg1) {
            real.setIndent(arg0, arg1);
        }

        public void setTabStops(float[] arg0, float arg1) {
            real.setTabStops(arg0, arg1);
        }

        public void setWidth(float arg0) {
            real.setWidth(arg0);
        }

    }
    public static final class Result {
        private final android.graphics.text.LineBreaker.Result real;

        public Result(android.graphics.text.LineBreaker.Result real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result wrap(android.graphics.text.LineBreaker.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreaker.Result(real);
        }

        public android.graphics.text.LineBreaker.Result unwrap() {
            return real;
        }

        public int getEndLineHyphenEdit(int arg0) {
            return real.getEndLineHyphenEdit(arg0);
        }

        public float getLineAscent(int arg0) {
            return real.getLineAscent(arg0);
        }

        public int getLineBreakOffset(int arg0) {
            return real.getLineBreakOffset(arg0);
        }

        public int getLineCount() {
            return real.getLineCount();
        }

        public float getLineDescent(int arg0) {
            return real.getLineDescent(arg0);
        }

        public float getLineWidth(int arg0) {
            return real.getLineWidth(arg0);
        }

        public int getStartLineHyphenEdit(int arg0) {
            return real.getStartLineHyphenEdit(arg0);
        }

        public boolean hasLineTab(int arg0) {
            return real.hasLineTab(arg0);
        }

    }
}
