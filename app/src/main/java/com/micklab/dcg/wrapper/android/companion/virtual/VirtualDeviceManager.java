// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion.virtual;

public final class VirtualDeviceManager {
    private final android.companion.virtual.VirtualDeviceManager real;

    public VirtualDeviceManager(android.companion.virtual.VirtualDeviceManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager wrap(android.companion.virtual.VirtualDeviceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager(real);
    }

    public android.companion.virtual.VirtualDeviceManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice getVirtualDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.companion.virtual.VirtualDevice.wrap(real.getVirtualDevice(arg0));
    }

    public void registerVirtualDeviceListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener arg1) {
        real.registerVirtualDeviceListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterVirtualDeviceListener(com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener arg0) {
        real.unregisterVirtualDeviceListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class VirtualDeviceListener {
        private final android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener real;

        public VirtualDeviceListener(android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener wrap(android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener(real);
        }

        public android.companion.virtual.VirtualDeviceManager.VirtualDeviceListener unwrap() {
            return real;
        }

        public void onVirtualDeviceClosed(int arg0) {
            real.onVirtualDeviceClosed(arg0);
        }

        public void onVirtualDeviceCreated(int arg0) {
            real.onVirtualDeviceCreated(arg0);
        }

    }
}
