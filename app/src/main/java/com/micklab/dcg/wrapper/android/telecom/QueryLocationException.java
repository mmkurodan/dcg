// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class QueryLocationException {
    private final android.telecom.QueryLocationException real;

    public QueryLocationException(android.telecom.QueryLocationException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.QueryLocationException wrap(android.telecom.QueryLocationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.QueryLocationException(real);
    }

    public android.telecom.QueryLocationException unwrap() {
        return real;
    }

    public QueryLocationException(java.lang.String arg0) {
        this(new android.telecom.QueryLocationException(arg0));
    }

    public QueryLocationException(java.lang.String arg0, int arg1) {
        this(new android.telecom.QueryLocationException(arg0, arg1));
    }

    public QueryLocationException(java.lang.String arg0, int arg1, java.lang.Throwable arg2) {
        this(new android.telecom.QueryLocationException(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getCode() {
        return real.getCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ERROR_NOT_ALLOWED_FOR_NON_EMERGENCY_CONNECTIONS = android.telecom.QueryLocationException.ERROR_NOT_ALLOWED_FOR_NON_EMERGENCY_CONNECTIONS;
    public static final int ERROR_NOT_PERMITTED = android.telecom.QueryLocationException.ERROR_NOT_PERMITTED;
    public static final int ERROR_PREVIOUS_REQUEST_EXISTS = android.telecom.QueryLocationException.ERROR_PREVIOUS_REQUEST_EXISTS;
    public static final int ERROR_REQUEST_TIME_OUT = android.telecom.QueryLocationException.ERROR_REQUEST_TIME_OUT;
    public static final int ERROR_SERVICE_UNAVAILABLE = android.telecom.QueryLocationException.ERROR_SERVICE_UNAVAILABLE;
    public static final int ERROR_UNSPECIFIED = android.telecom.QueryLocationException.ERROR_UNSPECIFIED;

}
