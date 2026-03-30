// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellInfoWcdma {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellInfoWcdma(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellInfoWcdma wrap(android.telephony.CellInfoWcdma real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellInfoWcdma(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellInfoWcdma getReal() {
        return (android.telephony.CellInfoWcdma) real;
    }

    public android.telephony.CellInfoWcdma unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellIdentityWcdma getCellIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#getCellIdentity()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellSignalStrengthWcdma getCellSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#getCellSignalStrength()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoWcdma#writeToParcel(android.os.Parcel,int)");
    }


}
