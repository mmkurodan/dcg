// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdServicesOutcomeReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdServicesOutcomeReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdServicesOutcomeReceiver wrap(android.adservices.common.AdServicesOutcomeReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdServicesOutcomeReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AdServicesOutcomeReceiver getReal() {
        return (android.adservices.common.AdServicesOutcomeReceiver) real;
    }

    public android.adservices.common.AdServicesOutcomeReceiver unwrap() {
        return getReal();
    }

    public void onError(java.lang.Throwable arg0) {
        ((android.adservices.common.AdServicesOutcomeReceiver) real).onError(arg0);
    }

    public void onResult(java.lang.Object arg0) {
        ((android.adservices.common.AdServicesOutcomeReceiver) real).onResult(arg0);
    }

}
