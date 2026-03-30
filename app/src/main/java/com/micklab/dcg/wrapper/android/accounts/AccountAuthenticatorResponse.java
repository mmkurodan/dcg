// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountAuthenticatorResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccountAuthenticatorResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse wrap(android.accounts.AccountAuthenticatorResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AccountAuthenticatorResponse getReal() {
        return (android.accounts.AccountAuthenticatorResponse) real;
    }

    public android.accounts.AccountAuthenticatorResponse unwrap() {
        return getReal();
    }

    public AccountAuthenticatorResponse(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.accounts.AccountAuthenticatorResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.accounts.AccountAuthenticatorResponse) real).describeContents();
    }

    public void onError(int arg0, java.lang.String arg1) {
        ((android.accounts.AccountAuthenticatorResponse) real).onError(arg0, arg1);
    }

    public void onRequestContinued() {
        ((android.accounts.AccountAuthenticatorResponse) real).onRequestContinued();
    }

    public void onResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.accounts.AccountAuthenticatorResponse) real).onResult(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.accounts.AccountAuthenticatorResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
