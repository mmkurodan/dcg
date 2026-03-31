// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SignalingDataInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SignalingDataInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SignalingDataInfo wrap(android.media.tv.SignalingDataInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SignalingDataInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.SignalingDataInfo getReal() {
        return (android.media.tv.SignalingDataInfo) real;
    }

    public android.media.tv.SignalingDataInfo unwrap() {
        return getReal();
    }

    public SignalingDataInfo(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3) {
        this(new android.media.tv.SignalingDataInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public SignalingDataInfo(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, java.lang.String arg4) {
        this(new android.media.tv.SignalingDataInfo(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.SignalingDataInfo) real).describeContents();
    }

    public java.lang.String getEncoding() {
        return ((android.media.tv.SignalingDataInfo) real).getEncoding();
    }

    public int getGroup() {
        return ((android.media.tv.SignalingDataInfo) real).getGroup();
    }

    public java.lang.String getSignalingDataType() {
        return ((android.media.tv.SignalingDataInfo) real).getSignalingDataType();
    }

    public java.lang.String getTable() {
        return ((android.media.tv.SignalingDataInfo) real).getTable();
    }

    public int getVersion() {
        return ((android.media.tv.SignalingDataInfo) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.SignalingDataInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String CONTENT_ENCODING_BASE64 = android.media.tv.SignalingDataInfo.CONTENT_ENCODING_BASE64;
    public static final java.lang.String CONTENT_ENCODING_UTF_8 = android.media.tv.SignalingDataInfo.CONTENT_ENCODING_UTF_8;
    public static final int LLS_NO_GROUP_ID = android.media.tv.SignalingDataInfo.LLS_NO_GROUP_ID;

}
