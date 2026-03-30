// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class SuggestionSpan {
    private final android.text.style.SuggestionSpan real;

    public SuggestionSpan(android.text.style.SuggestionSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.SuggestionSpan wrap(android.text.style.SuggestionSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.SuggestionSpan(real);
    }

    public android.text.style.SuggestionSpan unwrap() {
        return real;
    }

    public SuggestionSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.SuggestionSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public SuggestionSpan(java.util.Locale arg0, java.lang.String[] arg1, int arg2) {
        this(new android.text.style.SuggestionSpan(arg0, arg1, arg2));
    }

    public SuggestionSpan(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String[] arg1, int arg2) {
        this(new android.text.style.SuggestionSpan(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public SuggestionSpan(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.Locale arg1, java.lang.String[] arg2, int arg3, java.lang.Class arg4) {
        this(new android.text.style.SuggestionSpan(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getFlags() {
        return real.getFlags();
    }

    public java.lang.String getLocale() {
        return real.getLocale();
    }

    public java.util.Locale getLocaleObject() {
        return real.getLocaleObject();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public java.lang.String[] getSuggestions() {
        return real.getSuggestions();
    }

    public int getUnderlineColor() {
        return real.getUnderlineColor();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setFlags(int arg0) {
        real.setFlags(arg0);
    }

    public void updateDrawState(com.micklab.dcg.wrapper.android.text.TextPaint arg0) {
        real.updateDrawState(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ACTION_SUGGESTION_PICKED = android.text.style.SuggestionSpan.ACTION_SUGGESTION_PICKED;
    public static final int FLAG_AUTO_CORRECTION = android.text.style.SuggestionSpan.FLAG_AUTO_CORRECTION;
    public static final int FLAG_EASY_CORRECT = android.text.style.SuggestionSpan.FLAG_EASY_CORRECT;
    public static final int FLAG_GRAMMAR_ERROR = android.text.style.SuggestionSpan.FLAG_GRAMMAR_ERROR;
    public static final int FLAG_MISSPELLED = android.text.style.SuggestionSpan.FLAG_MISSPELLED;
    public static final int SUGGESTIONS_MAX_SIZE = android.text.style.SuggestionSpan.SUGGESTIONS_MAX_SIZE;
    public static final java.lang.String SUGGESTION_SPAN_PICKED_AFTER = android.text.style.SuggestionSpan.SUGGESTION_SPAN_PICKED_AFTER;
    public static final java.lang.String SUGGESTION_SPAN_PICKED_BEFORE = android.text.style.SuggestionSpan.SUGGESTION_SPAN_PICKED_BEFORE;
    public static final java.lang.String SUGGESTION_SPAN_PICKED_HASHCODE = android.text.style.SuggestionSpan.SUGGESTION_SPAN_PICKED_HASHCODE;

}
