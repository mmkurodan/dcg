package com.micklab.dcg.executor.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class StreamPump extends Thread {
    private static final int BUFFER_SIZE = 8192;

    private final InputStream inputStream;
    private final OutputStream outputStream;
    private final OutputTarget outputTarget;
    private final Listener listener;

    public StreamPump(
            String threadName,
            InputStream inputStream,
            OutputStream outputStream,
            OutputTarget outputTarget,
            Listener listener) {
        super(threadName);
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream == null");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("outputStream == null");
        }
        if (outputTarget == null) {
            throw new IllegalArgumentException("outputTarget == null");
        }
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.outputTarget = outputTarget;
        this.listener = listener;
        setDaemon(true);
    }

    @Override
    public void run() {
        IOException failure = null;
        byte[] buffer = new byte[BUFFER_SIZE];
        try {
            int read;
            while ((read = inputStream.read(buffer)) >= 0) {
                if (read == 0) {
                    continue;
                }
                outputStream.write(buffer, 0, read);
                outputStream.flush();
            }
        } catch (IOException exception) {
            failure = exception;
        } finally {
            try {
                outputTarget.shutdownOutput();
            } catch (IOException exception) {
                if (failure == null) {
                    failure = exception;
                } else {
                    failure.addSuppressed(exception);
                }
            }
            if (listener != null) {
                listener.onCompleted(this, failure);
            }
        }
    }

    public interface Listener {
        void onCompleted(StreamPump pump, IOException failure);
    }

    public interface OutputTarget {
        void shutdownOutput() throws IOException;
    }
}
