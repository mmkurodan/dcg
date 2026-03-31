// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class CommitBlobResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CommitBlobResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.CommitBlobResponse wrap(android.app.appsearch.CommitBlobResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.CommitBlobResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.CommitBlobResponse getReal() {
        return (android.app.appsearch.CommitBlobResponse) real;
    }

    public android.app.appsearch.CommitBlobResponse unwrap() {
        return getReal();
    }

    public CommitBlobResponse(com.micklab.dcg.wrapper.android.app.appsearch.AppSearchBatchResult arg0) {
        this(new android.app.appsearch.CommitBlobResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.appsearch.CommitBlobResponse) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.CommitBlobResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
