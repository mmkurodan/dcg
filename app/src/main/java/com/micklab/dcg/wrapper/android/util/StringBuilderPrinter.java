// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class StringBuilderPrinter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StringBuilderPrinter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.StringBuilderPrinter wrap(android.util.StringBuilderPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.StringBuilderPrinter(real, (__DcgwBridgeToken) null);
    }

    public android.util.StringBuilderPrinter getReal() {
        return (android.util.StringBuilderPrinter) real;
    }

    public android.util.StringBuilderPrinter unwrap() {
        return getReal();
    }

    public StringBuilderPrinter(java.lang.StringBuilder arg0) {
        this(new android.util.StringBuilderPrinter(arg0), (__DcgwBridgeToken) null);
    }

    public void println(java.lang.String arg0) {
        ((android.util.StringBuilderPrinter) real).println(arg0);
    }

}
