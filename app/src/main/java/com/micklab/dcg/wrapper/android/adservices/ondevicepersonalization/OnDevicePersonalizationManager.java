// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class OnDevicePersonalizationManager {
    private final android.adservices.ondevicepersonalization.OnDevicePersonalizationManager real;

    public OnDevicePersonalizationManager(android.adservices.ondevicepersonalization.OnDevicePersonalizationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager wrap(android.adservices.ondevicepersonalization.OnDevicePersonalizationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager(real);
    }

    public android.adservices.ondevicepersonalization.OnDevicePersonalizationManager unwrap() {
        return real;
    }

    public static final class ExecuteResult {
        private final android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult real;

        public ExecuteResult(android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult wrap(android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult(real);
        }

        public android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult unwrap() {
            return real;
        }

        public byte[] getOutputData() {
            return real.getOutputData();
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken getSurfacePackageToken() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken.wrap(real.getSurfacePackageToken());
        }

    }
}
