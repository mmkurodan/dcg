// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class RegisterCredentialDescriptionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RegisterCredentialDescriptionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.RegisterCredentialDescriptionRequest wrap(android.credentials.RegisterCredentialDescriptionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.RegisterCredentialDescriptionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.RegisterCredentialDescriptionRequest getReal() {
        return (android.credentials.RegisterCredentialDescriptionRequest) real;
    }

    public android.credentials.RegisterCredentialDescriptionRequest unwrap() {
        return getReal();
    }

    public RegisterCredentialDescriptionRequest(com.micklab.dcg.wrapper.android.credentials.CredentialDescription arg0) {
        this(new android.credentials.RegisterCredentialDescriptionRequest(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RegisterCredentialDescriptionRequest(java.util.Set arg0) {
        this(new android.credentials.RegisterCredentialDescriptionRequest(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.RegisterCredentialDescriptionRequest) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.RegisterCredentialDescriptionRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
