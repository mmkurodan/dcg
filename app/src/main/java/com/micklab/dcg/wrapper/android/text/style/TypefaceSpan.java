// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TypefaceSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TypefaceSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TypefaceSpan wrap(android.text.style.TypefaceSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TypefaceSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.TypefaceSpan getReal() {
        return (android.text.style.TypefaceSpan) real;
    }

    public android.text.style.TypefaceSpan unwrap() {
        return getReal();
    }

    public TypefaceSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.TypefaceSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TypefaceSpan(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        this(new android.text.style.TypefaceSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TypefaceSpan(java.lang.String arg0) {
        this(new android.text.style.TypefaceSpan(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.TypefaceSpan) real).describeContents();
    }

    public java.lang.String getFamily() {
        return ((android.text.style.TypefaceSpan) real).getFamily();
    }

    public int getSpanTypeId() {
        return ((android.text.style.TypefaceSpan) real).getSpanTypeId();
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.text.style.TypefaceSpan) real).getTypeface());
    }

    public java.lang.String toString() {
        return ((android.text.style.TypefaceSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.TypefaceSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.TypefaceSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.TypefaceSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
