// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssSignalType {
    private final android.location.GnssSignalType real;

    public GnssSignalType(android.location.GnssSignalType real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssSignalType wrap(android.location.GnssSignalType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssSignalType(real);
    }

    public android.location.GnssSignalType unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssSignalType create(int arg0, double arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.location.GnssSignalType.wrap(android.location.GnssSignalType.create(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public double getCarrierFrequencyHz() {
        return real.getCarrierFrequencyHz();
    }

    public java.lang.String getCodeType() {
        return real.getCodeType();
    }

    public int getConstellationType() {
        return real.getConstellationType();
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


}
