// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ForegroundColorSpan {
    private final android.text.style.ForegroundColorSpan real;

    public ForegroundColorSpan(android.text.style.ForegroundColorSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ForegroundColorSpan wrap(android.text.style.ForegroundColorSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ForegroundColorSpan(real);
    }

    public android.text.style.ForegroundColorSpan unwrap() {
        return real;
    }

    public ForegroundColorSpan(int arg0) {
        this(new android.text.style.ForegroundColorSpan(arg0));
    }

    public ForegroundColorSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.ForegroundColorSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getForegroundColor() {
        return real.getForegroundColor();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
