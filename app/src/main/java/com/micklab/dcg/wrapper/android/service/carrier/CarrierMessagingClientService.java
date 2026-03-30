// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class CarrierMessagingClientService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CarrierMessagingClientService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingClientService wrap(android.service.carrier.CarrierMessagingClientService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.CarrierMessagingClientService(real, (__DcgwBridgeToken) null);
    }

    public android.service.carrier.CarrierMessagingClientService getReal() {
        return (android.service.carrier.CarrierMessagingClientService) real;
    }

    public android.service.carrier.CarrierMessagingClientService unwrap() {
        return getReal();
    }

    public CarrierMessagingClientService() {
        this(new android.service.carrier.CarrierMessagingClientService(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.carrier.CarrierMessagingClientService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

}
