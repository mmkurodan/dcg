// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class VmSocketAddress {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VmSocketAddress(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.VmSocketAddress wrap(android.system.VmSocketAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.VmSocketAddress(real, (__DcgwBridgeToken) null);
    }

    public android.system.VmSocketAddress getReal() {
        return (android.system.VmSocketAddress) real;
    }

    public android.system.VmSocketAddress unwrap() {
        return getReal();
    }

    public VmSocketAddress(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.VmSocketAddress#android.system.VmSocketAddress(int,int)");
    }

    public int getSvmCid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.VmSocketAddress#getSvmCid()");
    }

    public int getSvmPort() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.VmSocketAddress#getSvmPort()");
    }

}
