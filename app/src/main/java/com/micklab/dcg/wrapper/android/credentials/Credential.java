// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class Credential {
    private final android.credentials.Credential real;

    public Credential(android.credentials.Credential real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.Credential wrap(android.credentials.Credential real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.Credential(real);
    }

    public android.credentials.Credential unwrap() {
        return real;
    }

    public Credential(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.credentials.Credential(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getData());
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

    public static final java.lang.String TYPE_PASSWORD_CREDENTIAL = android.credentials.Credential.TYPE_PASSWORD_CREDENTIAL;

}
