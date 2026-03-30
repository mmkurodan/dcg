// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class StyleSpan {
    private final android.text.style.StyleSpan real;

    public StyleSpan(android.text.style.StyleSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.StyleSpan wrap(android.text.style.StyleSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.StyleSpan(real);
    }

    public android.text.style.StyleSpan unwrap() {
        return real;
    }

    public StyleSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.StyleSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public StyleSpan(int arg0) {
        this(new android.text.style.StyleSpan(arg0));
    }

    public StyleSpan(int arg0, int arg1) {
        this(new android.text.style.StyleSpan(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getFontWeightAdjustment() {
        return real.getFontWeightAdjustment();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public int getStyle() {
        return real.getStyle();
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
