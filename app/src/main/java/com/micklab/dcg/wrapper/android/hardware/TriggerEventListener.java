// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class TriggerEventListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TriggerEventListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.TriggerEventListener wrap(android.hardware.TriggerEventListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.TriggerEventListener(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.TriggerEventListener getReal() {
        return (android.hardware.TriggerEventListener) real;
    }

    public android.hardware.TriggerEventListener unwrap() {
        return getReal();
    }

    public void onTrigger(com.micklab.dcg.wrapper.android.hardware.TriggerEvent arg0) {
        ((android.hardware.TriggerEventListener) real).onTrigger(arg0 == null ? null : arg0.getReal());
    }

}
