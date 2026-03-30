// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.biometrics;

public final class BiometricManager {
    private final android.hardware.biometrics.BiometricManager real;

    public BiometricManager(android.hardware.biometrics.BiometricManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager wrap(android.hardware.biometrics.BiometricManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager(real);
    }

    public android.hardware.biometrics.BiometricManager unwrap() {
        return real;
    }

    public int canAuthenticate() {
        return real.canAuthenticate();
    }

    public int canAuthenticate(int arg0) {
        return real.canAuthenticate(arg0);
    }

    public long getLastAuthenticationTime(int arg0) {
        return real.getLastAuthenticationTime(arg0);
    }

    public com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager.Strings getStrings(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager.Strings.wrap(real.getStrings(arg0));
    }

    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = android.hardware.biometrics.BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = android.hardware.biometrics.BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = android.hardware.biometrics.BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = android.hardware.biometrics.BiometricManager.BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED;
    public static final long BIOMETRIC_NO_AUTHENTICATION = android.hardware.biometrics.BiometricManager.BIOMETRIC_NO_AUTHENTICATION;
    public static final int BIOMETRIC_SUCCESS = android.hardware.biometrics.BiometricManager.BIOMETRIC_SUCCESS;

    public static final class Authenticators {
        private final android.hardware.biometrics.BiometricManager.Authenticators real;

        public Authenticators(android.hardware.biometrics.BiometricManager.Authenticators real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager.Authenticators wrap(android.hardware.biometrics.BiometricManager.Authenticators real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager.Authenticators(real);
        }

        public android.hardware.biometrics.BiometricManager.Authenticators unwrap() {
            return real;
        }

        public static final int BIOMETRIC_STRONG = android.hardware.biometrics.BiometricManager.Authenticators.BIOMETRIC_STRONG;
        public static final int BIOMETRIC_WEAK = android.hardware.biometrics.BiometricManager.Authenticators.BIOMETRIC_WEAK;
        public static final int DEVICE_CREDENTIAL = android.hardware.biometrics.BiometricManager.Authenticators.DEVICE_CREDENTIAL;

    }
    public static final class Strings {
        private final android.hardware.biometrics.BiometricManager.Strings real;

        public Strings(android.hardware.biometrics.BiometricManager.Strings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager.Strings wrap(android.hardware.biometrics.BiometricManager.Strings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.biometrics.BiometricManager.Strings(real);
        }

        public android.hardware.biometrics.BiometricManager.Strings unwrap() {
            return real;
        }

        public java.lang.CharSequence getButtonLabel() {
            return real.getButtonLabel();
        }

        public java.lang.CharSequence getPromptMessage() {
            return real.getPromptMessage();
        }

        public java.lang.CharSequence getSettingName() {
            return real.getSettingName();
        }

    }
}
