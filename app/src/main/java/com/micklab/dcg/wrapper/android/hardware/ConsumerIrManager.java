// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class ConsumerIrManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConsumerIrManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.ConsumerIrManager wrap(android.hardware.ConsumerIrManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.ConsumerIrManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.ConsumerIrManager getReal() {
        return (android.hardware.ConsumerIrManager) real;
    }

    public android.hardware.ConsumerIrManager unwrap() {
        return getReal();
    }

    public android.hardware.ConsumerIrManager.CarrierFrequencyRange[] getCarrierFrequencies() {
        return ((android.hardware.ConsumerIrManager) real).getCarrierFrequencies();
    }

    public boolean hasIrEmitter() {
        return ((android.hardware.ConsumerIrManager) real).hasIrEmitter();
    }

    public void transmit(int arg0, int[] arg1) {
        ((android.hardware.ConsumerIrManager) real).transmit(arg0, arg1);
    }

}
