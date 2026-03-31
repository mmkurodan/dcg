// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchBlobHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSearchBlobHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBlobHandle wrap(android.app.appsearch.AppSearchBlobHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBlobHandle(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.AppSearchBlobHandle getReal() {
        return (android.app.appsearch.AppSearchBlobHandle) real;
    }

    public android.app.appsearch.AppSearchBlobHandle unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBlobHandle createWithSha256(byte[] arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        return com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBlobHandle.wrap(android.app.appsearch.AppSearchBlobHandle.createWithSha256(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.AppSearchBlobHandle) real).equals(arg0);
    }

    public java.lang.String getDatabaseName() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).getDatabaseName();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).getNamespace();
    }

    public java.lang.String getPackageName() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).getPackageName();
    }

    public byte[] getSha256Digest() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).getSha256Digest();
    }

    public int hashCode() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.AppSearchBlobHandle) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.AppSearchBlobHandle) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
