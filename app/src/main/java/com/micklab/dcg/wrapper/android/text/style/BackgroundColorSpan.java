// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class BackgroundColorSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackgroundColorSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.BackgroundColorSpan wrap(android.text.style.BackgroundColorSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.BackgroundColorSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.BackgroundColorSpan getReal() {
        return (android.text.style.BackgroundColorSpan) real;
    }

    public android.text.style.BackgroundColorSpan unwrap() {
        return getReal();
    }

    public BackgroundColorSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.BackgroundColorSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public BackgroundColorSpan(int arg0) {
        this(new android.text.style.BackgroundColorSpan(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.BackgroundColorSpan) real).describeContents();
    }

    public int getBackgroundColor() {
        return ((android.text.style.BackgroundColorSpan) real).getBackgroundColor();
    }

    public int getSpanTypeId() {
        return ((android.text.style.BackgroundColorSpan) real).getSpanTypeId();
    }

    public java.lang.String toString() {
        return ((android.text.style.BackgroundColorSpan) real).toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.BackgroundColorSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.BackgroundColorSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
