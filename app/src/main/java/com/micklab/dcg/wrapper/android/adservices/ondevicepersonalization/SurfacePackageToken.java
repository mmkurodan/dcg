// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class SurfacePackageToken {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfacePackageToken(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken wrap(android.adservices.ondevicepersonalization.SurfacePackageToken real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.SurfacePackageToken(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.SurfacePackageToken getReal() {
        return (android.adservices.ondevicepersonalization.SurfacePackageToken) real;
    }

    public android.adservices.ondevicepersonalization.SurfacePackageToken unwrap() {
        return getReal();
    }

}
