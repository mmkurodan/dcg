// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class BroadcastInfoResponse {
    private final android.media.tv.BroadcastInfoResponse real;

    public BroadcastInfoResponse(android.media.tv.BroadcastInfoResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse wrap(android.media.tv.BroadcastInfoResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse(real);
    }

    public android.media.tv.BroadcastInfoResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getRequestId() {
        return real.getRequestId();
    }

    public int getResponseResult() {
        return real.getResponseResult();
    }

    public int getSequence() {
        return real.getSequence();
    }

    public int getType() {
        return real.getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int RESPONSE_RESULT_CANCEL = android.media.tv.BroadcastInfoResponse.RESPONSE_RESULT_CANCEL;
    public static final int RESPONSE_RESULT_ERROR = android.media.tv.BroadcastInfoResponse.RESPONSE_RESULT_ERROR;
    public static final int RESPONSE_RESULT_OK = android.media.tv.BroadcastInfoResponse.RESPONSE_RESULT_OK;

}
