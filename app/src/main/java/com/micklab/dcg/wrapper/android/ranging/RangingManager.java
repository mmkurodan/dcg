// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingManager wrap(android.ranging.RangingManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingManager(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingManager getReal() {
        return (android.ranging.RangingManager) real;
    }

    public android.ranging.RangingManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingSession createRangingSession(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.ranging.RangingSession.Callback arg1) {
        return com.micklab.dcg.wrapper.android.ranging.RangingSession.wrap(((android.ranging.RangingManager) real).createRangingSession(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public void registerCapabilitiesCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.ranging.RangingManager.RangingCapabilitiesCallback arg1) {
        ((android.ranging.RangingManager) real).registerCapabilitiesCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterCapabilitiesCallback(com.micklab.dcg.wrapper.android.ranging.RangingManager.RangingCapabilitiesCallback arg0) {
        ((android.ranging.RangingManager) real).unregisterCapabilitiesCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int BLE_CS = android.ranging.RangingManager.BLE_CS;
    public static final int BLE_RSSI = android.ranging.RangingManager.BLE_RSSI;
    public static final int UWB = android.ranging.RangingManager.UWB;
    public static final int WIFI_NAN_RTT = android.ranging.RangingManager.WIFI_NAN_RTT;

    public static final class RangingCapabilitiesCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RangingCapabilitiesCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.RangingManager.RangingCapabilitiesCallback wrap(android.ranging.RangingManager.RangingCapabilitiesCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingManager.RangingCapabilitiesCallback(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.RangingManager.RangingCapabilitiesCallback getReal() {
            return (android.ranging.RangingManager.RangingCapabilitiesCallback) real;
        }

        public android.ranging.RangingManager.RangingCapabilitiesCallback unwrap() {
            return getReal();
        }

        public void onRangingCapabilities(com.micklab.dcg.wrapper.android.ranging.RangingCapabilities arg0) {
            ((android.ranging.RangingManager.RangingCapabilitiesCallback) real).onRangingCapabilities(arg0 == null ? null : arg0.getReal());
        }

    }
}
