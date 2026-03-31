// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class RegistrationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RegistrationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager wrap(android.telephony.ims.RegistrationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.RegistrationManager getReal() {
        return (android.telephony.ims.RegistrationManager) real;
    }

    public android.telephony.ims.RegistrationManager unwrap() {
        return getReal();
    }

    public void registerImsRegistrationCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager#registerImsRegistrationCallback(java.util.concurrent.Executor,android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }

    public void unregisterImsRegistrationCallback(com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager#unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }


    public static final class RegistrationCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RegistrationCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback wrap(android.telephony.ims.RegistrationManager.RegistrationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.ims.RegistrationManager.RegistrationCallback getReal() {
            return (android.telephony.ims.RegistrationManager.RegistrationCallback) real;
        }

        public android.telephony.ims.RegistrationManager.RegistrationCallback unwrap() {
            return getReal();
        }

        public RegistrationCallback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#android.telephony.ims.RegistrationManager$RegistrationCallback()");
        }

        public void onRegistered(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistered(int)");
        }

        public void onRegistered(com.micklab.dcg.wrapper.android.telephony.ims.ImsRegistrationAttributes arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistered(android.telephony.ims.ImsRegistrationAttributes)");
        }

        public void onRegistering(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistering(int)");
        }

        public void onRegistering(com.micklab.dcg.wrapper.android.telephony.ims.ImsRegistrationAttributes arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistering(android.telephony.ims.ImsRegistrationAttributes)");
        }

        public void onTechnologyChangeFailed(int arg0, com.micklab.dcg.wrapper.android.telephony.ims.ImsReasonInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onTechnologyChangeFailed(int,android.telephony.ims.ImsReasonInfo)");
        }

        public void onUnregistered(com.micklab.dcg.wrapper.android.telephony.ims.ImsReasonInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onUnregistered(android.telephony.ims.ImsReasonInfo)");
        }

    }
}
