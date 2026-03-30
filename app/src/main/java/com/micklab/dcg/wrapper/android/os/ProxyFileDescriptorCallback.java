// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ProxyFileDescriptorCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProxyFileDescriptorCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ProxyFileDescriptorCallback wrap(android.os.ProxyFileDescriptorCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProxyFileDescriptorCallback(real, (__DcgwBridgeToken) null);
    }

    public android.os.ProxyFileDescriptorCallback getReal() {
        return (android.os.ProxyFileDescriptorCallback) real;
    }

    public android.os.ProxyFileDescriptorCallback unwrap() {
        return getReal();
    }

    public void onFsync() throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProxyFileDescriptorCallback#onFsync()");
    }

    public long onGetSize() throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProxyFileDescriptorCallback#onGetSize()");
    }

    public int onRead(long arg0, int arg1, byte[] arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProxyFileDescriptorCallback#onRead(long,int,[B)");
    }

    public void onRelease() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProxyFileDescriptorCallback#onRelease()");
    }

    public int onWrite(long arg0, int arg1, byte[] arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProxyFileDescriptorCallback#onWrite(long,int,[B)");
    }

}
