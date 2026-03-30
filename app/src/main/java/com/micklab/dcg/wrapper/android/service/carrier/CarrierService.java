// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CarrierService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierService wrap(android.service.carrier.CarrierService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierService(real, (__DcgwBridgeToken) null);
    }

    public android.service.carrier.CarrierService getReal() {
        return (android.service.carrier.CarrierService) real;
    }

    public android.service.carrier.CarrierService unwrap() {
        return getReal();
    }

    public void notifyCarrierNetworkChange(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.service.carrier.CarrierService#notifyCarrierNetworkChange(boolean)");
    }

    public void notifyCarrierNetworkChange(int arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.service.carrier.CarrierService#notifyCarrierNetworkChange(int,boolean)");
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.carrier.CarrierService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle onLoadConfig(com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier arg0) {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.service.carrier.CarrierService) real).onLoadConfig(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle onLoadConfig(int arg0, com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier arg1) {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.service.carrier.CarrierService) real).onLoadConfig(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static final java.lang.String CARRIER_SERVICE_INTERFACE = android.service.carrier.CarrierService.CARRIER_SERVICE_INTERFACE;

}
