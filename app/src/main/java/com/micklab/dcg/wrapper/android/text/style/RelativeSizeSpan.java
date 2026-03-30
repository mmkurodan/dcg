// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class RelativeSizeSpan {
    private final android.text.style.RelativeSizeSpan real;

    public RelativeSizeSpan(android.text.style.RelativeSizeSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.RelativeSizeSpan wrap(android.text.style.RelativeSizeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.RelativeSizeSpan(real);
    }

    public android.text.style.RelativeSizeSpan unwrap() {
        return real;
    }

    public RelativeSizeSpan(float arg0) {
        this(new android.text.style.RelativeSizeSpan(arg0));
    }

    public RelativeSizeSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.RelativeSizeSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public float getSizeChange() {
        return real.getSizeChange();
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
