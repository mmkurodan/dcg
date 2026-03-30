// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class CommandRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CommandRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.CommandRequest wrap(android.media.tv.CommandRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.CommandRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.CommandRequest getReal() {
        return (android.media.tv.CommandRequest) real;
    }

    public android.media.tv.CommandRequest unwrap() {
        return getReal();
    }

    public CommandRequest(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) {
        this(new android.media.tv.CommandRequest(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.CommandRequest) real).describeContents();
    }

    public java.lang.String getArgumentType() {
        return ((android.media.tv.CommandRequest) real).getArgumentType();
    }

    public java.lang.String getArguments() {
        return ((android.media.tv.CommandRequest) real).getArguments();
    }

    public java.lang.String getName() {
        return ((android.media.tv.CommandRequest) real).getName();
    }

    public java.lang.String getNamespace() {
        return ((android.media.tv.CommandRequest) real).getNamespace();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.CommandRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String ARGUMENT_TYPE_JSON = android.media.tv.CommandRequest.ARGUMENT_TYPE_JSON;
    public static final java.lang.String ARGUMENT_TYPE_XML = android.media.tv.CommandRequest.ARGUMENT_TYPE_XML;

}
