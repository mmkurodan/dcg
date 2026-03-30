// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SentenceSuggestionsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SentenceSuggestionsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SentenceSuggestionsInfo wrap(android.view.textservice.SentenceSuggestionsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SentenceSuggestionsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.SentenceSuggestionsInfo getReal() {
        return (android.view.textservice.SentenceSuggestionsInfo) real;
    }

    public android.view.textservice.SentenceSuggestionsInfo unwrap() {
        return getReal();
    }

    public SentenceSuggestionsInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.textservice.SentenceSuggestionsInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SentenceSuggestionsInfo(android.view.textservice.SuggestionsInfo[] arg0, int[] arg1, int[] arg2) {
        this(new android.view.textservice.SentenceSuggestionsInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.textservice.SentenceSuggestionsInfo) real).describeContents();
    }

    public int getLengthAt(int arg0) {
        return ((android.view.textservice.SentenceSuggestionsInfo) real).getLengthAt(arg0);
    }

    public int getOffsetAt(int arg0) {
        return ((android.view.textservice.SentenceSuggestionsInfo) real).getOffsetAt(arg0);
    }

    public int getSuggestionsCount() {
        return ((android.view.textservice.SentenceSuggestionsInfo) real).getSuggestionsCount();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo getSuggestionsInfoAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo.wrap(((android.view.textservice.SentenceSuggestionsInfo) real).getSuggestionsInfoAt(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textservice.SentenceSuggestionsInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
