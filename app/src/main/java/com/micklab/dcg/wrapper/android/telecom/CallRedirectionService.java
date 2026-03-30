// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallRedirectionService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallRedirectionService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallRedirectionService wrap(android.telecom.CallRedirectionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallRedirectionService(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallRedirectionService getReal() {
        return (android.telecom.CallRedirectionService) real;
    }

    public android.telecom.CallRedirectionService unwrap() {
        return getReal();
    }

    public void cancelCall() {
        ((android.telecom.CallRedirectionService) real).cancelCall();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.telecom.CallRedirectionService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onPlaceCall(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1, boolean arg2) {
        ((android.telecom.CallRedirectionService) real).onPlaceCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onRedirectionTimeout() {
        ((android.telecom.CallRedirectionService) real).onRedirectionTimeout();
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.telecom.CallRedirectionService) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

    public void placeCallUnmodified() {
        ((android.telecom.CallRedirectionService) real).placeCallUnmodified();
    }

    public void redirectCall(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1, boolean arg2) {
        ((android.telecom.CallRedirectionService) real).redirectCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.CallRedirectionService.SERVICE_INTERFACE;

}
