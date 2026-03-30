// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventUrlProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventUrlProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider wrap(android.adservices.ondevicepersonalization.EventUrlProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.EventUrlProvider getReal() {
        return (android.adservices.ondevicepersonalization.EventUrlProvider) real;
    }

    public android.adservices.ondevicepersonalization.EventUrlProvider unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.net.Uri createEventTrackingUrlWithRedirect(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.ondevicepersonalization.EventUrlProvider) real).createEventTrackingUrlWithRedirect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri createEventTrackingUrlWithResponse(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0, byte[] arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.ondevicepersonalization.EventUrlProvider) real).createEventTrackingUrlWithResponse(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

}
