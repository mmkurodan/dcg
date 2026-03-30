// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class ViewTranslationResponse {
    private final android.view.translation.ViewTranslationResponse real;

    public ViewTranslationResponse(android.view.translation.ViewTranslationResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse wrap(android.view.translation.ViewTranslationResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse(real);
    }

    public android.view.translation.ViewTranslationResponse unwrap() {
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

    public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue getValue(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.wrap(real.getValue(arg0));
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


    public static final class Builder {
        private final android.view.translation.ViewTranslationResponse.Builder real;

        public Builder(android.view.translation.ViewTranslationResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder wrap(android.view.translation.ViewTranslationResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder(real);
        }

        public android.view.translation.ViewTranslationResponse.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
            this(new android.view.translation.ViewTranslationResponse.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse build() {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder setValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder.wrap(real.setValue(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
}
