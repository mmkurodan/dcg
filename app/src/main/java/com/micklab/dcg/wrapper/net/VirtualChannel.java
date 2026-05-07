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
    private final java.net.Socket underlyingSocket;
    private final AtomicBoolean closed = new AtomicBoolean(false);

    private VirtualChannel(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, null);
    }

    private VirtualChannel(InputStream inputStream, OutputStream outputStream, java.net.Socket underlyingSocket) {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream == null");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream == null");
        }
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.underlyingSocket = underlyingSocket;
    }

    public static VirtualChannel fromSocket(java.net.Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        return new VirtualChannel(socket.getInputStream(), socket.getOutputStream(), socket);
    }

    static ChannelPair openPair() throws IOException {
        PipedInputStream clientInput = new PipedInputStream(PIPE_BUFFER_SIZE);
        PipedOutputStream serverOutput = new PipedOutputStream(clientInput);

        PipedInputStream serverInput = new PipedInputStream(PIPE_BUFFER_SIZE);
        PipedOutputStream clientOutput = new PipedOutputStream(serverInput);

        return new ChannelPair(
                new VirtualChannel(clientInput, clientOutput),
                new VirtualChannel(serverInput, serverOutput));
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void close() throws IOException {
        if (!closed.compareAndSet(false, true)) {
            return;
        }

        IOException failure = null;

        if (underlyingSocket != null) {
            try {
                underlyingSocket.close();
            } catch (IOException exception) {
                failure = exception;
            }
        } else {
            try {
                outputStream.close();
            } catch (IOException exception) {
                failure = exception;
            }

            try {
                inputStream.close();
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

    static final class ChannelPair {
        final VirtualChannel clientSide;
        final VirtualChannel serverSide;

        private ChannelPair(VirtualChannel clientSide, VirtualChannel serverSide) {
            this.clientSide = clientSide;
            this.serverSide = serverSide;
        }
    }
}
