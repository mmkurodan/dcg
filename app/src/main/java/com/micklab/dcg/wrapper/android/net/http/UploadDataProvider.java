// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class UploadDataProvider {
    private final android.net.http.UploadDataProvider real;

    public UploadDataProvider(android.net.http.UploadDataProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.UploadDataProvider wrap(android.net.http.UploadDataProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UploadDataProvider(real);
    }

    public android.net.http.UploadDataProvider unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataProvider#close()");
    }

    public long getLength() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataProvider#getLength()");
    }

    public void read(com.micklab.dcg.wrapper.android.net.http.UploadDataSink arg0, java.nio.ByteBuffer arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataProvider#read(android.net.http.UploadDataSink,java.nio.ByteBuffer)");
    }

    public void rewind(com.micklab.dcg.wrapper.android.net.http.UploadDataSink arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataProvider#rewind(android.net.http.UploadDataSink)");
    }

}
