// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class TimeFormatException {
    private final android.util.TimeFormatException real;

    public TimeFormatException(android.util.TimeFormatException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.TimeFormatException wrap(android.util.TimeFormatException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.TimeFormatException(real);
    }

    public android.util.TimeFormatException unwrap() {
        return real;
    }

}
