// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class Font {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Font(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.Font wrap(android.graphics.fonts.Font real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.Font(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.fonts.Font getReal() {
        return (android.graphics.fonts.Font) real;
    }

    public android.graphics.fonts.Font unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.fonts.Font) real).equals(arg0);
    }

    public android.graphics.fonts.FontVariationAxis[] getAxes() {
        return ((android.graphics.fonts.Font) real).getAxes();
    }

    public java.nio.ByteBuffer getBuffer() {
        return ((android.graphics.fonts.Font) real).getBuffer();
    }

    public java.io.File getFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.fonts.Font#getFile()");
    }

    public float getGlyphBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2) {
        return ((android.graphics.fonts.Font) real).getGlyphBounds(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocaleList() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.graphics.fonts.Font) real).getLocaleList());
    }

    public void getMetrics(com.micklab.dcg.wrapper.android.graphics.Paint arg0, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg1) {
        ((android.graphics.fonts.Font) real).getMetrics(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int getSourceIdentifier() {
        return ((android.graphics.fonts.Font) real).getSourceIdentifier();
    }

    public com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle getStyle() {
        return com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle.wrap(((android.graphics.fonts.Font) real).getStyle());
    }

    public int getTtcIndex() {
        return ((android.graphics.fonts.Font) real).getTtcIndex();
    }

    public int hashCode() {
        return ((android.graphics.fonts.Font) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.graphics.fonts.Font) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder wrap(android.graphics.fonts.Font.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.fonts.Font.Builder getReal() {
            return (android.graphics.fonts.Font.Builder) real;
        }

        public android.graphics.fonts.Font.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.fonts.Font arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.nio.ByteBuffer arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(java.io.File arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.content.res.AssetManager arg0, java.lang.String arg1) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, long arg2) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font build() throws java.io.IOException {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.wrap(((android.graphics.fonts.Font.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setFontVariationSettings(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(((android.graphics.fonts.Font.Builder) real).setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(((android.graphics.fonts.Font.Builder) real).setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setSlant(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(((android.graphics.fonts.Font.Builder) real).setSlant(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setTtcIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(((android.graphics.fonts.Font.Builder) real).setTtcIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setWeight(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(((android.graphics.fonts.Font.Builder) real).setWeight(arg0));
        }

    }
}
