// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NativeActivity {
    private final android.app.NativeActivity real;

    public NativeActivity(android.app.NativeActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NativeActivity wrap(android.app.NativeActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NativeActivity(real);
    }

    public android.app.NativeActivity unwrap() {
        return real;
    }

    public NativeActivity() {
        this(new android.app.NativeActivity());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onGlobalLayout() {
        real.onGlobalLayout();
    }

    public void onInputQueueCreated(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
        real.onInputQueueCreated(arg0 == null ? null : arg0.unwrap());
    }

    public void onInputQueueDestroyed(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
        real.onInputQueueDestroyed(arg0 == null ? null : arg0.unwrap());
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public void surfaceChanged(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        real.surfaceChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void surfaceCreated(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.surfaceCreated(arg0 == null ? null : arg0.unwrap());
    }

    public void surfaceDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.surfaceDestroyed(arg0 == null ? null : arg0.unwrap());
    }

    public void surfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.surfaceRedrawNeeded(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String META_DATA_FUNC_NAME = android.app.NativeActivity.META_DATA_FUNC_NAME;
    public static final java.lang.String META_DATA_LIB_NAME = android.app.NativeActivity.META_DATA_LIB_NAME;

}
