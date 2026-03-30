// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class StyleSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StyleSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.StyleSpan wrap(android.text.style.StyleSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.StyleSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.StyleSpan getReal() {
        return (android.text.style.StyleSpan) real;
    }

    public android.text.style.StyleSpan unwrap() {
        return getReal();
    }

    public StyleSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.StyleSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public StyleSpan(int arg0) {
        this(new android.text.style.StyleSpan(arg0), (__DcgwBridgeToken) null);
    }

    public StyleSpan(int arg0, int arg1) {
        this(new android.text.style.StyleSpan(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.StyleSpan) real).describeContents();
    }

    public int getFontWeightAdjustment() {
        return ((android.text.style.StyleSpan) real).getFontWeightAdjustment();
    }

    public int getSpanTypeId() {
        return ((android.text.style.StyleSpan) real).getSpanTypeId();
    }

    public int getStyle() {
        return ((android.text.style.StyleSpan) real).getStyle();
    }

    public java.lang.String toString() {
        return ((android.text.style.StyleSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.StyleSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.StyleSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.StyleSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
