// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class BackgroundColorSpan {
    private final android.text.style.BackgroundColorSpan real;

    public BackgroundColorSpan(android.text.style.BackgroundColorSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.BackgroundColorSpan wrap(android.text.style.BackgroundColorSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.BackgroundColorSpan(real);
    }

    public android.text.style.BackgroundColorSpan unwrap() {
        return real;
    }

    public BackgroundColorSpan(int arg0) {
        this(new android.text.style.BackgroundColorSpan(arg0));
    }

    public BackgroundColorSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.BackgroundColorSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getBackgroundColor() {
        return real.getBackgroundColor();
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
