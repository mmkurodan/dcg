// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class SocketKeepalive {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SocketKeepalive(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.SocketKeepalive wrap(android.net.SocketKeepalive real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.SocketKeepalive(real, (__DcgwBridgeToken) null);
    }

    public android.net.SocketKeepalive getReal() {
        return (android.net.SocketKeepalive) real;
    }

    public android.net.SocketKeepalive unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive#close()");
    }

    public void start(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive#start(int)");
    }

    public void stop() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive#stop()");
    }


    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.SocketKeepalive.Callback wrap(android.net.SocketKeepalive.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.SocketKeepalive.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.net.SocketKeepalive.Callback getReal() {
            return (android.net.SocketKeepalive.Callback) real;
        }

        public android.net.SocketKeepalive.Callback unwrap() {
            return getReal();
        }

        public Callback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive$Callback#android.net.SocketKeepalive$Callback()");
        }

        public void onDataReceived() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive$Callback#onDataReceived()");
        }

        public void onError(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive$Callback#onError(int)");
        }

        public void onStarted() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive$Callback#onStarted()");
        }

        public void onStopped() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SocketKeepalive$Callback#onStopped()");
        }

    }
}
