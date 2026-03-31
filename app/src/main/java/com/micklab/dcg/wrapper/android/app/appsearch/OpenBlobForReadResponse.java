// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class OpenBlobForReadResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OpenBlobForReadResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.OpenBlobForReadResponse wrap(android.app.appsearch.OpenBlobForReadResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.OpenBlobForReadResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.OpenBlobForReadResponse getReal() {
        return (android.app.appsearch.OpenBlobForReadResponse) real;
    }

    public android.app.appsearch.OpenBlobForReadResponse unwrap() {
        return getReal();
    }

    public OpenBlobForReadResponse(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult arg0) {
        this(new android.app.appsearch.OpenBlobForReadResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.app.appsearch.OpenBlobForReadResponse) real).close();
    }

    public int describeContents() {
        return ((android.app.appsearch.OpenBlobForReadResponse) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.OpenBlobForReadResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
