// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class PackageHealthStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PackageHealthStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.PackageHealthStats wrap(android.os.health.PackageHealthStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.PackageHealthStats(real, (__DcgwBridgeToken) null);
    }

    public android.os.health.PackageHealthStats getReal() {
        return (android.os.health.PackageHealthStats) real;
    }

    public android.os.health.PackageHealthStats unwrap() {
        return getReal();
    }


}
