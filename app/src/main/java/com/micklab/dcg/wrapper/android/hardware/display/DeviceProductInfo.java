// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class DeviceProductInfo {
    private final android.hardware.display.DeviceProductInfo real;

    public DeviceProductInfo(android.hardware.display.DeviceProductInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo wrap(android.hardware.display.DeviceProductInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo(real);
    }

    public android.hardware.display.DeviceProductInfo unwrap() {
        return real;
    }

    public DeviceProductInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4) {
        this(new android.hardware.display.DeviceProductInfo(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getConnectionToSinkType() {
        return real.getConnectionToSinkType();
    }

    public int getManufactureWeek() {
        return real.getManufactureWeek();
    }

    public int getManufactureYear() {
        return real.getManufactureYear();
    }

    public java.lang.String getManufacturerPnpId() {
        return real.getManufacturerPnpId();
    }

    public int getModelYear() {
        return real.getModelYear();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String getProductId() {
        return real.getProductId();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CONNECTION_TO_SINK_BUILT_IN = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_BUILT_IN;
    public static final int CONNECTION_TO_SINK_DIRECT = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_DIRECT;
    public static final int CONNECTION_TO_SINK_TRANSITIVE = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_TRANSITIVE;
    public static final int CONNECTION_TO_SINK_UNKNOWN = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_UNKNOWN;

}
