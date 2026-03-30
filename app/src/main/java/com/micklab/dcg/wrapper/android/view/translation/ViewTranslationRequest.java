// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class ViewTranslationRequest {
    private final android.view.translation.ViewTranslationRequest real;

    public ViewTranslationRequest(android.view.translation.ViewTranslationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest wrap(android.view.translation.ViewTranslationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest(real);
    }

    public android.view.translation.ViewTranslationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getAutofillId());
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue getValue(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue.wrap(real.getValue(arg0));
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

    public static final java.lang.String ID_TEXT = android.view.translation.ViewTranslationRequest.ID_TEXT;

    public static final class Builder {
        private final android.view.translation.ViewTranslationRequest.Builder real;

        public Builder(android.view.translation.ViewTranslationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder wrap(android.view.translation.ViewTranslationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder(real);
        }

        public android.view.translation.ViewTranslationRequest.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
            this(new android.view.translation.ViewTranslationRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long arg1) {
            this(new android.view.translation.ViewTranslationRequest.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest build() {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder setValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationRequestValue arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationRequest.Builder.wrap(real.setValue(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
}
