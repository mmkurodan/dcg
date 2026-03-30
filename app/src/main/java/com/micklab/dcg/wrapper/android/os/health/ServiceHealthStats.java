// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class ServiceHealthStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceHealthStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.ServiceHealthStats wrap(android.os.health.ServiceHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.ServiceHealthStats(real, (__DcgwBridgeToken) null);
    }

    public android.os.health.ServiceHealthStats getReal() {
        return (android.os.health.ServiceHealthStats) real;
    }

    public android.os.health.ServiceHealthStats unwrap() {
        return getReal();
    }


}
