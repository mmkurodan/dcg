// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class SystemUpdateInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SystemUpdateInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdateInfo wrap(android.app.admin.SystemUpdateInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SystemUpdateInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.SystemUpdateInfo getReal() {
        return (android.app.admin.SystemUpdateInfo) real;
    }

    public android.app.admin.SystemUpdateInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.SystemUpdateInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.admin.SystemUpdateInfo) real).equals(arg0);
    }

    public long getReceivedTime() {
        return ((android.app.admin.SystemUpdateInfo) real).getReceivedTime();
    }

    public int getSecurityPatchState() {
        return ((android.app.admin.SystemUpdateInfo) real).getSecurityPatchState();
    }

    public int hashCode() {
        return ((android.app.admin.SystemUpdateInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.admin.SystemUpdateInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.SystemUpdateInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SECURITY_PATCH_STATE_FALSE = android.app.admin.SystemUpdateInfo.SECURITY_PATCH_STATE_FALSE;
    public static final int SECURITY_PATCH_STATE_TRUE = android.app.admin.SystemUpdateInfo.SECURITY_PATCH_STATE_TRUE;
    public static final int SECURITY_PATCH_STATE_UNKNOWN = android.app.admin.SystemUpdateInfo.SECURITY_PATCH_STATE_UNKNOWN;

}
