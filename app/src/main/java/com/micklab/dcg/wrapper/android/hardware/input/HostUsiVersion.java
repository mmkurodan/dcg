// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.input;

public final class HostUsiVersion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HostUsiVersion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion wrap(android.hardware.input.HostUsiVersion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.input.HostUsiVersion getReal() {
        return (android.hardware.input.HostUsiVersion) real;
    }

    public android.hardware.input.HostUsiVersion unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.input.HostUsiVersion) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.input.HostUsiVersion) real).equals(arg0);
    }

    public int getMajorVersion() {
        return ((android.hardware.input.HostUsiVersion) real).getMajorVersion();
    }

    public int getMinorVersion() {
        return ((android.hardware.input.HostUsiVersion) real).getMinorVersion();
    }

    public int hashCode() {
        return ((android.hardware.input.HostUsiVersion) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.input.HostUsiVersion) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.input.HostUsiVersion) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
