// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingCapabilities wrap(android.ranging.RangingCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingCapabilities getReal() {
        return (android.ranging.RangingCapabilities) real;
    }

    public android.ranging.RangingCapabilities unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.RangingCapabilities) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingCapabilities getCsCapabilities() {
        return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingCapabilities.wrap(((android.ranging.RangingCapabilities) real).getCsCapabilities());
    }

    public com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingCapabilities getRttRangingCapabilities() {
        return com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingCapabilities.wrap(((android.ranging.RangingCapabilities) real).getRttRangingCapabilities());
    }

    public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingCapabilities getUwbCapabilities() {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingCapabilities.wrap(((android.ranging.RangingCapabilities) real).getUwbCapabilities());
    }

    public java.lang.String toString() {
        return ((android.ranging.RangingCapabilities) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.RangingCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DISABLED_REGULATORY = android.ranging.RangingCapabilities.DISABLED_REGULATORY;
    public static final int DISABLED_USER = android.ranging.RangingCapabilities.DISABLED_USER;
    public static final int DISABLED_USER_RESTRICTIONS = android.ranging.RangingCapabilities.DISABLED_USER_RESTRICTIONS;
    public static final int ENABLED = android.ranging.RangingCapabilities.ENABLED;
    public static final int NOT_SUPPORTED = android.ranging.RangingCapabilities.NOT_SUPPORTED;

}
