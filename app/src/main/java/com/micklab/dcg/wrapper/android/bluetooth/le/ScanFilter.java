// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanFilter {
    private final android.bluetooth.le.ScanFilter real;

    public ScanFilter(android.bluetooth.le.ScanFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter wrap(android.bluetooth.le.ScanFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter(real);
    }

    public android.bluetooth.le.ScanFilter unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public byte[] getAdvertisingData() {
        return real.getAdvertisingData();
    }

    public byte[] getAdvertisingDataMask() {
        return real.getAdvertisingDataMask();
    }

    public int getAdvertisingDataType() {
        return real.getAdvertisingDataType();
    }

    public java.lang.String getDeviceAddress() {
        return real.getDeviceAddress();
    }

    public java.lang.String getDeviceName() {
        return real.getDeviceName();
    }

    public byte[] getManufacturerData() {
        return real.getManufacturerData();
    }

    public byte[] getManufacturerDataMask() {
        return real.getManufacturerDataMask();
    }

    public int getManufacturerId() {
        return real.getManufacturerId();
    }

    public byte[] getServiceData() {
        return real.getServiceData();
    }

    public byte[] getServiceDataMask() {
        return real.getServiceDataMask();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceDataUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(real.getServiceDataUuid());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceSolicitationUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(real.getServiceSolicitationUuid());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceSolicitationUuidMask() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(real.getServiceSolicitationUuidMask());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceUuid() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(real.getServiceUuid());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getServiceUuidMask() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(real.getServiceUuidMask());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean matches(com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult arg0) {
        return real.matches(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.bluetooth.le.ScanFilter.Builder real;

        public Builder(android.bluetooth.le.ScanFilter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder wrap(android.bluetooth.le.ScanFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder(real);
        }

        public android.bluetooth.le.ScanFilter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.le.ScanFilter.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setAdvertisingDataType(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setAdvertisingDataType(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setAdvertisingDataTypeWithData(int arg0, byte[] arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setAdvertisingDataTypeWithData(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setDeviceAddress(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setDeviceAddress(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setDeviceName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setDeviceName(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setManufacturerData(int arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setManufacturerData(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setManufacturerData(int arg0, byte[] arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setManufacturerData(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setServiceData(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, byte[] arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setServiceData(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setServiceSolicitationUuid(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceSolicitationUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.os.ParcelUuid arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setServiceSolicitationUuid(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setServiceUuid(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder setServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.os.ParcelUuid arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter.Builder.wrap(real.setServiceUuid(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

    }
}
