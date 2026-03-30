// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsRcsManager {
    private final android.telephony.ims.ImsRcsManager real;

    public ImsRcsManager(android.telephony.ims.ImsRcsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsRcsManager wrap(android.telephony.ims.ImsRcsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsRcsManager(real);
    }

    public android.telephony.ims.ImsRcsManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.telephony.ims.RcsUceAdapter getUceAdapter() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsRcsManager#getUceAdapter()");
    }

    public void registerImsRegistrationCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsRcsManager#registerImsRegistrationCallback(java.util.concurrent.Executor,android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }

    public void registerImsStateCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsRcsManager#registerImsStateCallback(java.util.concurrent.Executor,android.telephony.ims.ImsStateCallback)");
    }

    public void unregisterImsRegistrationCallback(com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsRcsManager#unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }

    public void unregisterImsStateCallback(com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsRcsManager#unregisterImsStateCallback(android.telephony.ims.ImsStateCallback)");
    }


}
