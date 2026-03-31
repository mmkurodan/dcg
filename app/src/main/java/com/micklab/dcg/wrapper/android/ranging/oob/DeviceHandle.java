// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.oob;

public final class DeviceHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle wrap(android.ranging.oob.DeviceHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.oob.DeviceHandle getReal() {
        return (android.ranging.oob.DeviceHandle) real;
    }

    public android.ranging.oob.DeviceHandle unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.oob.DeviceHandle) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingDevice getRangingDevice() {
        return com.micklab.dcg.wrapper.android.ranging.RangingDevice.wrap(((android.ranging.oob.DeviceHandle) real).getRangingDevice());
    }

    public com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle getTransportHandle() {
        return com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle.wrap(((android.ranging.oob.DeviceHandle) real).getTransportHandle());
    }

    public java.lang.String toString() {
        return ((android.ranging.oob.DeviceHandle) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.oob.DeviceHandle) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle.Builder wrap(android.ranging.oob.DeviceHandle.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.oob.DeviceHandle.Builder getReal() {
            return (android.ranging.oob.DeviceHandle.Builder) real;
        }

        public android.ranging.oob.DeviceHandle.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.ranging.RangingDevice arg0, com.micklab.dcg.wrapper.android.ranging.oob.TransportHandle arg1) {
            this(new android.ranging.oob.DeviceHandle.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle build() {
            return com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle.wrap(((android.ranging.oob.DeviceHandle.Builder) real).build());
        }

    }
}
