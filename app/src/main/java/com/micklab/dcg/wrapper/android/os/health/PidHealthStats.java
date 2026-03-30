// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class PidHealthStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PidHealthStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.PidHealthStats wrap(android.os.health.PidHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.PidHealthStats(real, (__DcgwBridgeToken) null);
    }

    public android.os.health.PidHealthStats getReal() {
        return (android.os.health.PidHealthStats) real;
    }

    public android.os.health.PidHealthStats unwrap() {
        return getReal();
    }


}
