// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingMeasurement {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingMeasurement(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingMeasurement wrap(android.ranging.RangingMeasurement real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingMeasurement(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingMeasurement getReal() {
        return (android.ranging.RangingMeasurement) real;
    }

    public android.ranging.RangingMeasurement unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.RangingMeasurement) real).describeContents();
    }

    public int getConfidence() {
        return ((android.ranging.RangingMeasurement) real).getConfidence();
    }

    public double getMeasurement() {
        return ((android.ranging.RangingMeasurement) real).getMeasurement();
    }

    public java.lang.String toString() {
        return ((android.ranging.RangingMeasurement) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.RangingMeasurement) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONFIDENCE_HIGH = android.ranging.RangingMeasurement.CONFIDENCE_HIGH;
    public static final int CONFIDENCE_LOW = android.ranging.RangingMeasurement.CONFIDENCE_LOW;
    public static final int CONFIDENCE_MEDIUM = android.ranging.RangingMeasurement.CONFIDENCE_MEDIUM;

}
