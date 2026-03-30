// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class DateInterval {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateInterval(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.DateInterval wrap(android.icu.util.DateInterval real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.DateInterval(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.DateInterval getReal() {
        return (android.icu.util.DateInterval) real;
    }

    public android.icu.util.DateInterval unwrap() {
        return getReal();
    }

    public DateInterval(long arg0, long arg1) {
        this(new android.icu.util.DateInterval(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.util.DateInterval) real).equals(arg0);
    }

    public long getFromDate() {
        return ((android.icu.util.DateInterval) real).getFromDate();
    }

    public long getToDate() {
        return ((android.icu.util.DateInterval) real).getToDate();
    }

    public int hashCode() {
        return ((android.icu.util.DateInterval) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.icu.util.DateInterval) real).toString();
    }

}
