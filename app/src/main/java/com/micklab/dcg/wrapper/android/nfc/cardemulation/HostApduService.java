// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class HostApduService {
    private final android.nfc.cardemulation.HostApduService real;

    public HostApduService(android.nfc.cardemulation.HostApduService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.HostApduService wrap(android.nfc.cardemulation.HostApduService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.HostApduService(real);
    }

    public android.nfc.cardemulation.HostApduService unwrap() {
        return real;
    }

    public void notifyUnhandled() {
        real.notifyUnhandled();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onDeactivated(int arg0) {
        real.onDeactivated(arg0);
    }

    public byte[] processCommandApdu(byte[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.processCommandApdu(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void sendResponseApdu(byte[] arg0) {
        real.sendResponseApdu(arg0);
    }

    public static final int DEACTIVATION_DESELECTED = android.nfc.cardemulation.HostApduService.DEACTIVATION_DESELECTED;
    public static final int DEACTIVATION_LINK_LOSS = android.nfc.cardemulation.HostApduService.DEACTIVATION_LINK_LOSS;
    public static final java.lang.String SERVICE_INTERFACE = android.nfc.cardemulation.HostApduService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.nfc.cardemulation.HostApduService.SERVICE_META_DATA;

}
