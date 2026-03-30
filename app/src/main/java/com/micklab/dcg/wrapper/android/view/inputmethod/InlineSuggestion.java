// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestion {
    private final android.view.inputmethod.InlineSuggestion real;

    public InlineSuggestion(android.view.inputmethod.InlineSuggestion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestion wrap(android.view.inputmethod.InlineSuggestion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestion(real);
    }

    public android.view.inputmethod.InlineSuggestion unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo getInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo.wrap(real.getInfo());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
