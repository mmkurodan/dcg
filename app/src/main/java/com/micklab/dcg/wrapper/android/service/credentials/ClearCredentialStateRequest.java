// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class ClearCredentialStateRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClearCredentialStateRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.ClearCredentialStateRequest wrap(android.service.credentials.ClearCredentialStateRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.ClearCredentialStateRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.ClearCredentialStateRequest getReal() {
        return (android.service.credentials.ClearCredentialStateRequest) real;
    }

    public android.service.credentials.ClearCredentialStateRequest unwrap() {
        return getReal();
    }

    public ClearCredentialStateRequest(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.service.credentials.ClearCredentialStateRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.ClearCredentialStateRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(((android.service.credentials.ClearCredentialStateRequest) real).getCallingAppInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.credentials.ClearCredentialStateRequest) real).getData());
    }

    public java.lang.String toString() {
        return ((android.service.credentials.ClearCredentialStateRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.ClearCredentialStateRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
