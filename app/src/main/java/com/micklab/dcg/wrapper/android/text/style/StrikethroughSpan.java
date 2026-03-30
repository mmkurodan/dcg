// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class StrikethroughSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StrikethroughSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.StrikethroughSpan wrap(android.text.style.StrikethroughSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.StrikethroughSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.StrikethroughSpan getReal() {
        return (android.text.style.StrikethroughSpan) real;
    }

    public android.text.style.StrikethroughSpan unwrap() {
        return getReal();
    }

    public StrikethroughSpan() {
        this(new android.text.style.StrikethroughSpan(), (__DcgwBridgeToken) null);
    }

    public StrikethroughSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.StrikethroughSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.StrikethroughSpan) real).describeContents();
    }

    public int getSpanTypeId() {
        return ((android.text.style.StrikethroughSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.StrikethroughSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.StrikethroughSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.StrikethroughSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
