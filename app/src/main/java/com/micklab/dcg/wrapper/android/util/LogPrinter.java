// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LogPrinter {
    private final android.util.LogPrinter real;

    public LogPrinter(android.util.LogPrinter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LogPrinter wrap(android.util.LogPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LogPrinter(real);
    }

    public android.util.LogPrinter unwrap() {
        return real;
    }

    public LogPrinter(int arg0, java.lang.String arg1) {
        this(new android.util.LogPrinter(arg0, arg1));
    }

    public void println(java.lang.String arg0) {
        real.println(arg0);
    }

}
