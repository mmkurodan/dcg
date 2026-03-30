// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class OffHostApduService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OffHostApduService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.OffHostApduService wrap(android.nfc.cardemulation.OffHostApduService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.OffHostApduService(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.cardemulation.OffHostApduService getReal() {
        return (android.nfc.cardemulation.OffHostApduService) real;
    }

    public android.nfc.cardemulation.OffHostApduService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.nfc.cardemulation.OffHostApduService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String SERVICE_INTERFACE = android.nfc.cardemulation.OffHostApduService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.nfc.cardemulation.OffHostApduService.SERVICE_META_DATA;

}
