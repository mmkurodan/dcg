package com.micklab.dcg.executor.java;

import com.micklab.dcg.wrapper.net.ServerSocket;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProxyThreadTest {
    private static final AtomicInteger NEXT_VIRTUAL_PORT = new AtomicInteger(28080);

    @Test
    public void proxyBridgesRealTcpTrafficToVirtualServer() throws Exception {
        int virtualPort = NEXT_VIRTUAL_PORT.incrementAndGet();
        ServerSocket virtualServerSocket = new ServerSocket(virtualPort);
        ProxyThread proxyThread = new ProxyThread(0, virtualPort);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CountDownLatch serverAccepted = new CountDownLatch(1);
        try {
            Future<String> serverFuture = executor.submit(() -> {
                com.micklab.dcg.wrapper.net.Socket accepted = virtualServerSocket.accept();
                serverAccepted.countDown();
                try {
                    BufferedReader requestReader = new BufferedReader(
                            new InputStreamReader(accepted.getInputStream(), StandardCharsets.UTF_8));
                    String requestLine = requestReader.readLine();

                    String body = "<h1>Hello Proxy</h1>";
                    String response =
                            "HTTP/1.1 200 OK\r\n"
                                    + "Content-Type: text/html; charset=UTF-8\r\n"
                                    + "Content-Length: " + body.getBytes(StandardCharsets.UTF_8).length + "\r\n"
                                    + "\r\n"
                                    + body;
                    accepted.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
                    accepted.getOutputStream().flush();
                    return requestLine;
                } finally {
                    accepted.close();
                    virtualServerSocket.close();
                }
            });

            proxyThread.start();
            proxyThread.awaitReady(5, TimeUnit.SECONDS);

            Future<String> clientFuture = executor.submit(() -> {
                try (Socket clientSocket = new Socket("127.0.0.1", proxyThread.getListeningPort())) {
                    String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
                    clientSocket.getOutputStream().write(request.getBytes(StandardCharsets.UTF_8));
                    clientSocket.getOutputStream().flush();
                    return readAll(clientSocket.getInputStream());
                }
            });

            assertTrue(serverAccepted.await(5, TimeUnit.SECONDS));
            assertEquals("GET / HTTP/1.1", serverFuture.get(5, TimeUnit.SECONDS));
            String response = clientFuture.get(5, TimeUnit.SECONDS);
            assertTrue(response.startsWith("HTTP/1.1 200 OK\r\n"));
            assertTrue(response.contains("Content-Type: text/html; charset=UTF-8\r\n"));
            assertTrue(response.endsWith("<h1>Hello Proxy</h1>"));
        } finally {
            proxyThread.close();
            proxyThread.join(TimeUnit.SECONDS.toMillis(5));
            executor.shutdownNow();
        }
    }

    private String readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[256];
        int read;
        while ((read = inputStream.read(buffer)) >= 0) {
            outputStream.write(buffer, 0, read);
        }
        return outputStream.toString(StandardCharsets.UTF_8.name());
    }
}
