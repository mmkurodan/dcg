// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class InstallSourceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InstallSourceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.InstallSourceInfo wrap(android.content.pm.InstallSourceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.InstallSourceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.InstallSourceInfo getReal() {
        return (android.content.pm.InstallSourceInfo) real;
    }

    public android.content.pm.InstallSourceInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#describeContents()");
    }

    public java.lang.String getInitiatingPackageName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#getInitiatingPackageName()");
    }

    public com.micklab.dcg.wrapper.android.content.pm.SigningInfo getInitiatingPackageSigningInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#getInitiatingPackageSigningInfo()");
    }

    public java.lang.String getInstallingPackageName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#getInstallingPackageName()");
    }

    public java.lang.String getOriginatingPackageName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#getOriginatingPackageName()");
    }

    public int getPackageSource() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#getPackageSource()");
    }

    public java.lang.String getUpdateOwnerPackageName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#getUpdateOwnerPackageName()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.InstallSourceInfo#writeToParcel(android.os.Parcel,int)");
    }


}
