// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class SocketKeepalive {
    private final android.net.SocketKeepalive real;

    public SocketKeepalive(android.net.SocketKeepalive real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.SocketKeepalive wrap(android.net.SocketKeepalive real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.SocketKeepalive(real);
    }

    public android.net.SocketKeepalive unwrap() {
        return real;
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
        private final android.net.SocketKeepalive.Callback real;

        public Callback(android.net.SocketKeepalive.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.SocketKeepalive.Callback wrap(android.net.SocketKeepalive.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.SocketKeepalive.Callback(real);
        }

        public android.net.SocketKeepalive.Callback unwrap() {
            return real;
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
