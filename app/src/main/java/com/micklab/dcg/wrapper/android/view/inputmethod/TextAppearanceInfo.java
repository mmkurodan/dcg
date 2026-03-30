// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextAppearanceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextAppearanceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo wrap(android.view.inputmethod.TextAppearanceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.TextAppearanceInfo getReal() {
        return (android.view.inputmethod.TextAppearanceInfo) real;
    }

    public android.view.inputmethod.TextAppearanceInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.TextAppearanceInfo) real).equals(arg0);
    }

    public java.lang.String getFontFeatureSettings() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getFontFeatureSettings();
    }

    public java.lang.String getFontVariationSettings() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getFontVariationSettings();
    }

    public int getHighlightTextColor() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getHighlightTextColor();
    }

    public int getHintTextColor() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getHintTextColor();
    }

    public float getLetterSpacing() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getLetterSpacing();
    }

    public int getLineBreakStyle() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getLineBreakStyle();
    }

    public int getLineBreakWordStyle() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getLineBreakWordStyle();
    }

    public int getLinkTextColor() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getLinkTextColor();
    }

    public int getShadowColor() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getShadowColor();
    }

    public float getShadowDx() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getShadowDx();
    }

    public float getShadowDy() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getShadowDy();
    }

    public float getShadowRadius() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getShadowRadius();
    }

    public java.lang.String getSystemFontFamilyName() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getSystemFontFamilyName();
    }

    public int getTextColor() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getTextColor();
    }

    public int getTextFontWeight() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getTextFontWeight();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.view.inputmethod.TextAppearanceInfo) real).getTextLocales());
    }

    public float getTextScaleX() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getTextScaleX();
    }

    public float getTextSize() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getTextSize();
    }

    public int getTextStyle() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).getTextStyle();
    }

    public int hashCode() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).hashCode();
    }

    public boolean isAllCaps() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).isAllCaps();
    }

    public boolean isElegantTextHeight() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).isElegantTextHeight();
    }

    public boolean isFallbackLineSpacing() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).isFallbackLineSpacing();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.TextAppearanceInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.TextAppearanceInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder wrap(android.view.inputmethod.TextAppearanceInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.TextAppearanceInfo.Builder getReal() {
            return (android.view.inputmethod.TextAppearanceInfo.Builder) real;
        }

        public android.view.inputmethod.TextAppearanceInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.TextAppearanceInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setAllCaps(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setAllCaps(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setElegantTextHeight(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setElegantTextHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setFallbackLineSpacing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setFallbackLineSpacing(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setFontFeatureSettings(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setFontFeatureSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setFontVariationSettings(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setFontVariationSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setHighlightTextColor(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setHighlightTextColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setHintTextColor(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setHintTextColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setLetterSpacing(float arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setLetterSpacing(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setLineBreakStyle(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setLineBreakStyle(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setLineBreakWordStyle(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setLineBreakWordStyle(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setLinkTextColor(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setLinkTextColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setShadowColor(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setShadowColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setShadowDx(float arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setShadowDx(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setShadowDy(float arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setShadowDy(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setShadowRadius(float arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setShadowRadius(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setSystemFontFamilyName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setSystemFontFamilyName(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setTextColor(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setTextColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setTextFontWeight(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setTextFontWeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setTextLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setTextLocales(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setTextScaleX(float arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setTextScaleX(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setTextSize(float arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setTextSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder setTextStyle(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.Builder.wrap(((android.view.inputmethod.TextAppearanceInfo.Builder) real).setTextStyle(arg0));
        }

    }
}
