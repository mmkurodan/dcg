package com.micklab.dcg.wrapper.net;

import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class VirtualServerSocket {
    private final int port;
    private final AtomicBoolean closed = new AtomicBoolean(false);

    public VirtualServerSocket(int port) throws IOException {
        this.port = port;
        VirtualNetwork.registerServer(port, this);
    }

    public VirtualChannel accept() throws IOException {
        ensureOpen();
        return VirtualNetwork.waitForConnection(port);
    }

    public void close() {
        if (!closed.compareAndSet(false, true)) {
            return;
        }
        VirtualNetwork.unregisterServer(port);
    }

    boolean isClosed() {
        return closed.get();
    }

    private void ensureOpen() throws SocketException {
        if (closed.get()) {
            throw new SocketException("Virtual server socket is closed.");
        }
    }
}
