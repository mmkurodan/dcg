// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CredentialManager {
    private final android.credentials.CredentialManager real;

    public CredentialManager(android.credentials.CredentialManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CredentialManager wrap(android.credentials.CredentialManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialManager(real);
    }

    public android.credentials.CredentialManager unwrap() {
        return real;
    }

    public boolean isEnabledCredentialProviderService(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isEnabledCredentialProviderService(arg0 == null ? null : arg0.unwrap());
    }

    public void registerCredentialDescription(com.micklab.dcg.wrapper.android.credentials.RegisterCredentialDescriptionRequest arg0) {
        real.registerCredentialDescription(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterCredentialDescription(com.micklab.dcg.wrapper.android.credentials.UnregisterCredentialDescriptionRequest arg0) {
        real.unregisterCredentialDescription(arg0 == null ? null : arg0.unwrap());
    }

}
