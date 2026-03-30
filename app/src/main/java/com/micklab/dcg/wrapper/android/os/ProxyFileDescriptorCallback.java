// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ProxyFileDescriptorCallback {
    private final android.os.ProxyFileDescriptorCallback real;

    public ProxyFileDescriptorCallback(android.os.ProxyFileDescriptorCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ProxyFileDescriptorCallback wrap(android.os.ProxyFileDescriptorCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProxyFileDescriptorCallback(real);
    }

    public android.os.ProxyFileDescriptorCallback unwrap() {
        return real;
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
