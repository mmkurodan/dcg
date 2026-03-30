// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SuggestionsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SuggestionsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo wrap(android.view.textservice.SuggestionsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.SuggestionsInfo getReal() {
        return (android.view.textservice.SuggestionsInfo) real;
    }

    public android.view.textservice.SuggestionsInfo unwrap() {
        return getReal();
    }

    public SuggestionsInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.textservice.SuggestionsInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SuggestionsInfo(int arg0, java.lang.String[] arg1) {
        this(new android.view.textservice.SuggestionsInfo(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public SuggestionsInfo(int arg0, java.lang.String[] arg1, int arg2, int arg3) {
        this(new android.view.textservice.SuggestionsInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.textservice.SuggestionsInfo) real).describeContents();
    }

    public int getCookie() {
        return ((android.view.textservice.SuggestionsInfo) real).getCookie();
    }

    public int getSequence() {
        return ((android.view.textservice.SuggestionsInfo) real).getSequence();
    }

    public java.lang.String getSuggestionAt(int arg0) {
        return ((android.view.textservice.SuggestionsInfo) real).getSuggestionAt(arg0);
    }

    public int getSuggestionsAttributes() {
        return ((android.view.textservice.SuggestionsInfo) real).getSuggestionsAttributes();
    }

    public int getSuggestionsCount() {
        return ((android.view.textservice.SuggestionsInfo) real).getSuggestionsCount();
    }

    public void setCookieAndSequence(int arg0, int arg1) {
        ((android.view.textservice.SuggestionsInfo) real).setCookieAndSequence(arg0, arg1);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textservice.SuggestionsInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RESULT_ATTR_DONT_SHOW_UI_FOR_SUGGESTIONS = android.view.textservice.SuggestionsInfo.RESULT_ATTR_DONT_SHOW_UI_FOR_SUGGESTIONS;
    public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = android.view.textservice.SuggestionsInfo.RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS;
    public static final int RESULT_ATTR_IN_THE_DICTIONARY = android.view.textservice.SuggestionsInfo.RESULT_ATTR_IN_THE_DICTIONARY;
    public static final int RESULT_ATTR_LOOKS_LIKE_GRAMMAR_ERROR = android.view.textservice.SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_GRAMMAR_ERROR;
    public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = android.view.textservice.SuggestionsInfo.RESULT_ATTR_LOOKS_LIKE_TYPO;

}
