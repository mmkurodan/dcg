// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationResponseValue {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationResponseValue(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue wrap(android.view.translation.TranslationResponseValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationResponseValue getReal() {
        return (android.view.translation.TranslationResponseValue) real;
    }

    public android.view.translation.TranslationResponseValue unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.TranslationResponseValue) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.translation.TranslationResponseValue) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue forError() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.wrap(android.view.translation.TranslationResponseValue.forError());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.translation.TranslationResponseValue) real).getExtras());
    }

    public int getStatusCode() {
        return ((android.view.translation.TranslationResponseValue) real).getStatusCode();
    }

    public java.lang.CharSequence getText() {
        return ((android.view.translation.TranslationResponseValue) real).getText();
    }

    public java.lang.CharSequence getTransliteration() {
        return ((android.view.translation.TranslationResponseValue) real).getTransliteration();
    }

    public int hashCode() {
        return ((android.view.translation.TranslationResponseValue) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationResponseValue) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationResponseValue) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String EXTRA_DEFINITIONS = android.view.translation.TranslationResponseValue.EXTRA_DEFINITIONS;
    public static final int STATUS_ERROR = android.view.translation.TranslationResponseValue.STATUS_ERROR;
    public static final int STATUS_SUCCESS = android.view.translation.TranslationResponseValue.STATUS_SUCCESS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder wrap(android.view.translation.TranslationResponseValue.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.translation.TranslationResponseValue.Builder getReal() {
            return (android.view.translation.TranslationResponseValue.Builder) real;
        }

        public android.view.translation.TranslationResponseValue.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.view.translation.TranslationResponseValue.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.wrap(((android.view.translation.TranslationResponseValue.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder.wrap(((android.view.translation.TranslationResponseValue.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder setText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder.wrap(((android.view.translation.TranslationResponseValue.Builder) real).setText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder setTransliteration(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationResponseValue.Builder.wrap(((android.view.translation.TranslationResponseValue.Builder) real).setTransliteration(arg0));
        }

    }
}
