// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class OnDevicePersonalizationException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnDevicePersonalizationException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationException wrap(android.adservices.ondevicepersonalization.OnDevicePersonalizationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationException(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.OnDevicePersonalizationException getReal() {
        return (android.adservices.ondevicepersonalization.OnDevicePersonalizationException) real;
    }

    public android.adservices.ondevicepersonalization.OnDevicePersonalizationException unwrap() {
        return getReal();
    }

    public int getErrorCode() {
        return ((android.adservices.ondevicepersonalization.OnDevicePersonalizationException) real).getErrorCode();
    }

    public static final int ERROR_ISOLATED_SERVICE_FAILED = android.adservices.ondevicepersonalization.OnDevicePersonalizationException.ERROR_ISOLATED_SERVICE_FAILED;
    public static final int ERROR_PERSONALIZATION_DISABLED = android.adservices.ondevicepersonalization.OnDevicePersonalizationException.ERROR_PERSONALIZATION_DISABLED;

}
