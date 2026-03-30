// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Size {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Size(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Size wrap(android.util.Size real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Size(real, (__DcgwBridgeToken) null);
    }

    public android.util.Size getReal() {
        return (android.util.Size) real;
    }

    public android.util.Size unwrap() {
        return getReal();
    }

    public Size(int arg0, int arg1) {
        this(new android.util.Size(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.Size) real).equals(arg0);
    }

    public int getHeight() {
        return ((android.util.Size) real).getHeight();
    }

    public int getWidth() {
        return ((android.util.Size) real).getWidth();
    }

    public int hashCode() {
        return ((android.util.Size) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.util.Size parseSize(java.lang.String arg0) throws java.lang.NumberFormatException {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(android.util.Size.parseSize(arg0));
    }

    public java.lang.String toString() {
        return ((android.util.Size) real).toString();
    }

}
