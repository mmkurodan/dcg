// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventUrlProvider {
    private final android.adservices.ondevicepersonalization.EventUrlProvider real;

    public EventUrlProvider(android.adservices.ondevicepersonalization.EventUrlProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider wrap(android.adservices.ondevicepersonalization.EventUrlProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventUrlProvider(real);
    }

    public android.adservices.ondevicepersonalization.EventUrlProvider unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.net.Uri createEventTrackingUrlWithRedirect(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.createEventTrackingUrlWithRedirect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri createEventTrackingUrlWithResponse(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0, byte[] arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.createEventTrackingUrlWithResponse(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

}
