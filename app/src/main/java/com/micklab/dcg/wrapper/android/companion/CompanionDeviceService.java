// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class CompanionDeviceService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompanionDeviceService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.CompanionDeviceService wrap(android.companion.CompanionDeviceService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionDeviceService(real, (__DcgwBridgeToken) null);
    }

    public android.companion.CompanionDeviceService getReal() {
        return (android.companion.CompanionDeviceService) real;
    }

    public android.companion.CompanionDeviceService unwrap() {
        return getReal();
    }

    public void attachSystemDataTransport(int arg0, java.io.InputStream arg1, java.io.OutputStream arg2) throws android.companion.DeviceNotAssociatedException {
        ((android.companion.CompanionDeviceService) real).attachSystemDataTransport(arg0, arg1, arg2);
    }

    public void detachSystemDataTransport(int arg0) throws android.companion.DeviceNotAssociatedException {
        ((android.companion.CompanionDeviceService) real).detachSystemDataTransport(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.companion.CompanionDeviceService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onDeviceAppeared(com.micklab.dcg.wrapper.android.companion.AssociationInfo arg0) {
        ((android.companion.CompanionDeviceService) real).onDeviceAppeared(arg0 == null ? null : arg0.getReal());
    }

    public void onDeviceAppeared(java.lang.String arg0) {
        ((android.companion.CompanionDeviceService) real).onDeviceAppeared(arg0);
    }

    public void onDeviceDisappeared(com.micklab.dcg.wrapper.android.companion.AssociationInfo arg0) {
        ((android.companion.CompanionDeviceService) real).onDeviceDisappeared(arg0 == null ? null : arg0.getReal());
    }

    public void onDeviceDisappeared(java.lang.String arg0) {
        ((android.companion.CompanionDeviceService) real).onDeviceDisappeared(arg0);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.companion.CompanionDeviceService.SERVICE_INTERFACE;

}
