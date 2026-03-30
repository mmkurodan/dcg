// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CreateCredentialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CreateCredentialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CreateCredentialRequest wrap(android.service.credentials.CreateCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CreateCredentialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.CreateCredentialRequest getReal() {
        return (android.service.credentials.CreateCredentialRequest) real;
    }

    public android.service.credentials.CreateCredentialRequest unwrap() {
        return getReal();
    }

    public CreateCredentialRequest(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.service.credentials.CreateCredentialRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.CreateCredentialRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(((android.service.credentials.CreateCredentialRequest) real).getCallingAppInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.credentials.CreateCredentialRequest) real).getData());
    }

    public java.lang.String getType() {
        return ((android.service.credentials.CreateCredentialRequest) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.CreateCredentialRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
