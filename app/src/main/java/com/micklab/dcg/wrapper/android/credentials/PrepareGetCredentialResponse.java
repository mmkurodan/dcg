// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class PrepareGetCredentialResponse {
    private final android.credentials.PrepareGetCredentialResponse real;

    public PrepareGetCredentialResponse(android.credentials.PrepareGetCredentialResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse wrap(android.credentials.PrepareGetCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse(real);
    }

    public android.credentials.PrepareGetCredentialResponse unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getPendingGetCredentialHandle() {
        return com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle.wrap(real.getPendingGetCredentialHandle());
    }

    public boolean hasAuthenticationResults() {
        return real.hasAuthenticationResults();
    }

    public boolean hasCredentialResults(java.lang.String arg0) {
        return real.hasCredentialResults(arg0);
    }

    public boolean hasRemoteResults() {
        return real.hasRemoteResults();
    }

    public static final class PendingGetCredentialHandle {
        private final android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle real;

        public PendingGetCredentialHandle(android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle wrap(android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle(real);
        }

        public android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle unwrap() {
            return real;
        }

    }
}
