// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SuperscriptSpan {
    private final android.text.style.SuperscriptSpan real;

    public SuperscriptSpan(android.text.style.SuperscriptSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SuperscriptSpan wrap(android.text.style.SuperscriptSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SuperscriptSpan(real);
    }

    public android.text.style.SuperscriptSpan unwrap() {
        return real;
    }

    public SuperscriptSpan() {
        this(new android.text.style.SuperscriptSpan());
    }

    public SuperscriptSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.SuperscriptSpan(arg0 == null ? null : arg0.unwrap()));
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

    public void updateMeasureState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateMeasureState(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
