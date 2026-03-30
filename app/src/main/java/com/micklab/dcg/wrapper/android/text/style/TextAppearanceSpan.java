// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TextAppearanceSpan {
    private final android.text.style.TextAppearanceSpan real;

    public TextAppearanceSpan(android.text.style.TextAppearanceSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TextAppearanceSpan wrap(android.text.style.TextAppearanceSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TextAppearanceSpan(real);
    }

    public android.text.style.TextAppearanceSpan unwrap() {
        return real;
    }

    public TextAppearanceSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.TextAppearanceSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public TextAppearanceSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.text.style.TextAppearanceSpan(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public TextAppearanceSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.text.style.TextAppearanceSpan(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public TextAppearanceSpan(java.lang.String arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg3, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg4) {
        this(new android.text.style.TextAppearanceSpan(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getFamily() {
        return real.getFamily();
    }

    public java.lang.String getFontFeatureSettings() {
        return real.getFontFeatureSettings();
    }

    public java.lang.String getFontVariationSettings() {
        return real.getFontVariationSettings();
    }

    public float getLetterSpacing() {
        return real.getLetterSpacing();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getLinkTextColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getLinkTextColor());
    }

    public int getShadowColor() {
        return real.getShadowColor();
    }

    public float getShadowDx() {
        return real.getShadowDx();
    }

    public float getShadowDy() {
        return real.getShadowDy();
    }

    public float getShadowRadius() {
        return real.getShadowRadius();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getTextColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getTextColor());
    }

    public int getTextFontWeight() {
        return real.getTextFontWeight();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getTextLocales());
    }

    public int getTextSize() {
        return real.getTextSize();
    }

    public int getTextStyle() {
        return real.getTextStyle();
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.getTypeface());
    }

    public boolean isElegantTextHeight() {
        return real.isElegantTextHeight();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateMeasureState(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
