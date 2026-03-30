// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class RegistrationManager {
    private final android.telephony.ims.RegistrationManager real;

    public RegistrationManager(android.telephony.ims.RegistrationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager wrap(android.telephony.ims.RegistrationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager(real);
    }

    public android.telephony.ims.RegistrationManager unwrap() {
        return real;
    }

    public void registerImsRegistrationCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager#registerImsRegistrationCallback(java.util.concurrent.Executor,android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }

    public void unregisterImsRegistrationCallback(com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager#unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }


    public static final class RegistrationCallback {
        private final android.telephony.ims.RegistrationManager.RegistrationCallback real;

        public RegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback wrap(android.telephony.ims.RegistrationManager.RegistrationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback(real);
        }

        public android.telephony.ims.RegistrationManager.RegistrationCallback unwrap() {
            return real;
        }

        public RegistrationCallback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#android.telephony.ims.RegistrationManager$RegistrationCallback()");
        }

        public void onRegistered(com.micklab.dcg.wrapper.android.telephony.ims.ImsRegistrationAttributes arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistered(android.telephony.ims.ImsRegistrationAttributes)");
        }

        public void onRegistered(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistered(int)");
        }

        public void onRegistering(com.micklab.dcg.wrapper.android.telephony.ims.ImsRegistrationAttributes arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistering(android.telephony.ims.ImsRegistrationAttributes)");
        }

        public void onRegistering(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onRegistering(int)");
        }

        public void onTechnologyChangeFailed(int arg0, com.micklab.dcg.wrapper.android.telephony.ims.ImsReasonInfo arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onTechnologyChangeFailed(int,android.telephony.ims.ImsReasonInfo)");
        }

        public void onUnregistered(com.micklab.dcg.wrapper.android.telephony.ims.ImsReasonInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RegistrationManager$RegistrationCallback#onUnregistered(android.telephony.ims.ImsReasonInfo)");
        }

    }
}
