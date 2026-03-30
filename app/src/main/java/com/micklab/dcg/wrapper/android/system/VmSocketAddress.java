// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class VmSocketAddress {
    private final android.system.VmSocketAddress real;

    public VmSocketAddress(android.system.VmSocketAddress real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.VmSocketAddress wrap(android.system.VmSocketAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.VmSocketAddress(real);
    }

    public android.system.VmSocketAddress unwrap() {
        return real;
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
