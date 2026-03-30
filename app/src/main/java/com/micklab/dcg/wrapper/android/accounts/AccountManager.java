// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccountManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountManager wrap(android.accounts.AccountManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountManager(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AccountManager getReal() {
        return (android.accounts.AccountManager) real;
    }

    public android.accounts.AccountManager unwrap() {
        return getReal();
    }

    public boolean addAccountExplicitly(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.accounts.AccountManager) real).addAccountExplicitly(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void addOnAccountsUpdatedListener(com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1, boolean arg2) {
        ((android.accounts.AccountManager) real).addOnAccountsUpdatedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void addOnAccountsUpdatedListener(com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1, boolean arg2, java.lang.String[] arg3) {
        ((android.accounts.AccountManager) real).addOnAccountsUpdatedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public java.lang.String blockingGetAuthToken(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, boolean arg2) throws android.accounts.AuthenticatorException, java.io.IOException, android.accounts.OperationCanceledException {
        return ((android.accounts.AccountManager) real).blockingGetAuthToken(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void clearPassword(com.micklab.dcg.wrapper.android.accounts.Account arg0) {
        ((android.accounts.AccountManager) real).clearPassword(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.accounts.AccountManager.wrap(android.accounts.AccountManager.get(arg0 == null ? null : arg0.getReal()));
    }

    public int getAccountVisibility(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return ((android.accounts.AccountManager) real).getAccountVisibility(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public android.accounts.Account[] getAccounts() {
        return ((android.accounts.AccountManager) real).getAccounts();
    }

    public android.accounts.Account[] getAccountsByType(java.lang.String arg0) {
        return ((android.accounts.AccountManager) real).getAccountsByType(arg0);
    }

    public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String arg0, java.lang.String arg1) {
        return ((android.accounts.AccountManager) real).getAccountsByTypeForPackage(arg0, arg1);
    }

    public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes() {
        return ((android.accounts.AccountManager) real).getAuthenticatorTypes();
    }

    public java.lang.String getPassword(com.micklab.dcg.wrapper.android.accounts.Account arg0) {
        return ((android.accounts.AccountManager) real).getPassword(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getPreviousName(com.micklab.dcg.wrapper.android.accounts.Account arg0) {
        return ((android.accounts.AccountManager) real).getPreviousName(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getUserData(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return ((android.accounts.AccountManager) real).getUserData(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void invalidateAuthToken(java.lang.String arg0, java.lang.String arg1) {
        ((android.accounts.AccountManager) real).invalidateAuthToken(arg0, arg1);
    }

    public boolean notifyAccountAuthenticated(com.micklab.dcg.wrapper.android.accounts.Account arg0) {
        return ((android.accounts.AccountManager) real).notifyAccountAuthenticated(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String peekAuthToken(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return ((android.accounts.AccountManager) real).peekAuthToken(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean removeAccountExplicitly(com.micklab.dcg.wrapper.android.accounts.Account arg0) {
        return ((android.accounts.AccountManager) real).removeAccountExplicitly(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnAccountsUpdatedListener(com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener arg0) {
        ((android.accounts.AccountManager) real).removeOnAccountsUpdatedListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean setAccountVisibility(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, int arg2) {
        return ((android.accounts.AccountManager) real).setAccountVisibility(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setAuthToken(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.accounts.AccountManager) real).setAuthToken(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setPassword(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        ((android.accounts.AccountManager) real).setPassword(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setUserData(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.accounts.AccountManager) real).setUserData(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static final java.lang.String ACTION_ACCOUNT_REMOVED = android.accounts.AccountManager.ACTION_ACCOUNT_REMOVED;
    public static final java.lang.String ACTION_AUTHENTICATOR_INTENT = android.accounts.AccountManager.ACTION_AUTHENTICATOR_INTENT;
    public static final java.lang.String AUTHENTICATOR_ATTRIBUTES_NAME = android.accounts.AccountManager.AUTHENTICATOR_ATTRIBUTES_NAME;
    public static final java.lang.String AUTHENTICATOR_META_DATA_NAME = android.accounts.AccountManager.AUTHENTICATOR_META_DATA_NAME;
    public static final int ERROR_CODE_BAD_ARGUMENTS = android.accounts.AccountManager.ERROR_CODE_BAD_ARGUMENTS;
    public static final int ERROR_CODE_BAD_AUTHENTICATION = android.accounts.AccountManager.ERROR_CODE_BAD_AUTHENTICATION;
    public static final int ERROR_CODE_BAD_REQUEST = android.accounts.AccountManager.ERROR_CODE_BAD_REQUEST;
    public static final int ERROR_CODE_CANCELED = android.accounts.AccountManager.ERROR_CODE_CANCELED;
    public static final int ERROR_CODE_INVALID_RESPONSE = android.accounts.AccountManager.ERROR_CODE_INVALID_RESPONSE;
    public static final int ERROR_CODE_REMOTE_EXCEPTION = android.accounts.AccountManager.ERROR_CODE_REMOTE_EXCEPTION;
    public static final int ERROR_CODE_UNSUPPORTED_OPERATION = android.accounts.AccountManager.ERROR_CODE_UNSUPPORTED_OPERATION;
    public static final java.lang.String KEY_ACCOUNTS = android.accounts.AccountManager.KEY_ACCOUNTS;
    public static final java.lang.String KEY_ACCOUNT_AUTHENTICATOR_RESPONSE = android.accounts.AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE;
    public static final java.lang.String KEY_ACCOUNT_MANAGER_RESPONSE = android.accounts.AccountManager.KEY_ACCOUNT_MANAGER_RESPONSE;
    public static final java.lang.String KEY_ACCOUNT_NAME = android.accounts.AccountManager.KEY_ACCOUNT_NAME;
    public static final java.lang.String KEY_ACCOUNT_SESSION_BUNDLE = android.accounts.AccountManager.KEY_ACCOUNT_SESSION_BUNDLE;
    public static final java.lang.String KEY_ACCOUNT_STATUS_TOKEN = android.accounts.AccountManager.KEY_ACCOUNT_STATUS_TOKEN;
    public static final java.lang.String KEY_ACCOUNT_TYPE = android.accounts.AccountManager.KEY_ACCOUNT_TYPE;
    public static final java.lang.String KEY_ANDROID_PACKAGE_NAME = android.accounts.AccountManager.KEY_ANDROID_PACKAGE_NAME;
    public static final java.lang.String KEY_AUTHENTICATOR_TYPES = android.accounts.AccountManager.KEY_AUTHENTICATOR_TYPES;
    public static final java.lang.String KEY_AUTHTOKEN = android.accounts.AccountManager.KEY_AUTHTOKEN;
    public static final java.lang.String KEY_AUTH_FAILED_MESSAGE = android.accounts.AccountManager.KEY_AUTH_FAILED_MESSAGE;
    public static final java.lang.String KEY_AUTH_TOKEN_LABEL = android.accounts.AccountManager.KEY_AUTH_TOKEN_LABEL;
    public static final java.lang.String KEY_BOOLEAN_RESULT = android.accounts.AccountManager.KEY_BOOLEAN_RESULT;
    public static final java.lang.String KEY_CALLER_PID = android.accounts.AccountManager.KEY_CALLER_PID;
    public static final java.lang.String KEY_CALLER_UID = android.accounts.AccountManager.KEY_CALLER_UID;
    public static final java.lang.String KEY_ERROR_CODE = android.accounts.AccountManager.KEY_ERROR_CODE;
    public static final java.lang.String KEY_ERROR_MESSAGE = android.accounts.AccountManager.KEY_ERROR_MESSAGE;
    public static final java.lang.String KEY_INTENT = android.accounts.AccountManager.KEY_INTENT;
    public static final java.lang.String KEY_LAST_AUTHENTICATED_TIME = android.accounts.AccountManager.KEY_LAST_AUTHENTICATED_TIME;
    public static final java.lang.String KEY_PASSWORD = android.accounts.AccountManager.KEY_PASSWORD;
    public static final java.lang.String KEY_USERDATA = android.accounts.AccountManager.KEY_USERDATA;
    public static final java.lang.String LOGIN_ACCOUNTS_CHANGED_ACTION = android.accounts.AccountManager.LOGIN_ACCOUNTS_CHANGED_ACTION;
    public static final java.lang.String PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE = android.accounts.AccountManager.PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE;
    public static final java.lang.String PACKAGE_NAME_KEY_LEGACY_VISIBLE = android.accounts.AccountManager.PACKAGE_NAME_KEY_LEGACY_VISIBLE;
    public static final int VISIBILITY_NOT_VISIBLE = android.accounts.AccountManager.VISIBILITY_NOT_VISIBLE;
    public static final int VISIBILITY_UNDEFINED = android.accounts.AccountManager.VISIBILITY_UNDEFINED;
    public static final int VISIBILITY_USER_MANAGED_NOT_VISIBLE = android.accounts.AccountManager.VISIBILITY_USER_MANAGED_NOT_VISIBLE;
    public static final int VISIBILITY_USER_MANAGED_VISIBLE = android.accounts.AccountManager.VISIBILITY_USER_MANAGED_VISIBLE;
    public static final int VISIBILITY_VISIBLE = android.accounts.AccountManager.VISIBILITY_VISIBLE;

}
