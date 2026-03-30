// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class TriggerEventListener {
    private final android.hardware.TriggerEventListener real;

    public TriggerEventListener(android.hardware.TriggerEventListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.TriggerEventListener wrap(android.hardware.TriggerEventListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.TriggerEventListener(real);
    }

    public android.hardware.TriggerEventListener unwrap() {
        return real;
    }

    public void onTrigger(com.micklab.dcg.wrapper.android.hardware.TriggerEvent arg0) {
        real.onTrigger(arg0 == null ? null : arg0.unwrap());
    }

}
