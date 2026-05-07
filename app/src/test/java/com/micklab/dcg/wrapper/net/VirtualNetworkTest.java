package com.micklab.dcg.wrapper.net;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VirtualNetworkTest {
    @Test
    public void socketAndServerSocketExchangeData() throws Exception {
        ServerSocket serverSocket = new ServerSocket(18081);
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
                Socket client = new Socket("localhost", 18081);
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
        ServerSocket serverSocket = new ServerSocket(18082);
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

            Socket client = new Socket("localhost", 18082);
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
        ServerSocket serverSocket = new ServerSocket(18083);
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

            sendPayload("A1");
            sendPayload("B2");

            assertArrayEquals(new String[]{"A1", "B2"}, serverFuture.get(5, TimeUnit.SECONDS));
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    public void wrapperServerSocketServesHttpToRealLocalhostClient() throws Exception {
        int port = allocatePort();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<String> serverFuture = executor.submit(() -> {
                Socket accepted = serverSocket.accept();
                try {
                    String request = readUntil(accepted.getInputStream(), "\r\n\r\n");
                    String body = "<html><body><h1>Hello</h1></body></html>";
                    String response = "HTTP/1.1 200 OK\r\n"
                            + "Content-Type: text/html; charset=UTF-8\r\n"
                            + "Content-Length: " + body.getBytes(StandardCharsets.UTF_8).length + "\r\n"
                            + "Connection: close\r\n\r\n"
                            + body;
                    accepted.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
                    accepted.getOutputStream().flush();
                    return request;
                } finally {
                    accepted.close();
                    serverSocket.close();
                }
            });

            java.net.Socket browser = new java.net.Socket("127.0.0.1", port);
            try {
                OutputStream outputStream = browser.getOutputStream();
                outputStream.write(("GET / HTTP/1.1\r\nHost: localhost:" + port + "\r\n\r\n")
                        .getBytes(StandardCharsets.UTF_8));
                outputStream.flush();

                String response = readFully(browser.getInputStream());
                assertEquals(true, response.contains("HTTP/1.1 200 OK"));
                assertEquals(true, response.contains("<h1>Hello</h1>"));
            } finally {
                browser.close();
            }

            assertEquals(true, serverFuture.get(5, TimeUnit.SECONDS).startsWith("GET / HTTP/1.1"));
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    public void wrapperServerSocketCanStreamSseStyleResponseToRealClient() throws Exception {
        int port = allocatePort();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<String> serverFuture = executor.submit(() -> {
                Socket accepted = serverSocket.accept();
                try {
                    String request = readUntil(accepted.getInputStream(), "\r\n\r\n");
                    String response = "HTTP/1.1 200 OK\r\n"
                            + "Content-Type: text/event-stream\r\n"
                            + "Cache-Control: no-cache\r\n"
                            + "Connection: close\r\n\r\n"
                            + "event: ping\n"
                            + "data: hello\n\n";
                    accepted.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
                    accepted.getOutputStream().flush();
                    return request;
                } finally {
                    accepted.close();
                    serverSocket.close();
                }
            });

            java.net.Socket client = new java.net.Socket("127.0.0.1", port);
            try {
                client.getOutputStream().write(("GET /events HTTP/1.1\r\nHost: localhost:" + port + "\r\n\r\n")
                        .getBytes(StandardCharsets.UTF_8));
                client.getOutputStream().flush();

                String response = readFully(client.getInputStream());
                assertEquals(true, response.contains("Content-Type: text/event-stream"));
                assertEquals(true, response.contains("event: ping\n"));
                assertEquals(true, response.contains("data: hello\n\n"));
            } finally {
                client.close();
            }

            assertEquals(true, serverFuture.get(5, TimeUnit.SECONDS).startsWith("GET /events HTTP/1.1"));
        } finally {
            executor.shutdownNow();
        }
    }

    private void sendPayload(String payload) throws Exception {
        Socket client = new Socket("localhost", 18083);
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

    private String readFully(InputStream inputStream) throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int readCount;
        while ((readCount = inputStream.read(buffer)) != -1) {
            output.write(buffer, 0, readCount);
        }
        return output.toString(StandardCharsets.UTF_8.name());
    }

    private String readUntil(InputStream inputStream, String marker) throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] markerBytes = marker.getBytes(StandardCharsets.UTF_8);
        while (true) {
            int next = inputStream.read();
            if (next < 0) {
                break;
            }
            output.write(next);
            byte[] current = output.toByteArray();
            if (endsWith(current, markerBytes)) {
                break;
            }
        }
        return output.toString(StandardCharsets.UTF_8.name());
    }

    private boolean endsWith(byte[] value, byte[] suffix) {
        if (value.length < suffix.length) {
            return false;
        }
        int offset = value.length - suffix.length;
        for (int index = 0; index < suffix.length; index++) {
            if (value[offset + index] != suffix[index]) {
                return false;
            }
        }
        return true;
    }

    private int allocatePort() throws Exception {
        java.net.ServerSocket probe = new java.net.ServerSocket(0);
        try {
            return probe.getLocalPort();
        } finally {
            probe.close();
        }
    }
}
