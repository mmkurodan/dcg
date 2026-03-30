// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class FileServiceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FileServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.FileServiceInfo wrap(android.telephony.mbms.FileServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.FileServiceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.FileServiceInfo getReal() {
        return (android.telephony.mbms.FileServiceInfo) real;
    }

    public android.telephony.mbms.FileServiceInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.FileServiceInfo#describeContents()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.FileServiceInfo#writeToParcel(android.os.Parcel,int)");
    }


}
