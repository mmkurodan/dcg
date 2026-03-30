// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class OnDevicePersonalizationException {
    private final android.adservices.ondevicepersonalization.OnDevicePersonalizationException real;

    public OnDevicePersonalizationException(android.adservices.ondevicepersonalization.OnDevicePersonalizationException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationException wrap(android.adservices.ondevicepersonalization.OnDevicePersonalizationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationException(real);
    }

    public android.adservices.ondevicepersonalization.OnDevicePersonalizationException unwrap() {
        return real;
    }

    public int getErrorCode() {
        return real.getErrorCode();
    }

    public static final int ERROR_ISOLATED_SERVICE_FAILED = android.adservices.ondevicepersonalization.OnDevicePersonalizationException.ERROR_ISOLATED_SERVICE_FAILED;
    public static final int ERROR_PERSONALIZATION_DISABLED = android.adservices.ondevicepersonalization.OnDevicePersonalizationException.ERROR_PERSONALIZATION_DISABLED;

}
