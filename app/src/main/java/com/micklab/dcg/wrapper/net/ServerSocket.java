package com.micklab.dcg.wrapper.net;

import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServerSocket {
    private final int port;
    private final java.net.ServerSocket delegate;
    private final AtomicBoolean closed = new AtomicBoolean(false);

    public ServerSocket(int port) throws IOException {
        this.port = port;
        this.delegate = VirtualNetwork.openServer(port);
    }

    public Socket accept() throws IOException {
        ensureOpen();
        return new Socket(delegate.accept());
    }

    public void close() throws IOException {
        if (!closed.compareAndSet(false, true)) {
            return;
        }
        delegate.close();
    }

    private void ensureOpen() throws SocketException {
        if (closed.get()) {
            throw new SocketException("ServerSocket is closed.");
        }
    }
}
