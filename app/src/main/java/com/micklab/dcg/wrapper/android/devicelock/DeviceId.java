// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.devicelock;

public final class DeviceId {
    private final android.devicelock.DeviceId real;

    public DeviceId(android.devicelock.DeviceId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.devicelock.DeviceId wrap(android.devicelock.DeviceId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.devicelock.DeviceId(real);
    }

    public android.devicelock.DeviceId unwrap() {
        return real;
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public int getType() {
        return real.getType();
    }

    public static final int DEVICE_ID_TYPE_IMEI = android.devicelock.DeviceId.DEVICE_ID_TYPE_IMEI;
    public static final int DEVICE_ID_TYPE_MEID = android.devicelock.DeviceId.DEVICE_ID_TYPE_MEID;

}
