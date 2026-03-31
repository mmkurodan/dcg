// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingData wrap(android.ranging.RangingData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingData(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingData getReal() {
        return (android.ranging.RangingData) real;
    }

    public android.ranging.RangingData unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.RangingData) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingMeasurement getAzimuth() {
        return com.micklab.dcg.wrapper.android.ranging.RangingMeasurement.wrap(((android.ranging.RangingData) real).getAzimuth());
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingMeasurement getDistance() {
        return com.micklab.dcg.wrapper.android.ranging.RangingMeasurement.wrap(((android.ranging.RangingData) real).getDistance());
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingMeasurement getElevation() {
        return com.micklab.dcg.wrapper.android.ranging.RangingMeasurement.wrap(((android.ranging.RangingData) real).getElevation());
    }

    public int getRangingTechnology() {
        return ((android.ranging.RangingData) real).getRangingTechnology();
    }

    public int getRssi() {
        return ((android.ranging.RangingData) real).getRssi();
    }

    public long getTimestampMillis() {
        return ((android.ranging.RangingData) real).getTimestampMillis();
    }

    public boolean hasRssi() {
        return ((android.ranging.RangingData) real).hasRssi();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.RangingData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
