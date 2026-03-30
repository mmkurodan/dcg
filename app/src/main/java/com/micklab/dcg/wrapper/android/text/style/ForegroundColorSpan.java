// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ForegroundColorSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ForegroundColorSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ForegroundColorSpan wrap(android.text.style.ForegroundColorSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ForegroundColorSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.ForegroundColorSpan getReal() {
        return (android.text.style.ForegroundColorSpan) real;
    }

    public android.text.style.ForegroundColorSpan unwrap() {
        return getReal();
    }

    public ForegroundColorSpan(int arg0) {
        this(new android.text.style.ForegroundColorSpan(arg0), (__DcgwBridgeToken) null);
    }

    public ForegroundColorSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.ForegroundColorSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.ForegroundColorSpan) real).describeContents();
    }

    public int getForegroundColor() {
        return ((android.text.style.ForegroundColorSpan) real).getForegroundColor();
    }

    public int getSpanTypeId() {
        return ((android.text.style.ForegroundColorSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.ForegroundColorSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.ForegroundColorSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.ForegroundColorSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
