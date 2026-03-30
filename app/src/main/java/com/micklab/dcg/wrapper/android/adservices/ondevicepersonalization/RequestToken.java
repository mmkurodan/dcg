// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RequestToken {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RequestToken(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken wrap(android.adservices.ondevicepersonalization.RequestToken real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestToken(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.RequestToken getReal() {
        return (android.adservices.ondevicepersonalization.RequestToken) real;
    }

    public android.adservices.ondevicepersonalization.RequestToken unwrap() {
        return getReal();
    }

}
