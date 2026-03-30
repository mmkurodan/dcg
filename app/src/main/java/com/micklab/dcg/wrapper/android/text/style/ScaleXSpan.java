// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class ScaleXSpan {
    private final android.text.style.ScaleXSpan real;

    public ScaleXSpan(android.text.style.ScaleXSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.ScaleXSpan wrap(android.text.style.ScaleXSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.ScaleXSpan(real);
    }

    public android.text.style.ScaleXSpan unwrap() {
        return real;
    }

    public ScaleXSpan(float arg0) {
        this(new android.text.style.ScaleXSpan(arg0));
    }

    public ScaleXSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.ScaleXSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public float getScaleX() {
        return real.getScaleX();
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
