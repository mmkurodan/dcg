// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.vr;

public final class VrListenerService {
    private final android.service.vr.VrListenerService real;

    public VrListenerService(android.service.vr.VrListenerService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.vr.VrListenerService wrap(android.service.vr.VrListenerService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.vr.VrListenerService(real);
    }

    public android.service.vr.VrListenerService unwrap() {
        return real;
    }

    public static boolean isVrModePackageEnabled(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return android.service.vr.VrListenerService.isVrModePackageEnabled(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCurrentVrActivityChanged(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.onCurrentVrActivityChanged(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.vr.VrListenerService.SERVICE_INTERFACE;

}
