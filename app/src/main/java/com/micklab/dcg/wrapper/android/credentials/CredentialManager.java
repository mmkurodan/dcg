// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CredentialManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CredentialManager wrap(android.credentials.CredentialManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialManager(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.CredentialManager getReal() {
        return (android.credentials.CredentialManager) real;
    }

    public android.credentials.CredentialManager unwrap() {
        return getReal();
    }

    public boolean isEnabledCredentialProviderService(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return ((android.credentials.CredentialManager) real).isEnabledCredentialProviderService(arg0 == null ? null : arg0.getReal());
    }

    public void registerCredentialDescription(com.micklab.dcg.wrapper.android.credentials.RegisterCredentialDescriptionRequest arg0) {
        ((android.credentials.CredentialManager) real).registerCredentialDescription(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterCredentialDescription(com.micklab.dcg.wrapper.android.credentials.UnregisterCredentialDescriptionRequest arg0) {
        ((android.credentials.CredentialManager) real).unregisterCredentialDescription(arg0 == null ? null : arg0.getReal());
    }

}
