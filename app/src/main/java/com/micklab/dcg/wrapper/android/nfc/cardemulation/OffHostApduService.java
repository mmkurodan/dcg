// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class OffHostApduService {
    private final android.nfc.cardemulation.OffHostApduService real;

    public OffHostApduService(android.nfc.cardemulation.OffHostApduService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.OffHostApduService wrap(android.nfc.cardemulation.OffHostApduService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.OffHostApduService(real);
    }

    public android.nfc.cardemulation.OffHostApduService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public static final java.lang.String SERVICE_INTERFACE = android.nfc.cardemulation.OffHostApduService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.nfc.cardemulation.OffHostApduService.SERVICE_META_DATA;

}
