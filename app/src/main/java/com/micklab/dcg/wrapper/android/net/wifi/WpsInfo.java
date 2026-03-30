// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class WpsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WpsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.WpsInfo wrap(android.net.wifi.WpsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WpsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.WpsInfo getReal() {
        return (android.net.wifi.WpsInfo) real;
    }

    public android.net.wifi.WpsInfo unwrap() {
        return getReal();
    }

    public WpsInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WpsInfo#android.net.wifi.WpsInfo()");
    }

    public WpsInfo(com.micklab.dcg.wrapper.android.net.wifi.WpsInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WpsInfo#android.net.wifi.WpsInfo(android.net.wifi.WpsInfo)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WpsInfo#describeContents()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WpsInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WpsInfo#writeToParcel(android.os.Parcel,int)");
    }


}
