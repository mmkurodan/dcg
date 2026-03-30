// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class PrepareGetCredentialResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrepareGetCredentialResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse wrap(android.credentials.PrepareGetCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.PrepareGetCredentialResponse getReal() {
        return (android.credentials.PrepareGetCredentialResponse) real;
    }

    public android.credentials.PrepareGetCredentialResponse unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getPendingGetCredentialHandle() {
        return com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle.wrap(((android.credentials.PrepareGetCredentialResponse) real).getPendingGetCredentialHandle());
    }

    public boolean hasAuthenticationResults() {
        return ((android.credentials.PrepareGetCredentialResponse) real).hasAuthenticationResults();
    }

    public boolean hasCredentialResults(java.lang.String arg0) {
        return ((android.credentials.PrepareGetCredentialResponse) real).hasCredentialResults(arg0);
    }

    public boolean hasRemoteResults() {
        return ((android.credentials.PrepareGetCredentialResponse) real).hasRemoteResults();
    }

    public static final class PendingGetCredentialHandle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PendingGetCredentialHandle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle wrap(android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle(real, (__DcgwBridgeToken) null);
        }

        public android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getReal() {
            return (android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle) real;
        }

        public android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle unwrap() {
            return getReal();
        }

    }
}
