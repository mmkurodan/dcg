// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class QueryLocationException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QueryLocationException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.QueryLocationException wrap(android.telecom.QueryLocationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.QueryLocationException(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.QueryLocationException getReal() {
        return (android.telecom.QueryLocationException) real;
    }

    public android.telecom.QueryLocationException unwrap() {
        return getReal();
    }

    public QueryLocationException(java.lang.String arg0) {
        this(new android.telecom.QueryLocationException(arg0), (__DcgwBridgeToken) null);
    }

    public QueryLocationException(java.lang.String arg0, int arg1) {
        this(new android.telecom.QueryLocationException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public QueryLocationException(java.lang.String arg0, int arg1, java.lang.Throwable arg2) {
        this(new android.telecom.QueryLocationException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.QueryLocationException) real).describeContents();
    }

    public int getCode() {
        return ((android.telecom.QueryLocationException) real).getCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.QueryLocationException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ERROR_NOT_ALLOWED_FOR_NON_EMERGENCY_CONNECTIONS = android.telecom.QueryLocationException.ERROR_NOT_ALLOWED_FOR_NON_EMERGENCY_CONNECTIONS;
    public static final int ERROR_NOT_PERMITTED = android.telecom.QueryLocationException.ERROR_NOT_PERMITTED;
    public static final int ERROR_PREVIOUS_REQUEST_EXISTS = android.telecom.QueryLocationException.ERROR_PREVIOUS_REQUEST_EXISTS;
    public static final int ERROR_REQUEST_TIME_OUT = android.telecom.QueryLocationException.ERROR_REQUEST_TIME_OUT;
    public static final int ERROR_SERVICE_UNAVAILABLE = android.telecom.QueryLocationException.ERROR_SERVICE_UNAVAILABLE;
    public static final int ERROR_UNSPECIFIED = android.telecom.QueryLocationException.ERROR_UNSPECIFIED;

}
