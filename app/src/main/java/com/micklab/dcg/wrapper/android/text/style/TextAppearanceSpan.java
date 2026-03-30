// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TextAppearanceSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextAppearanceSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TextAppearanceSpan wrap(android.text.style.TextAppearanceSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TextAppearanceSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.TextAppearanceSpan getReal() {
        return (android.text.style.TextAppearanceSpan) real;
    }

    public android.text.style.TextAppearanceSpan unwrap() {
        return getReal();
    }

    public TextAppearanceSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.TextAppearanceSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextAppearanceSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.text.style.TextAppearanceSpan(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public TextAppearanceSpan(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.text.style.TextAppearanceSpan(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public TextAppearanceSpan(java.lang.String arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg3, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg4) {
        this(new android.text.style.TextAppearanceSpan(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.TextAppearanceSpan) real).describeContents();
    }

    public java.lang.String getFamily() {
        return ((android.text.style.TextAppearanceSpan) real).getFamily();
    }

    public java.lang.String getFontFeatureSettings() {
        return ((android.text.style.TextAppearanceSpan) real).getFontFeatureSettings();
    }

    public java.lang.String getFontVariationSettings() {
        return ((android.text.style.TextAppearanceSpan) real).getFontVariationSettings();
    }

    public float getLetterSpacing() {
        return ((android.text.style.TextAppearanceSpan) real).getLetterSpacing();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getLinkTextColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.text.style.TextAppearanceSpan) real).getLinkTextColor());
    }

    public int getShadowColor() {
        return ((android.text.style.TextAppearanceSpan) real).getShadowColor();
    }

    public float getShadowDx() {
        return ((android.text.style.TextAppearanceSpan) real).getShadowDx();
    }

    public float getShadowDy() {
        return ((android.text.style.TextAppearanceSpan) real).getShadowDy();
    }

    public float getShadowRadius() {
        return ((android.text.style.TextAppearanceSpan) real).getShadowRadius();
    }

    public int getSpanTypeId() {
        return ((android.text.style.TextAppearanceSpan) real).getSpanTypeId();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getTextColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.text.style.TextAppearanceSpan) real).getTextColor());
    }

    public int getTextFontWeight() {
        return ((android.text.style.TextAppearanceSpan) real).getTextFontWeight();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getTextLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.text.style.TextAppearanceSpan) real).getTextLocales());
    }

    public int getTextSize() {
        return ((android.text.style.TextAppearanceSpan) real).getTextSize();
    }

    public int getTextStyle() {
        return ((android.text.style.TextAppearanceSpan) real).getTextStyle();
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.text.style.TextAppearanceSpan) real).getTypeface());
    }

    public boolean isElegantTextHeight() {
        return ((android.text.style.TextAppearanceSpan) real).isElegantTextHeight();
    }

    public java.lang.String toString() {
        return ((android.text.style.TextAppearanceSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.TextAppearanceSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.TextAppearanceSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.TextAppearanceSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
