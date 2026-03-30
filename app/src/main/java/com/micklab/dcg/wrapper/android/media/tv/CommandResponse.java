// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class CommandResponse {
    private final android.media.tv.CommandResponse real;

    public CommandResponse(android.media.tv.CommandResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.CommandResponse wrap(android.media.tv.CommandResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.CommandResponse(real);
    }

    public android.media.tv.CommandResponse unwrap() {
        return real;
    }

    public CommandResponse(int arg0, int arg1, int arg2, java.lang.String arg3, java.lang.String arg4) {
        this(new android.media.tv.CommandResponse(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getResponse() {
        return real.getResponse();
    }

    public java.lang.String getResponseType() {
        return real.getResponseType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String RESPONSE_TYPE_JSON = android.media.tv.CommandResponse.RESPONSE_TYPE_JSON;
    public static final java.lang.String RESPONSE_TYPE_XML = android.media.tv.CommandResponse.RESPONSE_TYPE_XML;

}
