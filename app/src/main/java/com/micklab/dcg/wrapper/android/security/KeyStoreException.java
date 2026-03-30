// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyStoreException {
    private final android.security.KeyStoreException real;

    public KeyStoreException(android.security.KeyStoreException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyStoreException wrap(android.security.KeyStoreException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyStoreException(real);
    }

    public android.security.KeyStoreException unwrap() {
        return real;
    }

    public int getNumericErrorCode() {
        return real.getNumericErrorCode();
    }

    public int getRetryPolicy() {
        return real.getRetryPolicy();
    }

    public boolean isSystemError() {
        return real.isSystemError();
    }

    public boolean isTransientFailure() {
        return real.isTransientFailure();
    }

    public boolean requiresUserAuthentication() {
        return real.requiresUserAuthentication();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int ERROR_ATTESTATION_CHALLENGE_TOO_LARGE = android.security.KeyStoreException.ERROR_ATTESTATION_CHALLENGE_TOO_LARGE;
    public static final int ERROR_ATTESTATION_KEYS_UNAVAILABLE = android.security.KeyStoreException.ERROR_ATTESTATION_KEYS_UNAVAILABLE;
    public static final int ERROR_ID_ATTESTATION_FAILURE = android.security.KeyStoreException.ERROR_ID_ATTESTATION_FAILURE;
    public static final int ERROR_INCORRECT_USAGE = android.security.KeyStoreException.ERROR_INCORRECT_USAGE;
    public static final int ERROR_INTERNAL_SYSTEM_ERROR = android.security.KeyStoreException.ERROR_INTERNAL_SYSTEM_ERROR;
    public static final int ERROR_KEYMINT_FAILURE = android.security.KeyStoreException.ERROR_KEYMINT_FAILURE;
    public static final int ERROR_KEYSTORE_FAILURE = android.security.KeyStoreException.ERROR_KEYSTORE_FAILURE;
    public static final int ERROR_KEYSTORE_UNINITIALIZED = android.security.KeyStoreException.ERROR_KEYSTORE_UNINITIALIZED;
    public static final int ERROR_KEY_CORRUPTED = android.security.KeyStoreException.ERROR_KEY_CORRUPTED;
    public static final int ERROR_KEY_DOES_NOT_EXIST = android.security.KeyStoreException.ERROR_KEY_DOES_NOT_EXIST;
    public static final int ERROR_KEY_NOT_TEMPORALLY_VALID = android.security.KeyStoreException.ERROR_KEY_NOT_TEMPORALLY_VALID;
    public static final int ERROR_KEY_OPERATION_EXPIRED = android.security.KeyStoreException.ERROR_KEY_OPERATION_EXPIRED;
    public static final int ERROR_OTHER = android.security.KeyStoreException.ERROR_OTHER;
    public static final int ERROR_PERMISSION_DENIED = android.security.KeyStoreException.ERROR_PERMISSION_DENIED;
    public static final int ERROR_UNIMPLEMENTED = android.security.KeyStoreException.ERROR_UNIMPLEMENTED;
    public static final int ERROR_USER_AUTHENTICATION_REQUIRED = android.security.KeyStoreException.ERROR_USER_AUTHENTICATION_REQUIRED;
    public static final int RETRY_AFTER_NEXT_REBOOT = android.security.KeyStoreException.RETRY_AFTER_NEXT_REBOOT;
    public static final int RETRY_NEVER = android.security.KeyStoreException.RETRY_NEVER;
    public static final int RETRY_WHEN_CONNECTIVITY_AVAILABLE = android.security.KeyStoreException.RETRY_WHEN_CONNECTIVITY_AVAILABLE;
    public static final int RETRY_WITH_EXPONENTIAL_BACKOFF = android.security.KeyStoreException.RETRY_WITH_EXPONENTIAL_BACKOFF;

}
