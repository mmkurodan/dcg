// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AuthenticatorDescription {
    private final android.accounts.AuthenticatorDescription real;

    public AuthenticatorDescription(android.accounts.AuthenticatorDescription real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription wrap(android.accounts.AuthenticatorDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription(real);
    }

    public android.accounts.AuthenticatorDescription unwrap() {
        return real;
    }

    public AuthenticatorDescription(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.accounts.AuthenticatorDescription(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public AuthenticatorDescription(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this(new android.accounts.AuthenticatorDescription(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription newKey(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.accounts.AuthenticatorDescription.wrap(android.accounts.AuthenticatorDescription.newKey(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
