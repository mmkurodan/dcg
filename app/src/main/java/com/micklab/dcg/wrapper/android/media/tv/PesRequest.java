// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class PesRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PesRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.PesRequest wrap(android.media.tv.PesRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.PesRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.PesRequest getReal() {
        return (android.media.tv.PesRequest) real;
    }

    public android.media.tv.PesRequest unwrap() {
        return getReal();
    }

    public PesRequest(int arg0, int arg1, int arg2, int arg3) {
        this(new android.media.tv.PesRequest(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.PesRequest) real).describeContents();
    }

    public int getStreamId() {
        return ((android.media.tv.PesRequest) real).getStreamId();
    }

    public int getTsPid() {
        return ((android.media.tv.PesRequest) real).getTsPid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.PesRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
