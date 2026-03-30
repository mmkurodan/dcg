// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierIdentifier {
    private final android.service.carrier.CarrierIdentifier real;

    public CarrierIdentifier(android.service.carrier.CarrierIdentifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier wrap(android.service.carrier.CarrierIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier(real);
    }

    public android.service.carrier.CarrierIdentifier unwrap() {
        return real;
    }

    public CarrierIdentifier(byte[] arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.service.carrier.CarrierIdentifier(arg0, arg1, arg2));
    }

    public CarrierIdentifier(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) {
        this(new android.service.carrier.CarrierIdentifier(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public CarrierIdentifier(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, int arg6, int arg7) {
        this(new android.service.carrier.CarrierIdentifier(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getCarrierId() {
        return real.getCarrierId();
    }

    public java.lang.String getGid1() {
        return real.getGid1();
    }

    public java.lang.String getGid2() {
        return real.getGid2();
    }

    public java.lang.String getImsi() {
        return real.getImsi();
    }

    public java.lang.String getMcc() {
        return real.getMcc();
    }

    public java.lang.String getMnc() {
        return real.getMnc();
    }

    public int getSpecificCarrierId() {
        return real.getSpecificCarrierId();
    }

    public java.lang.String getSpn() {
        return real.getSpn();
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
