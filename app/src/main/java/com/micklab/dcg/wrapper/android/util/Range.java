// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Range {
    private final android.util.Range real;

    public Range(android.util.Range real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Range wrap(android.util.Range real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Range(real);
    }

    public android.util.Range unwrap() {
        return real;
    }

    public Range(java.lang.Comparable arg0, java.lang.Comparable arg1) {
        this(new android.util.Range(arg0, arg1));
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
