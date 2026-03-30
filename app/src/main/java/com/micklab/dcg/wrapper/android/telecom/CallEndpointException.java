// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallEndpointException {
    private final android.telecom.CallEndpointException real;

    public CallEndpointException(android.telecom.CallEndpointException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallEndpointException wrap(android.telecom.CallEndpointException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallEndpointException(real);
    }

    public android.telecom.CallEndpointException unwrap() {
        return real;
    }

    public CallEndpointException(java.lang.String arg0, int arg1) {
        this(new android.telecom.CallEndpointException(arg0, arg1));
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

    public static final int ERROR_ANOTHER_REQUEST = android.telecom.CallEndpointException.ERROR_ANOTHER_REQUEST;
    public static final int ERROR_ENDPOINT_DOES_NOT_EXIST = android.telecom.CallEndpointException.ERROR_ENDPOINT_DOES_NOT_EXIST;
    public static final int ERROR_REQUEST_TIME_OUT = android.telecom.CallEndpointException.ERROR_REQUEST_TIME_OUT;
    public static final int ERROR_UNSPECIFIED = android.telecom.CallEndpointException.ERROR_UNSPECIFIED;

}
