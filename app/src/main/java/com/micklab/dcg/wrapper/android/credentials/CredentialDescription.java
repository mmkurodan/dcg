// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CredentialDescription {
    private final android.credentials.CredentialDescription real;

    public CredentialDescription(android.credentials.CredentialDescription real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CredentialDescription wrap(android.credentials.CredentialDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialDescription(real);
    }

    public android.credentials.CredentialDescription unwrap() {
        return real;
    }

    public CredentialDescription(java.lang.String arg0, java.util.Set arg1, java.util.List arg2) {
        this(new android.credentials.CredentialDescription(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
