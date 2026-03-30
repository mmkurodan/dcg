// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class PackageInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PackageInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.PackageInfo wrap(android.content.pm.PackageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.PackageInfo getReal() {
        return (android.content.pm.PackageInfo) real;
    }

    public android.content.pm.PackageInfo unwrap() {
        return getReal();
    }

    public PackageInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#android.content.pm.PackageInfo()");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#describeContents()");
    }

    public java.lang.String getApexPackageName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#getApexPackageName()");
    }

    public long getArchiveTimeMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#getArchiveTimeMillis()");
    }

    public long getLongVersionCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#getLongVersionCode()");
    }

    public void setLongVersionCode(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#setLongVersionCode(long)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInfo#writeToParcel(android.os.Parcel,int)");
    }


}
