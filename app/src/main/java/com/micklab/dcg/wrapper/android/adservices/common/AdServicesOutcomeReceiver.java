// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdServicesOutcomeReceiver {
    private final android.adservices.common.AdServicesOutcomeReceiver real;

    public AdServicesOutcomeReceiver(android.adservices.common.AdServicesOutcomeReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdServicesOutcomeReceiver wrap(android.adservices.common.AdServicesOutcomeReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdServicesOutcomeReceiver(real);
    }

    public android.adservices.common.AdServicesOutcomeReceiver unwrap() {
        return real;
    }

    public void onError(java.lang.Throwable arg0) {
        real.onError(arg0);
    }

    public void onResult(java.lang.Object arg0) {
        real.onResult(arg0);
    }

}
