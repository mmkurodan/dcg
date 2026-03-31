// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class OpenBlobForWriteResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OpenBlobForWriteResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.OpenBlobForWriteResponse wrap(android.app.appsearch.OpenBlobForWriteResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.OpenBlobForWriteResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.OpenBlobForWriteResponse getReal() {
        return (android.app.appsearch.OpenBlobForWriteResponse) real;
    }

    public android.app.appsearch.OpenBlobForWriteResponse unwrap() {
        return getReal();
    }

    public OpenBlobForWriteResponse(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult arg0) {
        this(new android.app.appsearch.OpenBlobForWriteResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.app.appsearch.OpenBlobForWriteResponse) real).close();
    }

    public int describeContents() {
        return ((android.app.appsearch.OpenBlobForWriteResponse) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.OpenBlobForWriteResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
