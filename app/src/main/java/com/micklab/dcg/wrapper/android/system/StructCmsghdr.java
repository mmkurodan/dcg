// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class StructCmsghdr {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StructCmsghdr(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.StructCmsghdr wrap(android.system.StructCmsghdr real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.StructCmsghdr(real, (__DcgwBridgeToken) null);
    }

    public android.system.StructCmsghdr getReal() {
        return (android.system.StructCmsghdr) real;
    }

    public android.system.StructCmsghdr unwrap() {
        return getReal();
    }

    public StructCmsghdr(int arg0, int arg1, byte[] arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructCmsghdr#android.system.StructCmsghdr(int,int,[B)");
    }

    public StructCmsghdr(int arg0, int arg1, short arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.StructCmsghdr#android.system.StructCmsghdr(int,int,short)");
    }


}
