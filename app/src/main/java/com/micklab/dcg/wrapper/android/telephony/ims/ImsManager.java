// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsManager wrap(android.telephony.ims.ImsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.ImsManager getReal() {
        return (android.telephony.ims.ImsManager) real;
    }

    public android.telephony.ims.ImsManager unwrap() {
        return getReal();
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
