package com.micklab.dcg.executor.java;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProxyServerTest {
    @Test
    public void proxyBridgesRealTcpTrafficToJavaProcess() throws Exception {
        ProxyServer proxyServer = new ProxyServer(0, StdWebServer.class.getName());
        try {
            proxyServer.start();
            proxyServer.awaitReady(5, TimeUnit.SECONDS);

            try (Socket clientSocket = new Socket("127.0.0.1", proxyServer.getListeningPort())) {
                String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
                clientSocket.getOutputStream().write(request.getBytes(StandardCharsets.UTF_8));
                clientSocket.getOutputStream().flush();

                String response = readAll(clientSocket.getInputStream());
                assertTrue(response.startsWith("HTTP/1.1 200 OK\r\n"));
                assertTrue(response.contains("Content-Type: text/html; charset=UTF-8\r\n"));
                assertTrue(response.endsWith("<h1>Hello Proxy</h1>"));
            }
        } finally {
            proxyServer.close();
            proxyServer.join(TimeUnit.SECONDS.toMillis(5));
        }
    }

    @Test
    public void proxyContinuesListeningAfterProcessStartFailure() throws Exception {
        ProxyServer proxyServer = new ProxyServer(
                new FailOnceJavaExecutor(),
                0,
                StdWebServer.class.getName());
        try {
            proxyServer.start();
            proxyServer.awaitReady(5, TimeUnit.SECONDS);

            try (Socket failedClient = new Socket("127.0.0.1", proxyServer.getListeningPort())) {
                failedClient.setSoTimeout((int) TimeUnit.SECONDS.toMillis(2));
                String request = "GET /fail HTTP/1.1\r\nHost: localhost\r\n\r\n";
                failedClient.getOutputStream().write(request.getBytes(StandardCharsets.UTF_8));
                failedClient.getOutputStream().flush();
                assertClosedByProxy(failedClient);
            }

            try (Socket clientSocket = new Socket("127.0.0.1", proxyServer.getListeningPort())) {
                String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
                clientSocket.getOutputStream().write(request.getBytes(StandardCharsets.UTF_8));
                clientSocket.getOutputStream().flush();

                String response = readAll(clientSocket.getInputStream());
                assertTrue(response.startsWith("HTTP/1.1 200 OK\r\n"));
                assertTrue(response.endsWith("<h1>Hello Proxy</h1>"));
            }

            assertTrue(proxyServer.getRuntimeFailure() != null);
        } finally {
            proxyServer.close();
            proxyServer.join(TimeUnit.SECONDS.toMillis(5));
        }
    }

    public static final class StdWebServer {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in, StandardCharsets.UTF_8));
            String requestLine = reader.readLine();
            if (requestLine == null) {
                return;
            }

            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                // Consume the request headers before responding.
            }

            String body = "<h1>Hello Proxy</h1>";
            byte[] bodyBytes = body.getBytes(StandardCharsets.UTF_8);
            String response =
                    "HTTP/1.1 200 OK\r\n"
                            + "Content-Type: text/html; charset=UTF-8\r\n"
                            + "Content-Length: " + bodyBytes.length + "\r\n"
                            + "\r\n"
                            + body;
            System.out.print(response);
            System.out.flush();
        }
    }

    private static String readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[256];
        int read;
        while ((read = inputStream.read(buffer)) >= 0) {
            outputStream.write(buffer, 0, read);
        }
        return outputStream.toString(StandardCharsets.UTF_8.name());
    }

    private static void assertClosedByProxy(Socket socket) throws IOException {
        try {
            assertEquals(-1, socket.getInputStream().read());
        } catch (SocketException expected) {
            // Some stacks report an immediate reset instead of EOF when the proxy closes the socket.
        }
    }

    private static final class FailOnceJavaExecutor extends JavaExecutor {
        private final AtomicBoolean failNextConnection = new AtomicBoolean(true);

        @Override
        public JavaProcess startProcess(String className) throws IOException {
            if (failNextConnection.getAndSet(false)) {
                throw new IOException("Synthetic process launch failure.");
            }
            return super.startProcess(className);
        }
    }
}
