// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Pair {
    private final android.util.Pair real;

    public Pair(android.util.Pair real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Pair wrap(android.util.Pair real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Pair(real);
    }

    public android.util.Pair unwrap() {
        return real;
    }

    public Pair(java.lang.Object arg0, java.lang.Object arg1) {
        this(new android.util.Pair(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }


}
