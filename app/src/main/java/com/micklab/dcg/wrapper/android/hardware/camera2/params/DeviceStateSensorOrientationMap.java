// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class DeviceStateSensorOrientationMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceStateSensorOrientationMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap wrap(android.hardware.camera2.params.DeviceStateSensorOrientationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.DeviceStateSensorOrientationMap getReal() {
        return (android.hardware.camera2.params.DeviceStateSensorOrientationMap) real;
    }

    public android.hardware.camera2.params.DeviceStateSensorOrientationMap unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.DeviceStateSensorOrientationMap) real).equals(arg0);
    }

    public int getSensorOrientation(long arg0) {
        return ((android.hardware.camera2.params.DeviceStateSensorOrientationMap) real).getSensorOrientation(arg0);
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.DeviceStateSensorOrientationMap) real).hashCode();
    }

    public static final long FOLDED = android.hardware.camera2.params.DeviceStateSensorOrientationMap.FOLDED;
    public static final long NORMAL = android.hardware.camera2.params.DeviceStateSensorOrientationMap.NORMAL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder wrap(android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder getReal() {
            return (android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder) real;
        }

        public android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder addOrientationForState(long arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder.wrap(((android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder) real).addOrientationForState(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap build() {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.DeviceStateSensorOrientationMap.wrap(((android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder) real).build());
        }

    }
}
