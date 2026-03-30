// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsException {
    private final android.telephony.ims.ImsException real;

    public ImsException(android.telephony.ims.ImsException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsException wrap(android.telephony.ims.ImsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsException(real);
    }

    public android.telephony.ims.ImsException unwrap() {
        return real;
    }

    public int getCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsException#getCode()");
    }


}
