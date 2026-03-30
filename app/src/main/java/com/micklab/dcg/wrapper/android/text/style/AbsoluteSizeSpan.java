// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class AbsoluteSizeSpan {
    private final android.text.style.AbsoluteSizeSpan real;

    public AbsoluteSizeSpan(android.text.style.AbsoluteSizeSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.AbsoluteSizeSpan wrap(android.text.style.AbsoluteSizeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.AbsoluteSizeSpan(real);
    }

    public android.text.style.AbsoluteSizeSpan unwrap() {
        return real;
    }

    public AbsoluteSizeSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.AbsoluteSizeSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public AbsoluteSizeSpan(int arg0) {
        this(new android.text.style.AbsoluteSizeSpan(arg0));
    }

    public AbsoluteSizeSpan(int arg0, boolean arg1) {
        this(new android.text.style.AbsoluteSizeSpan(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean getDip() {
        return real.getDip();
    }

    public int getSize() {
        return real.getSize();
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
