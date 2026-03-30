// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SuggestionRangeSpan {
    private final android.text.style.SuggestionRangeSpan real;

    public SuggestionRangeSpan(android.text.style.SuggestionRangeSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SuggestionRangeSpan wrap(android.text.style.SuggestionRangeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SuggestionRangeSpan(real);
    }

    public android.text.style.SuggestionRangeSpan unwrap() {
        return real;
    }

    public SuggestionRangeSpan() {
        this(new android.text.style.SuggestionRangeSpan());
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

    public void setBackgroundColor(int arg0) {
        real.setBackgroundColor(arg0);
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
