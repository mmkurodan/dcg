// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PowerMonitor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PowerMonitor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PowerMonitor wrap(android.os.PowerMonitor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerMonitor(real, (__DcgwBridgeToken) null);
    }

    public android.os.PowerMonitor getReal() {
        return (android.os.PowerMonitor) real;
    }

    public android.os.PowerMonitor unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitor#describeContents()");
    }

    public java.lang.String getName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitor#getName()");
    }

    public int getType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitor#getType()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitor#writeToParcel(android.os.Parcel,int)");
    }


}
