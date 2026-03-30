// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class ImsMmTelManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImsMmTelManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager wrap(android.telephony.ims.ImsMmTelManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.ImsMmTelManager getReal() {
        return (android.telephony.ims.ImsMmTelManager) real;
    }

    public android.telephony.ims.ImsMmTelManager unwrap() {
        return getReal();
    }

    public int getVoWiFiModeSetting() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#getVoWiFiModeSetting()");
    }

    public boolean isAdvancedCallingSettingEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#isAdvancedCallingSettingEnabled()");
    }

    public boolean isCrossSimCallingEnabled() throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#isCrossSimCallingEnabled()");
    }

    public boolean isTtyOverVolteEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#isTtyOverVolteEnabled()");
    }

    public boolean isVoWiFiRoamingSettingEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#isVoWiFiRoamingSettingEnabled()");
    }

    public boolean isVoWiFiSettingEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#isVoWiFiSettingEnabled()");
    }

    public boolean isVtSettingEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#isVtSettingEnabled()");
    }

    public void registerImsRegistrationCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#registerImsRegistrationCallback(java.util.concurrent.Executor,android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }

    public void registerImsStateCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#registerImsStateCallback(java.util.concurrent.Executor,android.telephony.ims.ImsStateCallback)");
    }

    public void registerMmTelCapabilityCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager.CapabilityCallback arg1) throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#registerMmTelCapabilityCallback(java.util.concurrent.Executor,android.telephony.ims.ImsMmTelManager$CapabilityCallback)");
    }

    public void unregisterImsRegistrationCallback(com.micklab.dcg.wrapper.android.telephony.ims.RegistrationManager.RegistrationCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager$RegistrationCallback)");
    }

    public void unregisterImsStateCallback(com.micklab.dcg.wrapper.android.telephony.ims.ImsStateCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#unregisterImsStateCallback(android.telephony.ims.ImsStateCallback)");
    }

    public void unregisterMmTelCapabilityCallback(com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager.CapabilityCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager#unregisterMmTelCapabilityCallback(android.telephony.ims.ImsMmTelManager$CapabilityCallback)");
    }


    public static final class CapabilityCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CapabilityCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager.CapabilityCallback wrap(android.telephony.ims.ImsMmTelManager.CapabilityCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.ImsMmTelManager.CapabilityCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.ims.ImsMmTelManager.CapabilityCallback getReal() {
            return (android.telephony.ims.ImsMmTelManager.CapabilityCallback) real;
        }

        public android.telephony.ims.ImsMmTelManager.CapabilityCallback unwrap() {
            return getReal();
        }

        public CapabilityCallback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager$CapabilityCallback#android.telephony.ims.ImsMmTelManager$CapabilityCallback()");
        }

        public void onCapabilitiesStatusChanged(com.micklab.dcg.wrapper.android.telephony.ims.feature.MmTelFeature.MmTelCapabilities arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.ImsMmTelManager$CapabilityCallback#onCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature$MmTelCapabilities)");
        }

    }
}
