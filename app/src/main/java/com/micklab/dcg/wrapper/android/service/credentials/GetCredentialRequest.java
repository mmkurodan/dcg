// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class GetCredentialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetCredentialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.GetCredentialRequest wrap(android.service.credentials.GetCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.GetCredentialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.GetCredentialRequest getReal() {
        return (android.service.credentials.GetCredentialRequest) real;
    }

    public android.service.credentials.GetCredentialRequest unwrap() {
        return getReal();
    }

    public GetCredentialRequest(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0, java.util.List arg1) {
        this(new android.service.credentials.GetCredentialRequest(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.GetCredentialRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(((android.service.credentials.GetCredentialRequest) real).getCallingAppInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.GetCredentialRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
