// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class GetCredentialResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetCredentialResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.GetCredentialResponse wrap(android.credentials.GetCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialResponse(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.GetCredentialResponse getReal() {
        return (android.credentials.GetCredentialResponse) real;
    }

    public android.credentials.GetCredentialResponse unwrap() {
        return getReal();
    }

    public GetCredentialResponse(com.micklab.dcg.wrapper.android.credentials.Credential arg0) {
        this(new android.credentials.GetCredentialResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.GetCredentialResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.credentials.Credential getCredential() {
        return com.micklab.dcg.wrapper.android.credentials.Credential.wrap(((android.credentials.GetCredentialResponse) real).getCredential());
    }

    public java.lang.String toString() {
        return ((android.credentials.GetCredentialResponse) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.GetCredentialResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
