package com.micklab.dcg.executor.java;

import android.util.Log;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class ProxyThread extends Thread implements Closeable {
    private static final String TAG = "ProxyThread";
    private static final String BIND_HOST = "0.0.0.0";
    private static final int LISTEN_BACKLOG = 50;

    private final ExecutorBridge executorBridge;
    private final int listenPort;
    private final int virtualPort;
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final Set<BridgeSession> activeSessions =
            Collections.newSetFromMap(new ConcurrentHashMap<>());
    private final CountDownLatch started = new CountDownLatch(1);

    private volatile ServerSocket serverSocket;
    private volatile IOException startupFailure;
    private volatile IOException runtimeFailure;

    public ProxyThread(int listenPort, int virtualPort) {
        this(new ExecutorBridge(), listenPort, virtualPort);
    }

    public ProxyThread(ExecutorBridge executorBridge, int listenPort, int virtualPort) {
        super("ProxyThread-" + listenPort + "-" + virtualPort);
        if (executorBridge == null) {
            throw new IllegalArgumentException("executorBridge == null");
        }
        if (listenPort < 0 || listenPort > 65535) {
            throw new IllegalArgumentException("listenPort out of range: " + listenPort);
        }
        if (virtualPort < 1 || virtualPort > 65535) {
            throw new IllegalArgumentException("virtualPort out of range: " + virtualPort);
        }
        this.executorBridge = executorBridge;
        this.listenPort = listenPort;
        this.virtualPort = virtualPort;
        setDaemon(true);
    }

    @Override
    public void run() {
        ServerSocket listeningSocket = null;
        try {
            listeningSocket = new ServerSocket(
                    listenPort,
                    LISTEN_BACKLOG,
                    InetAddress.getByName(BIND_HOST));
            listeningSocket.setReuseAddress(true);
            serverSocket = listeningSocket;
            Log.i(
                    TAG,
                    "Opened real TCP proxy listener on "
                            + listeningSocket.getInetAddress().getHostAddress()
                            + ":"
                            + listeningSocket.getLocalPort()
                            + " for virtual port "
                            + virtualPort
                            + ".");
        } catch (IOException exception) {
            startupFailure = exception;
            started.countDown();
            return;
        }

        started.countDown();
        try {
            while (!closed.get()) {
                Socket realSocket = null;
                try {
                    realSocket = listeningSocket.accept();
                    Log.i(TAG, "Accepted real TCP connection from " + realSocket.getRemoteSocketAddress() + ".");
                    handleAcceptedSocket(realSocket);
                } catch (SocketException exception) {
                    if (closed.get() || listeningSocket.isClosed()) {
                        break;
                    }
                    recordRuntimeFailure(exception);
                    closeQuietly(realSocket);
                    Log.w(TAG, "Proxy accept failed; continuing to listen.", exception);
                } catch (IOException exception) {
                    recordRuntimeFailure(exception);
                    closeQuietly(realSocket);
                    Log.w(TAG, "Proxy bridge setup failed for an accepted socket; continuing.", exception);
                } catch (RuntimeException exception) {
                    recordRuntimeFailure(new IOException("Proxy bridge hit an unexpected runtime failure.", exception));
                    closeQuietly(realSocket);
                    Log.e(TAG, "Proxy bridge hit an unexpected runtime failure; continuing.", exception);
                }
            }
        } finally {
            closeQuietly(listeningSocket);
            closeAllSessions();
            serverSocket = null;
        }
    }

    public void awaitReady(long timeout, TimeUnit unit) throws IOException, InterruptedException {
        if (!started.await(timeout, unit)) {
            throw new IOException("Timed out while waiting for proxy startup.");
        }
        if (startupFailure != null) {
            throw startupFailure;
        }
    }

    public int getListeningPort() {
        ServerSocket current = serverSocket;
        return current == null ? -1 : current.getLocalPort();
    }

    public IOException getRuntimeFailure() {
        return runtimeFailure;
    }

    @Override
    public void close() throws IOException {
        if (!closed.compareAndSet(false, true)) {
            return;
        }
        IOException failure = null;
        failure = closeAndCollect(serverSocket, failure);
        closeAllSessions();
        if (failure != null) {
            throw failure;
        }
    }

    private void handleAcceptedSocket(Socket realSocket) {
        if (realSocket == null) {
            return;
        }

        try {
            BridgeSession session = new BridgeSession(realSocket, executorBridge.connect(virtualPort));
            activeSessions.add(session);
            session.start();
        } catch (IOException exception) {
            recordRuntimeFailure(exception);
            closeQuietly(realSocket);
            Log.w(TAG, "Failed to connect accepted real TCP socket to virtual port " + virtualPort + ".", exception);
        }
    }

    private void closeAllSessions() {
        for (BridgeSession session : activeSessions.toArray(new BridgeSession[0])) {
            closeQuietly(session);
        }
        activeSessions.clear();
    }

    private IOException closeAndCollect(Closeable closeable, IOException failure) {
        if (closeable == null) {
            return failure;
        }
        try {
            closeable.close();
        } catch (IOException exception) {
            if (failure == null) {
                return exception;
            }
            failure.addSuppressed(exception);
        }
        return failure;
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException ignored) {
        }
    }

    private synchronized void recordRuntimeFailure(IOException exception) {
        if (exception == null || closed.get()) {
            return;
        }
        if (runtimeFailure == null) {
            runtimeFailure = exception;
            return;
        }
        runtimeFailure.addSuppressed(exception);
    }

    private final class BridgeSession implements Closeable, StreamPump.Listener {
        private final Endpoint realEndpoint;
        private final Endpoint virtualEndpoint;
        private final StreamPump realToVirtualPump;
        private final StreamPump virtualToRealPump;
        private final AtomicBoolean sessionClosed = new AtomicBoolean(false);
        private final AtomicInteger remainingPumps = new AtomicInteger(2);

        private BridgeSession(Socket realSocket, ExecutorBridge.VirtualSocketConnection virtualConnection)
                throws IOException {
            this.realEndpoint = new RealSocketEndpoint(realSocket);
            this.virtualEndpoint = new VirtualSocketEndpoint(virtualConnection);
            this.realToVirtualPump = new StreamPump(
                    "StreamPump-real-to-virtual-" + realSocket.getPort() + "-" + virtualPort,
                    realEndpoint.getInputStream(),
                    virtualEndpoint.getOutputStream(),
                    virtualEndpoint,
                    this);
            this.virtualToRealPump = new StreamPump(
                    "StreamPump-virtual-to-real-" + virtualPort + "-" + realSocket.getPort(),
                    virtualEndpoint.getInputStream(),
                    realEndpoint.getOutputStream(),
                    realEndpoint,
                    this);
        }

        private void start() {
            Log.i(TAG, "Starting bidirectional stream relay for real TCP to virtual port " + virtualPort + ".");
            realToVirtualPump.start();
            virtualToRealPump.start();
        }

        @Override
        public void onCompleted(StreamPump pump, IOException failure) {
            if (failure != null || remainingPumps.decrementAndGet() == 0) {
                closeQuietly(this);
            }
        }

        @Override
        public void close() throws IOException {
            if (!sessionClosed.compareAndSet(false, true)) {
                return;
            }
            activeSessions.remove(this);
            IOException failure = null;
            failure = closeAndCollect(realEndpoint, failure);
            failure = closeAndCollect(virtualEndpoint, failure);
            if (failure != null) {
                throw failure;
            }
        }
    }

    private interface Endpoint extends Closeable, StreamPump.OutputTarget {
        InputStream getInputStream();

        OutputStream getOutputStream();
    }

    private static final class RealSocketEndpoint implements Endpoint {
        private final Socket socket;
        private final InputStream inputStream;
        private final OutputStream outputStream;

        private RealSocketEndpoint(Socket socket) throws IOException {
            if (socket == null) {
                throw new IllegalArgumentException("socket == null");
            }
            this.socket = socket;
            this.inputStream = socket.getInputStream();
            this.outputStream = socket.getOutputStream();
        }

        @Override
        public InputStream getInputStream() {
            return inputStream;
        }

        @Override
        public OutputStream getOutputStream() {
            return outputStream;
        }

        @Override
        public void shutdownOutput() throws IOException {
            if (!socket.isClosed() && !socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        }

        @Override
        public void close() throws IOException {
            socket.close();
        }
    }

    private static final class VirtualSocketEndpoint implements Endpoint {
        private final ExecutorBridge.VirtualSocketConnection connection;

        private VirtualSocketEndpoint(ExecutorBridge.VirtualSocketConnection connection) {
            if (connection == null) {
                throw new IllegalArgumentException("connection == null");
            }
            this.connection = connection;
        }

        @Override
        public InputStream getInputStream() {
            return connection.getInputStream();
        }

        @Override
        public OutputStream getOutputStream() {
            return connection.getOutputStream();
        }

        @Override
        public void shutdownOutput() throws IOException {
            connection.shutdownOutput();
        }

        @Override
        public void close() throws IOException {
            connection.close();
        }
    }
}
