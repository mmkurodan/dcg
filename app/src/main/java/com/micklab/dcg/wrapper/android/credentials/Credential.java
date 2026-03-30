// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class Credential {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Credential(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.Credential wrap(android.credentials.Credential real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.Credential(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.Credential getReal() {
        return (android.credentials.Credential) real;
    }

    public android.credentials.Credential unwrap() {
        return getReal();
    }

    public Credential(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.credentials.Credential(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.Credential) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.Credential) real).getData());
    }

    public java.lang.String getType() {
        return ((android.credentials.Credential) real).getType();
    }

    public java.lang.String toString() {
        return ((android.credentials.Credential) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.Credential) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String TYPE_PASSWORD_CREDENTIAL = android.credentials.Credential.TYPE_PASSWORD_CREDENTIAL;

}
