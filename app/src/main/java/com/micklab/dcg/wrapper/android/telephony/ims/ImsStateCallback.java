// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsStateCallback {
    private final android.telephony.ims.ImsStateCallback real;

    public ImsStateCallback(android.telephony.ims.ImsStateCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback wrap(android.telephony.ims.ImsStateCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback(real);
    }

    public android.telephony.ims.ImsStateCallback unwrap() {
        return real;
    }

    public void onAvailable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsStateCallback#onAvailable()");
    }

    public void onError() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsStateCallback#onError()");
    }

    public void onUnavailable(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsStateCallback#onUnavailable(int)");
    }


}
