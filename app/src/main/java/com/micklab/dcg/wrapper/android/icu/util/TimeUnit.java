// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class TimeUnit {
    private final android.icu.util.TimeUnit real;

    public TimeUnit(android.icu.util.TimeUnit real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeUnit wrap(android.icu.util.TimeUnit real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.TimeUnit(real);
    }

    public android.icu.util.TimeUnit unwrap() {
        return real;
    }

    public static android.icu.util.TimeUnit[] values() {
        return android.icu.util.TimeUnit.values();
    }

}
