// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class Int64Ref {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Int64Ref(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.Int64Ref wrap(android.system.Int64Ref real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.Int64Ref(real, (__DcgwBridgeToken) null);
    }

    public android.system.Int64Ref getReal() {
        return (android.system.Int64Ref) real;
    }

    public android.system.Int64Ref unwrap() {
        return getReal();
    }

    public Int64Ref(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Int64Ref#android.system.Int64Ref(long)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Int64Ref#toString()");
    }


}
