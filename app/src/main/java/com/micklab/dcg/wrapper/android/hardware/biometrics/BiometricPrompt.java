// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class BiometricPrompt {
    private final android.hardware.biometrics.BiometricPrompt real;

    public BiometricPrompt(android.hardware.biometrics.BiometricPrompt real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt wrap(android.hardware.biometrics.BiometricPrompt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt(real);
    }

    public android.hardware.biometrics.BiometricPrompt unwrap() {
        return real;
    }

    public void authenticate(com.micklab.dcg.wrapper.android.os.CancellationSignal arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback arg2) {
        real.authenticate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void authenticate(com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject arg0, com.micklab.dcg.wrapper.android.os.CancellationSignal arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback arg3) {
        real.authenticate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public int getAllowedAuthenticators() {
        return real.getAllowedAuthenticators();
    }

    public com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView getContentView() {
        return com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView.wrap(real.getContentView());
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getLogoBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getLogoBitmap());
    }

    public java.lang.String getLogoDescription() {
        return real.getLogoDescription();
    }

    public int getLogoRes() {
        return real.getLogoRes();
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return real.getNegativeButtonText();
    }

    public java.lang.CharSequence getSubtitle() {
        return real.getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public boolean isConfirmationRequired() {
        return real.isConfirmationRequired();
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
        private final android.hardware.biometrics.BiometricPrompt.AuthenticationCallback real;

        public AuthenticationCallback(android.hardware.biometrics.BiometricPrompt.AuthenticationCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback wrap(android.hardware.biometrics.BiometricPrompt.AuthenticationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationCallback(real);
        }

        public android.hardware.biometrics.BiometricPrompt.AuthenticationCallback unwrap() {
            return real;
        }

        public void onAuthenticationError(int arg0, java.lang.CharSequence arg1) {
            real.onAuthenticationError(arg0, arg1);
        }

        public void onAuthenticationFailed() {
            real.onAuthenticationFailed();
        }

        public void onAuthenticationHelp(int arg0, java.lang.CharSequence arg1) {
            real.onAuthenticationHelp(arg0, arg1);
        }

        public void onAuthenticationSucceeded(com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationResult arg0) {
            real.onAuthenticationSucceeded(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class AuthenticationResult {
        private final android.hardware.biometrics.BiometricPrompt.AuthenticationResult real;

        public AuthenticationResult(android.hardware.biometrics.BiometricPrompt.AuthenticationResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationResult wrap(android.hardware.biometrics.BiometricPrompt.AuthenticationResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.AuthenticationResult(real);
        }

        public android.hardware.biometrics.BiometricPrompt.AuthenticationResult unwrap() {
            return real;
        }

        public int getAuthenticationType() {
            return real.getAuthenticationType();
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject getCryptoObject() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject.wrap(real.getCryptoObject());
        }

    }
    public static final class Builder {
        private final android.hardware.biometrics.BiometricPrompt.Builder real;

        public Builder(android.hardware.biometrics.BiometricPrompt.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder wrap(android.hardware.biometrics.BiometricPrompt.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder(real);
        }

        public android.hardware.biometrics.BiometricPrompt.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt build() {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setAllowedAuthenticators(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setAllowedAuthenticators(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setConfirmationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setConfirmationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setContentView(com.micklab.dcg.wrapper.android.hardware.biometrics.PromptContentView arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setContentView(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setDeviceCredentialAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setDeviceCredentialAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setLogoBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setLogoBitmap(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setLogoDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setLogoDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setLogoRes(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setLogoRes(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setNegativeButton(java.lang.CharSequence arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.content.DialogInterface.OnClickListener arg2) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setNegativeButton(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.Builder.wrap(real.setTitle(arg0));
        }

    }
    public static final class CryptoObject {
        private final android.hardware.biometrics.BiometricPrompt.CryptoObject real;

        public CryptoObject(android.hardware.biometrics.BiometricPrompt.CryptoObject real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject wrap(android.hardware.biometrics.BiometricPrompt.CryptoObject real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricPrompt.CryptoObject(real);
        }

        public android.hardware.biometrics.BiometricPrompt.CryptoObject unwrap() {
            return real;
        }

        public CryptoObject(long arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0));
        }

        public CryptoObject(com.micklab.dcg.wrapper.android.security.identity.PresentationSession arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0 == null ? null : arg0.unwrap()));
        }

        public CryptoObject(com.micklab.dcg.wrapper.android.security.identity.IdentityCredential arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0 == null ? null : arg0.unwrap()));
        }

        public CryptoObject(java.security.Signature arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0));
        }

        public CryptoObject(javax.crypto.Cipher arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0));
        }

        public CryptoObject(javax.crypto.Mac arg0) {
            this(new android.hardware.biometrics.BiometricPrompt.CryptoObject(arg0));
        }

        public javax.crypto.Cipher getCipher() {
            return real.getCipher();
        }

        public com.micklab.dcg.wrapper.android.security.identity.IdentityCredential getIdentityCredential() {
            return com.micklab.dcg.wrapper.android.security.identity.IdentityCredential.wrap(real.getIdentityCredential());
        }

        public javax.crypto.Mac getMac() {
            return real.getMac();
        }

        public long getOperationHandle() {
            return real.getOperationHandle();
        }

        public com.micklab.dcg.wrapper.android.security.identity.PresentationSession getPresentationSession() {
            return com.micklab.dcg.wrapper.android.security.identity.PresentationSession.wrap(real.getPresentationSession());
        }

        public java.security.Signature getSignature() {
            return real.getSignature();
        }

    }
}
