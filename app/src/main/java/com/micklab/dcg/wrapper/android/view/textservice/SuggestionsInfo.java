// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SuggestionsInfo {
    private final android.view.textservice.SuggestionsInfo real;

    public SuggestionsInfo(android.view.textservice.SuggestionsInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo wrap(android.view.textservice.SuggestionsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo(real);
    }

    public android.view.textservice.SuggestionsInfo unwrap() {
        return real;
    }

    public SuggestionsInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.textservice.SuggestionsInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public SuggestionsInfo(int arg0, java.lang.String[] arg1) {
        this(new android.view.textservice.SuggestionsInfo(arg0, arg1));
    }

    public SuggestionsInfo(int arg0, java.lang.String[] arg1, int arg2, int arg3) {
        this(new android.view.textservice.SuggestionsInfo(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getCookie() {
        return real.getCookie();
    }

    public int getSequence() {
        return real.getSequence();
    }

    public java.lang.String getSuggestionAt(int arg0) {
        return real.getSuggestionAt(arg0);
    }

    public int getSuggestionsAttributes() {
        return real.getSuggestionsAttributes();
    }

    public int getSuggestionsCount() {
        return real.getSuggestionsCount();
    }

    public void setCookieAndSequence(int arg0, int arg1) {
        real.setCookieAndSequence(arg0, arg1);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int RESULT_ATTR_DONT_SHOW_UI_FOR_SUGGESTIONS = android.view.textservice.SuggestionsInfo.RESULT_ATTR_DONT_SHOW_UI_FOR_SUGGESTIONS;
    public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = android.view.textservice.SuggestionsInfo.RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS;
    public static final int RESULT_ATTR_IN_THE_DICTIONARY = android.view.textservice.SuggestionsInfo.RESULT_ATTR_IN_THE_DICTIONARY;
    public static final int RESULT_ATTR_LOOKS_LIKE_GRAMMAR_ERROR = android.view.textservice.SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_GRAMMAR_ERROR;
    public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = android.view.textservice.SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_TYPO;

}
