// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImsException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsException wrap(android.telephony.ims.ImsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsException(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.ImsException getReal() {
        return (android.telephony.ims.ImsException) real;
    }

    public android.telephony.ims.ImsException unwrap() {
        return getReal();
    }

    public int getCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsException#getCode()");
    }


}
