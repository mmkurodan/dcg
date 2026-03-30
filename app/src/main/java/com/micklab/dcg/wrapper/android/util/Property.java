// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Property {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Property(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Property wrap(android.util.Property real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Property(real, (__DcgwBridgeToken) null);
    }

    public android.util.Property getReal() {
        return (android.util.Property) real;
    }

    public android.util.Property unwrap() {
        return getReal();
    }

    public java.lang.Object get(java.lang.Object arg0) {
        return ((android.util.Property) real).get(arg0);
    }

    public java.lang.String getName() {
        return ((android.util.Property) real).getName();
    }

    public boolean isReadOnly() {
        return ((android.util.Property) real).isReadOnly();
    }

    public void set(java.lang.Object arg0, java.lang.Object arg1) {
        ((android.util.Property) real).set(arg0, arg1);
    }

}
