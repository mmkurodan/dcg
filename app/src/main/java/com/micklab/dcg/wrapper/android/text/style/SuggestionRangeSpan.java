// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SuggestionRangeSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SuggestionRangeSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SuggestionRangeSpan wrap(android.text.style.SuggestionRangeSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SuggestionRangeSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.SuggestionRangeSpan getReal() {
        return (android.text.style.SuggestionRangeSpan) real;
    }

    public android.text.style.SuggestionRangeSpan unwrap() {
        return getReal();
    }

    public SuggestionRangeSpan() {
        this(new android.text.style.SuggestionRangeSpan(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.SuggestionRangeSpan) real).describeContents();
    }

    public int getBackgroundColor() {
        return ((android.text.style.SuggestionRangeSpan) real).getBackgroundColor();
    }

    public int getSpanTypeId() {
        return ((android.text.style.SuggestionRangeSpan) real).getSpanTypeId();
    }

    public void setBackgroundColor(int arg0) {
        ((android.text.style.SuggestionRangeSpan) real).setBackgroundColor(arg0);
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        ((android.text.style.SuggestionRangeSpan) real).updateDrawState(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.SuggestionRangeSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
