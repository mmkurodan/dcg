// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class CommandResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CommandResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.CommandResponse wrap(android.media.tv.CommandResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.CommandResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.CommandResponse getReal() {
        return (android.media.tv.CommandResponse) real;
    }

    public android.media.tv.CommandResponse unwrap() {
        return getReal();
    }

    public CommandResponse(int arg0, int arg1, int arg2, java.lang.String arg3, java.lang.String arg4) {
        this(new android.media.tv.CommandResponse(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.CommandResponse) real).describeContents();
    }

    public java.lang.String getResponse() {
        return ((android.media.tv.CommandResponse) real).getResponse();
    }

    public java.lang.String getResponseType() {
        return ((android.media.tv.CommandResponse) real).getResponseType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.CommandResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String RESPONSE_TYPE_JSON = android.media.tv.CommandResponse.RESPONSE_TYPE_JSON;
    public static final java.lang.String RESPONSE_TYPE_XML = android.media.tv.CommandResponse.RESPONSE_TYPE_XML;

}
