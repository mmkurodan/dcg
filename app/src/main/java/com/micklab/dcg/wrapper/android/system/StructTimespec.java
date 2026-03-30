// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class StructTimespec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StructTimespec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.StructTimespec wrap(android.system.StructTimespec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.StructTimespec(real, (__DcgwBridgeToken) null);
    }

    public android.system.StructTimespec getReal() {
        return (android.system.StructTimespec) real;
    }

    public android.system.StructTimespec unwrap() {
        return getReal();
    }

    public StructTimespec(long arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructTimespec#android.system.StructTimespec(long,long)");
    }

    public int compareTo(com.micklab.dcg.wrapper.android.system.StructTimespec arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructTimespec#compareTo(android.system.StructTimespec)");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructTimespec#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructTimespec#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructTimespec#toString()");
    }


}
