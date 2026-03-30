// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class IInterface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IInterface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.IInterface wrap(android.os.IInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.IInterface(real, (__DcgwBridgeToken) null);
    }

    public android.os.IInterface getReal() {
        return (android.os.IInterface) real;
    }

    public android.os.IInterface unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder asBinder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IInterface#asBinder()");
    }

}
