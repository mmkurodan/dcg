// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestionsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlineSuggestionsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest wrap(android.view.inputmethod.InlineSuggestionsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InlineSuggestionsRequest getReal() {
        return (android.view.inputmethod.InlineSuggestionsRequest) real;
    }

    public android.view.inputmethod.InlineSuggestionsRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.InlineSuggestionsRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InlineSuggestionsRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.inputmethod.InlineSuggestionsRequest) real).getExtras());
    }

    public java.lang.String getHostPackageName() {
        return ((android.view.inputmethod.InlineSuggestionsRequest) real).getHostPackageName();
    }

    public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec getInlineTooltipPresentationSpec() {
        return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(((android.view.inputmethod.InlineSuggestionsRequest) real).getInlineTooltipPresentationSpec());
    }

    public int getMaxSuggestionCount() {
        return ((android.view.inputmethod.InlineSuggestionsRequest) real).getMaxSuggestionCount();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getSupportedLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.view.inputmethod.InlineSuggestionsRequest) real).getSupportedLocales());
    }

    public int hashCode() {
        return ((android.view.inputmethod.InlineSuggestionsRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.InlineSuggestionsRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InlineSuggestionsRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SUGGESTION_COUNT_UNLIMITED = android.view.inputmethod.InlineSuggestionsRequest.SUGGESTION_COUNT_UNLIMITED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder wrap(android.view.inputmethod.InlineSuggestionsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.InlineSuggestionsRequest.Builder getReal() {
            return (android.view.inputmethod.InlineSuggestionsRequest.Builder) real;
        }

        public android.view.inputmethod.InlineSuggestionsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.util.List arg0) {
            this(new android.view.inputmethod.InlineSuggestionsRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder addInlinePresentationSpecs(com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(((android.view.inputmethod.InlineSuggestionsRequest.Builder) real).addInlinePresentationSpecs(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.wrap(((android.view.inputmethod.InlineSuggestionsRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(((android.view.inputmethod.InlineSuggestionsRequest.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setInlineTooltipPresentationSpec(com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(((android.view.inputmethod.InlineSuggestionsRequest.Builder) real).setInlineTooltipPresentationSpec(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setMaxSuggestionCount(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(((android.view.inputmethod.InlineSuggestionsRequest.Builder) real).setMaxSuggestionCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setSupportedLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(((android.view.inputmethod.InlineSuggestionsRequest.Builder) real).setSupportedLocales(arg0 == null ? null : arg0.getReal()));
        }

    }
}
