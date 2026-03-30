// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.fingerprint;

public final class FingerprintManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FingerprintManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager wrap(android.hardware.fingerprint.FingerprintManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.fingerprint.FingerprintManager getReal() {
        return (android.hardware.fingerprint.FingerprintManager) real;
    }

    public android.hardware.fingerprint.FingerprintManager unwrap() {
        return getReal();
    }

    public void authenticate(com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.CryptoObject arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, int arg2, com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.AuthenticationCallback arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        ((android.hardware.fingerprint.FingerprintManager) real).authenticate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public boolean hasEnrolledFingerprints() {
        return ((android.hardware.fingerprint.FingerprintManager) real).hasEnrolledFingerprints();
    }

    public boolean isHardwareDetected() {
        return ((android.hardware.fingerprint.FingerprintManager) real).isHardwareDetected();
    }

    public static final int FINGERPRINT_ACQUIRED_GOOD = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ACQUIRED_GOOD;
    public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ACQUIRED_IMAGER_DIRTY;
    public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ACQUIRED_INSUFFICIENT;
    public static final int FINGERPRINT_ACQUIRED_PARTIAL = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ACQUIRED_PARTIAL;
    public static final int FINGERPRINT_ACQUIRED_TOO_FAST = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ACQUIRED_TOO_FAST;
    public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ACQUIRED_TOO_SLOW;
    public static final int FINGERPRINT_ERROR_CANCELED = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_CANCELED;
    public static final int FINGERPRINT_ERROR_HW_NOT_PRESENT = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_HW_NOT_PRESENT;
    public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_HW_UNAVAILABLE;
    public static final int FINGERPRINT_ERROR_LOCKOUT = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_LOCKOUT;
    public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_LOCKOUT_PERMANENT;
    public static final int FINGERPRINT_ERROR_NO_FINGERPRINTS = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_NO_FINGERPRINTS;
    public static final int FINGERPRINT_ERROR_NO_SPACE = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_NO_SPACE;
    public static final int FINGERPRINT_ERROR_TIMEOUT = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_TIMEOUT;
    public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_UNABLE_TO_PROCESS;
    public static final int FINGERPRINT_ERROR_USER_CANCELED = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_USER_CANCELED;
    public static final int FINGERPRINT_ERROR_VENDOR = android.hardware.fingerprint.FingerprintManager.FINGERPRINT_ERROR_VENDOR;

    public static final class AuthenticationCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AuthenticationCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrap(android.hardware.fingerprint.FingerprintManager.AuthenticationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.AuthenticationCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.fingerprint.FingerprintManager.AuthenticationCallback getReal() {
            return (android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) real;
        }

        public android.hardware.fingerprint.FingerprintManager.AuthenticationCallback unwrap() {
            return getReal();
        }

        public void onAuthenticationError(int arg0, java.lang.CharSequence arg1) {
            ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) real).onAuthenticationError(arg0, arg1);
        }

        public void onAuthenticationFailed() {
            ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) real).onAuthenticationFailed();
        }

        public void onAuthenticationHelp(int arg0, java.lang.CharSequence arg1) {
            ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) real).onAuthenticationHelp(arg0, arg1);
        }

        public void onAuthenticationSucceeded(com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.AuthenticationResult arg0) {
            ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) real).onAuthenticationSucceeded(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class AuthenticationResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AuthenticationResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.AuthenticationResult wrap(android.hardware.fingerprint.FingerprintManager.AuthenticationResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.AuthenticationResult(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.fingerprint.FingerprintManager.AuthenticationResult getReal() {
            return (android.hardware.fingerprint.FingerprintManager.AuthenticationResult) real;
        }

        public android.hardware.fingerprint.FingerprintManager.AuthenticationResult unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject() {
            return com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.CryptoObject.wrap(((android.hardware.fingerprint.FingerprintManager.AuthenticationResult) real).getCryptoObject());
        }

    }
    public static final class CryptoObject {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CryptoObject(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.CryptoObject wrap(android.hardware.fingerprint.FingerprintManager.CryptoObject real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.fingerprint.FingerprintManager.CryptoObject(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.fingerprint.FingerprintManager.CryptoObject getReal() {
            return (android.hardware.fingerprint.FingerprintManager.CryptoObject) real;
        }

        public android.hardware.fingerprint.FingerprintManager.CryptoObject unwrap() {
            return getReal();
        }

        public CryptoObject(javax.crypto.Mac arg0) {
            this(new android.hardware.fingerprint.FingerprintManager.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public CryptoObject(javax.crypto.Cipher arg0) {
            this(new android.hardware.fingerprint.FingerprintManager.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public CryptoObject(java.security.Signature arg0) {
            this(new android.hardware.fingerprint.FingerprintManager.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public javax.crypto.Cipher getCipher() {
            return ((android.hardware.fingerprint.FingerprintManager.CryptoObject) real).getCipher();
        }

        public javax.crypto.Mac getMac() {
            return ((android.hardware.fingerprint.FingerprintManager.CryptoObject) real).getMac();
        }

        public java.security.Signature getSignature() {
            return ((android.hardware.fingerprint.FingerprintManager.CryptoObject) real).getSignature();
        }

    }
}
