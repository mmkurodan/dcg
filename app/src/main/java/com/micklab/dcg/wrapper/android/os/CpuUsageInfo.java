// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CpuUsageInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CpuUsageInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CpuUsageInfo wrap(android.os.CpuUsageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CpuUsageInfo(real, (__DcgwBridgeToken) null);
    }

    public android.os.CpuUsageInfo getReal() {
        return (android.os.CpuUsageInfo) real;
    }

    public android.os.CpuUsageInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CpuUsageInfo#describeContents()");
    }

    public long getActive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CpuUsageInfo#getActive()");
    }

    public long getTotal() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CpuUsageInfo#getTotal()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CpuUsageInfo#writeToParcel(android.os.Parcel,int)");
    }


}
