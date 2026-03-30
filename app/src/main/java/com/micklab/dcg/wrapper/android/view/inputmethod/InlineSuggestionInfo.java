// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestionInfo {
    private final android.view.inputmethod.InlineSuggestionInfo real;

    public InlineSuggestionInfo(android.view.inputmethod.InlineSuggestionInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo wrap(android.view.inputmethod.InlineSuggestionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionInfo(real);
    }

    public android.view.inputmethod.InlineSuggestionInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String[] getAutofillHints() {
        return real.getAutofillHints();
    }

    public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec getInlinePresentationSpec() {
        return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(real.getInlinePresentationSpec());
    }

    public java.lang.String getSource() {
        return real.getSource();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isPinned() {
        return real.isPinned();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String SOURCE_AUTOFILL = android.view.inputmethod.InlineSuggestionInfo.SOURCE_AUTOFILL;
    public static final java.lang.String SOURCE_PLATFORM = android.view.inputmethod.InlineSuggestionInfo.SOURCE_PLATFORM;
    public static final java.lang.String TYPE_ACTION = android.view.inputmethod.InlineSuggestionInfo.TYPE_ACTION;
    public static final java.lang.String TYPE_SUGGESTION = android.view.inputmethod.InlineSuggestionInfo.TYPE_SUGGESTION;

}
