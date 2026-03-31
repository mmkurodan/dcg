// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ExecuteInIsolatedServiceResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExecuteInIsolatedServiceResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse wrap(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse getReal() {
        return (android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse) real;
    }

    public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse unwrap() {
        return getReal();
    }

    public ExecuteInIsolatedServiceResponse(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken arg0, int arg1) {
        this(new android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int getBestValue() {
        return ((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse) real).getBestValue();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken getSurfacePackageToken() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse) real).getSurfacePackageToken());
    }

    public static final int DEFAULT_BEST_VALUE = android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse.DEFAULT_BEST_VALUE;

}
