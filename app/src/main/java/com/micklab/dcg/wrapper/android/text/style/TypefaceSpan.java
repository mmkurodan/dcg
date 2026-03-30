// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TypefaceSpan {
    private final android.text.style.TypefaceSpan real;

    public TypefaceSpan(android.text.style.TypefaceSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TypefaceSpan wrap(android.text.style.TypefaceSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TypefaceSpan(real);
    }

    public android.text.style.TypefaceSpan unwrap() {
        return real;
    }

    public TypefaceSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.TypefaceSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public TypefaceSpan(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        this(new android.text.style.TypefaceSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public TypefaceSpan(java.lang.String arg0) {
        this(new android.text.style.TypefaceSpan(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getFamily() {
        return real.getFamily();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.getTypeface());
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
