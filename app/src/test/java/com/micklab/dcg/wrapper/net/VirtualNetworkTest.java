package com.micklab.dcg.wrapper.net;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

public class VirtualNetworkTest {
    private static final AtomicInteger NEXT_PORT = new AtomicInteger(18080);

    @Test
    public void socketAndServerSocketExchangeData() throws Exception {
        int port = nextPort();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<String> serverFuture = executor.submit(() -> {
                Socket accepted = serverSocket.accept();
                try {
                    String request = readFully(accepted, 5);
                    accepted.getOutputStream().write("pong".getBytes(StandardCharsets.UTF_8));
                    accepted.getOutputStream().flush();
                    return request;
                } finally {
                    accepted.close();
                    serverSocket.close();
                }
            });

            Future<String> clientFuture = executor.submit(() -> {
                Socket client = new Socket("localhost", port);
                try {
                    client.getOutputStream().write("ping!".getBytes(StandardCharsets.UTF_8));
                    client.getOutputStream().flush();
                    return readFully(client, 4);
                } finally {
                    client.close();
                }
            });

            assertEquals("ping!", serverFuture.get(5, TimeUnit.SECONDS));
            assertEquals("pong", clientFuture.get(5, TimeUnit.SECONDS));
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    public void acceptBlocksUntilClientConnects() throws Exception {
        int port = nextPort();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch acceptStarted = new CountDownLatch(1);
        try {
            Future<Socket> acceptedFuture = executor.submit(() -> {
                acceptStarted.countDown();
                return serverSocket.accept();
            });

            acceptStarted.await(5, TimeUnit.SECONDS);
            Thread.sleep(200L);
            assertFalse(acceptedFuture.isDone());

            Socket client = new Socket("localhost", port);
            Socket accepted = acceptedFuture.get(5, TimeUnit.SECONDS);
            try {
                client.close();
                accepted.close();
            } finally {
                serverSocket.close();
            }
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    public void supportsMultipleConnectionsAndBlockingReads() throws Exception {
        int port = nextPort();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<String[]> serverFuture = executor.submit(() -> {
                String[] payloads = new String[2];
                for (int index = 0; index < payloads.length; index++) {
                    Socket accepted = serverSocket.accept();
                    try {
                        payloads[index] = readFully(accepted, 2);
                    } finally {
                        accepted.close();
                    }
                }
                serverSocket.close();
                return payloads;
            });

            sendPayload(port, "A1");
            sendPayload(port, "B2");

            assertArrayEquals(new String[]{"A1", "B2"}, serverFuture.get(5, TimeUnit.SECONDS));
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    public void connectFailsWhenNoVirtualServerIsRegistered() {
        ConnectException exception = assertThrows(
                ConnectException.class,
                () -> new Socket("localhost", nextPort()));
        assertTrue(exception.getMessage().contains("Virtual connection refused"));
    }

    @Test
    public void closingAcceptedSocketClosesPeerStreams() throws Exception {
        int port = nextPort();
        ServerSocket serverSocket = new ServerSocket(port);
        Socket client = new Socket("localhost", port);
        Socket accepted = serverSocket.accept();
        try {
            accepted.close();
            assertThrows(IOException.class, () -> client.getOutputStream().write(1));
        } finally {
            client.close();
            serverSocket.close();
        }
    }

    @Test
    public void virtualServerSocketCloseUnblocksPendingAccept() throws Exception {
        int port = nextPort();
        VirtualServerSocket serverSocket = new VirtualServerSocket(port);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<VirtualChannel> acceptedFuture = executor.submit(serverSocket::accept);
            Thread.sleep(200L);
            serverSocket.close();

            ExecutionException failure = assertThrows(
                    ExecutionException.class,
                    () -> acceptedFuture.get(5, TimeUnit.SECONDS));
            assertTrue(failure.getCause() instanceof SocketException);
        } finally {
            executor.shutdownNow();
        }
    }

    private void sendPayload(int port, String payload) throws Exception {
        Socket client = new Socket("localhost", port);
        try {
            client.getOutputStream().write(payload.getBytes(StandardCharsets.UTF_8));
            client.getOutputStream().flush();
        } finally {
            client.close();
        }
    }

    private String readFully(Socket socket, int expectedByteCount) throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while (output.size() < expectedByteCount) {
            int next = socket.getInputStream().read();
            if (next < 0) {
                break;
            }
            output.write(next);
        }
        return output.toString(StandardCharsets.UTF_8.name());
    }

    private int nextPort() {
        return NEXT_PORT.incrementAndGet();
    }
}
