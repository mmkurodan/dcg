// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class ViewTranslationResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewTranslationResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse wrap(android.view.translation.ViewTranslationResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.ViewTranslationResponse getReal() {
        return (android.view.translation.ViewTranslationResponse) real;
    }

    public android.view.translation.ViewTranslationResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.ViewTranslationResponse) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.translation.ViewTranslationResponse) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.translation.ViewTranslationResponse) real).getAutofillId());
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue getValue(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.wrap(((android.view.translation.ViewTranslationResponse) real).getValue(arg0));
    }

    public int hashCode() {
        return ((android.view.translation.ViewTranslationResponse) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.translation.ViewTranslationResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.ViewTranslationResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder wrap(android.view.translation.ViewTranslationResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.translation.ViewTranslationResponse.Builder getReal() {
            return (android.view.translation.ViewTranslationResponse.Builder) real;
        }

        public android.view.translation.ViewTranslationResponse.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
            this(new android.view.translation.ViewTranslationResponse.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse build() {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.wrap(((android.view.translation.ViewTranslationResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder setValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.Builder.wrap(((android.view.translation.ViewTranslationResponse.Builder) real).setValue(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
}
