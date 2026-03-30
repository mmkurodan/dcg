// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class StringBuilderPrinter {
    private final android.util.StringBuilderPrinter real;

    public StringBuilderPrinter(android.util.StringBuilderPrinter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.StringBuilderPrinter wrap(android.util.StringBuilderPrinter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.StringBuilderPrinter(real);
    }

    public android.util.StringBuilderPrinter unwrap() {
        return real;
    }

    public StringBuilderPrinter(java.lang.StringBuilder arg0) {
        this(new android.util.StringBuilderPrinter(arg0));
    }

    public void println(java.lang.String arg0) {
        real.println(arg0);
    }

}
