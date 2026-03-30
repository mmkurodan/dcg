// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LocaleSpan {
    private final android.text.style.LocaleSpan real;

    public LocaleSpan(android.text.style.LocaleSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LocaleSpan wrap(android.text.style.LocaleSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LocaleSpan(real);
    }

    public android.text.style.LocaleSpan unwrap() {
        return real;
    }

    public LocaleSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.LocaleSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public LocaleSpan(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        this(new android.text.style.LocaleSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public LocaleSpan(java.util.Locale arg0) {
        this(new android.text.style.LocaleSpan(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getLocales());
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
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
