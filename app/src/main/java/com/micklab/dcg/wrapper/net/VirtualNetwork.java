package com.micklab.dcg.wrapper.net;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class VirtualNetwork {
    private static final Map<Integer, ServerRegistration> SERVERS = new ConcurrentHashMap<>();

    private VirtualNetwork() {
    }

    public static synchronized void registerServer(int port, ServerSocket serverSocket) throws IOException {
        validatePort(port);
        if (serverSocket == null) {
            throw new IllegalArgumentException("serverSocket == null");
        }

        ServerRegistration existing = SERVERS.get(port);
        if (existing != null && !existing.isClosed()) {
            throw new BindException("Virtual port already in use: " + port);
        }

        SERVERS.put(port, new ServerRegistration(serverSocket));
    }

    public static VirtualChannel connect(String host, int port) throws IOException {
        validateHost(host);
        validatePort(port);

        ServerRegistration registration = SERVERS.get(port);
        if (registration != null && !registration.isClosed()) {
            VirtualChannel.ChannelPair pair = VirtualChannel.openPair();
            if (!registration.offer(pair.serverSide)) {
                closeQuietly(pair.clientSide);
                closeQuietly(pair.serverSide);
                throw new ConnectException("Virtual connection refused: " + host + ":" + port);
            }
            return pair.clientSide;
        }

        // No virtual server registered — attempt real network connection
        try {
            java.net.Socket real = new java.net.Socket(host, port);
            return VirtualChannel.fromSocket(real);
        } catch (UnknownHostException exception) {
            throw exception;
        } catch (IOException exception) {
            ConnectException refused = new ConnectException("Connection refused: " + host + ":" + port);
            refused.initCause(exception);
            throw refused;
        }
    }

    public static java.net.ServerSocket openServer(int port) throws IOException {
        validatePort(port);

        java.net.ServerSocket serverSocket = new java.net.ServerSocket();
        serverSocket.setReuseAddress(true);
        try {
            serverSocket.bind(new InetSocketAddress(port));
            return serverSocket;
        } catch (IOException exception) {
            try {
                serverSocket.close();
            } catch (IOException closeException) {
                exception.addSuppressed(closeException);
            }
            throw exception;
        }
    }

    public static VirtualChannel waitForConnection(int port) throws IOException {
        validatePort(port);
        ServerRegistration registration = SERVERS.get(port);
        if (registration == null || registration.isClosed()) {
            throw new SocketException("Virtual server socket is closed: " + port);
        }
        return registration.take();
    }

    static synchronized void unregisterServer(int port, ServerSocket serverSocket) {
        ServerRegistration registration = SERVERS.get(port);
        if (registration == null || !registration.isOwnedBy(serverSocket)) {
            return;
        }
        SERVERS.remove(port);
        registration.close();
    }

    private static void validateHost(String host) throws UnknownHostException {
        if (host == null || host.trim().isEmpty()) {
            throw new UnknownHostException("Virtual host is empty.");
        }
    }

    private static void validatePort(int port) throws SocketException {
        if (port < 1 || port > 65535) {
            throw new SocketException("Virtual port out of range: " + port);
        }
    }

    private static void closeQuietly(VirtualChannel channel) {
        if (channel == null) {
            return;
        }
        try {
            channel.close();
        } catch (IOException ignored) {
        }
    }

    private static final class ServerRegistration {
        private final ServerSocket owner;
        private final BlockingQueue<ConnectionEvent> pendingConnections = new LinkedBlockingQueue<>();
        private final AtomicBoolean closed = new AtomicBoolean(false);

        private ServerRegistration(ServerSocket owner) {
            this.owner = owner;
        }

        private boolean isOwnedBy(ServerSocket serverSocket) {
            return owner == serverSocket;
        }

        private boolean isClosed() {
            return closed.get();
        }

        private boolean offer(VirtualChannel channel) {
            if (channel == null || closed.get()) {
                return false;
            }
            return pendingConnections.offer(ConnectionEvent.connection(channel));
        }

        private VirtualChannel take() throws IOException {
            try {
                while (true) {
                    ConnectionEvent event = pendingConnections.take();
                    if (event.isCloseSignal()) {
                        pendingConnections.offer(ConnectionEvent.closeSignal());
                        throw new SocketException("Virtual server socket is closed.");
                    }
                    return event.channel;
                }
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                SocketException interrupted = new SocketException("Interrupted while waiting for a virtual connection.");
                interrupted.initCause(exception);
                throw interrupted;
            }
        }

        private void close() {
            if (!closed.compareAndSet(false, true)) {
                return;
            }

            ConnectionEvent event;
            while ((event = pendingConnections.poll()) != null) {
                if (!event.isCloseSignal()) {
                    closeQuietly(event.channel);
                }
            }
            pendingConnections.offer(ConnectionEvent.closeSignal());
        }
    }

    private static final class ConnectionEvent {
        private static final ConnectionEvent CLOSE_SIGNAL = new ConnectionEvent(null, true);

        private final VirtualChannel channel;
        private final boolean closeSignal;

        private ConnectionEvent(VirtualChannel channel, boolean closeSignal) {
            this.channel = channel;
            this.closeSignal = closeSignal;
        }

        private static ConnectionEvent connection(VirtualChannel channel) {
            return new ConnectionEvent(channel, false);
        }

        private static ConnectionEvent closeSignal() {
            return CLOSE_SIGNAL;
        }

        private boolean isCloseSignal() {
            return closeSignal;
        }
    }
}
