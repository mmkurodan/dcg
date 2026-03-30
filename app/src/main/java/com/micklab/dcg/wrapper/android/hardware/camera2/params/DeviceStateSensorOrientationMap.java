// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class DeviceStateSensorOrientationMap {
    private final android.hardware.camera2.params.DeviceStateSensorOrientationMap real;

    public DeviceStateSensorOrientationMap(android.hardware.camera2.params.DeviceStateSensorOrientationMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap wrap(android.hardware.camera2.params.DeviceStateSensorOrientationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap(real);
    }

    public android.hardware.camera2.params.DeviceStateSensorOrientationMap unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getSensorOrientation(long arg0) {
        return real.getSensorOrientation(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final long FOLDED = android.hardware.camera2.params.DeviceStateSensorOrientationMap.FOLDED;
    public static final long NORMAL = android.hardware.camera2.params.DeviceStateSensorOrientationMap.NORMAL;

    public static final class Builder {
        private final android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder real;

        public Builder(android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder wrap(android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder(real);
        }

        public android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder());
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder addOrientationForState(long arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder.wrap(real.addOrientationForState(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap build() {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.wrap(real.build());
        }

    }
}
