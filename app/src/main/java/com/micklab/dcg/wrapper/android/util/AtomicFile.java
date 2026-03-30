// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AtomicFile {
    private final android.util.AtomicFile real;

    public AtomicFile(android.util.AtomicFile real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AtomicFile wrap(android.util.AtomicFile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AtomicFile(real);
    }

    public android.util.AtomicFile unwrap() {
        return real;
    }

    public AtomicFile(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.util.AtomicFile#android.util.AtomicFile(java.io.File)");
    }

    public void delete() {
        real.delete();
    }

    public void failWrite(java.io.FileOutputStream arg0) {
        real.failWrite(arg0);
    }

    public void finishWrite(java.io.FileOutputStream arg0) {
        real.finishWrite(arg0);
    }

    public java.io.File getBaseFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.util.AtomicFile#getBaseFile()");
    }

    public long getLastModifiedTime() {
        return real.getLastModifiedTime();
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
        return real.openRead();
    }

    public byte[] readFully() throws java.io.IOException {
        return real.readFully();
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
        return real.startWrite();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
