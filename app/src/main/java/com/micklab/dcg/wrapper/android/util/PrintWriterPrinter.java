// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class PrintWriterPrinter {
    private final android.util.PrintWriterPrinter real;

    public PrintWriterPrinter(android.util.PrintWriterPrinter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.PrintWriterPrinter wrap(android.util.PrintWriterPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.PrintWriterPrinter(real);
    }

    public android.util.PrintWriterPrinter unwrap() {
        return real;
    }

    public PrintWriterPrinter(java.io.PrintWriter arg0) {
        this(new android.util.PrintWriterPrinter(arg0));
    }

    public void println(java.lang.String arg0) {
        real.println(arg0);
    }

}
