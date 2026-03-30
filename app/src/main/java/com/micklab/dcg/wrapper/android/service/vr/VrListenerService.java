// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.vr;

public final class VrListenerService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VrListenerService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.vr.VrListenerService wrap(android.service.vr.VrListenerService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.vr.VrListenerService(real, (__DcgwBridgeToken) null);
    }

    public android.service.vr.VrListenerService getReal() {
        return (android.service.vr.VrListenerService) real;
    }

    public android.service.vr.VrListenerService unwrap() {
        return getReal();
    }

    public static boolean isVrModePackageEnabled(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return android.service.vr.VrListenerService.isVrModePackageEnabled(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.vr.VrListenerService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCurrentVrActivityChanged(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.service.vr.VrListenerService) real).onCurrentVrActivityChanged(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.vr.VrListenerService.SERVICE_INTERFACE;

}
