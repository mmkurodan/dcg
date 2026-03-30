// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class TriggerEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TriggerEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.TriggerEvent wrap(android.hardware.TriggerEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.TriggerEvent(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.TriggerEvent getReal() {
        return (android.hardware.TriggerEvent) real;
    }

    public android.hardware.TriggerEvent unwrap() {
        return getReal();
    }


}
