// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellInfoLte {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellInfoLte(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellInfoLte wrap(android.telephony.CellInfoLte real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellInfoLte(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellInfoLte getReal() {
        return (android.telephony.CellInfoLte) real;
    }

    public android.telephony.CellInfoLte unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellIdentityLte getCellIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#getCellIdentity()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellSignalStrengthLte getCellSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#getCellSignalStrength()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoLte#writeToParcel(android.os.Parcel,int)");
    }


}
