// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class DisconnectCause {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisconnectCause(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.DisconnectCause wrap(android.telecom.DisconnectCause real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.DisconnectCause(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.DisconnectCause getReal() {
        return (android.telecom.DisconnectCause) real;
    }

    public android.telecom.DisconnectCause unwrap() {
        return getReal();
    }

    public DisconnectCause(int arg0) {
        this(new android.telecom.DisconnectCause(arg0), (__DcgwBridgeToken) null);
    }

    public DisconnectCause(int arg0, java.lang.String arg1) {
        this(new android.telecom.DisconnectCause(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public DisconnectCause(int arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, java.lang.String arg3) {
        this(new android.telecom.DisconnectCause(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public DisconnectCause(int arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, java.lang.String arg3, int arg4) {
        this(new android.telecom.DisconnectCause(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.DisconnectCause) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.telecom.DisconnectCause) real).equals(arg0);
    }

    public int getCode() {
        return ((android.telecom.DisconnectCause) real).getCode();
    }

    public java.lang.CharSequence getDescription() {
        return ((android.telecom.DisconnectCause) real).getDescription();
    }

    public java.lang.CharSequence getLabel() {
        return ((android.telecom.DisconnectCause) real).getLabel();
    }

    public java.lang.String getReason() {
        return ((android.telecom.DisconnectCause) real).getReason();
    }

    public int getTone() {
        return ((android.telecom.DisconnectCause) real).getTone();
    }

    public int hashCode() {
        return ((android.telecom.DisconnectCause) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.telecom.DisconnectCause) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.DisconnectCause) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ANSWERED_ELSEWHERE = android.telecom.DisconnectCause.ANSWERED_ELSEWHERE;
    public static final int BUSY = android.telecom.DisconnectCause.BUSY;
    public static final int CALL_PULLED = android.telecom.DisconnectCause.CALL_PULLED;
    public static final int CANCELED = android.telecom.DisconnectCause.CANCELED;
    public static final int CONNECTION_MANAGER_NOT_SUPPORTED = android.telecom.DisconnectCause.CONNECTION_MANAGER_NOT_SUPPORTED;
    public static final int ERROR = android.telecom.DisconnectCause.ERROR;
    public static final int LOCAL = android.telecom.DisconnectCause.LOCAL;
    public static final int MISSED = android.telecom.DisconnectCause.MISSED;
    public static final int OTHER = android.telecom.DisconnectCause.OTHER;
    public static final java.lang.String REASON_EMERGENCY_CALL_PLACED = android.telecom.DisconnectCause.REASON_EMERGENCY_CALL_PLACED;
    public static final java.lang.String REASON_EMULATING_SINGLE_CALL = android.telecom.DisconnectCause.REASON_EMULATING_SINGLE_CALL;
    public static final java.lang.String REASON_IMS_ACCESS_BLOCKED = android.telecom.DisconnectCause.REASON_IMS_ACCESS_BLOCKED;
    public static final java.lang.String REASON_WIFI_ON_BUT_WFC_OFF = android.telecom.DisconnectCause.REASON_WIFI_ON_BUT_WFC_OFF;
    public static final int REJECTED = android.telecom.DisconnectCause.REJECTED;
    public static final int REMOTE = android.telecom.DisconnectCause.REMOTE;
    public static final int RESTRICTED = android.telecom.DisconnectCause.RESTRICTED;
    public static final int UNKNOWN = android.telecom.DisconnectCause.UNKNOWN;

}
