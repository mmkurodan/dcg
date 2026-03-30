// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class ParcelablePeerHandle {
    private final android.net.wifi.aware.ParcelablePeerHandle real;

    public ParcelablePeerHandle(android.net.wifi.aware.ParcelablePeerHandle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.ParcelablePeerHandle wrap(android.net.wifi.aware.ParcelablePeerHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.ParcelablePeerHandle(real);
    }

    public android.net.wifi.aware.ParcelablePeerHandle unwrap() {
        return real;
    }

    public ParcelablePeerHandle(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ParcelablePeerHandle#android.net.wifi.aware.ParcelablePeerHandle(android.net.wifi.aware.PeerHandle)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ParcelablePeerHandle#describeContents()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ParcelablePeerHandle#writeToParcel(android.os.Parcel,int)");
    }


}
