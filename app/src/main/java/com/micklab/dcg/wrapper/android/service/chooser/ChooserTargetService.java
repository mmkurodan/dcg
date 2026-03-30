// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserTargetService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChooserTargetService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserTargetService wrap(android.service.chooser.ChooserTargetService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserTargetService(real, (__DcgwBridgeToken) null);
    }

    public android.service.chooser.ChooserTargetService getReal() {
        return (android.service.chooser.ChooserTargetService) real;
    }

    public android.service.chooser.ChooserTargetService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.chooser.ChooserTargetService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String BIND_PERMISSION = android.service.chooser.ChooserTargetService.BIND_PERMISSION;
    public static final java.lang.String META_DATA_NAME = android.service.chooser.ChooserTargetService.META_DATA_NAME;
    public static final java.lang.String SERVICE_INTERFACE = android.service.chooser.ChooserTargetService.SERVICE_INTERFACE;

}
