// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountAuthenticatorResponse {
    private final android.accounts.AccountAuthenticatorResponse real;

    public AccountAuthenticatorResponse(android.accounts.AccountAuthenticatorResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse wrap(android.accounts.AccountAuthenticatorResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse(real);
    }

    public android.accounts.AccountAuthenticatorResponse unwrap() {
        return real;
    }

    public AccountAuthenticatorResponse(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.accounts.AccountAuthenticatorResponse(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void onError(int arg0, java.lang.String arg1) {
        real.onError(arg0, arg1);
    }

    public void onRequestContinued() {
        real.onRequestContinued();
    }

    public void onResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onResult(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
