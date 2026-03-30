// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationCapability {
    private final android.view.translation.TranslationCapability real;

    public TranslationCapability(android.view.translation.TranslationCapability real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationCapability wrap(android.view.translation.TranslationCapability real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationCapability(real);
    }

    public android.view.translation.TranslationCapability unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getSourceSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(real.getSourceSpec());
    }

    public int getState() {
        return real.getState();
    }

    public int getSupportedTranslationFlags() {
        return real.getSupportedTranslationFlags();
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getTargetSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(real.getTargetSpec());
    }

    public boolean isUiTranslationEnabled() {
        return real.isUiTranslationEnabled();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATE_AVAILABLE_TO_DOWNLOAD = android.view.translation.TranslationCapability.STATE_AVAILABLE_TO_DOWNLOAD;
    public static final int STATE_DOWNLOADING = android.view.translation.TranslationCapability.STATE_DOWNLOADING;
    public static final int STATE_NOT_AVAILABLE = android.view.translation.TranslationCapability.STATE_NOT_AVAILABLE;
    public static final int STATE_ON_DEVICE = android.view.translation.TranslationCapability.STATE_ON_DEVICE;

}
