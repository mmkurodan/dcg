// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PersistableBundle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PersistableBundle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PersistableBundle wrap(android.os.PersistableBundle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PersistableBundle(real, (__DcgwBridgeToken) null);
    }

    public android.os.PersistableBundle getReal() {
        return (android.os.PersistableBundle) real;
    }

    public android.os.PersistableBundle unwrap() {
        return getReal();
    }

    public PersistableBundle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#android.os.PersistableBundle()");
    }

    public PersistableBundle(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#android.os.PersistableBundle(int)");
    }

    public PersistableBundle(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#android.os.PersistableBundle(android.os.PersistableBundle)");
    }

    public java.lang.Object clone() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#clone()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle deepCopy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#deepCopy()");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#describeContents()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getPersistableBundle(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#getPersistableBundle(java.lang.String)");
    }

    public void putPersistableBundle(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#putPersistableBundle(java.lang.String,android.os.PersistableBundle)");
    }

    public static com.micklab.dcg.wrapper.android.os.PersistableBundle readFromStream(java.io.InputStream arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#readFromStream(java.io.InputStream)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#writeToParcel(android.os.Parcel,int)");
    }

    public void writeToStream(java.io.OutputStream arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PersistableBundle#writeToStream(java.io.OutputStream)");
    }


}
