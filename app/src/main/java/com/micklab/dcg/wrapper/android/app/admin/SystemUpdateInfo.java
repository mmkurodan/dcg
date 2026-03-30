// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class SystemUpdateInfo {
    private final android.app.admin.SystemUpdateInfo real;

    public SystemUpdateInfo(android.app.admin.SystemUpdateInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdateInfo wrap(android.app.admin.SystemUpdateInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SystemUpdateInfo(real);
    }

    public android.app.admin.SystemUpdateInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getReceivedTime() {
        return real.getReceivedTime();
    }

    public int getSecurityPatchState() {
        return real.getSecurityPatchState();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int SECURITY_PATCH_STATE_FALSE = android.app.admin.SystemUpdateInfo.SECURITY_PATCH_STATE_FALSE;
    public static final int SECURITY_PATCH_STATE_TRUE = android.app.admin.SystemUpdateInfo.SECURITY_PATCH_STATE_TRUE;
    public static final int SECURITY_PATCH_STATE_UNKNOWN = android.app.admin.SystemUpdateInfo.SECURITY_PATCH_STATE_UNKNOWN;

}
