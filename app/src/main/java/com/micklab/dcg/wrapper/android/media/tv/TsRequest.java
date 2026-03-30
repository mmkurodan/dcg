// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TsRequest wrap(android.media.tv.TsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TsRequest getReal() {
        return (android.media.tv.TsRequest) real;
    }

    public android.media.tv.TsRequest unwrap() {
        return getReal();
    }

    public TsRequest(int arg0, int arg1, int arg2) {
        this(new android.media.tv.TsRequest(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.TsRequest) real).describeContents();
    }

    public int getTsPid() {
        return ((android.media.tv.TsRequest) real).getTsPid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TsRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
