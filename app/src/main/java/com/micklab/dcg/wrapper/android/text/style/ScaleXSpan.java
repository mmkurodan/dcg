// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ScaleXSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScaleXSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ScaleXSpan wrap(android.text.style.ScaleXSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ScaleXSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.ScaleXSpan getReal() {
        return (android.text.style.ScaleXSpan) real;
    }

    public android.text.style.ScaleXSpan unwrap() {
        return getReal();
    }

    public ScaleXSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.ScaleXSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ScaleXSpan(float arg0) {
        this(new android.text.style.ScaleXSpan(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.ScaleXSpan) real).describeContents();
    }

    public float getScaleX() {
        return ((android.text.style.ScaleXSpan) real).getScaleX();
    }

    public int getSpanTypeId() {
        return ((android.text.style.ScaleXSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.ScaleXSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.ScaleXSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.ScaleXSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.ScaleXSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
