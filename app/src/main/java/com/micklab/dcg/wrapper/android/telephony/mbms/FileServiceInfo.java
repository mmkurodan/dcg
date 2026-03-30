// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class FileServiceInfo {
    private final android.telephony.mbms.FileServiceInfo real;

    public FileServiceInfo(android.telephony.mbms.FileServiceInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.FileServiceInfo wrap(android.telephony.mbms.FileServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.FileServiceInfo(real);
    }

    public android.telephony.mbms.FileServiceInfo unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.FileServiceInfo#describeContents()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.FileServiceInfo#writeToParcel(android.os.Parcel,int)");
    }


}
