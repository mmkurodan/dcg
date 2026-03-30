// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class SigningInfo {
    private final android.content.pm.SigningInfo real;

    public SigningInfo(android.content.pm.SigningInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.SigningInfo wrap(android.content.pm.SigningInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.SigningInfo(real);
    }

    public android.content.pm.SigningInfo unwrap() {
        return real;
    }

    public SigningInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#android.content.pm.SigningInfo()");
    }

    public SigningInfo(com.micklab.dcg.wrapper.android.content.pm.SigningInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#android.content.pm.SigningInfo(android.content.pm.SigningInfo)");
    }

    public SigningInfo(int arg0, java.util.Collection arg1, java.util.Collection arg2, java.util.Collection arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#android.content.pm.SigningInfo(int,java.util.Collection,java.util.Collection,java.util.Collection)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#describeContents()");
    }

    public android.content.pm.Signature[] getApkContentsSigners() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#getApkContentsSigners()");
    }

    public int getSchemeVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#getSchemeVersion()");
    }

    public android.content.pm.Signature[] getSigningCertificateHistory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#getSigningCertificateHistory()");
    }

    public boolean hasMultipleSigners() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#hasMultipleSigners()");
    }

    public boolean hasPastSigningCertificates() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#hasPastSigningCertificates()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.SigningInfo#writeToParcel(android.os.Parcel,int)");
    }


}
