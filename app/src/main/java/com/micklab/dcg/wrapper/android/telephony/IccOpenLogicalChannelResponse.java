// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class IccOpenLogicalChannelResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IccOpenLogicalChannelResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.IccOpenLogicalChannelResponse wrap(android.telephony.IccOpenLogicalChannelResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.IccOpenLogicalChannelResponse(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.IccOpenLogicalChannelResponse getReal() {
        return (android.telephony.IccOpenLogicalChannelResponse) real;
    }

    public android.telephony.IccOpenLogicalChannelResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.IccOpenLogicalChannelResponse#describeContents()");
    }

    public int getChannel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.IccOpenLogicalChannelResponse#getChannel()");
    }

    public byte[] getSelectResponse() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.IccOpenLogicalChannelResponse#getSelectResponse()");
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.IccOpenLogicalChannelResponse#getStatus()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.IccOpenLogicalChannelResponse#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.IccOpenLogicalChannelResponse#writeToParcel(android.os.Parcel,int)");
    }


}
