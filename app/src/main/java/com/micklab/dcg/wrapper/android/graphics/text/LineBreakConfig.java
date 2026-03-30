// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.text;

public final class LineBreakConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LineBreakConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig wrap(android.graphics.text.LineBreakConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.text.LineBreakConfig getReal() {
        return (android.graphics.text.LineBreakConfig) real;
    }

    public android.graphics.text.LineBreakConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.graphics.text.LineBreakConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.text.LineBreakConfig) real).equals(arg0);
    }

    public int getHyphenation() {
        return ((android.graphics.text.LineBreakConfig) real).getHyphenation();
    }

    public int getLineBreakStyle() {
        return ((android.graphics.text.LineBreakConfig) real).getLineBreakStyle();
    }

    public int getLineBreakWordStyle() {
        return ((android.graphics.text.LineBreakConfig) real).getLineBreakWordStyle();
    }

    public int hashCode() {
        return ((android.graphics.text.LineBreakConfig) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig merge(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(((android.graphics.text.LineBreakConfig) real).merge(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String toString() {
        return ((android.graphics.text.LineBreakConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.text.LineBreakConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int HYPHENATION_DISABLED = android.graphics.text.LineBreakConfig.HYPHENATION_DISABLED;
    public static final int HYPHENATION_ENABLED = android.graphics.text.LineBreakConfig.HYPHENATION_ENABLED;
    public static final int HYPHENATION_UNSPECIFIED = android.graphics.text.LineBreakConfig.HYPHENATION_UNSPECIFIED;
    public static final int LINE_BREAK_STYLE_AUTO = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_AUTO;
    public static final int LINE_BREAK_STYLE_LOOSE = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_LOOSE;
    public static final int LINE_BREAK_STYLE_NONE = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_NONE;
    public static final int LINE_BREAK_STYLE_NORMAL = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_NORMAL;
    public static final int LINE_BREAK_STYLE_NO_BREAK = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_NO_BREAK;
    public static final int LINE_BREAK_STYLE_STRICT = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_STRICT;
    public static final int LINE_BREAK_STYLE_UNSPECIFIED = android.graphics.text.LineBreakConfig.LINE_BREAK_STYLE_UNSPECIFIED;
    public static final int LINE_BREAK_WORD_STYLE_AUTO = android.graphics.text.LineBreakConfig.LINE_BREAK_WORD_STYLE_AUTO;
    public static final int LINE_BREAK_WORD_STYLE_NONE = android.graphics.text.LineBreakConfig.LINE_BREAK_WORD_STYLE_NONE;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = android.graphics.text.LineBreakConfig.LINE_BREAK_WORD_STYLE_PHRASE;
    public static final int LINE_BREAK_WORD_STYLE_UNSPECIFIED = android.graphics.text.LineBreakConfig.LINE_BREAK_WORD_STYLE_UNSPECIFIED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder wrap(android.graphics.text.LineBreakConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.text.LineBreakConfig.Builder getReal() {
            return (android.graphics.text.LineBreakConfig.Builder) real;
        }

        public android.graphics.text.LineBreakConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.graphics.text.LineBreakConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig build() {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(((android.graphics.text.LineBreakConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder merge(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder.wrap(((android.graphics.text.LineBreakConfig.Builder) real).merge(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder setHyphenation(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder.wrap(((android.graphics.text.LineBreakConfig.Builder) real).setHyphenation(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder setLineBreakStyle(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder.wrap(((android.graphics.text.LineBreakConfig.Builder) real).setLineBreakStyle(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder setLineBreakWordStyle(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.Builder.wrap(((android.graphics.text.LineBreakConfig.Builder) real).setLineBreakWordStyle(arg0));
        }

    }
}
