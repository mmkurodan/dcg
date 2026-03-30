// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class ParcelablePeerHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParcelablePeerHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.ParcelablePeerHandle wrap(android.net.wifi.aware.ParcelablePeerHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.ParcelablePeerHandle(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.ParcelablePeerHandle getReal() {
        return (android.net.wifi.aware.ParcelablePeerHandle) real;
    }

    public android.net.wifi.aware.ParcelablePeerHandle unwrap() {
        return getReal();
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
