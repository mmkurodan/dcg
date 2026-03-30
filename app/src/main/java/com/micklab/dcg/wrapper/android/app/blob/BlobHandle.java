// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.blob;

public final class BlobHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlobHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.blob.BlobHandle wrap(android.app.blob.BlobHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.blob.BlobHandle(real, (__DcgwBridgeToken) null);
    }

    public android.app.blob.BlobHandle getReal() {
        return (android.app.blob.BlobHandle) real;
    }

    public android.app.blob.BlobHandle unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.app.blob.BlobHandle createWithSha256(byte[] arg0, java.lang.CharSequence arg1, long arg2, java.lang.String arg3) {
        return com.micklab.dcg.wrapper.android.app.blob.BlobHandle.wrap(android.app.blob.BlobHandle.createWithSha256(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return ((android.app.blob.BlobHandle) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.blob.BlobHandle) real).equals(arg0);
    }

    public long getExpiryTimeMillis() {
        return ((android.app.blob.BlobHandle) real).getExpiryTimeMillis();
    }

    public java.lang.CharSequence getLabel() {
        return ((android.app.blob.BlobHandle) real).getLabel();
    }

    public byte[] getSha256Digest() {
        return ((android.app.blob.BlobHandle) real).getSha256Digest();
    }

    public java.lang.String getTag() {
        return ((android.app.blob.BlobHandle) real).getTag();
    }

    public int hashCode() {
        return ((android.app.blob.BlobHandle) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.blob.BlobHandle) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.blob.BlobHandle) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
