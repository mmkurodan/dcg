// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class StructPollfd {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StructPollfd(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.StructPollfd wrap(android.system.StructPollfd real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.StructPollfd(real, (__DcgwBridgeToken) null);
    }

    public android.system.StructPollfd getReal() {
        return (android.system.StructPollfd) real;
    }

    public android.system.StructPollfd unwrap() {
        return getReal();
    }

    public StructPollfd() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructPollfd#android.system.StructPollfd()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructPollfd#toString()");
    }


}
