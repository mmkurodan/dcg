// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Pair {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Pair(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Pair wrap(android.util.Pair real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Pair(real, (__DcgwBridgeToken) null);
    }

    public android.util.Pair getReal() {
        return (android.util.Pair) real;
    }

    public android.util.Pair unwrap() {
        return getReal();
    }

    public Pair(java.lang.Object arg0, java.lang.Object arg1) {
        this(new android.util.Pair(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.Pair) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.util.Pair) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.util.Pair) real).toString();
    }


}
