// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class ClearCredentialStateRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClearCredentialStateRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateRequest wrap(android.credentials.ClearCredentialStateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateRequest(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.ClearCredentialStateRequest getReal() {
        return (android.credentials.ClearCredentialStateRequest) real;
    }

    public android.credentials.ClearCredentialStateRequest unwrap() {
        return getReal();
    }

    public ClearCredentialStateRequest(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        this(new android.credentials.ClearCredentialStateRequest(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.ClearCredentialStateRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.ClearCredentialStateRequest) real).getData());
    }

    public java.lang.String toString() {
        return ((android.credentials.ClearCredentialStateRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.ClearCredentialStateRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
