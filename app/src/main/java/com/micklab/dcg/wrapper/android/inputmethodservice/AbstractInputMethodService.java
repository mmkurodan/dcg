// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class AbstractInputMethodService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbstractInputMethodService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService wrap(android.inputmethodservice.AbstractInputMethodService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService(real, (__DcgwBridgeToken) null);
    }

    public android.inputmethodservice.AbstractInputMethodService getReal() {
        return (android.inputmethodservice.AbstractInputMethodService) real;
    }

    public android.inputmethodservice.AbstractInputMethodService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState getKeyDispatcherState() {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState.wrap(((android.inputmethodservice.AbstractInputMethodService) real).getKeyDispatcherState());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.inputmethodservice.AbstractInputMethodService) real).getSystemService(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.inputmethodservice.AbstractInputMethodService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.inputmethodservice.AbstractInputMethodService) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl.wrap(((android.inputmethodservice.AbstractInputMethodService) real).onCreateInputMethodInterface());
    }

    public com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        return com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl.wrap(((android.inputmethodservice.AbstractInputMethodService) real).onCreateInputMethodSessionInterface());
    }

    public void onDestroy() {
        ((android.inputmethodservice.AbstractInputMethodService) real).onDestroy();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.inputmethodservice.AbstractInputMethodService) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onLowMemory() {
        ((android.inputmethodservice.AbstractInputMethodService) real).onLowMemory();
    }

    public boolean onShouldVerifyKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.inputmethodservice.AbstractInputMethodService) real).onShouldVerifyKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.inputmethodservice.AbstractInputMethodService) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onTrimMemory(int arg0) {
        ((android.inputmethodservice.AbstractInputMethodService) real).onTrimMemory(arg0);
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.inputmethodservice.AbstractInputMethodService) real).registerComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.inputmethodservice.AbstractInputMethodService) real).unregisterComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public static final class AbstractInputMethodImpl {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AbstractInputMethodImpl(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl wrap(android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl(real, (__DcgwBridgeToken) null);
        }

        public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl getReal() {
            return (android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl) real;
        }

        public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl unwrap() {
            return getReal();
        }

        public void createSession(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethod.SessionCallback arg0) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl) real).createSession(arg0 == null ? null : arg0.getReal());
        }

        public void revokeSession(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl) real).revokeSession(arg0 == null ? null : arg0.getReal());
        }

        public void setSessionEnabled(com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession arg0, boolean arg1) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl) real).setSessionEnabled(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class AbstractInputMethodSessionImpl {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AbstractInputMethodSessionImpl(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl wrap(android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl(real, (__DcgwBridgeToken) null);
        }

        public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl getReal() {
            return (android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real;
        }

        public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl unwrap() {
            return getReal();
        }

        public void dispatchGenericMotionEvent(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).dispatchGenericMotionEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void dispatchKeyEvent(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).dispatchKeyEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void dispatchTrackballEvent(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSession.EventCallback arg2) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).dispatchTrackballEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public boolean isEnabled() {
            return ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).isEnabled();
        }

        public boolean isRevoked() {
            return ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).isRevoked();
        }

        public boolean onShouldVerifyKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            return ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).onShouldVerifyKeyEvent(arg0 == null ? null : arg0.getReal());
        }

        public void revokeSelf() {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).revokeSelf();
        }

        public void setEnabled(boolean arg0) {
            ((android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl) real).setEnabled(arg0);
        }


    }
}
