// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class RelativeSizeSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RelativeSizeSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.RelativeSizeSpan wrap(android.text.style.RelativeSizeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.RelativeSizeSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.RelativeSizeSpan getReal() {
        return (android.text.style.RelativeSizeSpan) real;
    }

    public android.text.style.RelativeSizeSpan unwrap() {
        return getReal();
    }

    public RelativeSizeSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.RelativeSizeSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RelativeSizeSpan(float arg0) {
        this(new android.text.style.RelativeSizeSpan(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.RelativeSizeSpan) real).describeContents();
    }

    public float getSizeChange() {
        return ((android.text.style.RelativeSizeSpan) real).getSizeChange();
    }

    public int getSpanTypeId() {
        return ((android.text.style.RelativeSizeSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.RelativeSizeSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.RelativeSizeSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.RelativeSizeSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.RelativeSizeSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
