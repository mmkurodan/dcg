// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class CellInfo {
    private final android.telephony.CellInfo real;

    public CellInfo(android.telephony.CellInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.CellInfo wrap(android.telephony.CellInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.CellInfo(real);
    }

    public android.telephony.CellInfo unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#equals(java.lang.Object)");
    }

    public int getCellConnectionStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#getCellConnectionStatus()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellIdentity getCellIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#getCellIdentity()");
    }

    public com.micklab.dcg.wrapper.android.telephony.CellSignalStrength getCellSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#getCellSignalStrength()");
    }

    public long getTimeStamp() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#getTimeStamp()");
    }

    public long getTimestampMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#getTimestampMillis()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#hashCode()");
    }

    public boolean isRegistered() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#isRegistered()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.CellInfo#writeToParcel(android.os.Parcel,int)");
    }


}
