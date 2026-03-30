// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NativeActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NativeActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NativeActivity wrap(android.app.NativeActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NativeActivity(real, (__DcgwBridgeToken) null);
    }

    public android.app.NativeActivity getReal() {
        return (android.app.NativeActivity) real;
    }

    public android.app.NativeActivity unwrap() {
        return getReal();
    }

    public NativeActivity() {
        this(new android.app.NativeActivity(), (__DcgwBridgeToken) null);
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.app.NativeActivity) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onGlobalLayout() {
        ((android.app.NativeActivity) real).onGlobalLayout();
    }

    public void onInputQueueCreated(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
        ((android.app.NativeActivity) real).onInputQueueCreated(arg0 == null ? null : arg0.getReal());
    }

    public void onInputQueueDestroyed(com.micklab.dcg.wrapper.android.view.InputQueue arg0) {
        ((android.app.NativeActivity) real).onInputQueueDestroyed(arg0 == null ? null : arg0.getReal());
    }

    public void onLowMemory() {
        ((android.app.NativeActivity) real).onLowMemory();
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.app.NativeActivity) real).onWindowFocusChanged(arg0);
    }

    public void surfaceChanged(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        ((android.app.NativeActivity) real).surfaceChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void surfaceCreated(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.app.NativeActivity) real).surfaceCreated(arg0 == null ? null : arg0.getReal());
    }

    public void surfaceDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.app.NativeActivity) real).surfaceDestroyed(arg0 == null ? null : arg0.getReal());
    }

    public void surfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.app.NativeActivity) real).surfaceRedrawNeeded(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String META_DATA_FUNC_NAME = android.app.NativeActivity.META_DATA_FUNC_NAME;
    public static final java.lang.String META_DATA_LIB_NAME = android.app.NativeActivity.META_DATA_LIB_NAME;

}
