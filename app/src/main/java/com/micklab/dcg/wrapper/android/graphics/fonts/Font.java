// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.fonts;

public final class Font {
    private final android.graphics.fonts.Font real;

    public Font(android.graphics.fonts.Font real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.fonts.Font wrap(android.graphics.fonts.Font real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.Font(real);
    }

    public android.graphics.fonts.Font unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public android.graphics.fonts.FontVariationAxis[] getAxes() {
        return real.getAxes();
    }

    public java.nio.ByteBuffer getBuffer() {
        return real.getBuffer();
    }

    public java.io.File getFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.fonts.Font#getFile()");
    }

    public float getGlyphBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2) {
        return real.getGlyphBounds(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocaleList() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getLocaleList());
    }

    public void getMetrics(com.micklab.dcg.wrapper.android.graphics.Paint arg0, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetrics arg1) {
        real.getMetrics(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int getSourceIdentifier() {
        return real.getSourceIdentifier();
    }

    public com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle getStyle() {
        return com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle.wrap(real.getStyle());
    }

    public int getTtcIndex() {
        return real.getTtcIndex();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.graphics.fonts.Font.Builder real;

        public Builder(android.graphics.fonts.Font.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder wrap(android.graphics.fonts.Font.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder(real);
        }

        public android.graphics.fonts.Font.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.fonts.Font arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(java.nio.ByteBuffer arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0));
        }

        public Builder(java.io.File arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0));
        }

        public Builder(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.res.AssetManager arg0, java.lang.String arg1) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public Builder(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, long arg2) {
            this(new android.graphics.fonts.Font.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font build() throws java.io.IOException {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setFontVariationSettings(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(real.setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(real.setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setSlant(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(real.setSlant(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setTtcIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(real.setTtcIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder setWeight(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.fonts.Font.Builder.wrap(real.setWeight(arg0));
        }

    }
}
