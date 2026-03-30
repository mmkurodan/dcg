// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsStateCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImsStateCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback wrap(android.telephony.ims.ImsStateCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.ImsStateCallback getReal() {
        return (android.telephony.ims.ImsStateCallback) real;
    }

    public android.telephony.ims.ImsStateCallback unwrap() {
        return getReal();
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
