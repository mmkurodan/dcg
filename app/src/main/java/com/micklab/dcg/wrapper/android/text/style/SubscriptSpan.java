// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SubscriptSpan {
    private final android.text.style.SubscriptSpan real;

    public SubscriptSpan(android.text.style.SubscriptSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SubscriptSpan wrap(android.text.style.SubscriptSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SubscriptSpan(real);
    }

    public android.text.style.SubscriptSpan unwrap() {
        return real;
    }

    public SubscriptSpan() {
        this(new android.text.style.SubscriptSpan());
    }

    public SubscriptSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.SubscriptSpan(arg0 == null ? null : arg0.unwrap()));
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
