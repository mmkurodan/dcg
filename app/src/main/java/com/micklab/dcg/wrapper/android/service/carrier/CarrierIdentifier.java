// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierIdentifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CarrierIdentifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier wrap(android.service.carrier.CarrierIdentifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier(real, (__DcgwBridgeToken) null);
    }

    public android.service.carrier.CarrierIdentifier getReal() {
        return (android.service.carrier.CarrierIdentifier) real;
    }

    public android.service.carrier.CarrierIdentifier unwrap() {
        return getReal();
    }

    public CarrierIdentifier(byte[] arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.service.carrier.CarrierIdentifier(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public CarrierIdentifier(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) {
        this(new android.service.carrier.CarrierIdentifier(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public CarrierIdentifier(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, int arg6, int arg7) {
        this(new android.service.carrier.CarrierIdentifier(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.carrier.CarrierIdentifier) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.carrier.CarrierIdentifier) real).equals(arg0);
    }

    public int getCarrierId() {
        return ((android.service.carrier.CarrierIdentifier) real).getCarrierId();
    }

    public java.lang.String getGid1() {
        return ((android.service.carrier.CarrierIdentifier) real).getGid1();
    }

    public java.lang.String getGid2() {
        return ((android.service.carrier.CarrierIdentifier) real).getGid2();
    }

    public java.lang.String getImsi() {
        return ((android.service.carrier.CarrierIdentifier) real).getImsi();
    }

    public java.lang.String getMcc() {
        return ((android.service.carrier.CarrierIdentifier) real).getMcc();
    }

    public java.lang.String getMnc() {
        return ((android.service.carrier.CarrierIdentifier) real).getMnc();
    }

    public int getSpecificCarrierId() {
        return ((android.service.carrier.CarrierIdentifier) real).getSpecificCarrierId();
    }

    public java.lang.String getSpn() {
        return ((android.service.carrier.CarrierIdentifier) real).getSpn();
    }

    public int hashCode() {
        return ((android.service.carrier.CarrierIdentifier) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.service.carrier.CarrierIdentifier) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.carrier.CarrierIdentifier) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
