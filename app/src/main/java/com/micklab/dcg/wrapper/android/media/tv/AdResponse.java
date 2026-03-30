// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AdResponse {
    private final android.media.tv.AdResponse real;

    public AdResponse(android.media.tv.AdResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AdResponse wrap(android.media.tv.AdResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AdResponse(real);
    }

    public android.media.tv.AdResponse unwrap() {
        return real;
    }

    public AdResponse(int arg0, int arg1, long arg2) {
        this(new android.media.tv.AdResponse(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getElapsedTimeMillis() {
        return real.getElapsedTimeMillis();
    }

    public int getId() {
        return real.getId();
    }

    public int getResponseType() {
        return real.getResponseType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int RESPONSE_TYPE_BUFFERING = android.media.tv.AdResponse.RESPONSE_TYPE_BUFFERING;
    public static final int RESPONSE_TYPE_ERROR = android.media.tv.AdResponse.RESPONSE_TYPE_ERROR;
    public static final int RESPONSE_TYPE_FINISHED = android.media.tv.AdResponse.RESPONSE_TYPE_FINISHED;
    public static final int RESPONSE_TYPE_PLAYING = android.media.tv.AdResponse.RESPONSE_TYPE_PLAYING;
    public static final int RESPONSE_TYPE_STOPPED = android.media.tv.AdResponse.RESPONSE_TYPE_STOPPED;

}
