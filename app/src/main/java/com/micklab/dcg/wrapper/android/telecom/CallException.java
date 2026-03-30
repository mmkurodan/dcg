// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallException wrap(android.telecom.CallException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallException(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallException getReal() {
        return (android.telecom.CallException) real;
    }

    public android.telecom.CallException unwrap() {
        return getReal();
    }

    public CallException(java.lang.String arg0, int arg1) {
        this(new android.telecom.CallException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.CallException) real).describeContents();
    }

    public int getCode() {
        return ((android.telecom.CallException) real).getCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.CallException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CODE_CALL_CANNOT_BE_SET_TO_ACTIVE = android.telecom.CallException.CODE_CALL_CANNOT_BE_SET_TO_ACTIVE;
    public static final int CODE_CALL_IS_NOT_BEING_TRACKED = android.telecom.CallException.CODE_CALL_IS_NOT_BEING_TRACKED;
    public static final int CODE_CALL_NOT_PERMITTED_AT_PRESENT_TIME = android.telecom.CallException.CODE_CALL_NOT_PERMITTED_AT_PRESENT_TIME;
    public static final int CODE_CANNOT_HOLD_CURRENT_ACTIVE_CALL = android.telecom.CallException.CODE_CANNOT_HOLD_CURRENT_ACTIVE_CALL;
    public static final int CODE_ERROR_UNKNOWN = android.telecom.CallException.CODE_ERROR_UNKNOWN;
    public static final int CODE_OPERATION_TIMED_OUT = android.telecom.CallException.CODE_OPERATION_TIMED_OUT;

}
