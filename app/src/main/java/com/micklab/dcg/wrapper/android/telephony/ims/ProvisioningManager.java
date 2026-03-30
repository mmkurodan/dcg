// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ProvisioningManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProvisioningManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager wrap(android.telephony.ims.ProvisioningManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.ProvisioningManager getReal() {
        return (android.telephony.ims.ProvisioningManager) real;
    }

    public android.telephony.ims.ProvisioningManager unwrap() {
        return getReal();
    }

    public boolean getProvisioningStatusForCapability(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#getProvisioningStatusForCapability(int,int)");
    }

    public boolean getRcsProvisioningStatusForCapability(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#getRcsProvisioningStatusForCapability(int,int)");
    }

    public boolean isProvisioningRequiredForCapability(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#isProvisioningRequiredForCapability(int,int)");
    }

    public boolean isRcsProvisioningRequiredForCapability(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#isRcsProvisioningRequiredForCapability(int,int)");
    }

    public void registerFeatureProvisioningChangedCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#registerFeatureProvisioningChangedCallback(java.util.concurrent.Executor,android.telephony.ims.ProvisioningManager$FeatureProvisioningCallback)");
    }

    public void setProvisioningStatusForCapability(int arg0, int arg1, boolean arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#setProvisioningStatusForCapability(int,int,boolean)");
    }

    public void setRcsProvisioningStatusForCapability(int arg0, int arg1, boolean arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#setRcsProvisioningStatusForCapability(int,int,boolean)");
    }

    public void unregisterFeatureProvisioningChangedCallback(com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager#unregisterFeatureProvisioningChangedCallback(android.telephony.ims.ProvisioningManager$FeatureProvisioningCallback)");
    }

    public static final class FeatureProvisioningCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FeatureProvisioningCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback wrap(android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback getReal() {
            return (android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback) real;
        }

        public android.telephony.ims.ProvisioningManager.FeatureProvisioningCallback unwrap() {
            return getReal();
        }

        public void onFeatureProvisioningChanged(int arg0, int arg1, boolean arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager$FeatureProvisioningCallback#onFeatureProvisioningChanged(int,int,boolean)");
        }

        public void onRcsFeatureProvisioningChanged(int arg0, int arg1, boolean arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ProvisioningManager$FeatureProvisioningCallback#onRcsFeatureProvisioningChanged(int,int,boolean)");
        }

    }
}
