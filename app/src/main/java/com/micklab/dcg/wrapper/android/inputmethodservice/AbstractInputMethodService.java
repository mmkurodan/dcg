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

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return ((android.inputmethodservice.AbstractInputMethodService) real).onCreateInputMethodInterface();
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        return ((android.inputmethodservice.AbstractInputMethodService) real).onCreateInputMethodSessionInterface();
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

}
