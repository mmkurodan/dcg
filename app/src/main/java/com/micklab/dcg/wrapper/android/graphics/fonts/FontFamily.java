// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class FontFamily {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FontFamily(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily wrap(android.graphics.fonts.FontFamily real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.fonts.FontFamily getReal() {
        return (android.graphics.fonts.FontFamily) real;
    }

    public android.graphics.fonts.FontFamily unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.fonts.Font getFont(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.fonts.Font.wrap(((android.graphics.fonts.FontFamily) real).getFont(arg0));
    }

    public int getSize() {
        return ((android.graphics.fonts.FontFamily) real).getSize();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder wrap(android.graphics.fonts.FontFamily.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.fonts.FontFamily.Builder getReal() {
            return (android.graphics.fonts.FontFamily.Builder) real;
        }

        public android.graphics.fonts.FontFamily.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.fonts.Font arg0) {
            this(new android.graphics.fonts.FontFamily.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder addFont(com.micklab.dcg.wrapper.android.graphics.fonts.Font arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder.wrap(((android.graphics.fonts.FontFamily.Builder) real).addFont(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily build() {
            return com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.wrap(((android.graphics.fonts.FontFamily.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily buildVariableFamily() {
            return com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.wrap(((android.graphics.fonts.FontFamily.Builder) real).buildVariableFamily());
        }

    }
}
