// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class FontFamily {
    private final android.graphics.fonts.FontFamily real;

    public FontFamily(android.graphics.fonts.FontFamily real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily wrap(android.graphics.fonts.FontFamily real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily(real);
    }

    public android.graphics.fonts.FontFamily unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.fonts.Font getFont(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.fonts.Font.wrap(real.getFont(arg0));
    }

    public int getSize() {
        return real.getSize();
    }

    public static final class Builder {
        private final android.graphics.fonts.FontFamily.Builder real;

        public Builder(android.graphics.fonts.FontFamily.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder wrap(android.graphics.fonts.FontFamily.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder(real);
        }

        public android.graphics.fonts.FontFamily.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.fonts.Font arg0) {
            this(new android.graphics.fonts.FontFamily.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder addFont(com.micklab.dcg.wrapper.android.graphics.fonts.Font arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.Builder.wrap(real.addFont(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily build() {
            return com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily buildVariableFamily() {
            return com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily.wrap(real.buildVariableFamily());
        }

    }
}
