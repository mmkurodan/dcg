// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.uwb;

public final class UwbRangingCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UwbRangingCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingCapabilities wrap(android.ranging.uwb.UwbRangingCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.uwb.UwbRangingCapabilities getReal() {
        return (android.ranging.uwb.UwbRangingCapabilities) real;
    }

    public android.ranging.uwb.UwbRangingCapabilities unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).describeContents();
    }

    public java.time.Duration getMinimumRangingInterval() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).getMinimumRangingInterval();
    }

    public boolean isAzimuthalAngleSupported() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).isAzimuthalAngleSupported();
    }

    public boolean isBackgroundRangingSupported() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).isBackgroundRangingSupported();
    }

    public boolean isDistanceMeasurementSupported() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).isDistanceMeasurementSupported();
    }

    public boolean isElevationAngleSupported() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).isElevationAngleSupported();
    }

    public boolean isRangingIntervalReconfigurationSupported() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).isRangingIntervalReconfigurationSupported();
    }

    public java.lang.String toString() {
        return ((android.ranging.uwb.UwbRangingCapabilities) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.uwb.UwbRangingCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
