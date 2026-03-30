// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class KeyguardManager {
    private final android.app.KeyguardManager real;

    public KeyguardManager(android.app.KeyguardManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.KeyguardManager wrap(android.app.KeyguardManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager(real);
    }

    public android.app.KeyguardManager unwrap() {
        return real;
    }

    public void addKeyguardLockedStateListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener arg1) {
        real.addKeyguardLockedStateListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createConfirmDeviceCredentialIntent(arg0, arg1));
    }

    public void exitKeyguardSecurely(com.micklab.dcg.wrapper.android.app.KeyguardManager.OnKeyguardExitResult arg0) {
        real.exitKeyguardSecurely(arg0 == null ? null : arg0.unwrap());
    }

    public boolean inKeyguardRestrictedInputMode() {
        return real.inKeyguardRestrictedInputMode();
    }

    public boolean isDeviceLocked() {
        return real.isDeviceLocked();
    }

    public boolean isDeviceSecure() {
        return real.isDeviceSecure();
    }

    public boolean isKeyguardLocked() {
        return real.isKeyguardLocked();
    }

    public boolean isKeyguardSecure() {
        return real.isKeyguardSecure();
    }

    public android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String arg0) {
        return real.newKeyguardLock(arg0);
    }

    public void removeKeyguardLockedStateListener(com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener arg0) {
        real.removeKeyguardLockedStateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void requestDismissKeyguard(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardDismissCallback arg1) {
        real.requestDismissKeyguard(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class KeyguardDismissCallback {
        private final android.app.KeyguardManager.KeyguardDismissCallback real;

        public KeyguardDismissCallback(android.app.KeyguardManager.KeyguardDismissCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardDismissCallback wrap(android.app.KeyguardManager.KeyguardDismissCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardDismissCallback(real);
        }

        public android.app.KeyguardManager.KeyguardDismissCallback unwrap() {
            return real;
        }

        public void onDismissCancelled() {
            real.onDismissCancelled();
        }

        public void onDismissError() {
            real.onDismissError();
        }

        public void onDismissSucceeded() {
            real.onDismissSucceeded();
        }

    }
    public static final class KeyguardLockedStateListener {
        private final android.app.KeyguardManager.KeyguardLockedStateListener real;

        public KeyguardLockedStateListener(android.app.KeyguardManager.KeyguardLockedStateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener wrap(android.app.KeyguardManager.KeyguardLockedStateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener(real);
        }

        public android.app.KeyguardManager.KeyguardLockedStateListener unwrap() {
            return real;
        }

        public void onKeyguardLockedStateChanged(boolean arg0) {
            real.onKeyguardLockedStateChanged(arg0);
        }

    }
    public static final class OnKeyguardExitResult {
        private final android.app.KeyguardManager.OnKeyguardExitResult real;

        public OnKeyguardExitResult(android.app.KeyguardManager.OnKeyguardExitResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.OnKeyguardExitResult wrap(android.app.KeyguardManager.OnKeyguardExitResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.OnKeyguardExitResult(real);
        }

        public android.app.KeyguardManager.OnKeyguardExitResult unwrap() {
            return real;
        }

        public void onKeyguardExitResult(boolean arg0) {
            real.onKeyguardExitResult(arg0);
        }

    }
}
