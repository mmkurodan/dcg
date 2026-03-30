// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginCreateCredentialRequest {
    private final android.service.credentials.BeginCreateCredentialRequest real;

    public BeginCreateCredentialRequest(android.service.credentials.BeginCreateCredentialRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialRequest wrap(android.service.credentials.BeginCreateCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialRequest(real);
    }

    public android.service.credentials.BeginCreateCredentialRequest unwrap() {
        return real;
    }

    public BeginCreateCredentialRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.service.credentials.BeginCreateCredentialRequest(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public BeginCreateCredentialRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg2) {
        this(new android.service.credentials.BeginCreateCredentialRequest(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
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
