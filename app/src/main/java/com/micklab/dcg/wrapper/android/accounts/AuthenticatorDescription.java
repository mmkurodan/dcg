// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AuthenticatorDescription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AuthenticatorDescription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription wrap(android.accounts.AuthenticatorDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AuthenticatorDescription getReal() {
        return (android.accounts.AuthenticatorDescription) real;
    }

    public android.accounts.AuthenticatorDescription unwrap() {
        return getReal();
    }

    public AuthenticatorDescription(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.accounts.AuthenticatorDescription(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public AuthenticatorDescription(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this(new android.accounts.AuthenticatorDescription(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.accounts.AuthenticatorDescription) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.accounts.AuthenticatorDescription) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.accounts.AuthenticatorDescription) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription newKey(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription.wrap(android.accounts.AuthenticatorDescription.newKey(arg0));
    }

    public java.lang.String toString() {
        return ((android.accounts.AuthenticatorDescription) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.accounts.AuthenticatorDescription) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
