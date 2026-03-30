// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class UnderlineSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnderlineSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.UnderlineSpan wrap(android.text.style.UnderlineSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.UnderlineSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.UnderlineSpan getReal() {
        return (android.text.style.UnderlineSpan) real;
    }

    public android.text.style.UnderlineSpan unwrap() {
        return getReal();
    }

    public UnderlineSpan() {
        this(new android.text.style.UnderlineSpan(), (__DcgwBridgeToken) null);
    }

    public UnderlineSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.UnderlineSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.UnderlineSpan) real).describeContents();
    }

    public int getSpanTypeId() {
        return ((android.text.style.UnderlineSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.UnderlineSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.UnderlineSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.UnderlineSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
