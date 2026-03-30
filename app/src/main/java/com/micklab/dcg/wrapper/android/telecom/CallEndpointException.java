// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallEndpointException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallEndpointException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallEndpointException wrap(android.telecom.CallEndpointException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallEndpointException(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallEndpointException getReal() {
        return (android.telecom.CallEndpointException) real;
    }

    public android.telecom.CallEndpointException unwrap() {
        return getReal();
    }

    public CallEndpointException(java.lang.String arg0, int arg1) {
        this(new android.telecom.CallEndpointException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.CallEndpointException) real).describeContents();
    }

    public int getCode() {
        return ((android.telecom.CallEndpointException) real).getCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.CallEndpointException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ERROR_ANOTHER_REQUEST = android.telecom.CallEndpointException.ERROR_ANOTHER_REQUEST;
    public static final int ERROR_ENDPOINT_DOES_NOT_EXIST = android.telecom.CallEndpointException.ERROR_ENDPOINT_DOES_NOT_EXIST;
    public static final int ERROR_REQUEST_TIME_OUT = android.telecom.CallEndpointException.ERROR_REQUEST_TIME_OUT;
    public static final int ERROR_UNSPECIFIED = android.telecom.CallEndpointException.ERROR_UNSPECIFIED;

}
