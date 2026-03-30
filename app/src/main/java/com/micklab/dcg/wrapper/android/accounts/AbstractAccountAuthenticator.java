// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AbstractAccountAuthenticator {
    private final android.accounts.AbstractAccountAuthenticator real;

    public AbstractAccountAuthenticator(android.accounts.AbstractAccountAuthenticator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AbstractAccountAuthenticator wrap(android.accounts.AbstractAccountAuthenticator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AbstractAccountAuthenticator(real);
    }

    public android.accounts.AbstractAccountAuthenticator unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.Bundle addAccount(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String[] arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.addAccount(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle addAccountFromCredentials(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.addAccountFromCredentials(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle confirmCredentials(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.confirmCredentials(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle editProperties(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.editProperties(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle finishSession(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.finishSession(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAccountCredentialsForCloning(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getAccountCredentialsForCloning(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAccountRemovalAllowed(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getAccountRemovalAllowed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAuthToken(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getAuthToken(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public java.lang.String getAuthTokenLabel(java.lang.String arg0) {
        return real.getAuthTokenLabel(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getIBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getIBinder());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle hasFeatures(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String[] arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.hasFeatures(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle isCredentialsUpdateSuggested(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.isCredentialsUpdateSuggested(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle startAddAccountSession(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String[] arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.startAddAccountSession(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle startUpdateCredentialsSession(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.startUpdateCredentialsSession(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle updateCredentials(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.updateCredentials(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static final java.lang.String KEY_CUSTOM_TOKEN_EXPIRY = android.accounts.AbstractAccountAuthenticator.KEY_CUSTOM_TOKEN_EXPIRY;

}
