// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class PrintWriterPrinter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintWriterPrinter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.PrintWriterPrinter wrap(android.util.PrintWriterPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.PrintWriterPrinter(real, (__DcgwBridgeToken) null);
    }

    public android.util.PrintWriterPrinter getReal() {
        return (android.util.PrintWriterPrinter) real;
    }

    public android.util.PrintWriterPrinter unwrap() {
        return getReal();
    }

    public PrintWriterPrinter(java.io.PrintWriter arg0) {
        this(new android.util.PrintWriterPrinter(arg0), (__DcgwBridgeToken) null);
    }

    public void println(java.lang.String arg0) {
        ((android.util.PrintWriterPrinter) real).println(arg0);
    }

}
