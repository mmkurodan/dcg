// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class UnregisterCredentialDescriptionRequest {
    private final android.credentials.UnregisterCredentialDescriptionRequest real;

    public UnregisterCredentialDescriptionRequest(android.credentials.UnregisterCredentialDescriptionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.UnregisterCredentialDescriptionRequest wrap(android.credentials.UnregisterCredentialDescriptionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.UnregisterCredentialDescriptionRequest(real);
    }

    public android.credentials.UnregisterCredentialDescriptionRequest unwrap() {
        return real;
    }

    public UnregisterCredentialDescriptionRequest(com.micklab.dcg.wrapper.android.credentials.CredentialDescription arg0) {
        this(new android.credentials.UnregisterCredentialDescriptionRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public UnregisterCredentialDescriptionRequest(java.util.Set arg0) {
        this(new android.credentials.UnregisterCredentialDescriptionRequest(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
