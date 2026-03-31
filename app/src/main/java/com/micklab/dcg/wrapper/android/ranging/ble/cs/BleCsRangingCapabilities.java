// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.ble.cs;

public final class BleCsRangingCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BleCsRangingCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingCapabilities wrap(android.ranging.ble.cs.BleCsRangingCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.ble.cs.BleCsRangingCapabilities getReal() {
        return (android.ranging.ble.cs.BleCsRangingCapabilities) real;
    }

    public android.ranging.ble.cs.BleCsRangingCapabilities unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.ble.cs.BleCsRangingCapabilities) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.ranging.ble.cs.BleCsRangingCapabilities) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.ble.cs.BleCsRangingCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CS_SECURITY_LEVEL_FOUR = android.ranging.ble.cs.BleCsRangingCapabilities.CS_SECURITY_LEVEL_FOUR;
    public static final int CS_SECURITY_LEVEL_ONE = android.ranging.ble.cs.BleCsRangingCapabilities.CS_SECURITY_LEVEL_ONE;

}
