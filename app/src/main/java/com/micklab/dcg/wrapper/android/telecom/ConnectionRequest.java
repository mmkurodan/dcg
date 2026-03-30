// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class ConnectionRequest {
    private final android.telecom.ConnectionRequest real;

    public ConnectionRequest(android.telecom.ConnectionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.ConnectionRequest wrap(android.telecom.ConnectionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.ConnectionRequest(real);
    }

    public android.telecom.ConnectionRequest unwrap() {
        return real;
    }

    public ConnectionRequest(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.telecom.ConnectionRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public ConnectionRequest(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, int arg3) {
        this(new android.telecom.ConnectionRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(real.getAccountHandle());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getAddress());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream getRttTextStream() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream.wrap(real.getRttTextStream());
    }

    public int getVideoState() {
        return real.getVideoState();
    }

    public boolean isAdhocConferenceCall() {
        return real.isAdhocConferenceCall();
    }

    public boolean isRequestingRtt() {
        return real.isRequestingRtt();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
