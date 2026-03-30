// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class DeviceProductInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceProductInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo wrap(android.hardware.display.DeviceProductInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.display.DeviceProductInfo getReal() {
        return (android.hardware.display.DeviceProductInfo) real;
    }

    public android.hardware.display.DeviceProductInfo unwrap() {
        return getReal();
    }

    public DeviceProductInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4) {
        this(new android.hardware.display.DeviceProductInfo(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.hardware.display.DeviceProductInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.display.DeviceProductInfo) real).equals(arg0);
    }

    public int getConnectionToSinkType() {
        return ((android.hardware.display.DeviceProductInfo) real).getConnectionToSinkType();
    }

    public int getManufactureWeek() {
        return ((android.hardware.display.DeviceProductInfo) real).getManufactureWeek();
    }

    public int getManufactureYear() {
        return ((android.hardware.display.DeviceProductInfo) real).getManufactureYear();
    }

    public java.lang.String getManufacturerPnpId() {
        return ((android.hardware.display.DeviceProductInfo) real).getManufacturerPnpId();
    }

    public int getModelYear() {
        return ((android.hardware.display.DeviceProductInfo) real).getModelYear();
    }

    public java.lang.String getName() {
        return ((android.hardware.display.DeviceProductInfo) real).getName();
    }

    public java.lang.String getProductId() {
        return ((android.hardware.display.DeviceProductInfo) real).getProductId();
    }

    public int hashCode() {
        return ((android.hardware.display.DeviceProductInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.display.DeviceProductInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.display.DeviceProductInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONNECTION_TO_SINK_BUILT_IN = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_BUILT_IN;
    public static final int CONNECTION_TO_SINK_DIRECT = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_DIRECT;
    public static final int CONNECTION_TO_SINK_TRANSITIVE = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_TRANSITIVE;
    public static final int CONNECTION_TO_SINK_UNKNOWN = android.hardware.display.DeviceProductInfo.CONNECTION_TO_SINK_UNKNOWN;

}
