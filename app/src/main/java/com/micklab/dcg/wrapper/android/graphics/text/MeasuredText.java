// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class MeasuredText {
    private final android.graphics.text.MeasuredText real;

    public MeasuredText(android.graphics.text.MeasuredText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.MeasuredText wrap(android.graphics.text.MeasuredText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.MeasuredText(real);
    }

    public android.graphics.text.MeasuredText unwrap() {
        return real;
    }

    public void getBounds(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        real.getBounds(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public float getCharWidthAt(int arg0) {
        return real.getCharWidthAt(arg0);
    }

    public void getFontMetricsInt(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg2) {
        real.getFontMetricsInt(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public float getWidth(int arg0, int arg1) {
        return real.getWidth(arg0, arg1);
    }

    public static final class Builder {
        private final android.graphics.text.MeasuredText.Builder real;

        public Builder(android.graphics.text.MeasuredText.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder wrap(android.graphics.text.MeasuredText.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder(real);
        }

        public android.graphics.text.MeasuredText.Builder unwrap() {
            return real;
        }

        public Builder(char[] arg0) {
            this(new android.graphics.text.MeasuredText.Builder(arg0));
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0) {
            this(new android.graphics.text.MeasuredText.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder appendReplacementRun(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(real.appendReplacementRun(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder appendStyleRun(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int arg1, boolean arg2) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(real.appendStyleRun(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder appendStyleRun(com.micklab.dcg.wrapper.android.graphics.Paint arg0, com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg1, int arg2, boolean arg3) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(real.appendStyleRun(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText build() {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder setComputeHyphenation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(real.setComputeHyphenation(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder setComputeHyphenation(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(real.setComputeHyphenation(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder setComputeLayout(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(real.setComputeLayout(arg0));
        }

        public static final int HYPHENATION_MODE_FAST = android.graphics.text.MeasuredText.Builder.HYPHENATION_MODE_FAST;
        public static final int HYPHENATION_MODE_NONE = android.graphics.text.MeasuredText.Builder.HYPHENATION_MODE_NONE;
        public static final int HYPHENATION_MODE_NORMAL = android.graphics.text.MeasuredText.Builder.HYPHENATION_MODE_NORMAL;

    }
}
