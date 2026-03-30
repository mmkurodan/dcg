// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SubscriptSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SubscriptSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SubscriptSpan wrap(android.text.style.SubscriptSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SubscriptSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.SubscriptSpan getReal() {
        return (android.text.style.SubscriptSpan) real;
    }

    public android.text.style.SubscriptSpan unwrap() {
        return getReal();
    }

    public SubscriptSpan() {
        this(new android.text.style.SubscriptSpan(), (__DcgwBridgeToken) null);
    }

    public SubscriptSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.SubscriptSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.SubscriptSpan) real).describeContents();
    }

    public int getSpanTypeId() {
        return ((android.text.style.SubscriptSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.SubscriptSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.SubscriptSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.SubscriptSpan) real).updateMeasureState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.SubscriptSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
