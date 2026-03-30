// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class ViewTranslationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewTranslationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest wrap(android.view.translation.ViewTranslationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.ViewTranslationRequest getReal() {
        return (android.view.translation.ViewTranslationRequest) real;
    }

    public android.view.translation.ViewTranslationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.ViewTranslationRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.translation.ViewTranslationRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.translation.ViewTranslationRequest) real).getAutofillId());
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue getValue(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue.wrap(((android.view.translation.ViewTranslationRequest) real).getValue(arg0));
    }

    public int hashCode() {
        return ((android.view.translation.ViewTranslationRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.translation.ViewTranslationRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.ViewTranslationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String ID_TEXT = android.view.translation.ViewTranslationRequest.ID_TEXT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder wrap(android.view.translation.ViewTranslationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.translation.ViewTranslationRequest.Builder getReal() {
            return (android.view.translation.ViewTranslationRequest.Builder) real;
        }

        public android.view.translation.ViewTranslationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
            this(new android.view.translation.ViewTranslationRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long arg1) {
            this(new android.view.translation.ViewTranslationRequest.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest build() {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.wrap(((android.view.translation.ViewTranslationRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder setValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder.wrap(((android.view.translation.ViewTranslationRequest.Builder) real).setValue(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
}
