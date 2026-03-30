// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Property {
    private final android.util.Property real;

    public Property(android.util.Property real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Property wrap(android.util.Property real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Property(real);
    }

    public android.util.Property unwrap() {
        return real;
    }

    public java.lang.Object get(java.lang.Object arg0) {
        return real.get(arg0);
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public boolean isReadOnly() {
        return real.isReadOnly();
    }

    public void set(java.lang.Object arg0, java.lang.Object arg1) {
        real.set(arg0, arg1);
    }

}
