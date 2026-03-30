// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class TimeUnit {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeUnit(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeUnit wrap(android.icu.util.TimeUnit real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.TimeUnit(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.TimeUnit getReal() {
        return (android.icu.util.TimeUnit) real;
    }

    public android.icu.util.TimeUnit unwrap() {
        return getReal();
    }

    public static android.icu.util.TimeUnit[] values() {
        return android.icu.util.TimeUnit.values();
    }

}
