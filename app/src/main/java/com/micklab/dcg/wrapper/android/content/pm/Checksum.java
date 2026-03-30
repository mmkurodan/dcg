// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class Checksum {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Checksum(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.Checksum wrap(android.content.pm.Checksum real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.Checksum(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.Checksum getReal() {
        return (android.content.pm.Checksum) real;
    }

    public android.content.pm.Checksum unwrap() {
        return getReal();
    }

    public Checksum(int arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Checksum#android.content.pm.Checksum(int,[B)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Checksum#describeContents()");
    }

    public int getType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Checksum#getType()");
    }

    public byte[] getValue() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Checksum#getValue()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Checksum#writeToParcel(android.os.Parcel,int)");
    }


}
