// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Dumpable {
    private final android.util.Dumpable real;

    public Dumpable(android.util.Dumpable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Dumpable wrap(android.util.Dumpable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Dumpable(real);
    }

    public android.util.Dumpable unwrap() {
        return real;
    }

    public void dump(java.io.PrintWriter arg0, java.lang.String[] arg1) {
        real.dump(arg0, arg1);
    }

    public java.lang.String getDumpableName() {
        return real.getDumpableName();
    }

}
