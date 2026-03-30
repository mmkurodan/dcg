// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class HostApduService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HostApduService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.HostApduService wrap(android.nfc.cardemulation.HostApduService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.HostApduService(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.cardemulation.HostApduService getReal() {
        return (android.nfc.cardemulation.HostApduService) real;
    }

    public android.nfc.cardemulation.HostApduService unwrap() {
        return getReal();
    }

    public void notifyUnhandled() {
        ((android.nfc.cardemulation.HostApduService) real).notifyUnhandled();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.nfc.cardemulation.HostApduService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onDeactivated(int arg0) {
        ((android.nfc.cardemulation.HostApduService) real).onDeactivated(arg0);
    }

    public byte[] processCommandApdu(byte[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.nfc.cardemulation.HostApduService) real).processCommandApdu(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendResponseApdu(byte[] arg0) {
        ((android.nfc.cardemulation.HostApduService) real).sendResponseApdu(arg0);
    }

    public static final int DEACTIVATION_DESELECTED = android.nfc.cardemulation.HostApduService.DEACTIVATION_DESELECTED;
    public static final int DEACTIVATION_LINK_LOSS = android.nfc.cardemulation.HostApduService.DEACTIVATION_LINK_LOSS;
    public static final java.lang.String SERVICE_INTERFACE = android.nfc.cardemulation.HostApduService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.nfc.cardemulation.HostApduService.SERVICE_META_DATA;

}
