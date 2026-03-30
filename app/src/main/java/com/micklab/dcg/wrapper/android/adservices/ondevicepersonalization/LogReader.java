// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class LogReader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LogReader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.LogReader wrap(android.adservices.ondevicepersonalization.LogReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.LogReader(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.LogReader getReal() {
        return (android.adservices.ondevicepersonalization.LogReader) real;
    }

    public android.adservices.ondevicepersonalization.LogReader unwrap() {
        return getReal();
    }

}
