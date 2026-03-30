// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class AssetFileDescriptor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssetFileDescriptor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor wrap(android.content.res.AssetFileDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.AssetFileDescriptor getReal() {
        return (android.content.res.AssetFileDescriptor) real;
    }

    public android.content.res.AssetFileDescriptor unwrap() {
        return getReal();
    }

    public AssetFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#android.content.res.AssetFileDescriptor(android.os.ParcelFileDescriptor,long,long)");
    }

    public AssetFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, long arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#android.content.res.AssetFileDescriptor(android.os.ParcelFileDescriptor,long,long,android.os.Bundle)");
    }

    public void close() throws java.io.IOException {
        ((android.content.res.AssetFileDescriptor) real).close();
    }

    public java.io.FileInputStream createInputStream() throws java.io.IOException {
        return ((android.content.res.AssetFileDescriptor) real).createInputStream();
    }

    public java.io.FileOutputStream createOutputStream() throws java.io.IOException {
        return ((android.content.res.AssetFileDescriptor) real).createOutputStream();
    }

    public int describeContents() {
        return ((android.content.res.AssetFileDescriptor) real).describeContents();
    }

    public long getDeclaredLength() {
        return ((android.content.res.AssetFileDescriptor) real).getDeclaredLength();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.res.AssetFileDescriptor) real).getExtras());
    }

    public java.io.FileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#getFileDescriptor()");
    }

    public long getLength() {
        return ((android.content.res.AssetFileDescriptor) real).getLength();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getParcelFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor#getParcelFileDescriptor()");
    }

    public long getStartOffset() {
        return ((android.content.res.AssetFileDescriptor) real).getStartOffset();
    }

    public java.lang.String toString() {
        return ((android.content.res.AssetFileDescriptor) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.res.AssetFileDescriptor) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long UNKNOWN_LENGTH = android.content.res.AssetFileDescriptor.UNKNOWN_LENGTH;

    public static final class AutoCloseInputStream {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutoCloseInputStream(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseInputStream wrap(android.content.res.AssetFileDescriptor.AutoCloseInputStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseInputStream(real, (__DcgwBridgeToken) null);
        }

        public android.content.res.AssetFileDescriptor.AutoCloseInputStream getReal() {
            return (android.content.res.AssetFileDescriptor.AutoCloseInputStream) real;
        }

        public android.content.res.AssetFileDescriptor.AutoCloseInputStream unwrap() {
            return getReal();
        }

        public AutoCloseInputStream(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor$AutoCloseInputStream#android.content.res.AssetFileDescriptor$AutoCloseInputStream(android.content.res.AssetFileDescriptor)");
        }

        public int available() throws java.io.IOException {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).available();
        }

        public void close() throws java.io.IOException {
            ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).close();
        }

        public java.nio.channels.FileChannel getChannel() {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).getChannel();
        }

        public void mark(int arg0) {
            ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).mark(arg0);
        }

        public boolean markSupported() {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).markSupported();
        }

        public int read() throws java.io.IOException {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).read();
        }

        public int read(byte[] arg0) throws java.io.IOException {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).read(arg0);
        }

        public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).read(arg0, arg1, arg2);
        }

        public void reset() throws java.io.IOException {
            ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).reset();
        }

        public long skip(long arg0) throws java.io.IOException {
            return ((android.content.res.AssetFileDescriptor.AutoCloseInputStream) real).skip(arg0);
        }

    }
    public static final class AutoCloseOutputStream {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutoCloseOutputStream(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseOutputStream wrap(android.content.res.AssetFileDescriptor.AutoCloseOutputStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.AutoCloseOutputStream(real, (__DcgwBridgeToken) null);
        }

        public android.content.res.AssetFileDescriptor.AutoCloseOutputStream getReal() {
            return (android.content.res.AssetFileDescriptor.AutoCloseOutputStream) real;
        }

        public android.content.res.AssetFileDescriptor.AutoCloseOutputStream unwrap() {
            return getReal();
        }

        public AutoCloseOutputStream(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.res.AssetFileDescriptor$AutoCloseOutputStream#android.content.res.AssetFileDescriptor$AutoCloseOutputStream(android.content.res.AssetFileDescriptor)");
        }

        public void write(int arg0) throws java.io.IOException {
            ((android.content.res.AssetFileDescriptor.AutoCloseOutputStream) real).write(arg0);
        }

        public void write(byte[] arg0) throws java.io.IOException {
            ((android.content.res.AssetFileDescriptor.AutoCloseOutputStream) real).write(arg0);
        }

        public void write(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
            ((android.content.res.AssetFileDescriptor.AutoCloseOutputStream) real).write(arg0, arg1, arg2);
        }

    }
}
