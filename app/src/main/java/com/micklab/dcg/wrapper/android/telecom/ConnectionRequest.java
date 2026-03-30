// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class ConnectionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConnectionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.ConnectionRequest wrap(android.telecom.ConnectionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.ConnectionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.ConnectionRequest getReal() {
        return (android.telecom.ConnectionRequest) real;
    }

    public android.telecom.ConnectionRequest unwrap() {
        return getReal();
    }

    public ConnectionRequest(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.telecom.ConnectionRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public ConnectionRequest(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, int arg3) {
        this(new android.telecom.ConnectionRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.ConnectionRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.ConnectionRequest) real).getAccountHandle());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.ConnectionRequest) real).getAddress());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.ConnectionRequest) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream getRttTextStream() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream.wrap(((android.telecom.ConnectionRequest) real).getRttTextStream());
    }

    public int getVideoState() {
        return ((android.telecom.ConnectionRequest) real).getVideoState();
    }

    public boolean isAdhocConferenceCall() {
        return ((android.telecom.ConnectionRequest) real).isAdhocConferenceCall();
    }

    public boolean isRequestingRtt() {
        return ((android.telecom.ConnectionRequest) real).isRequestingRtt();
    }

    public java.lang.String toString() {
        return ((android.telecom.ConnectionRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.ConnectionRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
