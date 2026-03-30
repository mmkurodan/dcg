// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginCreateCredentialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BeginCreateCredentialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialRequest wrap(android.service.credentials.BeginCreateCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.BeginCreateCredentialRequest getReal() {
        return (android.service.credentials.BeginCreateCredentialRequest) real;
    }

    public android.service.credentials.BeginCreateCredentialRequest unwrap() {
        return getReal();
    }

    public BeginCreateCredentialRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.service.credentials.BeginCreateCredentialRequest(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public BeginCreateCredentialRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg2) {
        this(new android.service.credentials.BeginCreateCredentialRequest(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.BeginCreateCredentialRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(((android.service.credentials.BeginCreateCredentialRequest) real).getCallingAppInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.credentials.BeginCreateCredentialRequest) real).getData());
    }

    public java.lang.String getType() {
        return ((android.service.credentials.BeginCreateCredentialRequest) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.BeginCreateCredentialRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
