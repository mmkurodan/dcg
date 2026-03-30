// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class ProcessHealthStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProcessHealthStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.ProcessHealthStats wrap(android.os.health.ProcessHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.ProcessHealthStats(real, (__DcgwBridgeToken) null);
    }

    public android.os.health.ProcessHealthStats getReal() {
        return (android.os.health.ProcessHealthStats) real;
    }

    public android.os.health.ProcessHealthStats unwrap() {
        return getReal();
    }


}
