// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequest wrap(android.view.translation.TranslationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationRequest(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationRequest getReal() {
        return (android.view.translation.TranslationRequest) real;
    }

    public android.view.translation.TranslationRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.TranslationRequest) real).describeContents();
    }

    public int getFlags() {
        return ((android.view.translation.TranslationRequest) real).getFlags();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_DICTIONARY_RESULT = android.view.translation.TranslationRequest.FLAG_DICTIONARY_RESULT;
    public static final int FLAG_PARTIAL_RESPONSES = android.view.translation.TranslationRequest.FLAG_PARTIAL_RESPONSES;
    public static final int FLAG_TRANSLATION_RESULT = android.view.translation.TranslationRequest.FLAG_TRANSLATION_RESULT;
    public static final int FLAG_TRANSLITERATION_RESULT = android.view.translation.TranslationRequest.FLAG_TRANSLITERATION_RESULT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder wrap(android.view.translation.TranslationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.translation.TranslationRequest.Builder getReal() {
            return (android.view.translation.TranslationRequest.Builder) real;
        }

        public android.view.translation.TranslationRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.translation.TranslationRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationRequest build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.wrap(((android.view.translation.TranslationRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder.wrap(((android.view.translation.TranslationRequest.Builder) real).setFlags(arg0));
        }

    }
}
