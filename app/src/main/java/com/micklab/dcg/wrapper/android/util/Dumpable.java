// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Dumpable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Dumpable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Dumpable wrap(android.util.Dumpable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Dumpable(real, (__DcgwBridgeToken) null);
    }

    public android.util.Dumpable getReal() {
        return (android.util.Dumpable) real;
    }

    public android.util.Dumpable unwrap() {
        return getReal();
    }

    public void dump(java.io.PrintWriter arg0, java.lang.String[] arg1) {
        ((android.util.Dumpable) real).dump(arg0, arg1);
    }

    public java.lang.String getDumpableName() {
        return ((android.util.Dumpable) real).getDumpableName();
    }

}
