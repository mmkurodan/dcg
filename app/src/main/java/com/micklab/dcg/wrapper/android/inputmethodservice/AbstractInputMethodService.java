// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class AbstractInputMethodService {
    private final android.inputmethodservice.AbstractInputMethodService real;

    public AbstractInputMethodService(android.inputmethodservice.AbstractInputMethodService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService wrap(android.inputmethodservice.AbstractInputMethodService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.AbstractInputMethodService(real);
    }

    public android.inputmethodservice.AbstractInputMethodService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState getKeyDispatcherState() {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState.wrap(real.getKeyDispatcherState());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return real.getSystemService(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return real.onCreateInputMethodInterface();
    }

    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        return real.onCreateInputMethodSessionInterface();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.registerComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.unregisterComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

}
