// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CreateCredentialResponse {
    private final android.credentials.CreateCredentialResponse real;

    public CreateCredentialResponse(android.credentials.CreateCredentialResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialResponse wrap(android.credentials.CreateCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialResponse(real);
    }

    public android.credentials.CreateCredentialResponse unwrap() {
        return real;
    }

    public CreateCredentialResponse(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        this(new android.credentials.CreateCredentialResponse(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getData());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
