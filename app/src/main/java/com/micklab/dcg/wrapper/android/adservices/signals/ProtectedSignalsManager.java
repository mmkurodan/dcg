// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.signals;

public final class ProtectedSignalsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProtectedSignalsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.signals.ProtectedSignalsManager wrap(android.adservices.signals.ProtectedSignalsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.signals.ProtectedSignalsManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.signals.ProtectedSignalsManager getReal() {
        return (android.adservices.signals.ProtectedSignalsManager) real;
    }

    public android.adservices.signals.ProtectedSignalsManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.signals.ProtectedSignalsManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.signals.ProtectedSignalsManager.wrap(android.adservices.signals.ProtectedSignalsManager.get(arg0 == null ? null : arg0.getReal()));
    }

}
