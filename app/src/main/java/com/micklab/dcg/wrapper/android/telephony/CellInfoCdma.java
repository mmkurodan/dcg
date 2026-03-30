// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellInfoCdma {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellInfoCdma(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellInfoCdma wrap(android.telephony.CellInfoCdma real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellInfoCdma(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellInfoCdma getReal() {
        return (android.telephony.CellInfoCdma) real;
    }

    public android.telephony.CellInfoCdma unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellIdentityCdma getCellIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#getCellIdentity()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellSignalStrengthCdma getCellSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#getCellSignalStrength()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoCdma#writeToParcel(android.os.Parcel,int)");
    }


}
