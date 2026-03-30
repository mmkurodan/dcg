// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls;

public final class ControlsProviderService {
    private final android.service.controls.ControlsProviderService real;

    public ControlsProviderService(android.service.controls.ControlsProviderService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.ControlsProviderService wrap(android.service.controls.ControlsProviderService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.ControlsProviderService(real);
    }

    public android.service.controls.ControlsProviderService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public static void requestAddControl(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.service.controls.Control arg2) {
        android.service.controls.ControlsProviderService.requestAddControl(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final int CONTROLS_SURFACE_ACTIVITY_PANEL = android.service.controls.ControlsProviderService.CONTROLS_SURFACE_ACTIVITY_PANEL;
    public static final int CONTROLS_SURFACE_DREAM = android.service.controls.ControlsProviderService.CONTROLS_SURFACE_DREAM;
    public static final java.lang.String EXTRA_CONTROLS_SURFACE = android.service.controls.ControlsProviderService.EXTRA_CONTROLS_SURFACE;
    public static final java.lang.String EXTRA_LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS = android.service.controls.ControlsProviderService.EXTRA_LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS;
    public static final java.lang.String META_DATA_PANEL_ACTIVITY = android.service.controls.ControlsProviderService.META_DATA_PANEL_ACTIVITY;
    public static final java.lang.String SERVICE_CONTROLS = android.service.controls.ControlsProviderService.SERVICE_CONTROLS;
    public static final java.lang.String TAG = android.service.controls.ControlsProviderService.TAG;

}
