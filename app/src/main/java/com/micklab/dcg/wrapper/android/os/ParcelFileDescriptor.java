// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ParcelFileDescriptor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParcelFileDescriptor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor wrap(android.os.ParcelFileDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor(real, (__DcgwBridgeToken) null);
    }

    public android.os.ParcelFileDescriptor getReal() {
        return (android.os.ParcelFileDescriptor) real;
    }

    public android.os.ParcelFileDescriptor unwrap() {
        return getReal();
    }

    public ParcelFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#android.os.ParcelFileDescriptor(android.os.ParcelFileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor adoptFd(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#adoptFd(int)");
    }

    public boolean canDetectErrors() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#canDetectErrors()");
    }

    public void checkError() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#checkError()");
    }

    public void close() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#close()");
    }

    public void closeWithError(java.lang.String arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#closeWithError(java.lang.String)");
    }

    public static android.os.ParcelFileDescriptor[] createPipe() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#createPipe()");
    }

    public static android.os.ParcelFileDescriptor[] createReliablePipe() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#createReliablePipe()");
    }

    public static android.os.ParcelFileDescriptor[] createReliableSocketPair() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#createReliableSocketPair()");
    }

    public static android.os.ParcelFileDescriptor[] createSocketPair() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#createSocketPair()");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#describeContents()");
    }

    public int detachFd() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#detachFd()");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor dup() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#dup()");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor dup(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#dup(java.io.FileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor fromDatagramSocket(java.net.DatagramSocket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#fromDatagramSocket(java.net.DatagramSocket)");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor fromFd(int arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#fromFd(int)");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor fromSocket(java.net.Socket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#fromSocket(java.net.Socket)");
    }

    public int getFd() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#getFd()");
    }

    public java.io.FileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#getFileDescriptor()");
    }

    public long getStatSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#getStatSize()");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor open(java.io.File arg0, int arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#open(java.io.File,int)");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor open(java.io.File arg0, int arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.OnCloseListener arg3) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#open(java.io.File,int,android.os.Handler,android.os.ParcelFileDescriptor$OnCloseListener)");
    }

    public static int parseMode(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#parseMode(java.lang.String)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#toString()");
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor wrap(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.os.Handler arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.OnCloseListener arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#wrap(android.os.ParcelFileDescriptor,android.os.Handler,android.os.ParcelFileDescriptor$OnCloseListener)");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor#writeToParcel(android.os.Parcel,int)");
    }


    public static final class AutoCloseInputStream {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutoCloseInputStream(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.AutoCloseInputStream wrap(android.os.ParcelFileDescriptor.AutoCloseInputStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.AutoCloseInputStream(real, (__DcgwBridgeToken) null);
        }

        public android.os.ParcelFileDescriptor.AutoCloseInputStream getReal() {
            return (android.os.ParcelFileDescriptor.AutoCloseInputStream) real;
        }

        public android.os.ParcelFileDescriptor.AutoCloseInputStream unwrap() {
            return getReal();
        }

        public AutoCloseInputStream(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseInputStream#android.os.ParcelFileDescriptor$AutoCloseInputStream(android.os.ParcelFileDescriptor)");
        }

        public void close() throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseInputStream#close()");
        }

        public int read() throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseInputStream#read()");
        }

        public int read(byte[] arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseInputStream#read([B)");
        }

        public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseInputStream#read([B,int,int)");
        }

    }
    public static final class AutoCloseOutputStream {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutoCloseOutputStream(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.AutoCloseOutputStream wrap(android.os.ParcelFileDescriptor.AutoCloseOutputStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.AutoCloseOutputStream(real, (__DcgwBridgeToken) null);
        }

        public android.os.ParcelFileDescriptor.AutoCloseOutputStream getReal() {
            return (android.os.ParcelFileDescriptor.AutoCloseOutputStream) real;
        }

        public android.os.ParcelFileDescriptor.AutoCloseOutputStream unwrap() {
            return getReal();
        }

        public AutoCloseOutputStream(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseOutputStream#android.os.ParcelFileDescriptor$AutoCloseOutputStream(android.os.ParcelFileDescriptor)");
        }

        public void close() throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$AutoCloseOutputStream#close()");
        }

    }
    public static final class FileDescriptorDetachedException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FileDescriptorDetachedException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.FileDescriptorDetachedException wrap(android.os.ParcelFileDescriptor.FileDescriptorDetachedException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.FileDescriptorDetachedException(real, (__DcgwBridgeToken) null);
        }

        public android.os.ParcelFileDescriptor.FileDescriptorDetachedException getReal() {
            return (android.os.ParcelFileDescriptor.FileDescriptorDetachedException) real;
        }

        public android.os.ParcelFileDescriptor.FileDescriptorDetachedException unwrap() {
            return getReal();
        }

        public FileDescriptorDetachedException() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$FileDescriptorDetachedException#android.os.ParcelFileDescriptor$FileDescriptorDetachedException()");
        }

    }
    public static final class OnCloseListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCloseListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.OnCloseListener wrap(android.os.ParcelFileDescriptor.OnCloseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.OnCloseListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.ParcelFileDescriptor.OnCloseListener getReal() {
            return (android.os.ParcelFileDescriptor.OnCloseListener) real;
        }

        public android.os.ParcelFileDescriptor.OnCloseListener unwrap() {
            return getReal();
        }

        public void onClose(java.io.IOException arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFileDescriptor$OnCloseListener#onClose(java.io.IOException)");
        }

    }
}
