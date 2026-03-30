// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.blob;

public final class BlobHandle {
    private final android.app.blob.BlobHandle real;

    public BlobHandle(android.app.blob.BlobHandle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.blob.BlobHandle wrap(android.app.blob.BlobHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.blob.BlobHandle(real);
    }

    public android.app.blob.BlobHandle unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.app.blob.BlobHandle createWithSha256(byte[] arg0, java.lang.CharSequence arg1, long arg2, java.lang.String arg3) {
        return com.micklab.dcg.wrapper.android.app.blob.BlobHandle.wrap(android.app.blob.BlobHandle.createWithSha256(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getExpiryTimeMillis() {
        return real.getExpiryTimeMillis();
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public byte[] getSha256Digest() {
        return real.getSha256Digest();
    }

    public java.lang.String getTag() {
        return real.getTag();
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


}
