// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class ConsumerIrManager {
    private final android.hardware.ConsumerIrManager real;

    public ConsumerIrManager(android.hardware.ConsumerIrManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.ConsumerIrManager wrap(android.hardware.ConsumerIrManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.ConsumerIrManager(real);
    }

    public android.hardware.ConsumerIrManager unwrap() {
        return real;
    }

    public android.hardware.ConsumerIrManager.CarrierFrequencyRange[] getCarrierFrequencies() {
        return real.getCarrierFrequencies();
    }

    public boolean hasIrEmitter() {
        return real.hasIrEmitter();
    }

    public void transmit(int arg0, int[] arg1) {
        real.transmit(arg0, arg1);
    }

}
