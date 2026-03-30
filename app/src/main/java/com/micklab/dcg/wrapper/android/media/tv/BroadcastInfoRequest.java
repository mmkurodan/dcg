// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class BroadcastInfoRequest {
    private final android.media.tv.BroadcastInfoRequest real;

    public BroadcastInfoRequest(android.media.tv.BroadcastInfoRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest wrap(android.media.tv.BroadcastInfoRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest(real);
    }

    public android.media.tv.BroadcastInfoRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getOption() {
        return real.getOption();
    }

    public int getRequestId() {
        return real.getRequestId();
    }

    public int getType() {
        return real.getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int REQUEST_OPTION_AUTO_UPDATE = android.media.tv.BroadcastInfoRequest.REQUEST_OPTION_AUTO_UPDATE;
    public static final int REQUEST_OPTION_REPEAT = android.media.tv.BroadcastInfoRequest.REQUEST_OPTION_REPEAT;

}
