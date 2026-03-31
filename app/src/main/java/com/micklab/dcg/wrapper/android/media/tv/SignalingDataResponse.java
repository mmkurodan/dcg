// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SignalingDataResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SignalingDataResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SignalingDataResponse wrap(android.media.tv.SignalingDataResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SignalingDataResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.SignalingDataResponse getReal() {
        return (android.media.tv.SignalingDataResponse) real;
    }

    public android.media.tv.SignalingDataResponse unwrap() {
        return getReal();
    }

    public SignalingDataResponse(int arg0, int arg1, int arg2, java.util.List arg3, java.util.List arg4) {
        this(new android.media.tv.SignalingDataResponse(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.SignalingDataResponse) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.SignalingDataResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
