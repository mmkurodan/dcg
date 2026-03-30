// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class BidiFormatter {
    private final android.text.BidiFormatter real;

    public BidiFormatter(android.text.BidiFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.BidiFormatter wrap(android.text.BidiFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.BidiFormatter(real);
    }

    public android.text.BidiFormatter unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.text.BidiFormatter getInstance() {
        return com.micklab.dcg.wrapper.android.text.BidiFormatter.wrap(android.text.BidiFormatter.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.BidiFormatter getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.BidiFormatter.wrap(android.text.BidiFormatter.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.text.BidiFormatter getInstance(boolean arg0) {
        return com.micklab.dcg.wrapper.android.text.BidiFormatter.wrap(android.text.BidiFormatter.getInstance(arg0));
    }

    public boolean getStereoReset() {
        return real.getStereoReset();
    }

    public boolean isRtl(java.lang.CharSequence arg0) {
        return real.isRtl(arg0);
    }

    public boolean isRtl(java.lang.String arg0) {
        return real.isRtl(arg0);
    }

    public boolean isRtlContext() {
        return real.isRtlContext();
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0) {
        return real.unicodeWrap(arg0);
    }

    public java.lang.String unicodeWrap(java.lang.String arg0) {
        return real.unicodeWrap(arg0);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0, boolean arg1) {
        return real.unicodeWrap(arg0, arg1);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1) {
        return real.unicodeWrap(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String unicodeWrap(java.lang.String arg0, boolean arg1) {
        return real.unicodeWrap(arg0, arg1);
    }

    public java.lang.String unicodeWrap(java.lang.String arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1) {
        return real.unicodeWrap(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1, boolean arg2) {
        return real.unicodeWrap(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public java.lang.String unicodeWrap(java.lang.String arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1, boolean arg2) {
        return real.unicodeWrap(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final class Builder {
        private final android.text.BidiFormatter.Builder real;

        public Builder(android.text.BidiFormatter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder wrap(android.text.BidiFormatter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder(real);
        }

        public android.text.BidiFormatter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.text.BidiFormatter.Builder());
        }

        public Builder(java.util.Locale arg0) {
            this(new android.text.BidiFormatter.Builder(arg0));
        }

        public Builder(boolean arg0) {
            this(new android.text.BidiFormatter.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.BidiFormatter build() {
            return com.micklab.dcg.wrapper.android.text.BidiFormatter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder setTextDirectionHeuristic(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder.wrap(real.setTextDirectionHeuristic(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder stereoReset(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder.wrap(real.stereoReset(arg0));
        }

    }
}
