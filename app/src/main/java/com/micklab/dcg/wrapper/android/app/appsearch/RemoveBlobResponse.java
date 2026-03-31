// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class RemoveBlobResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoveBlobResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.RemoveBlobResponse wrap(android.app.appsearch.RemoveBlobResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.RemoveBlobResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.RemoveBlobResponse getReal() {
        return (android.app.appsearch.RemoveBlobResponse) real;
    }

    public android.app.appsearch.RemoveBlobResponse unwrap() {
        return getReal();
    }

    public RemoveBlobResponse(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult arg0) {
        this(new android.app.appsearch.RemoveBlobResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.appsearch.RemoveBlobResponse) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.RemoveBlobResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
