// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class MacAddress {
    private final android.net.MacAddress real;

    public MacAddress(android.net.MacAddress real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.MacAddress wrap(android.net.MacAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.MacAddress(real);
    }

    public android.net.MacAddress unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#equals(java.lang.Object)");
    }

    public static com.micklab.dcg.wrapper.android.net.MacAddress fromBytes(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#fromBytes([B)");
    }

    public static com.micklab.dcg.wrapper.android.net.MacAddress fromString(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#fromString(java.lang.String)");
    }

    public int getAddressType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#getAddressType()");
    }

    public java.net.Inet6Address getLinkLocalIpv6FromEui48Mac() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#getLinkLocalIpv6FromEui48Mac()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#hashCode()");
    }

    public boolean isLocallyAssigned() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#isLocallyAssigned()");
    }

    public boolean matches(com.micklab.dcg.wrapper.android.net.MacAddress arg0, com.micklab.dcg.wrapper.android.net.MacAddress arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#matches(android.net.MacAddress,android.net.MacAddress)");
    }

    public byte[] toByteArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#toByteArray()");
    }

    public java.lang.String toOuiString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#toOuiString()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MacAddress#writeToParcel(android.os.Parcel,int)");
    }


}
