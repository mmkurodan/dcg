// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class HostNfcFService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HostNfcFService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.HostNfcFService wrap(android.nfc.cardemulation.HostNfcFService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.HostNfcFService(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.cardemulation.HostNfcFService getReal() {
        return (android.nfc.cardemulation.HostNfcFService) real;
    }

    public android.nfc.cardemulation.HostNfcFService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.nfc.cardemulation.HostNfcFService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onDeactivated(int arg0) {
        ((android.nfc.cardemulation.HostNfcFService) real).onDeactivated(arg0);
    }

    public byte[] processNfcFPacket(byte[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.nfc.cardemulation.HostNfcFService) real).processNfcFPacket(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendResponsePacket(byte[] arg0) {
        ((android.nfc.cardemulation.HostNfcFService) real).sendResponsePacket(arg0);
    }

    public static final int DEACTIVATION_LINK_LOSS = android.nfc.cardemulation.HostNfcFService.DEACTIVATION_LINK_LOSS;
    public static final java.lang.String SERVICE_INTERFACE = android.nfc.cardemulation.HostNfcFService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.nfc.cardemulation.HostNfcFService.SERVICE_META_DATA;

}
