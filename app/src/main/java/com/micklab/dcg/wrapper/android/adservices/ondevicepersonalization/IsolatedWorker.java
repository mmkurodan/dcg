// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class IsolatedWorker {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IsolatedWorker(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedWorker wrap(android.adservices.ondevicepersonalization.IsolatedWorker real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.IsolatedWorker(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.IsolatedWorker getReal() {
        return (android.adservices.ondevicepersonalization.IsolatedWorker) real;
    }

    public android.adservices.ondevicepersonalization.IsolatedWorker unwrap() {
        return getReal();
    }

}
