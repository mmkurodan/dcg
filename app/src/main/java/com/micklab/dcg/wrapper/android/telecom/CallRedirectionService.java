// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallRedirectionService {
    private final android.telecom.CallRedirectionService real;

    public CallRedirectionService(android.telecom.CallRedirectionService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallRedirectionService wrap(android.telecom.CallRedirectionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallRedirectionService(real);
    }

    public android.telecom.CallRedirectionService unwrap() {
        return real;
    }

    public void cancelCall() {
        real.cancelCall();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onPlaceCall(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1, boolean arg2) {
        real.onPlaceCall(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onRedirectionTimeout() {
        real.onRedirectionTimeout();
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public void placeCallUnmodified() {
        real.placeCallUnmodified();
    }

    public void redirectCall(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1, boolean arg2) {
        real.redirectCall(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.CallRedirectionService.SERVICE_INTERFACE;

}
