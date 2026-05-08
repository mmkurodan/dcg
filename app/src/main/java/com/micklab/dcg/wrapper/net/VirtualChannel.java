package com.micklab.dcg.wrapper.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

public final class VirtualChannel {
    private static final int PIPE_BUFFER_SIZE = 64 * 1024;

    private final InputStream inputStream;
    private final OutputStream outputStream;
    private final String peerHost;
    private final int peerPort;
    private final CloseController closeController;

    private VirtualChannel(
            InputStream inputStream,
            OutputStream outputStream,
            String peerHost,
            int peerPort,
            CloseController closeController) {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream == null");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream == null");
        }
        if (peerHost == null || peerHost.trim().isEmpty()) {
            throw new IllegalArgumentException("peerHost == null");
        }
        if (peerPort < 1 || peerPort > 65535) {
            throw new IllegalArgumentException("peerPort out of range: " + peerPort);
        }
        if (closeController == null) {
            throw new IllegalArgumentException("closeController == null");
        }
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.peerHost = peerHost;
        this.peerPort = peerPort;
        this.closeController = closeController;
    }

    static ChannelPair openPair(String host, int port) throws IOException {
        PipedInputStream clientInput = new PipedInputStream(PIPE_BUFFER_SIZE);
        PipedOutputStream serverOutput = new PipedOutputStream(clientInput);

        PipedInputStream serverInput = new PipedInputStream(PIPE_BUFFER_SIZE);
        PipedOutputStream clientOutput = new PipedOutputStream(serverInput);

        CloseController closeController = new CloseController(
                clientOutput,
                serverOutput);
        return new ChannelPair(
                new VirtualChannel(clientInput, clientOutput, host, port, closeController),
                new VirtualChannel(serverInput, serverOutput, host, port, closeController));
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void close() throws IOException {
        closeController.close();
    }

    String getPeerHost() {
        return peerHost;
    }

    int getPeerPort() {
        return peerPort;
    }

    static final class ChannelPair {
        final VirtualChannel clientSide;
        final VirtualChannel serverSide;

        private ChannelPair(VirtualChannel clientSide, VirtualChannel serverSide) {
            this.clientSide = clientSide;
            this.serverSide = serverSide;
        }
    }

    private static final class CloseController {
        private final OutputStream[] closeables;
        private final AtomicBoolean closed = new AtomicBoolean(false);

        private CloseController(OutputStream... closeables) {
            this.closeables = closeables;
        }

        private void close() throws IOException {
            if (!closed.compareAndSet(false, true)) {
                return;
            }

            IOException failure = null;
            for (OutputStream closeable : closeables) {
                try {
                    closeable.close();
                } catch (IOException exception) {
                    if (failure == null) {
                        failure = exception;
                    } else {
                        failure.addSuppressed(exception);
                    }
                }
            }

            if (failure != null) {
                throw failure;
            }
        }
    }
}
