// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestionInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlineSuggestionInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo wrap(android.view.inputmethod.InlineSuggestionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InlineSuggestionInfo getReal() {
        return (android.view.inputmethod.InlineSuggestionInfo) real;
    }

    public android.view.inputmethod.InlineSuggestionInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).equals(arg0);
    }

    public java.lang.String[] getAutofillHints() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).getAutofillHints();
    }

    public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec getInlinePresentationSpec() {
        return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(((android.view.inputmethod.InlineSuggestionInfo) real).getInlinePresentationSpec());
    }

    public java.lang.String getSource() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).getSource();
    }

    public java.lang.String getType() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).getType();
    }

    public int hashCode() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).hashCode();
    }

    public boolean isPinned() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).isPinned();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.InlineSuggestionInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InlineSuggestionInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String SOURCE_AUTOFILL = android.view.inputmethod.InlineSuggestionInfo.SOURCE_AUTOFILL;
    public static final java.lang.String SOURCE_PLATFORM = android.view.inputmethod.InlineSuggestionInfo.SOURCE_PLATFORM;
    public static final java.lang.String TYPE_ACTION = android.view.inputmethod.InlineSuggestionInfo.TYPE_ACTION;
    public static final java.lang.String TYPE_SUGGESTION = android.view.inputmethod.InlineSuggestionInfo.TYPE_SUGGESTION;

}
