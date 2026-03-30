// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class StrikethroughSpan {
    private final android.text.style.StrikethroughSpan real;

    public StrikethroughSpan(android.text.style.StrikethroughSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.StrikethroughSpan wrap(android.text.style.StrikethroughSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.StrikethroughSpan(real);
    }

    public android.text.style.StrikethroughSpan unwrap() {
        return real;
    }

    public StrikethroughSpan() {
        this(new android.text.style.StrikethroughSpan());
    }

    public StrikethroughSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.StrikethroughSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
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
