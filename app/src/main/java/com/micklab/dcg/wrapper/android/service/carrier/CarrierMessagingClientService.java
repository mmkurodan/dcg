// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierMessagingClientService {
    private final android.service.carrier.CarrierMessagingClientService real;

    public CarrierMessagingClientService(android.service.carrier.CarrierMessagingClientService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingClientService wrap(android.service.carrier.CarrierMessagingClientService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingClientService(real);
    }

    public android.service.carrier.CarrierMessagingClientService unwrap() {
        return real;
    }

    public CarrierMessagingClientService() {
        this(new android.service.carrier.CarrierMessagingClientService());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

}
