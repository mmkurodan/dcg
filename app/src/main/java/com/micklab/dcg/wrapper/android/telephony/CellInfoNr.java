// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellInfoNr {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CellInfoNr(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellInfoNr wrap(android.telephony.CellInfoNr real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellInfoNr(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.CellInfoNr getReal() {
        return (android.telephony.CellInfoNr) real;
    }

    public android.telephony.CellInfoNr unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoNr#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellIdentity getCellIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoNr#getCellIdentity()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellSignalStrength getCellSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoNr#getCellSignalStrength()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoNr#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoNr#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfoNr#writeToParcel(android.os.Parcel,int)");
    }


}
