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

public class ProxyServer extends Thread implements Closeable {
    private static final String TAG = "ProxyServer";
    private static final String BIND_HOST = "0.0.0.0";
    private static final int LISTEN_BACKLOG = 50;

    private final JavaExecutor javaExecutor;
    private final int listenPort;
    private final String className;
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final Set<BridgeSession> activeSessions =
            Collections.newSetFromMap(new ConcurrentHashMap<>());
    private final CountDownLatch started = new CountDownLatch(1);

    private volatile ServerSocket serverSocket;
    private volatile IOException startupFailure;
    private volatile IOException runtimeFailure;

    public ProxyServer(int listenPort, String className) {
        this(new JavaExecutor(), listenPort, className);
    }

    public ProxyServer(JavaExecutor javaExecutor, int listenPort, String className) {
        super("ProxyServer-" + listenPort + "-" + className);
        if (javaExecutor == null) {
            throw new IllegalArgumentException("javaExecutor == null");
        }
        if (listenPort < 0 || listenPort > 65535) {
            throw new IllegalArgumentException("listenPort out of range: " + listenPort);
        }
        if (className == null || className.trim().isEmpty()) {
            throw new IllegalArgumentException("className is empty");
        }
        this.javaExecutor = javaExecutor;
        this.listenPort = listenPort;
        this.className = className.trim();
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
                            + " for "
                            + className
                            + ".");
        } catch (IOException exception) {
            startupFailure = exception;
            started.countDown();
            return;
        }

        started.countDown();
        try {
            while (!closed.get()) {
                Socket clientSocket = null;
                try {
                    clientSocket = listeningSocket.accept();
                    Log.i(TAG, "Accepted real TCP connection from " + clientSocket.getRemoteSocketAddress() + ".");
                    handleAcceptedSocket(clientSocket);
                } catch (SocketException exception) {
                    if (closed.get() || listeningSocket.isClosed()) {
                        break;
                    }
                    recordRuntimeFailure(exception);
                    closeQuietly(clientSocket);
                    Log.w(TAG, "Proxy accept failed; continuing to listen.", exception);
                } catch (IOException exception) {
                    recordRuntimeFailure(exception);
                    closeQuietly(clientSocket);
                    Log.w(TAG, "Proxy process setup failed for an accepted socket; continuing.", exception);
                } catch (RuntimeException exception) {
                    recordRuntimeFailure(new IOException("Proxy server hit an unexpected runtime failure.", exception));
                    closeQuietly(clientSocket);
                    Log.e(TAG, "Proxy server hit an unexpected runtime failure; continuing.", exception);
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

    private void handleAcceptedSocket(Socket clientSocket) {
        if (clientSocket == null) {
            return;
        }

        try {
            BridgeSession session = new BridgeSession(clientSocket, javaExecutor.startProcess(className));
            activeSessions.add(session);
            session.start();
        } catch (IOException exception) {
            recordRuntimeFailure(exception);
            closeQuietly(clientSocket);
            Log.w(TAG, "Failed to launch JavaExecutor process " + className + " for accepted socket.", exception);
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
        private final Endpoint clientEndpoint;
        private final ProcessEndpoint processEndpoint;
        private final StreamPump clientToProcessPump;
        private final StreamPump processToClientPump;
        private final AtomicBoolean sessionClosed = new AtomicBoolean(false);
        private final AtomicInteger remainingPumps = new AtomicInteger(2);

        private BridgeSession(Socket clientSocket, JavaExecutor.JavaProcess javaProcess)
                throws IOException {
            this.clientEndpoint = new RealSocketEndpoint(clientSocket);
            this.processEndpoint = new ProcessEndpoint(javaProcess);
            this.clientToProcessPump = new StreamPump(
                    "StreamPump-client-to-process-" + clientSocket.getPort(),
                    clientEndpoint.getInputStream(),
                    processEndpoint.getOutputStream(),
                    processEndpoint,
                    this);
            this.processToClientPump = new StreamPump(
                    "StreamPump-process-to-client-" + clientSocket.getPort(),
                    processEndpoint.getInputStream(),
                    clientEndpoint.getOutputStream(),
                    clientEndpoint,
                    this);
        }

        private void start() {
            Log.i(TAG, "Starting bidirectional stream relay for " + className + ".");
            clientToProcessPump.start();
            processToClientPump.start();
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
            failure = closeAndCollect(clientEndpoint, failure);
            failure = closeAndCollect(processEndpoint, failure);
            Throwable processFailure = processEndpoint.getFailure();
            if (processFailure != null) {
                recordRuntimeFailure(new IOException(
                        "JavaExecutor process " + className + " terminated with a failure.",
                        processFailure));
            }
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

    private static final class ProcessEndpoint implements Endpoint {
        private final JavaExecutor.JavaProcess javaProcess;

        private ProcessEndpoint(JavaExecutor.JavaProcess javaProcess) {
            if (javaProcess == null) {
                throw new IllegalArgumentException("javaProcess == null");
            }
            this.javaProcess = javaProcess;
        }

        @Override
        public InputStream getInputStream() {
            return javaProcess.getInputStream();
        }

        @Override
        public OutputStream getOutputStream() {
            return javaProcess.getOutputStream();
        }

        private Throwable getFailure() {
            return javaProcess.getFailure();
        }

        @Override
        public void shutdownOutput() throws IOException {
            javaProcess.shutdownOutput();
        }

        @Override
        public void close() throws IOException {
            javaProcess.close();
        }
    }
}
