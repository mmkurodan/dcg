// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationCapability {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationCapability(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationCapability wrap(android.view.translation.TranslationCapability real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationCapability(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationCapability getReal() {
        return (android.view.translation.TranslationCapability) real;
    }

    public android.view.translation.TranslationCapability unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.translation.TranslationCapability) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getSourceSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(((android.view.translation.TranslationCapability) real).getSourceSpec());
    }

    public int getState() {
        return ((android.view.translation.TranslationCapability) real).getState();
    }

    public int getSupportedTranslationFlags() {
        return ((android.view.translation.TranslationCapability) real).getSupportedTranslationFlags();
    }

    public com.micklab.dcg.wrapper.android.view.translation.TranslationSpec getTargetSpec() {
        return com.micklab.dcg.wrapper.android.view.translation.TranslationSpec.wrap(((android.view.translation.TranslationCapability) real).getTargetSpec());
    }

    public boolean isUiTranslationEnabled() {
        return ((android.view.translation.TranslationCapability) real).isUiTranslationEnabled();
    }

    public java.lang.String toString() {
        return ((android.view.translation.TranslationCapability) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.translation.TranslationCapability) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STATE_AVAILABLE_TO_DOWNLOAD = android.view.translation.TranslationCapability.STATE_AVAILABLE_TO_DOWNLOAD;
    public static final int STATE_DOWNLOADING = android.view.translation.TranslationCapability.STATE_DOWNLOADING;
    public static final int STATE_NOT_AVAILABLE = android.view.translation.TranslationCapability.STATE_NOT_AVAILABLE;
    public static final int STATE_ON_DEVICE = android.view.translation.TranslationCapability.STATE_ON_DEVICE;

}
