// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Range {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Range(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Range wrap(android.util.Range real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Range(real, (__DcgwBridgeToken) null);
    }

    public android.util.Range getReal() {
        return (android.util.Range) real;
    }

    public android.util.Range unwrap() {
        return getReal();
    }

    public Range(java.lang.Comparable arg0, java.lang.Comparable arg1) {
        this(new android.util.Range(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.Range) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.util.Range) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.util.Range) real).toString();
    }

}
