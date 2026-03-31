// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.wifi.rtt;

public final class RttRangingCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RttRangingCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingCapabilities wrap(android.ranging.wifi.rtt.RttRangingCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.wifi.rtt.RttRangingCapabilities getReal() {
        return (android.ranging.wifi.rtt.RttRangingCapabilities) real;
    }

    public android.ranging.wifi.rtt.RttRangingCapabilities unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.wifi.rtt.RttRangingCapabilities) real).describeContents();
    }

    public boolean hasPeriodicRangingHardwareFeature() {
        return ((android.ranging.wifi.rtt.RttRangingCapabilities) real).hasPeriodicRangingHardwareFeature();
    }

    public java.lang.String toString() {
        return ((android.ranging.wifi.rtt.RttRangingCapabilities) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.wifi.rtt.RttRangingCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
