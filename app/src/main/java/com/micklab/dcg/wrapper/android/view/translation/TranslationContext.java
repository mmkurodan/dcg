// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationContext wrap(android.view.translation.TranslationContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationContext(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationContext getReal() {
        return (android.view.translation.TranslationContext) real;
    }

    public android.view.translation.TranslationContext unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.TranslationContext) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getSourceSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(((android.view.translation.TranslationContext) real).getSourceSpec());
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getTargetSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(((android.view.translation.TranslationContext) real).getTargetSpec());
    }

    public int getTranslationFlags() {
        return ((android.view.translation.TranslationContext) real).getTranslationFlags();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationContext) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationContext) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_DEFINITIONS = android.view.translation.TranslationContext.FLAG_DEFINITIONS;
    public static final int FLAG_LOW_LATENCY = android.view.translation.TranslationContext.FLAG_LOW_LATENCY;
    public static final int FLAG_TRANSLITERATION = android.view.translation.TranslationContext.FLAG_TRANSLITERATION;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder wrap(android.view.translation.TranslationContext.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.translation.TranslationContext.Builder getReal() {
            return (android.view.translation.TranslationContext.Builder) real;
        }

        public android.view.translation.TranslationContext.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.translation.TranslationSpec arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationSpec arg1) {
            this(new android.view.translation.TranslationContext.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationContext build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationContext.wrap(((android.view.translation.TranslationContext.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder setTranslationFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder.wrap(((android.view.translation.TranslationContext.Builder) real).setTranslationFlags(arg0));
        }

    }
}
