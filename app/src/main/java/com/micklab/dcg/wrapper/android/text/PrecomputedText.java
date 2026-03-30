// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class PrecomputedText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrecomputedText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.PrecomputedText wrap(android.text.PrecomputedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.PrecomputedText(real, (__DcgwBridgeToken) null);
    }

    public android.text.PrecomputedText getReal() {
        return (android.text.PrecomputedText) real;
    }

    public android.text.PrecomputedText unwrap() {
        return getReal();
    }

    public char charAt(int arg0) {
        return ((android.text.PrecomputedText) real).charAt(arg0);
    }

    public static com.micklab.dcg.wrapper.android.text.PrecomputedText create(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.PrecomputedText.Params arg1) {
        return com.micklab.dcg.wrapper.android.text.PrecomputedText.wrap(android.text.PrecomputedText.create(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public void getBounds(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        ((android.text.PrecomputedText) real).getBounds(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void getFontMetricsInt(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg2) {
        ((android.text.PrecomputedText) real).getFontMetricsInt(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public int getParagraphCount() {
        return ((android.text.PrecomputedText) real).getParagraphCount();
    }

    public int getParagraphEnd(int arg0) {
        return ((android.text.PrecomputedText) real).getParagraphEnd(arg0);
    }

    public int getParagraphStart(int arg0) {
        return ((android.text.PrecomputedText) real).getParagraphStart(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params getParams() {
        return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.wrap(((android.text.PrecomputedText) real).getParams());
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return ((android.text.PrecomputedText) real).getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return ((android.text.PrecomputedText) real).getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return ((android.text.PrecomputedText) real).getSpanStart(arg0);
    }

    public float getWidth(int arg0, int arg1) {
        return ((android.text.PrecomputedText) real).getWidth(arg0, arg1);
    }

    public int length() {
        return ((android.text.PrecomputedText) real).length();
    }

    public void removeSpan(java.lang.Object arg0) {
        ((android.text.PrecomputedText) real).removeSpan(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        ((android.text.PrecomputedText) real).setSpan(arg0, arg1, arg2, arg3);
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.text.PrecomputedText) real).subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.text.PrecomputedText) real).toString();
    }

    public static final class Params {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Params(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.PrecomputedText.Params wrap(android.text.PrecomputedText.Params real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.PrecomputedText.Params(real, (__DcgwBridgeToken) null);
        }

        public android.text.PrecomputedText.Params getReal() {
            return (android.text.PrecomputedText.Params) real;
        }

        public android.text.PrecomputedText.Params unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.text.PrecomputedText.Params) real).equals(arg0);
        }

        public int getBreakStrategy() {
            return ((android.text.PrecomputedText.Params) real).getBreakStrategy();
        }

        public int getHyphenationFrequency() {
            return ((android.text.PrecomputedText.Params) real).getHyphenationFrequency();
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(((android.text.PrecomputedText.Params) real).getLineBreakConfig());
        }

        public com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic getTextDirection() {
            return com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(((android.text.PrecomputedText.Params) real).getTextDirection());
        }

        public com.micklab.dcg.wrapper.android.text.TextPaint getTextPaint() {
            return com.micklab.dcg.wrapper.android.text.TextPaint.wrap(((android.text.PrecomputedText.Params) real).getTextPaint());
        }

        public int hashCode() {
            return ((android.text.PrecomputedText.Params) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.text.PrecomputedText.Params) real).toString();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder wrap(android.text.PrecomputedText.Params.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.text.PrecomputedText.Params.Builder getReal() {
                return (android.text.PrecomputedText.Params.Builder) real;
            }

            public android.text.PrecomputedText.Params.Builder unwrap() {
                return getReal();
            }

            public Builder(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
                this(new android.text.PrecomputedText.Params.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
            }

            public Builder(com.micklab.dcg.wrapper.android.text.PrecomputedText.Params arg0) {
                this(new android.text.PrecomputedText.Params.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params build() {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.wrap(((android.text.PrecomputedText.Params.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setBreakStrategy(int arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(((android.text.PrecomputedText.Params.Builder) real).setBreakStrategy(arg0));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setHyphenationFrequency(int arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(((android.text.PrecomputedText.Params.Builder) real).setHyphenationFrequency(arg0));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(((android.text.PrecomputedText.Params.Builder) real).setLineBreakConfig(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setTextDirection(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(((android.text.PrecomputedText.Params.Builder) real).setTextDirection(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
