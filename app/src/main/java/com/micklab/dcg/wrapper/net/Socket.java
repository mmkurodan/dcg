package com.micklab.dcg.wrapper.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Socket {
    private final String host;
    private final int port;
    private final VirtualChannel channel;
    private final AtomicBoolean closed = new AtomicBoolean(false);

    public Socket(String host, int port) throws IOException {
        this(host, port, VirtualNetwork.connect(host, port));
    }

    Socket(java.net.Socket socket) throws IOException {
        this(resolveHost(socket), resolvePort(socket), VirtualChannel.fromSocket(socket));
    }

    Socket(String host, int port, VirtualChannel channel) {
        if (host == null || host.trim().isEmpty()) {
            throw new IllegalArgumentException("host == null");
        }
        if (channel == null) {
            throw new IllegalArgumentException("channel == null");
        }
        this.host = host;
        this.port = port;
        this.channel = channel;
    }

    public InputStream getInputStream() throws IOException {
        ensureOpen();
        return channel.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        ensureOpen();
        return channel.getOutputStream();
    }

    public void close() throws IOException {
        if (!closed.compareAndSet(false, true)) {
            return;
        }
        channel.close();
    }

    String getHost() {
        return host;
    }

    int getPort() {
        return port;
    }

    private void ensureOpen() throws SocketException {
        if (closed.get()) {
            throw new SocketException("Socket is closed.");
        }
    }

    private static String resolveHost(java.net.Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInetAddress() != null) {
            String address = socket.getInetAddress().getHostAddress();
            if (address != null && !address.trim().isEmpty()) {
                return address;
            }
        }
        return "localhost";
    }

    private static int resolvePort(java.net.Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        return socket.getPort();
    }
}
