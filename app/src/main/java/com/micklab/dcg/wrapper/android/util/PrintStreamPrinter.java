// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class PrintStreamPrinter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintStreamPrinter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.PrintStreamPrinter wrap(android.util.PrintStreamPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.PrintStreamPrinter(real, (__DcgwBridgeToken) null);
    }

    public android.util.PrintStreamPrinter getReal() {
        return (android.util.PrintStreamPrinter) real;
    }

    public android.util.PrintStreamPrinter unwrap() {
        return getReal();
    }

    public PrintStreamPrinter(java.io.PrintStream arg0) {
        this(new android.util.PrintStreamPrinter(arg0), (__DcgwBridgeToken) null);
    }

    public void println(java.lang.String arg0) {
        ((android.util.PrintStreamPrinter) real).println(arg0);
    }

}
