// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class KeyguardManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyguardManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.KeyguardManager wrap(android.app.KeyguardManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.KeyguardManager getReal() {
        return (android.app.KeyguardManager) real;
    }

    public android.app.KeyguardManager unwrap() {
        return getReal();
    }

    public void addKeyguardLockedStateListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener arg1) {
        ((android.app.KeyguardManager) real).addKeyguardLockedStateListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createConfirmDeviceCredentialIntent(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.KeyguardManager) real).createConfirmDeviceCredentialIntent(arg0, arg1));
    }

    public void exitKeyguardSecurely(com.micklab.dcg.wrapper.android.app.KeyguardManager.OnKeyguardExitResult arg0) {
        ((android.app.KeyguardManager) real).exitKeyguardSecurely(arg0 == null ? null : arg0.getReal());
    }

    public boolean inKeyguardRestrictedInputMode() {
        return ((android.app.KeyguardManager) real).inKeyguardRestrictedInputMode();
    }

    public boolean isDeviceLocked() {
        return ((android.app.KeyguardManager) real).isDeviceLocked();
    }

    public boolean isDeviceSecure() {
        return ((android.app.KeyguardManager) real).isDeviceSecure();
    }

    public boolean isKeyguardLocked() {
        return ((android.app.KeyguardManager) real).isKeyguardLocked();
    }

    public boolean isKeyguardSecure() {
        return ((android.app.KeyguardManager) real).isKeyguardSecure();
    }

    public com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLock.wrap(((android.app.KeyguardManager) real).newKeyguardLock(arg0));
    }

    public void removeKeyguardLockedStateListener(com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener arg0) {
        ((android.app.KeyguardManager) real).removeKeyguardLockedStateListener(arg0 == null ? null : arg0.getReal());
    }

    public void requestDismissKeyguard(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardDismissCallback arg1) {
        ((android.app.KeyguardManager) real).requestDismissKeyguard(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class KeyguardDismissCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private KeyguardDismissCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardDismissCallback wrap(android.app.KeyguardManager.KeyguardDismissCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardDismissCallback(real, (__DcgwBridgeToken) null);
        }

        public android.app.KeyguardManager.KeyguardDismissCallback getReal() {
            return (android.app.KeyguardManager.KeyguardDismissCallback) real;
        }

        public android.app.KeyguardManager.KeyguardDismissCallback unwrap() {
            return getReal();
        }

        public void onDismissCancelled() {
            ((android.app.KeyguardManager.KeyguardDismissCallback) real).onDismissCancelled();
        }

        public void onDismissError() {
            ((android.app.KeyguardManager.KeyguardDismissCallback) real).onDismissError();
        }

        public void onDismissSucceeded() {
            ((android.app.KeyguardManager.KeyguardDismissCallback) real).onDismissSucceeded();
        }

    }
    public static final class KeyguardLock {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private KeyguardLock(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLock wrap(android.app.KeyguardManager.KeyguardLock real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLock(real, (__DcgwBridgeToken) null);
        }

        public android.app.KeyguardManager.KeyguardLock getReal() {
            return (android.app.KeyguardManager.KeyguardLock) real;
        }

        public android.app.KeyguardManager.KeyguardLock unwrap() {
            return getReal();
        }

        public void disableKeyguard() {
            ((android.app.KeyguardManager.KeyguardLock) real).disableKeyguard();
        }

        public void reenableKeyguard() {
            ((android.app.KeyguardManager.KeyguardLock) real).reenableKeyguard();
        }


    }
    public static final class KeyguardLockedStateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private KeyguardLockedStateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener wrap(android.app.KeyguardManager.KeyguardLockedStateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.KeyguardLockedStateListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.KeyguardManager.KeyguardLockedStateListener getReal() {
            return (android.app.KeyguardManager.KeyguardLockedStateListener) real;
        }

        public android.app.KeyguardManager.KeyguardLockedStateListener unwrap() {
            return getReal();
        }

        public void onKeyguardLockedStateChanged(boolean arg0) {
            ((android.app.KeyguardManager.KeyguardLockedStateListener) real).onKeyguardLockedStateChanged(arg0);
        }

    }
    public static final class OnKeyguardExitResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnKeyguardExitResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.KeyguardManager.OnKeyguardExitResult wrap(android.app.KeyguardManager.OnKeyguardExitResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.KeyguardManager.OnKeyguardExitResult(real, (__DcgwBridgeToken) null);
        }

        public android.app.KeyguardManager.OnKeyguardExitResult getReal() {
            return (android.app.KeyguardManager.OnKeyguardExitResult) real;
        }

        public android.app.KeyguardManager.OnKeyguardExitResult unwrap() {
            return getReal();
        }

        public void onKeyguardExitResult(boolean arg0) {
            ((android.app.KeyguardManager.OnKeyguardExitResult) real).onKeyguardExitResult(arg0);
        }

    }
}
