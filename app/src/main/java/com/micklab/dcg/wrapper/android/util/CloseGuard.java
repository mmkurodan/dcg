// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class CloseGuard {
    private final android.util.CloseGuard real;

    public CloseGuard(android.util.CloseGuard real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.CloseGuard wrap(android.util.CloseGuard real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.CloseGuard(real);
    }

    public android.util.CloseGuard unwrap() {
        return real;
    }

    public CloseGuard() {
        this(new android.util.CloseGuard());
    }

    public void close() {
        real.close();
    }

    public void open(java.lang.String arg0) {
        real.open(arg0);
    }

    public void warnIfOpen() {
        real.warnIfOpen();
    }

}
