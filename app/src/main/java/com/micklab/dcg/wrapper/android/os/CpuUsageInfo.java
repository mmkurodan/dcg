// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CpuUsageInfo {
    private final android.os.CpuUsageInfo real;

    public CpuUsageInfo(android.os.CpuUsageInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CpuUsageInfo wrap(android.os.CpuUsageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CpuUsageInfo(real);
    }

    public android.os.CpuUsageInfo unwrap() {
        return real;
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
