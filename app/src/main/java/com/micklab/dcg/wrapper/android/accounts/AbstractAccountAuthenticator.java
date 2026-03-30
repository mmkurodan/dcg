// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AbstractAccountAuthenticator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbstractAccountAuthenticator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AbstractAccountAuthenticator wrap(android.accounts.AbstractAccountAuthenticator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AbstractAccountAuthenticator(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AbstractAccountAuthenticator getReal() {
        return (android.accounts.AbstractAccountAuthenticator) real;
    }

    public android.accounts.AbstractAccountAuthenticator unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle addAccount(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String[] arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).addAccount(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle addAccountFromCredentials(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).addAccountFromCredentials(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle confirmCredentials(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).confirmCredentials(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle editProperties(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).editProperties(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle finishSession(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).finishSession(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAccountCredentialsForCloning(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).getAccountCredentialsForCloning(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAccountRemovalAllowed(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).getAccountRemovalAllowed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAuthToken(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).getAuthToken(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public java.lang.String getAuthTokenLabel(java.lang.String arg0) {
        return ((android.accounts.AbstractAccountAuthenticator) real).getAuthTokenLabel(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getIBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.accounts.AbstractAccountAuthenticator) real).getIBinder());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle hasFeatures(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String[] arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).hasFeatures(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle isCredentialsUpdateSuggested(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).isCredentialsUpdateSuggested(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle startAddAccountSession(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String[] arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).startAddAccountSession(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle startUpdateCredentialsSession(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).startUpdateCredentialsSession(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle updateCredentials(com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorResponse arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.accounts.NetworkErrorException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.accounts.AbstractAccountAuthenticator) real).updateCredentials(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static final java.lang.String KEY_CUSTOM_TOKEN_EXPIRY = android.accounts.AbstractAccountAuthenticator.KEY_CUSTOM_TOKEN_EXPIRY;

}
