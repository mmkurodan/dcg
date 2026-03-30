// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class BroadcastInfoResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BroadcastInfoResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse wrap(android.media.tv.BroadcastInfoResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.BroadcastInfoResponse getReal() {
        return (android.media.tv.BroadcastInfoResponse) real;
    }

    public android.media.tv.BroadcastInfoResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.tv.BroadcastInfoResponse) real).describeContents();
    }

    public int getRequestId() {
        return ((android.media.tv.BroadcastInfoResponse) real).getRequestId();
    }

    public int getResponseResult() {
        return ((android.media.tv.BroadcastInfoResponse) real).getResponseResult();
    }

    public int getSequence() {
        return ((android.media.tv.BroadcastInfoResponse) real).getSequence();
    }

    public int getType() {
        return ((android.media.tv.BroadcastInfoResponse) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.BroadcastInfoResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RESPONSE_RESULT_CANCEL = android.media.tv.BroadcastInfoResponse.RESPONSE_RESULT_CANCEL;
    public static final int RESPONSE_RESULT_ERROR = android.media.tv.BroadcastInfoResponse.RESPONSE_RESULT_ERROR;
    public static final int RESPONSE_RESULT_OK = android.media.tv.BroadcastInfoResponse.RESPONSE_RESULT_OK;

}
