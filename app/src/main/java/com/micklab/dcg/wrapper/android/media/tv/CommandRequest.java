// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class CommandRequest {
    private final android.media.tv.CommandRequest real;

    public CommandRequest(android.media.tv.CommandRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.CommandRequest wrap(android.media.tv.CommandRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.CommandRequest(real);
    }

    public android.media.tv.CommandRequest unwrap() {
        return real;
    }

    public CommandRequest(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) {
        this(new android.media.tv.CommandRequest(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getArgumentType() {
        return real.getArgumentType();
    }

    public java.lang.String getArguments() {
        return real.getArguments();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ARGUMENT_TYPE_JSON = android.media.tv.CommandRequest.ARGUMENT_TYPE_JSON;
    public static final java.lang.String ARGUMENT_TYPE_XML = android.media.tv.CommandRequest.ARGUMENT_TYPE_XML;

}
