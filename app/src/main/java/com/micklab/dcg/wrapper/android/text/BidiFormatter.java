// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class BidiFormatter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BidiFormatter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.BidiFormatter wrap(android.text.BidiFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.BidiFormatter(real, (__DcgwBridgeToken) null);
    }

    public android.text.BidiFormatter getReal() {
        return (android.text.BidiFormatter) real;
    }

    public android.text.BidiFormatter unwrap() {
        return getReal();
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
        return ((android.text.BidiFormatter) real).getStereoReset();
    }

    public boolean isRtl(java.lang.String arg0) {
        return ((android.text.BidiFormatter) real).isRtl(arg0);
    }

    public boolean isRtl(java.lang.CharSequence arg0) {
        return ((android.text.BidiFormatter) real).isRtl(arg0);
    }

    public boolean isRtlContext() {
        return ((android.text.BidiFormatter) real).isRtlContext();
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0);
    }

    public java.lang.String unicodeWrap(java.lang.String arg0) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0, arg1 == null ? null : arg1.getReal());
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0, boolean arg1) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0, arg1);
    }

    public java.lang.String unicodeWrap(java.lang.String arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0, arg1 == null ? null : arg1.getReal());
    }

    public java.lang.String unicodeWrap(java.lang.String arg0, boolean arg1) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0, arg1);
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1, boolean arg2) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public java.lang.String unicodeWrap(java.lang.String arg0, com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg1, boolean arg2) {
        return ((android.text.BidiFormatter) real).unicodeWrap(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder wrap(android.text.BidiFormatter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.text.BidiFormatter.Builder getReal() {
            return (android.text.BidiFormatter.Builder) real;
        }

        public android.text.BidiFormatter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.text.BidiFormatter.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(java.util.Locale arg0) {
            this(new android.text.BidiFormatter.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(boolean arg0) {
            this(new android.text.BidiFormatter.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.text.BidiFormatter build() {
            return com.micklab.dcg.wrapper.android.text.BidiFormatter.wrap(((android.text.BidiFormatter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder setTextDirectionHeuristic(com.micklab.dcg.wrapper.android.text.TextDirectionHeuristic arg0) {
            return com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder.wrap(((android.text.BidiFormatter.Builder) real).setTextDirectionHeuristic(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder stereoReset(boolean arg0) {
            return com.micklab.dcg.wrapper.android.text.BidiFormatter.Builder.wrap(((android.text.BidiFormatter.Builder) real).stereoReset(arg0));
        }

    }
}
