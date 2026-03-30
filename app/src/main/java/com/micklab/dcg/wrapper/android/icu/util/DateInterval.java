// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class DateInterval {
    private final android.icu.util.DateInterval real;

    public DateInterval(android.icu.util.DateInterval real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.DateInterval wrap(android.icu.util.DateInterval real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.DateInterval(real);
    }

    public android.icu.util.DateInterval unwrap() {
        return real;
    }

    public DateInterval(long arg0, long arg1) {
        this(new android.icu.util.DateInterval(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getFromDate() {
        return real.getFromDate();
    }

    public long getToDate() {
        return real.getToDate();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
