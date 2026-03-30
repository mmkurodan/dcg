// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SentenceSuggestionsInfo {
    private final android.view.textservice.SentenceSuggestionsInfo real;

    public SentenceSuggestionsInfo(android.view.textservice.SentenceSuggestionsInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SentenceSuggestionsInfo wrap(android.view.textservice.SentenceSuggestionsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SentenceSuggestionsInfo(real);
    }

    public android.view.textservice.SentenceSuggestionsInfo unwrap() {
        return real;
    }

    public SentenceSuggestionsInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.textservice.SentenceSuggestionsInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public SentenceSuggestionsInfo(android.view.textservice.SuggestionsInfo[] arg0, int[] arg1, int[] arg2) {
        this(new android.view.textservice.SentenceSuggestionsInfo(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getLengthAt(int arg0) {
        return real.getLengthAt(arg0);
    }

    public int getOffsetAt(int arg0) {
        return real.getOffsetAt(arg0);
    }

    public int getSuggestionsCount() {
        return real.getSuggestionsCount();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo getSuggestionsInfoAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo.wrap(real.getSuggestionsInfoAt(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
