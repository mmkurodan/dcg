// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginGetCredentialOption {
    private final android.service.credentials.BeginGetCredentialOption real;

    public BeginGetCredentialOption(android.service.credentials.BeginGetCredentialOption real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption wrap(android.service.credentials.BeginGetCredentialOption real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption(real);
    }

    public android.service.credentials.BeginGetCredentialOption unwrap() {
        return real;
    }

    public BeginGetCredentialOption(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.service.credentials.BeginGetCredentialOption(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCandidateQueryData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getCandidateQueryData());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
