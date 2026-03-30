// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CreateCredentialRequest {
    private final android.service.credentials.CreateCredentialRequest real;

    public CreateCredentialRequest(android.service.credentials.CreateCredentialRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CreateCredentialRequest wrap(android.service.credentials.CreateCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CreateCredentialRequest(real);
    }

    public android.service.credentials.CreateCredentialRequest unwrap() {
        return real;
    }

    public CreateCredentialRequest(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.service.credentials.CreateCredentialRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(real.getCallingAppInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getData());
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
