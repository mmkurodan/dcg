// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationContext {
    private final android.view.translation.TranslationContext real;

    public TranslationContext(android.view.translation.TranslationContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationContext wrap(android.view.translation.TranslationContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationContext(real);
    }

    public android.view.translation.TranslationContext unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getSourceSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(real.getSourceSpec());
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getTargetSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(real.getTargetSpec());
    }

    public int getTranslationFlags() {
        return real.getTranslationFlags();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_DEFINITIONS = android.view.translation.TranslationContext.FLAG_DEFINITIONS;
    public static final int FLAG_LOW_LATENCY = android.view.translation.TranslationContext.FLAG_LOW_LATENCY;
    public static final int FLAG_TRANSLITERATION = android.view.translation.TranslationContext.FLAG_TRANSLITERATION;

    public static final class Builder {
        private final android.view.translation.TranslationContext.Builder real;

        public Builder(android.view.translation.TranslationContext.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder wrap(android.view.translation.TranslationContext.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder(real);
        }

        public android.view.translation.TranslationContext.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.translation.TranslationSpec arg0, com.micklab.dcg.wrapper.android.view.translation.TranslationSpec arg1) {
            this(new android.view.translation.TranslationContext.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationContext build() {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationContext.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder setTranslationFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.view.translation.TranslationContext.Builder.wrap(real.setTranslationFlags(arg0));
        }

    }
}
