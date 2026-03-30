// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestionsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlineSuggestionsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsResponse wrap(android.view.inputmethod.InlineSuggestionsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InlineSuggestionsResponse getReal() {
        return (android.view.inputmethod.InlineSuggestionsResponse) real;
    }

    public android.view.inputmethod.InlineSuggestionsResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.InlineSuggestionsResponse) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InlineSuggestionsResponse) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.view.inputmethod.InlineSuggestionsResponse) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.InlineSuggestionsResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InlineSuggestionsResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
