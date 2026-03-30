// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Device {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Device(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Device wrap(android.health.connect.datatypes.Device real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Device(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.Device getReal() {
        return (android.health.connect.datatypes.Device) real;
    }

    public android.health.connect.datatypes.Device unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.Device) real).equals(arg0);
    }

    public java.lang.String getManufacturer() {
        return ((android.health.connect.datatypes.Device) real).getManufacturer();
    }

    public java.lang.String getModel() {
        return ((android.health.connect.datatypes.Device) real).getModel();
    }

    public int getType() {
        return ((android.health.connect.datatypes.Device) real).getType();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.Device) real).hashCode();
    }

    public static final int DEVICE_TYPE_CHEST_STRAP = android.health.connect.datatypes.Device.DEVICE_TYPE_CHEST_STRAP;
    public static final int DEVICE_TYPE_FITNESS_BAND = android.health.connect.datatypes.Device.DEVICE_TYPE_FITNESS_BAND;
    public static final int DEVICE_TYPE_HEAD_MOUNTED = android.health.connect.datatypes.Device.DEVICE_TYPE_HEAD_MOUNTED;
    public static final int DEVICE_TYPE_PHONE = android.health.connect.datatypes.Device.DEVICE_TYPE_PHONE;
    public static final int DEVICE_TYPE_RING = android.health.connect.datatypes.Device.DEVICE_TYPE_RING;
    public static final int DEVICE_TYPE_SCALE = android.health.connect.datatypes.Device.DEVICE_TYPE_SCALE;
    public static final int DEVICE_TYPE_SMART_DISPLAY = android.health.connect.datatypes.Device.DEVICE_TYPE_SMART_DISPLAY;
    public static final int DEVICE_TYPE_UNKNOWN = android.health.connect.datatypes.Device.DEVICE_TYPE_UNKNOWN;
    public static final int DEVICE_TYPE_WATCH = android.health.connect.datatypes.Device.DEVICE_TYPE_WATCH;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder wrap(android.health.connect.datatypes.Device.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.Device.Builder getReal() {
            return (android.health.connect.datatypes.Device.Builder) real;
        }

        public android.health.connect.datatypes.Device.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.datatypes.Device.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Device build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.wrap(((android.health.connect.datatypes.Device.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder setManufacturer(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder.wrap(((android.health.connect.datatypes.Device.Builder) real).setManufacturer(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder setModel(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder.wrap(((android.health.connect.datatypes.Device.Builder) real).setModel(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Device.Builder.wrap(((android.health.connect.datatypes.Device.Builder) real).setType(arg0));
        }

    }
}
