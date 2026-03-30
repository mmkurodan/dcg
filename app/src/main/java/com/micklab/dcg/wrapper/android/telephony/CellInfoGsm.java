// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellInfoGsm {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellInfoGsm(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellInfoGsm wrap(android.telephony.CellInfoGsm real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellInfoGsm(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellInfoGsm getReal() {
        return (android.telephony.CellInfoGsm) real;
    }

    public android.telephony.CellInfoGsm unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellIdentityGsm getCellIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#getCellIdentity()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellSignalStrengthGsm getCellSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#getCellSignalStrength()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoGsm#writeToParcel(android.os.Parcel,int)");
    }


}
