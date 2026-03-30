// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class LauncherUserInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LauncherUserInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.LauncherUserInfo wrap(android.content.pm.LauncherUserInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.LauncherUserInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.LauncherUserInfo getReal() {
        return (android.content.pm.LauncherUserInfo) real;
    }

    public android.content.pm.LauncherUserInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.LauncherUserInfo#describeContents()");
    }

    public int getUserSerialNumber() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.LauncherUserInfo#getUserSerialNumber()");
    }

    public java.lang.String getUserType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.LauncherUserInfo#getUserType()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.LauncherUserInfo#writeToParcel(android.os.Parcel,int)");
    }


}
