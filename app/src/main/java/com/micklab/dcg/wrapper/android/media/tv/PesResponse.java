// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class PesResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PesResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.PesResponse wrap(android.media.tv.PesResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.PesResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.PesResponse getReal() {
        return (android.media.tv.PesResponse) real;
    }

    public android.media.tv.PesResponse unwrap() {
        return getReal();
    }

    public PesResponse(int arg0, int arg1, int arg2, java.lang.String arg3) {
        this(new android.media.tv.PesResponse(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.PesResponse) real).describeContents();
    }

    public java.lang.String getSharedFilterToken() {
        return ((android.media.tv.PesResponse) real).getSharedFilterToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.PesResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
