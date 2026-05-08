package com.micklab.dcg.executor.java;

import android.util.Log;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class ExecutorBridge {
    private static final String TAG = "ExecutorBridge";

    private final JavaExecutor javaExecutor;

    public ExecutorBridge() {
        this(new JavaExecutor());
    }

    ExecutorBridge(JavaExecutor javaExecutor) {
        if (javaExecutor == null) {
            throw new IllegalArgumentException("javaExecutor == null");
        }
        this.javaExecutor = javaExecutor;
    }

    public VirtualSocketConnection connect(int virtualPort) throws IOException {
        return connect("localhost", virtualPort);
    }

    public VirtualSocketConnection connect(String host, int virtualPort) throws IOException {
        VirtualSocketConnection connection =
                new VirtualSocketConnection(javaExecutor.openVirtualSocketBridge(host, virtualPort));
        Log.i(TAG, "Connected virtual TCP bridge to " + host + ":" + virtualPort + ".");
        return connection;
    }

    public static final class VirtualSocketConnection implements Closeable, StreamPump.OutputTarget {
        private final JavaExecutor.VirtualSocketBridge bridge;

        private VirtualSocketConnection(JavaExecutor.VirtualSocketBridge bridge) {
            if (bridge == null) {
                throw new IllegalArgumentException("bridge == null");
            }
            this.bridge = bridge;
        }

        public InputStream getInputStream() {
            return bridge.getInputStream();
        }

        public OutputStream getOutputStream() {
            return bridge.getOutputStream();
        }

        @Override
        public void shutdownOutput() throws IOException {
            bridge.shutdownOutput();
        }

        @Override
        public void close() throws IOException {
            bridge.close();
        }
    }
}
