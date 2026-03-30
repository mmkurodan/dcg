// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlineSuggestion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestion wrap(android.view.inputmethod.InlineSuggestion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestion(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InlineSuggestion getReal() {
        return (android.view.inputmethod.InlineSuggestion) real;
    }

    public android.view.inputmethod.InlineSuggestion unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.InlineSuggestion) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InlineSuggestion) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo getInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo.wrap(((android.view.inputmethod.InlineSuggestion) real).getInfo());
    }

    public int hashCode() {
        return ((android.view.inputmethod.InlineSuggestion) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.InlineSuggestion) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InlineSuggestion) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
