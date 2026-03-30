// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellIdentity {
    private final android.telephony.CellIdentity real;

    public CellIdentity(android.telephony.CellIdentity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellIdentity wrap(android.telephony.CellIdentity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellIdentity(real);
    }

    public android.telephony.CellIdentity unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellIdentity#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellIdentity#equals(java.lang.Object)");
    }

    public java.lang.CharSequence getOperatorAlphaLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellIdentity#getOperatorAlphaLong()");
    }

    public java.lang.CharSequence getOperatorAlphaShort() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellIdentity#getOperatorAlphaShort()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellIdentity#hashCode()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellIdentity#writeToParcel(android.os.Parcel,int)");
    }


}
