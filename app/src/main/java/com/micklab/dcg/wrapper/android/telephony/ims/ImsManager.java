// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsManager {
    private final android.telephony.ims.ImsManager real;

    public ImsManager(android.telephony.ims.ImsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsManager wrap(android.telephony.ims.ImsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsManager(real);
    }

    public android.telephony.ims.ImsManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager getImsMmTelManager(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsManager#getImsMmTelManager(int)");
    }

    public com.micklab.dcg.wrapper.android.telephony.ims.ImsRcsManager getImsRcsManager(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsManager#getImsRcsManager(int)");
    }

    public com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager getProvisioningManager(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsManager#getProvisioningManager(int)");
    }


}
