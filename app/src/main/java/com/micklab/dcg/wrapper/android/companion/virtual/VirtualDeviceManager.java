// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion.virtual;

public final class VirtualDeviceManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VirtualDeviceManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager wrap(android.companion.virtual.VirtualDeviceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager(real, (__DcgwBridgeToken) null);
    }

    public android.companion.virtual.VirtualDeviceManager getReal() {
        return (android.companion.virtual.VirtualDeviceManager) real;
    }

    public android.companion.virtual.VirtualDeviceManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice getVirtualDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice.wrap(((android.companion.virtual.VirtualDeviceManager) real).getVirtualDevice(arg0));
    }

    public void registerVirtualDeviceListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener arg1) {
        ((android.companion.virtual.VirtualDeviceManager) real).registerVirtualDeviceListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterVirtualDeviceListener(com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener arg0) {
        ((android.companion.virtual.VirtualDeviceManager) real).unregisterVirtualDeviceListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class VirtualDeviceListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VirtualDeviceListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener wrap(android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener(real, (__DcgwBridgeToken) null);
        }

        public android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener getReal() {
            return (android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener) real;
        }

        public android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener unwrap() {
            return getReal();
        }

        public void onVirtualDeviceClosed(int arg0) {
            ((android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener) real).onVirtualDeviceClosed(arg0);
        }

        public void onVirtualDeviceCreated(int arg0) {
            ((android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener) real).onVirtualDeviceCreated(arg0);
        }

    }
}
