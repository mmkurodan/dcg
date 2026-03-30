// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Typeface {
    private final android.graphics.Typeface real;

    public Typeface(android.graphics.Typeface real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface wrap(android.graphics.Typeface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Typeface(real);
    }

    public android.graphics.Typeface unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface create(com.micklab.dcg.wrapper.android.graphics.Typeface arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.create(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface create(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.create(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface create(com.micklab.dcg.wrapper.android.graphics.Typeface arg0, int arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.create(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface createFromAsset(com.micklab.dcg.wrapper.android.content.res.AssetManager arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.createFromAsset(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface createFromFile(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.Typeface#createFromFile(java.io.File)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface createFromFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.Typeface#createFromFile(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Typeface defaultFromStyle(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.defaultFromStyle(arg0));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getStyle() {
        return real.getStyle();
    }

    public java.lang.String getSystemFontFamilyName() {
        return real.getSystemFontFamilyName();
    }

    public int getWeight() {
        return real.getWeight();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBold() {
        return real.isBold();
    }

    public boolean isItalic() {
        return real.isItalic();
    }

    public static final int BOLD = android.graphics.Typeface.BOLD;
    public static final int BOLD_ITALIC = android.graphics.Typeface.BOLD_ITALIC;
    public static final com.micklab.dcg.wrapper.android.graphics.Typeface DEFAULT = com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.DEFAULT);
    public static final com.micklab.dcg.wrapper.android.graphics.Typeface DEFAULT_BOLD = com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.DEFAULT_BOLD);
    public static final int ITALIC = android.graphics.Typeface.ITALIC;
    public static final com.micklab.dcg.wrapper.android.graphics.Typeface MONOSPACE = com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.MONOSPACE);
    public static final int NORMAL = android.graphics.Typeface.NORMAL;
    public static final com.micklab.dcg.wrapper.android.graphics.Typeface SANS_SERIF = com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.SANS_SERIF);
    public static final com.micklab.dcg.wrapper.android.graphics.Typeface SERIF = com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(android.graphics.Typeface.SERIF);

    public static final class Builder {
        private final android.graphics.Typeface.Builder real;

        public Builder(android.graphics.Typeface.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Typeface.Builder wrap(android.graphics.Typeface.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Typeface.Builder(real);
        }

        public android.graphics.Typeface.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.graphics.Typeface.Builder(arg0));
        }

        public Builder(java.io.FileDescriptor arg0) {
            this(new android.graphics.Typeface.Builder(arg0));
        }

        public Builder(java.io.File arg0) {
            this(new android.graphics.Typeface.Builder(arg0));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.res.AssetManager arg0, java.lang.String arg1) {
            this(new android.graphics.Typeface.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface build() {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.Builder setFallback(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.Builder.wrap(real.setFallback(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.Builder.wrap(real.setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.Builder setFontVariationSettings(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.Builder.wrap(real.setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.Builder setItalic(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.Builder.wrap(real.setItalic(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.Builder setTtcIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.Builder.wrap(real.setTtcIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.Builder setWeight(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.Builder.wrap(real.setWeight(arg0));
        }

    }
    public static final class CustomFallbackBuilder {
        private final android.graphics.Typeface.CustomFallbackBuilder real;

        public CustomFallbackBuilder(android.graphics.Typeface.CustomFallbackBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder wrap(android.graphics.Typeface.CustomFallbackBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder(real);
        }

        public android.graphics.Typeface.CustomFallbackBuilder unwrap() {
            return real;
        }

        public CustomFallbackBuilder(com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily arg0) {
            this(new android.graphics.Typeface.CustomFallbackBuilder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder addCustomFallback(com.micklab.dcg.wrapper.android.graphics.fonts.FontFamily arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder.wrap(real.addCustomFallback(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface build() {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.build());
        }

        public static int getMaxCustomFallbackCount() {
            return android.graphics.Typeface.CustomFallbackBuilder.getMaxCustomFallbackCount();
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder setStyle(com.micklab.dcg.wrapper.android.graphics.fonts.FontStyle arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder.wrap(real.setStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder setSystemFallback(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.CustomFallbackBuilder.wrap(real.setSystemFallback(arg0));
        }

    }
}
