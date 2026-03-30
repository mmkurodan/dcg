// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class AssetFileDescriptor {
    private final android.content.res.AssetFileDescriptor real;

    public AssetFileDescriptor(android.content.res.AssetFileDescriptor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor wrap(android.content.res.AssetFileDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor(real);
    }

    public android.content.res.AssetFileDescriptor unwrap() {
        return real;
    }

    public AssetFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#android.content.res.AssetFileDescriptor(android.os.ParcelFileDescriptor,long,long)");
    }

    public AssetFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, long arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#android.content.res.AssetFileDescriptor(android.os.ParcelFileDescriptor,long,long,android.os.Bundle)");
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public java.io.FileInputStream createInputStream() throws java.io.IOException {
        return real.createInputStream();
    }

    public java.io.FileOutputStream createOutputStream() throws java.io.IOException {
        return real.createOutputStream();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getDeclaredLength() {
        return real.getDeclaredLength();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.io.FileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#getFileDescriptor()");
    }

    public long getLength() {
        return real.getLength();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getParcelFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#getParcelFileDescriptor()");
    }

    public long getStartOffset() {
        return real.getStartOffset();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final long UNKNOWN_LENGTH = android.content.res.AssetFileDescriptor.UNKNOWN_LENGTH;

    public static final class AutoCloseInputStream {
        private final android.content.res.AssetFileDescriptor.AutoCloseInputStream real;

        public AutoCloseInputStream(android.content.res.AssetFileDescriptor.AutoCloseInputStream real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseInputStream wrap(android.content.res.AssetFileDescriptor.AutoCloseInputStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseInputStream(real);
        }

        public android.content.res.AssetFileDescriptor.AutoCloseInputStream unwrap() {
            return real;
        }

        public AutoCloseInputStream(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor$AutoCloseInputStream#android.content.res.AssetFileDescriptor$AutoCloseInputStream(android.content.res.AssetFileDescriptor)");
        }

        public int available() throws java.io.IOException {
            return real.available();
        }

        public void close() throws java.io.IOException {
            real.close();
        }

        public java.nio.channels.FileChannel getChannel() {
            return real.getChannel();
        }

        public void mark(int arg0) {
            real.mark(arg0);
        }

        public boolean markSupported() {
            return real.markSupported();
        }

        public int read() throws java.io.IOException {
            return real.read();
        }

        public int read(byte[] arg0) throws java.io.IOException {
            return real.read(arg0);
        }

        public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
            return real.read(arg0, arg1, arg2);
        }

        public void reset() throws java.io.IOException {
            real.reset();
        }

        public long skip(long arg0) throws java.io.IOException {
            return real.skip(arg0);
        }

    }
    public static final class AutoCloseOutputStream {
        private final android.content.res.AssetFileDescriptor.AutoCloseOutputStream real;

        public AutoCloseOutputStream(android.content.res.AssetFileDescriptor.AutoCloseOutputStream real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseOutputStream wrap(android.content.res.AssetFileDescriptor.AutoCloseOutputStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseOutputStream(real);
        }

        public android.content.res.AssetFileDescriptor.AutoCloseOutputStream unwrap() {
            return real;
        }

        public AutoCloseOutputStream(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor$AutoCloseOutputStream#android.content.res.AssetFileDescriptor$AutoCloseOutputStream(android.content.res.AssetFileDescriptor)");
        }

        public void write(int arg0) throws java.io.IOException {
            real.write(arg0);
        }

        public void write(byte[] arg0) throws java.io.IOException {
            real.write(arg0);
        }

        public void write(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
            real.write(arg0, arg1, arg2);
        }

    }
}
