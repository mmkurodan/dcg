// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class Checksum {
    private final android.content.pm.Checksum real;

    public Checksum(android.content.pm.Checksum real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.Checksum wrap(android.content.pm.Checksum real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.Checksum(real);
    }

    public android.content.pm.Checksum unwrap() {
        return real;
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
