// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class BroadcastInfoRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BroadcastInfoRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest wrap(android.media.tv.BroadcastInfoRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.BroadcastInfoRequest getReal() {
        return (android.media.tv.BroadcastInfoRequest) real;
    }

    public android.media.tv.BroadcastInfoRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.tv.BroadcastInfoRequest) real).describeContents();
    }

    public int getOption() {
        return ((android.media.tv.BroadcastInfoRequest) real).getOption();
    }

    public int getRequestId() {
        return ((android.media.tv.BroadcastInfoRequest) real).getRequestId();
    }

    public int getType() {
        return ((android.media.tv.BroadcastInfoRequest) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.BroadcastInfoRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int REQUEST_OPTION_AUTO_UPDATE = android.media.tv.BroadcastInfoRequest.REQUEST_OPTION_AUTO_UPDATE;
    public static final int REQUEST_OPTION_ONESHOT = android.media.tv.BroadcastInfoRequest.REQUEST_OPTION_ONESHOT;
    public static final int REQUEST_OPTION_ONEWAY = android.media.tv.BroadcastInfoRequest.REQUEST_OPTION_ONEWAY;
    public static final int REQUEST_OPTION_REPEAT = android.media.tv.BroadcastInfoRequest.REQUEST_OPTION_REPEAT;

}
