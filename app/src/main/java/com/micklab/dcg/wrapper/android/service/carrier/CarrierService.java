// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierService {
    private final android.service.carrier.CarrierService real;

    public CarrierService(android.service.carrier.CarrierService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierService wrap(android.service.carrier.CarrierService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierService(real);
    }

    public android.service.carrier.CarrierService unwrap() {
        return real;
    }

    public void notifyCarrierNetworkChange(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.service.carrier.CarrierService#notifyCarrierNetworkChange(boolean)");
    }

    public void notifyCarrierNetworkChange(int arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.service.carrier.CarrierService#notifyCarrierNetworkChange(int,boolean)");
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle onLoadConfig(com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier arg0) {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.onLoadConfig(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle onLoadConfig(int arg0, com.micklab.dcg.wrapper.android.service.carrier.CarrierIdentifier arg1) {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.onLoadConfig(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static final java.lang.String CARRIER_SERVICE_INTERFACE = android.service.carrier.CarrierService.CARRIER_SERVICE_INTERFACE;

}
