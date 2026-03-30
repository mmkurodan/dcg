// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AtomicFile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AtomicFile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AtomicFile wrap(android.util.AtomicFile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AtomicFile(real, (__DcgwBridgeToken) null);
    }

    public android.util.AtomicFile getReal() {
        return (android.util.AtomicFile) real;
    }

    public android.util.AtomicFile unwrap() {
        return getReal();
    }

    public AtomicFile(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.util.AtomicFile#android.util.AtomicFile(java.io.File)");
    }

    public void delete() {
        ((android.util.AtomicFile) real).delete();
    }

    public void failWrite(java.io.FileOutputStream arg0) {
        ((android.util.AtomicFile) real).failWrite(arg0);
    }

    public void finishWrite(java.io.FileOutputStream arg0) {
        ((android.util.AtomicFile) real).finishWrite(arg0);
    }

    public java.io.File getBaseFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.util.AtomicFile#getBaseFile()");
    }

    public long getLastModifiedTime() {
        return ((android.util.AtomicFile) real).getLastModifiedTime();
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
        return ((android.util.AtomicFile) real).openRead();
    }

    public byte[] readFully() throws java.io.IOException {
        return ((android.util.AtomicFile) real).readFully();
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
        return ((android.util.AtomicFile) real).startWrite();
    }

    public java.lang.String toString() {
        return ((android.util.AtomicFile) real).toString();
    }

}
