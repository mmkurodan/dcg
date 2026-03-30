// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.devicelock;

public final class DeviceId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.devicelock.DeviceId wrap(android.devicelock.DeviceId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.devicelock.DeviceId(real, (__DcgwBridgeToken) null);
    }

    public android.devicelock.DeviceId getReal() {
        return (android.devicelock.DeviceId) real;
    }

    public android.devicelock.DeviceId unwrap() {
        return getReal();
    }

    public java.lang.String getId() {
        return ((android.devicelock.DeviceId) real).getId();
    }

    public int getType() {
        return ((android.devicelock.DeviceId) real).getType();
    }

    public static final int DEVICE_ID_TYPE_IMEI = android.devicelock.DeviceId.DEVICE_ID_TYPE_IMEI;
    public static final int DEVICE_ID_TYPE_MEID = android.devicelock.DeviceId.DEVICE_ID_TYPE_MEID;

}
