// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationResponseValue {
    private final android.view.translation.TranslationResponseValue real;

    public TranslationResponseValue(android.view.translation.TranslationResponseValue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue wrap(android.view.translation.TranslationResponseValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue(real);
    }

    public android.view.translation.TranslationResponseValue unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue forError() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.wrap(android.view.translation.TranslationResponseValue.forError());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public int getStatusCode() {
        return real.getStatusCode();
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public java.lang.CharSequence getTransliteration() {
        return real.getTransliteration();
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

    public static final java.lang.String EXTRA_DEFINITIONS = android.view.translation.TranslationResponseValue.EXTRA_DEFINITIONS;
    public static final int STATUS_ERROR = android.view.translation.TranslationResponseValue.STATUS_ERROR;
    public static final int STATUS_SUCCESS = android.view.translation.TranslationResponseValue.STATUS_SUCCESS;

    public static final class Builder {
        private final android.view.translation.TranslationResponseValue.Builder real;

        public Builder(android.view.translation.TranslationResponseValue.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder wrap(android.view.translation.TranslationResponseValue.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder(real);
        }

        public android.view.translation.TranslationResponseValue.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.view.translation.TranslationResponseValue.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder setText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder.wrap(real.setText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder setTransliteration(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder.wrap(real.setTransliteration(arg0));
        }

    }
}
