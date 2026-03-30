// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssSignalType {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssSignalType(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssSignalType wrap(android.location.GnssSignalType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssSignalType(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssSignalType getReal() {
        return (android.location.GnssSignalType) real;
    }

    public android.location.GnssSignalType unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.location.GnssSignalType create(int arg0, double arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.location.GnssSignalType.wrap(android.location.GnssSignalType.create(arg0, arg1, arg2));
    }

    public int describeContents() {
        return ((android.location.GnssSignalType) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.GnssSignalType) real).equals(arg0);
    }

    public double getCarrierFrequencyHz() {
        return ((android.location.GnssSignalType) real).getCarrierFrequencyHz();
    }

    public java.lang.String getCodeType() {
        return ((android.location.GnssSignalType) real).getCodeType();
    }

    public int getConstellationType() {
        return ((android.location.GnssSignalType) real).getConstellationType();
    }

    public int hashCode() {
        return ((android.location.GnssSignalType) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.location.GnssSignalType) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssSignalType) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
