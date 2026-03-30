// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class PrecomputedText {
    private final android.text.PrecomputedText real;

    public PrecomputedText(android.text.PrecomputedText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.PrecomputedText wrap(android.text.PrecomputedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.PrecomputedText(real);
    }

    public android.text.PrecomputedText unwrap() {
        return real;
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public static com.micklab.dcg.wrapper.android.text.PrecomputedText create(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.PrecomputedText.Params arg1) {
        return com.micklab.dcg.wrapper.android.text.PrecomputedText.wrap(android.text.PrecomputedText.create(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public void getBounds(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        real.getBounds(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void getFontMetricsInt(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg2) {
        real.getFontMetricsInt(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public int getParagraphCount() {
        return real.getParagraphCount();
    }

    public int getParagraphEnd(int arg0) {
        return real.getParagraphEnd(arg0);
    }

    public int getParagraphStart(int arg0) {
        return real.getParagraphStart(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params getParams() {
        return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.wrap(real.getParams());
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return real.getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return real.getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return real.getSpanStart(arg0);
    }

    public float getWidth(int arg0, int arg1) {
        return real.getWidth(arg0, arg1);
    }

    public int length() {
        return real.length();
    }

    public void removeSpan(java.lang.Object arg0) {
        real.removeSpan(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        real.setSpan(arg0, arg1, arg2, arg3);
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return real.subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Params {
        private final android.text.PrecomputedText.Params real;

        public Params(android.text.PrecomputedText.Params real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.PrecomputedText.Params wrap(android.text.PrecomputedText.Params real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.PrecomputedText.Params(real);
        }

        public android.text.PrecomputedText.Params unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getBreakStrategy() {
            return real.getBreakStrategy();
        }

        public int getHyphenationFrequency() {
            return real.getHyphenationFrequency();
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(real.getLineBreakConfig());
        }

        public com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic getTextDirection() {
            return com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic.wrap(real.getTextDirection());
        }

        public com.micklab.dcg.wrapper.android.text.TextPaint getTextPaint() {
            return com.micklab.dcg.wrapper.android.text.TextPaint.wrap(real.getTextPaint());
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final class Builder {
            private final android.text.PrecomputedText.Params.Builder real;

            public Builder(android.text.PrecomputedText.Params.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder wrap(android.text.PrecomputedText.Params.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder(real);
            }

            public android.text.PrecomputedText.Params.Builder unwrap() {
                return real;
            }

            public Builder(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
                this(new android.text.PrecomputedText.Params.Builder(arg0 == null ? null : arg0.unwrap()));
            }

            public Builder(com.micklab.dcg.wrapper.android.text.PrecomputedText.Params arg0) {
                this(new android.text.PrecomputedText.Params.Builder(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params build() {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setBreakStrategy(int arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(real.setBreakStrategy(arg0));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setHyphenationFrequency(int arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(real.setHyphenationFrequency(arg0));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setLineBreakConfig(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(real.setLineBreakConfig(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder setTextDirection(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
                return com.micklab.dcg.wrapper.android.text.PrecomputedText.Params.Builder.wrap(real.setTextDirection(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
