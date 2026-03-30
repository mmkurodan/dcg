// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class UnderlineSpan {
    private final android.text.style.UnderlineSpan real;

    public UnderlineSpan(android.text.style.UnderlineSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.UnderlineSpan wrap(android.text.style.UnderlineSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.UnderlineSpan(real);
    }

    public android.text.style.UnderlineSpan unwrap() {
        return real;
    }

    public UnderlineSpan() {
        this(new android.text.style.UnderlineSpan());
    }

    public UnderlineSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.UnderlineSpan(arg0 == null ? null : arg0.unwrap()));
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
