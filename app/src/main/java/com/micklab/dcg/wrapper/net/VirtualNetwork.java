package com.micklab.dcg.wrapper.net;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
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

    public static synchronized void registerServer(int port, VirtualServerSocket server) throws IOException {
        validatePort(port);
        if (server == null) {
            throw new IllegalArgumentException("server == null");
        }

        ServerRegistration existing = SERVERS.get(port);
        if (existing != null && !existing.isClosed()) {
            throw new BindException("Virtual port already in use: " + port);
        }

        SERVERS.put(port, new ServerRegistration(server));
    }

    public static synchronized void unregisterServer(int port) {
        ServerRegistration registration = SERVERS.remove(port);
        if (registration != null) {
            registration.close();
        }
    }

    public static VirtualChannel connect(String host, int port) throws IOException {
        validateHost(host);
        validatePort(port);

        ServerRegistration registration = SERVERS.get(port);
        if (registration == null || registration.isClosed()) {
            throw connectionRefused(host, port, null);
        }

        VirtualChannel.ChannelPair pair;
        try {
            pair = VirtualChannel.openPair(host, port);
        } catch (IOException exception) {
            throw connectionRefused(host, port, exception);
        }

        if (!registration.offer(pair.serverSide)) {
            closeQuietly(pair.clientSide);
            closeQuietly(pair.serverSide);
            throw connectionRefused(host, port, null);
        }

        return pair.clientSide;
    }

    public static VirtualChannel waitForConnection(int port) throws IOException {
        validatePort(port);
        ServerRegistration registration = SERVERS.get(port);
        if (registration == null || registration.isClosed()) {
            throw new SocketException("Virtual server socket is closed: " + port);
        }
        return registration.take();
    }

    private static ConnectException connectionRefused(String host, int port, IOException cause) {
        ConnectException exception = new ConnectException("Virtual connection refused: " + host + ":" + port);
        if (cause != null) {
            exception.initCause(cause);
        }
        return exception;
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
        private final VirtualServerSocket owner;
        private final BlockingQueue<ConnectionEvent> pendingConnections = new LinkedBlockingQueue<>();
        private final AtomicBoolean closed = new AtomicBoolean(false);

        private ServerRegistration(VirtualServerSocket owner) {
            this.owner = owner;
        }

        private boolean isClosed() {
            return closed.get();
        }

        private boolean offer(VirtualChannel channel) {
            if (channel == null || closed.get() || owner.isClosed()) {
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
