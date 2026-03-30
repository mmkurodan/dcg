// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationRequest {
    private final android.view.translation.TranslationRequest real;

    public TranslationRequest(android.view.translation.TranslationRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequest wrap(android.view.translation.TranslationRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationRequest(real);
    }

    public android.view.translation.TranslationRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getFlags() {
        return real.getFlags();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_DICTIONARY_RESULT = android.view.translation.TranslationRequest.FLAG_DICTIONARY_RESULT;
    public static final int FLAG_PARTIAL_RESPONSES = android.view.translation.TranslationRequest.FLAG_PARTIAL_RESPONSES;
    public static final int FLAG_TRANSLATION_RESULT = android.view.translation.TranslationRequest.FLAG_TRANSLATION_RESULT;
    public static final int FLAG_TRANSLITERATION_RESULT = android.view.translation.TranslationRequest.FLAG_TRANSLITERATION_RESULT;

    public static final class Builder {
        private final android.view.translation.TranslationRequest.Builder real;

        public Builder(android.view.translation.TranslationRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder wrap(android.view.translation.TranslationRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder(real);
        }

        public android.view.translation.TranslationRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.translation.TranslationRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationRequest build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationRequest.Builder.wrap(real.setFlags(arg0));
        }

    }
}
