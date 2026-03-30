// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class MeasuredText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MeasuredText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.MeasuredText wrap(android.graphics.text.MeasuredText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.MeasuredText(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.text.MeasuredText getReal() {
        return (android.graphics.text.MeasuredText) real;
    }

    public android.graphics.text.MeasuredText unwrap() {
        return getReal();
    }

    public void getBounds(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        ((android.graphics.text.MeasuredText) real).getBounds(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public float getCharWidthAt(int arg0) {
        return ((android.graphics.text.MeasuredText) real).getCharWidthAt(arg0);
    }

    public void getFontMetricsInt(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg2) {
        ((android.graphics.text.MeasuredText) real).getFontMetricsInt(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public float getWidth(int arg0, int arg1) {
        return ((android.graphics.text.MeasuredText) real).getWidth(arg0, arg1);
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder wrap(android.graphics.text.MeasuredText.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.text.MeasuredText.Builder getReal() {
            return (android.graphics.text.MeasuredText.Builder) real;
        }

        public android.graphics.text.MeasuredText.Builder unwrap() {
            return getReal();
        }

        public Builder(char[] arg0) {
            this(new android.graphics.text.MeasuredText.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.text.MeasuredText arg0) {
            this(new android.graphics.text.MeasuredText.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder appendReplacementRun(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(((android.graphics.text.MeasuredText.Builder) real).appendReplacementRun(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder appendStyleRun(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int arg1, boolean arg2) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(((android.graphics.text.MeasuredText.Builder) real).appendStyleRun(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder appendStyleRun(com.micklab.dcg.wrapper.android.graphics.Paint arg0, com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg1, int arg2, boolean arg3) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(((android.graphics.text.MeasuredText.Builder) real).appendStyleRun(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText build() {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.wrap(((android.graphics.text.MeasuredText.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder setComputeHyphenation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(((android.graphics.text.MeasuredText.Builder) real).setComputeHyphenation(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder setComputeHyphenation(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(((android.graphics.text.MeasuredText.Builder) real).setComputeHyphenation(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder setComputeLayout(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.MeasuredText.Builder.wrap(((android.graphics.text.MeasuredText.Builder) real).setComputeLayout(arg0));
        }

        public static final int HYPHENATION_MODE_FAST = android.graphics.text.MeasuredText.Builder.HYPHENATION_MODE_FAST;
        public static final int HYPHENATION_MODE_NONE = android.graphics.text.MeasuredText.Builder.HYPHENATION_MODE_NONE;
        public static final int HYPHENATION_MODE_NORMAL = android.graphics.text.MeasuredText.Builder.HYPHENATION_MODE_NORMAL;

    }
}
