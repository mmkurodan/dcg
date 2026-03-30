// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponse wrap(android.view.translation.TranslationResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponse(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationResponse getReal() {
        return (android.view.translation.TranslationResponse) real;
    }

    public android.view.translation.TranslationResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.TranslationResponse) real).describeContents();
    }

    public int getTranslationStatus() {
        return ((android.view.translation.TranslationResponse) real).getTranslationStatus();
    }

    public boolean isFinalResponse() {
        return ((android.view.translation.TranslationResponse) real).isFinalResponse();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TRANSLATION_STATUS_CONTEXT_UNSUPPORTED = android.view.translation.TranslationResponse.TRANSLATION_STATUS_CONTEXT_UNSUPPORTED;
    public static final int TRANSLATION_STATUS_SUCCESS = android.view.translation.TranslationResponse.TRANSLATION_STATUS_SUCCESS;
    public static final int TRANSLATION_STATUS_UNKNOWN_ERROR = android.view.translation.TranslationResponse.TRANSLATION_STATUS_UNKNOWN_ERROR;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder wrap(android.view.translation.TranslationResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.translation.TranslationResponse.Builder getReal() {
            return (android.view.translation.TranslationResponse.Builder) real;
        }

        public android.view.translation.TranslationResponse.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.view.translation.TranslationResponse.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.wrap(((android.view.translation.TranslationResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder setFinalResponse(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder.wrap(((android.view.translation.TranslationResponse.Builder) real).setFinalResponse(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder setTranslationResponseValue(int arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder.wrap(((android.view.translation.TranslationResponse.Builder) real).setTranslationResponseValue(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder setViewTranslationResponse(int arg0, com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse arg1) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponse.Builder.wrap(((android.view.translation.TranslationResponse.Builder) real).setViewTranslationResponse(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
}
