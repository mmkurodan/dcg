// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestionsResponse {
    private final android.view.inputmethod.InlineSuggestionsResponse real;

    public InlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsResponse wrap(android.view.inputmethod.InlineSuggestionsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsResponse(real);
    }

    public android.view.inputmethod.InlineSuggestionsResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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
