// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class PrintStreamPrinter {
    private final android.util.PrintStreamPrinter real;

    public PrintStreamPrinter(android.util.PrintStreamPrinter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.PrintStreamPrinter wrap(android.util.PrintStreamPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.PrintStreamPrinter(real);
    }

    public android.util.PrintStreamPrinter unwrap() {
        return real;
    }

    public PrintStreamPrinter(java.io.PrintStream arg0) {
        this(new android.util.PrintStreamPrinter(arg0));
    }

    public void println(java.lang.String arg0) {
        real.println(arg0);
    }

}
