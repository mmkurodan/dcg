// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SuperscriptSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SuperscriptSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SuperscriptSpan wrap(android.text.style.SuperscriptSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SuperscriptSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.SuperscriptSpan getReal() {
        return (android.text.style.SuperscriptSpan) real;
    }

    public android.text.style.SuperscriptSpan unwrap() {
        return getReal();
    }

    public SuperscriptSpan() {
        this(new android.text.style.SuperscriptSpan(), (__DcgwBridgeToken) null);
    }

    public SuperscriptSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.SuperscriptSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.SuperscriptSpan) real).describeContents();
    }

    public int getSpanTypeId() {
        return ((android.text.style.SuperscriptSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.SuperscriptSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.SuperscriptSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.SuperscriptSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.SuperscriptSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
