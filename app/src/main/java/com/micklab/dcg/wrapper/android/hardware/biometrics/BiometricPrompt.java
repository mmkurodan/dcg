// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class BiometricPrompt {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BiometricPrompt(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt wrap(android.hardware.biometrics.BiometricPrompt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.biometrics.BiometricPrompt getReal() {
        return (android.hardware.biometrics.BiometricPrompt) real;
    }

    public android.hardware.biometrics.BiometricPrompt unwrap() {
        return getReal();
    }

    public void authenticate(com.micklab.dcg.wrapper.android.os.CancellationSignal arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback arg2) {
        ((android.hardware.biometrics.BiometricPrompt) real).authenticate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void authenticate(com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback arg3) {
        ((android.hardware.biometrics.BiometricPrompt) real).authenticate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public int getAllowedAuthenticators() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getAllowedAuthenticators();
    }

    public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView getContentView() {
        return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView.wrap(((android.hardware.biometrics.BiometricPrompt) real).getContentView());
    }

    public java.lang.CharSequence getDescription() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getLogoBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.hardware.biometrics.BiometricPrompt) real).getLogoBitmap());
    }

    public java.lang.String getLogoDescription() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getLogoDescription();
    }

    public int getLogoRes() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getLogoRes();
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getNegativeButtonText();
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.hardware.biometrics.BiometricPrompt) real).getTitle();
    }

    public boolean isConfirmationRequired() {
        return ((android.hardware.biometrics.BiometricPrompt) real).isConfirmationRequired();
    }

    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = android.hardware.biometrics.BiometricPrompt.AUTHENTICATION_RESULT_TYPE_BIOMETRIC;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = android.hardware.biometrics.BiometricPrompt.AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL;
    public static final int BIOMETRIC_ACQUIRED_GOOD = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ACQUIRED_GOOD;
    public static final int BIOMETRIC_ACQUIRED_IMAGER_DIRTY = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ACQUIRED_IMAGER_DIRTY;
    public static final int BIOMETRIC_ACQUIRED_INSUFFICIENT = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ACQUIRED_INSUFFICIENT;
    public static final int BIOMETRIC_ACQUIRED_PARTIAL = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ACQUIRED_PARTIAL;
    public static final int BIOMETRIC_ACQUIRED_TOO_FAST = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ACQUIRED_TOO_FAST;
    public static final int BIOMETRIC_ACQUIRED_TOO_SLOW = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ACQUIRED_TOO_SLOW;
    public static final int BIOMETRIC_ERROR_CANCELED = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_CANCELED;
    public static final int BIOMETRIC_ERROR_HW_NOT_PRESENT = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_HW_NOT_PRESENT;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_HW_UNAVAILABLE;
    public static final int BIOMETRIC_ERROR_LOCKOUT = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_LOCKOUT;
    public static final int BIOMETRIC_ERROR_LOCKOUT_PERMANENT = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_LOCKOUT_PERMANENT;
    public static final int BIOMETRIC_ERROR_NO_BIOMETRICS = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_NO_BIOMETRICS;
    public static final int BIOMETRIC_ERROR_NO_DEVICE_CREDENTIAL = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_NO_DEVICE_CREDENTIAL;
    public static final int BIOMETRIC_ERROR_NO_SPACE = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_NO_SPACE;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED;
    public static final int BIOMETRIC_ERROR_TIMEOUT = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_TIMEOUT;
    public static final int BIOMETRIC_ERROR_UNABLE_TO_PROCESS = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_UNABLE_TO_PROCESS;
    public static final int BIOMETRIC_ERROR_USER_CANCELED = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_USER_CANCELED;
    public static final int BIOMETRIC_ERROR_VENDOR = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_ERROR_VENDOR;
    public static final long BIOMETRIC_NO_AUTHENTICATION = android.hardware.biometrics.BiometricPrompt.BIOMETRIC_NO_AUTHENTICATION;

    public static final class AuthenticationCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AuthenticationCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback wrap(android.hardware.biometrics.BiometricPrompt.AuthenticationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.biometrics.BiometricPrompt.AuthenticationCallback getReal() {
            return (android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) real;
        }

        public android.hardware.biometrics.BiometricPrompt.AuthenticationCallback unwrap() {
            return getReal();
        }

        public void onAuthenticationError(int arg0, java.lang.CharSequence arg1) {
            ((android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) real).onAuthenticationError(arg0, arg1);
        }

        public void onAuthenticationFailed() {
            ((android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) real).onAuthenticationFailed();
        }

        public void onAuthenticationHelp(int arg0, java.lang.CharSequence arg1) {
            ((android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) real).onAuthenticationHelp(arg0, arg1);
        }

        public void onAuthenticationSucceeded(com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationResult arg0) {
            ((android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) real).onAuthenticationSucceeded(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class AuthenticationResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AuthenticationResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationResult wrap(android.hardware.biometrics.BiometricPrompt.AuthenticationResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationResult(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.biometrics.BiometricPrompt.AuthenticationResult getReal() {
            return (android.hardware.biometrics.BiometricPrompt.AuthenticationResult) real;
        }

        public android.hardware.biometrics.BiometricPrompt.AuthenticationResult unwrap() {
            return getReal();
        }

        public int getAuthenticationType() {
            return ((android.hardware.biometrics.BiometricPrompt.AuthenticationResult) real).getAuthenticationType();
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject getCryptoObject() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject.wrap(((android.hardware.biometrics.BiometricPrompt.AuthenticationResult) real).getCryptoObject());
        }

    }
    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder wrap(android.hardware.biometrics.BiometricPrompt.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.biometrics.BiometricPrompt.Builder getReal() {
            return (android.hardware.biometrics.BiometricPrompt.Builder) real;
        }

        public android.hardware.biometrics.BiometricPrompt.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt build() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setAllowedAuthenticators(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setAllowedAuthenticators(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setConfirmationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setConfirmationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setContentView(com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setContentView(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setDeviceCredentialAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setDeviceCredentialAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setLogoBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setLogoBitmap(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setLogoDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setLogoDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setLogoRes(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setLogoRes(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setNegativeButton(java.lang.CharSequence arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setNegativeButton(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(((android.hardware.biometrics.BiometricPrompt.Builder) real).setTitle(arg0));
        }

    }
    public static final class CryptoObject {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CryptoObject(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject wrap(android.hardware.biometrics.BiometricPrompt.CryptoObject real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.biometrics.BiometricPrompt.CryptoObject getReal() {
            return (android.hardware.biometrics.BiometricPrompt.CryptoObject) real;
        }

        public android.hardware.biometrics.BiometricPrompt.CryptoObject unwrap() {
            return getReal();
        }

        public CryptoObject(long arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public CryptoObject(com.micklab.dcg.wrapper.android.security.identity.PresentationSession arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public CryptoObject(com.micklab.dcg.wrapper.android.security.identity.IdentityCredential arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public CryptoObject(java.security.Signature arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public CryptoObject(javax.crypto.Cipher arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public CryptoObject(javax.crypto.Mac arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0), (__DcgwBridgeToken) null);
        }

        public javax.crypto.Cipher getCipher() {
            return ((android.hardware.biometrics.BiometricPrompt.CryptoObject) real).getCipher();
        }

        public com.micklab.dcg.wrapper.android.security.identity.IdentityCredential getIdentityCredential() {
            return com.micklab.dcg.wrapper.android.security.identity.IdentityCredential.wrap(((android.hardware.biometrics.BiometricPrompt.CryptoObject) real).getIdentityCredential());
        }

        public javax.crypto.Mac getMac() {
            return ((android.hardware.biometrics.BiometricPrompt.CryptoObject) real).getMac();
        }

        public long getOperationHandle() {
            return ((android.hardware.biometrics.BiometricPrompt.CryptoObject) real).getOperationHandle();
        }

        public com.micklab.dcg.wrapper.android.security.identity.PresentationSession getPresentationSession() {
            return com.micklab.dcg.wrapper.android.security.identity.PresentationSession.wrap(((android.hardware.biometrics.BiometricPrompt.CryptoObject) real).getPresentationSession());
        }

        public java.security.Signature getSignature() {
            return ((android.hardware.biometrics.BiometricPrompt.CryptoObject) real).getSignature();
        }

    }
}
