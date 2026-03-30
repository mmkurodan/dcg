// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Printer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Printer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Printer wrap(android.util.Printer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Printer(real, (__DcgwBridgeToken) null);
    }

    public android.util.Printer getReal() {
        return (android.util.Printer) real;
    }

    public android.util.Printer unwrap() {
        return getReal();
    }

    public void println(java.lang.String arg0) {
        ((android.util.Printer) real).println(arg0);
    }

}
