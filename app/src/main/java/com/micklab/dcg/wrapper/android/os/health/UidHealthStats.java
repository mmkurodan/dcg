// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class UidHealthStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UidHealthStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.UidHealthStats wrap(android.os.health.UidHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.UidHealthStats(real, (__DcgwBridgeToken) null);
    }

    public android.os.health.UidHealthStats getReal() {
        return (android.os.health.UidHealthStats) real;
    }

    public android.os.health.UidHealthStats unwrap() {
        return getReal();
    }


}
