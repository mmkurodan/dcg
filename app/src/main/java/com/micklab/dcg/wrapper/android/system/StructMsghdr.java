// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class StructMsghdr {
    private final android.system.StructMsghdr real;

    public StructMsghdr(android.system.StructMsghdr real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.StructMsghdr wrap(android.system.StructMsghdr real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.StructMsghdr(real);
    }

    public android.system.StructMsghdr unwrap() {
        return real;
    }

    public StructMsghdr(java.net.SocketAddress arg0, java.nio.ByteBuffer[] arg1, android.system.StructCmsghdr[] arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructMsghdr#android.system.StructMsghdr(java.net.SocketAddress,[Ljava.nio.ByteBuffer;,[Landroid.system.StructCmsghdr;,int)");
    }


}
