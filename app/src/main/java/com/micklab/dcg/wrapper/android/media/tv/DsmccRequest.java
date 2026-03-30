// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class DsmccRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DsmccRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.DsmccRequest wrap(android.media.tv.DsmccRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.DsmccRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.DsmccRequest getReal() {
        return (android.media.tv.DsmccRequest) real;
    }

    public android.media.tv.DsmccRequest unwrap() {
        return getReal();
    }

    public DsmccRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        this(new android.media.tv.DsmccRequest(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.DsmccRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.tv.DsmccRequest) real).getUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.DsmccRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
