// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class IsolatedServiceException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IsolatedServiceException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedServiceException wrap(android.adservices.ondevicepersonalization.IsolatedServiceException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedServiceException(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.IsolatedServiceException getReal() {
        return (android.adservices.ondevicepersonalization.IsolatedServiceException) real;
    }

    public android.adservices.ondevicepersonalization.IsolatedServiceException unwrap() {
        return getReal();
    }

    public IsolatedServiceException(int arg0) {
        this(new android.adservices.ondevicepersonalization.IsolatedServiceException(arg0), (__DcgwBridgeToken) null);
    }

}
