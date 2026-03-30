// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class UiccPortInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UiccPortInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.UiccPortInfo wrap(android.telephony.UiccPortInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.UiccPortInfo(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.UiccPortInfo getReal() {
        return (android.telephony.UiccPortInfo) real;
    }

    public android.telephony.UiccPortInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#equals(java.lang.Object)");
    }

    public java.lang.String getIccId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#getIccId()");
    }

    public int getLogicalSlotIndex() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#getLogicalSlotIndex()");
    }

    public int getPortIndex() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#getPortIndex()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#hashCode()");
    }

    public boolean isActive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#isActive()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.UiccPortInfo#writeToParcel(android.os.Parcel,int)");
    }


}
