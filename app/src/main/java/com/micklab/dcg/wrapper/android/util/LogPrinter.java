// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LogPrinter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LogPrinter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LogPrinter wrap(android.util.LogPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LogPrinter(real, (__DcgwBridgeToken) null);
    }

    public android.util.LogPrinter getReal() {
        return (android.util.LogPrinter) real;
    }

    public android.util.LogPrinter unwrap() {
        return getReal();
    }

    public LogPrinter(int arg0, java.lang.String arg1) {
        this(new android.util.LogPrinter(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public void println(java.lang.String arg0) {
        ((android.util.LogPrinter) real).println(arg0);
    }

}
