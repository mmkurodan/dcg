// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class StreamingServiceInfo {
    private final android.telephony.mbms.StreamingServiceInfo real;

    public StreamingServiceInfo(android.telephony.mbms.StreamingServiceInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceInfo wrap(android.telephony.mbms.StreamingServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceInfo(real);
    }

    public android.telephony.mbms.StreamingServiceInfo unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceInfo#describeContents()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceInfo#writeToParcel(android.os.Parcel,int)");
    }


}
