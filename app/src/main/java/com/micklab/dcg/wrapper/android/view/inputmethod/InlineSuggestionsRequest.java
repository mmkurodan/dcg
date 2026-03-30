// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InlineSuggestionsRequest {
    private final android.view.inputmethod.InlineSuggestionsRequest real;

    public InlineSuggestionsRequest(android.view.inputmethod.InlineSuggestionsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest wrap(android.view.inputmethod.InlineSuggestionsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest(real);
    }

    public android.view.inputmethod.InlineSuggestionsRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getHostPackageName() {
        return real.getHostPackageName();
    }

    public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec getInlineTooltipPresentationSpec() {
        return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(real.getInlineTooltipPresentationSpec());
    }

    public int getMaxSuggestionCount() {
        return real.getMaxSuggestionCount();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getSupportedLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getSupportedLocales());
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

    public static final int SUGGESTION_COUNT_UNLIMITED = android.view.inputmethod.InlineSuggestionsRequest.SUGGESTION_COUNT_UNLIMITED;

    public static final class Builder {
        private final android.view.inputmethod.InlineSuggestionsRequest.Builder real;

        public Builder(android.view.inputmethod.InlineSuggestionsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder wrap(android.view.inputmethod.InlineSuggestionsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder(real);
        }

        public android.view.inputmethod.InlineSuggestionsRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.util.List arg0) {
            this(new android.view.inputmethod.InlineSuggestionsRequest.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder addInlinePresentationSpecs(com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(real.addInlinePresentationSpecs(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setInlineTooltipPresentationSpec(com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(real.setInlineTooltipPresentationSpec(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setMaxSuggestionCount(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(real.setMaxSuggestionCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder setSupportedLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.Builder.wrap(real.setSupportedLocales(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
