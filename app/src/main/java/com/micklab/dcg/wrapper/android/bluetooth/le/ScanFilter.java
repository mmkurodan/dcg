// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScanFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter wrap(android.bluetooth.le.ScanFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.ScanFilter getReal() {
        return (android.bluetooth.le.ScanFilter) real;
    }

    public android.bluetooth.le.ScanFilter unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.le.ScanFilter) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.le.ScanFilter) real).equals(arg0);
    }

    public byte[] getAdvertisingData() {
        return ((android.bluetooth.le.ScanFilter) real).getAdvertisingData();
    }

    public byte[] getAdvertisingDataMask() {
        return ((android.bluetooth.le.ScanFilter) real).getAdvertisingDataMask();
    }

    public int getAdvertisingDataType() {
        return ((android.bluetooth.le.ScanFilter) real).getAdvertisingDataType();
    }

    public java.lang.String getDeviceAddress() {
        return ((android.bluetooth.le.ScanFilter) real).getDeviceAddress();
    }

    public java.lang.String getDeviceName() {
        return ((android.bluetooth.le.ScanFilter) real).getDeviceName();
    }

    public byte[] getManufacturerData() {
        return ((android.bluetooth.le.ScanFilter) real).getManufacturerData();
    }

    public byte[] getManufacturerDataMask() {
        return ((android.bluetooth.le.ScanFilter) real).getManufacturerDataMask();
    }

    public int getManufacturerId() {
        return ((android.bluetooth.le.ScanFilter) real).getManufacturerId();
    }

    public byte[] getServiceData() {
        return ((android.bluetooth.le.ScanFilter) real).getServiceData();
    }

    public byte[] getServiceDataMask() {
        return ((android.bluetooth.le.ScanFilter) real).getServiceDataMask();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceDataUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.bluetooth.le.ScanFilter) real).getServiceDataUuid());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceSolicitationUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.bluetooth.le.ScanFilter) real).getServiceSolicitationUuid());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceSolicitationUuidMask() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.bluetooth.le.ScanFilter) real).getServiceSolicitationUuidMask());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.bluetooth.le.ScanFilter) real).getServiceUuid());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceUuidMask() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.bluetooth.le.ScanFilter) real).getServiceUuidMask());
    }

    public int hashCode() {
        return ((android.bluetooth.le.ScanFilter) real).hashCode();
    }

    public boolean matches(com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult arg0) {
        return ((android.bluetooth.le.ScanFilter) real).matches(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.ScanFilter) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.ScanFilter) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder wrap(android.bluetooth.le.ScanFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.le.ScanFilter.Builder getReal() {
            return (android.bluetooth.le.ScanFilter.Builder) real;
        }

        public android.bluetooth.le.ScanFilter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.le.ScanFilter.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.wrap(((android.bluetooth.le.ScanFilter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setAdvertisingDataType(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setAdvertisingDataType(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setAdvertisingDataTypeWithData(int arg0, byte[] arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setAdvertisingDataTypeWithData(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setDeviceAddress(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setDeviceName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setDeviceName(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setManufacturerData(int arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setManufacturerData(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setManufacturerData(int arg0, byte[] arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setManufacturerData(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setServiceData(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, byte[] arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setServiceData(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setServiceSolicitationUuid(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.os.ParcelUuid arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setServiceSolicitationUuid(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setServiceUuid(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.os.ParcelUuid arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(((android.bluetooth.le.ScanFilter.Builder) real).setServiceUuid(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

    }
}
