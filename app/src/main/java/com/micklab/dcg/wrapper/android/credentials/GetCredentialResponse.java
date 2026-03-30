// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class GetCredentialResponse {
    private final android.credentials.GetCredentialResponse real;

    public GetCredentialResponse(android.credentials.GetCredentialResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.GetCredentialResponse wrap(android.credentials.GetCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialResponse(real);
    }

    public android.credentials.GetCredentialResponse unwrap() {
        return real;
    }

    public GetCredentialResponse(com.micklab.dcg.wrapper.android.credentials.Credential arg0) {
        this(new android.credentials.GetCredentialResponse(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.credentials.Credential getCredential() {
        return com.micklab.dcg.wrapper.android.credentials.Credential.wrap(real.getCredential());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
