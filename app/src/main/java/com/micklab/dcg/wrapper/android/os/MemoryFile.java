// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class MemoryFile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MemoryFile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.MemoryFile wrap(android.os.MemoryFile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.MemoryFile(real, (__DcgwBridgeToken) null);
    }

    public android.os.MemoryFile getReal() {
        return (android.os.MemoryFile) real;
    }

    public android.os.MemoryFile unwrap() {
        return getReal();
    }

    public MemoryFile(java.lang.String arg0, int arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#android.os.MemoryFile(java.lang.String,int)");
    }

    public boolean allowPurging(boolean arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#allowPurging(boolean)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#close()");
    }

    public java.io.InputStream getInputStream() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#getInputStream()");
    }

    public java.io.OutputStream getOutputStream() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#getOutputStream()");
    }

    public boolean isPurgingAllowed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#isPurgingAllowed()");
    }

    public int length() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#length()");
    }

    public int readBytes(byte[] arg0, int arg1, int arg2, int arg3) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#readBytes([B,int,int,int)");
    }

    public void writeBytes(byte[] arg0, int arg1, int arg2, int arg3) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.MemoryFile#writeBytes([B,int,int,int)");
    }

}
