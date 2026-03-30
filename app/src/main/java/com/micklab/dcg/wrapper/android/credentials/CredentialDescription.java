// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CredentialDescription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialDescription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CredentialDescription wrap(android.credentials.CredentialDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialDescription(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.CredentialDescription getReal() {
        return (android.credentials.CredentialDescription) real;
    }

    public android.credentials.CredentialDescription unwrap() {
        return getReal();
    }

    public CredentialDescription(java.lang.String arg0, java.util.Set arg1, java.util.List arg2) {
        this(new android.credentials.CredentialDescription(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.credentials.CredentialDescription) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.credentials.CredentialDescription) real).equals(arg0);
    }

    public java.lang.String getType() {
        return ((android.credentials.CredentialDescription) real).getType();
    }

    public int hashCode() {
        return ((android.credentials.CredentialDescription) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.CredentialDescription) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
