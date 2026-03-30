// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class IsolatedServiceException {
    private final android.adservices.ondevicepersonalization.IsolatedServiceException real;

    public IsolatedServiceException(android.adservices.ondevicepersonalization.IsolatedServiceException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedServiceException wrap(android.adservices.ondevicepersonalization.IsolatedServiceException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedServiceException(real);
    }

    public android.adservices.ondevicepersonalization.IsolatedServiceException unwrap() {
        return real;
    }

    public IsolatedServiceException(int arg0) {
        this(new android.adservices.ondevicepersonalization.IsolatedServiceException(arg0));
    }

}
