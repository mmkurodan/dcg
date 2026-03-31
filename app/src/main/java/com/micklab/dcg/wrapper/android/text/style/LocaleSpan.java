// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LocaleSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocaleSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LocaleSpan wrap(android.text.style.LocaleSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LocaleSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.LocaleSpan getReal() {
        return (android.text.style.LocaleSpan) real;
    }

    public android.text.style.LocaleSpan unwrap() {
        return getReal();
    }

    public LocaleSpan(java.util.Locale arg0) {
        this(new android.text.style.LocaleSpan(arg0), (__DcgwBridgeToken) null);
    }

    public LocaleSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.LocaleSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public LocaleSpan(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        this(new android.text.style.LocaleSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.LocaleSpan) real).describeContents();
    }

    public java.util.Locale getLocale() {
        return ((android.text.style.LocaleSpan) real).getLocale();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.text.style.LocaleSpan) real).getLocales());
    }

    public int getSpanTypeId() {
        return ((android.text.style.LocaleSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.LocaleSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.LocaleSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.LocaleSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.LocaleSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
