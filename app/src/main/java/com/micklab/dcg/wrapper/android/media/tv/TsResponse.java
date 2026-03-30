// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TsResponse wrap(android.media.tv.TsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TsResponse getReal() {
        return (android.media.tv.TsResponse) real;
    }

    public android.media.tv.TsResponse unwrap() {
        return getReal();
    }

    public TsResponse(int arg0, int arg1, int arg2, java.lang.String arg3) {
        this(new android.media.tv.TsResponse(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.TsResponse) real).describeContents();
    }

    public java.lang.String getSharedFilterToken() {
        return ((android.media.tv.TsResponse) real).getSharedFilterToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TsResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
