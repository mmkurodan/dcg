// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationResponse {
    private final android.view.translation.TranslationResponse real;

    public TranslationResponse(android.view.translation.TranslationResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponse wrap(android.view.translation.TranslationResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponse(real);
    }

    public android.view.translation.TranslationResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getTranslationStatus() {
        return real.getTranslationStatus();
    }

    public boolean isFinalResponse() {
        return real.isFinalResponse();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TRANSLATION_STATUS_CONTEXT_UNSUPPORTED = android.view.translation.TranslationResponse.TRANSLATION_STATUS_CONTEXT_UNSUPPORTED;
    public static final int TRANSLATION_STATUS_SUCCESS = android.view.translation.TranslationResponse.TRANSLATION_STATUS_SUCCESS;
    public static final int TRANSLATION_STATUS_UNKNOWN_ERROR = android.view.translation.TranslationResponse.TRANSLATION_STATUS_UNKNOWN_ERROR;

    public static final class Builder {
        private final android.view.translation.TranslationResponse.Builder real;

        public Builder(android.view.translation.TranslationResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder wrap(android.view.translation.TranslationResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder(real);
        }

        public android.view.translation.TranslationResponse.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.view.translation.TranslationResponse.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder setFinalResponse(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder.wrap(real.setFinalResponse(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder setTranslationResponseValue(int arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder.wrap(real.setTranslationResponseValue(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder setViewTranslationResponse(int arg0, com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder.wrap(real.setViewTranslationResponse(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
}
