// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginGetCredentialOption {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BeginGetCredentialOption(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption wrap(android.service.credentials.BeginGetCredentialOption real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.BeginGetCredentialOption getReal() {
        return (android.service.credentials.BeginGetCredentialOption) real;
    }

    public android.service.credentials.BeginGetCredentialOption unwrap() {
        return getReal();
    }

    public BeginGetCredentialOption(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.service.credentials.BeginGetCredentialOption(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.BeginGetCredentialOption) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCandidateQueryData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.credentials.BeginGetCredentialOption) real).getCandidateQueryData());
    }

    public java.lang.String getId() {
        return ((android.service.credentials.BeginGetCredentialOption) real).getId();
    }

    public java.lang.String getType() {
        return ((android.service.credentials.BeginGetCredentialOption) real).getType();
    }

    public java.lang.String toString() {
        return ((android.service.credentials.BeginGetCredentialOption) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.BeginGetCredentialOption) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
