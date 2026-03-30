// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class AbsoluteSizeSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbsoluteSizeSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.AbsoluteSizeSpan wrap(android.text.style.AbsoluteSizeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.AbsoluteSizeSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.AbsoluteSizeSpan getReal() {
        return (android.text.style.AbsoluteSizeSpan) real;
    }

    public android.text.style.AbsoluteSizeSpan unwrap() {
        return getReal();
    }

    public AbsoluteSizeSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.AbsoluteSizeSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AbsoluteSizeSpan(int arg0) {
        this(new android.text.style.AbsoluteSizeSpan(arg0), (__DcgwBridgeToken) null);
    }

    public AbsoluteSizeSpan(int arg0, boolean arg1) {
        this(new android.text.style.AbsoluteSizeSpan(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.AbsoluteSizeSpan) real).describeContents();
    }

    public boolean getDip() {
        return ((android.text.style.AbsoluteSizeSpan) real).getDip();
    }

    public int getSize() {
        return ((android.text.style.AbsoluteSizeSpan) real).getSize();
    }

    public int getSpanTypeId() {
        return ((android.text.style.AbsoluteSizeSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.AbsoluteSizeSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.AbsoluteSizeSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.AbsoluteSizeSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.AbsoluteSizeSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
