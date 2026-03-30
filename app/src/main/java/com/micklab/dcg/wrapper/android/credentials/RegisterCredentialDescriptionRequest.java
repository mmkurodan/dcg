// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class RegisterCredentialDescriptionRequest {
    private final android.credentials.RegisterCredentialDescriptionRequest real;

    public RegisterCredentialDescriptionRequest(android.credentials.RegisterCredentialDescriptionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.RegisterCredentialDescriptionRequest wrap(android.credentials.RegisterCredentialDescriptionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.RegisterCredentialDescriptionRequest(real);
    }

    public android.credentials.RegisterCredentialDescriptionRequest unwrap() {
        return real;
    }

    public RegisterCredentialDescriptionRequest(com.micklab.dcg.wrapper.android.credentials.CredentialDescription arg0) {
        this(new android.credentials.RegisterCredentialDescriptionRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public RegisterCredentialDescriptionRequest(java.util.Set arg0) {
        this(new android.credentials.RegisterCredentialDescriptionRequest(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
