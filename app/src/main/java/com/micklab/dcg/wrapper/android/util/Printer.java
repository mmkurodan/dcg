// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Printer {
    private final android.util.Printer real;

    public Printer(android.util.Printer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Printer wrap(android.util.Printer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Printer(real);
    }

    public android.util.Printer unwrap() {
        return real;
    }

    public void println(java.lang.String arg0) {
        real.println(arg0);
    }

}
