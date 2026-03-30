// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class OnDevicePersonalizationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnDevicePersonalizationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager wrap(android.adservices.ondevicepersonalization.OnDevicePersonalizationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.OnDevicePersonalizationManager getReal() {
        return (android.adservices.ondevicepersonalization.OnDevicePersonalizationManager) real;
    }

    public android.adservices.ondevicepersonalization.OnDevicePersonalizationManager unwrap() {
        return getReal();
    }

    public static final class ExecuteResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExecuteResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult wrap(android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult getReal() {
            return (android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult) real;
        }

        public android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult unwrap() {
            return getReal();
        }

        public byte[] getOutputData() {
            return ((android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult) real).getOutputData();
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken getSurfacePackageToken() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken.wrap(((android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult) real).getSurfacePackageToken());
        }

    }
}
