// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class FileUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FileUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.FileUtils wrap(android.os.FileUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.FileUtils(real, (__DcgwBridgeToken) null);
    }

    public android.os.FileUtils getReal() {
        return (android.os.FileUtils) real;
    }

    public android.os.FileUtils unwrap() {
        return getReal();
    }

    public static void closeQuietly(java.lang.AutoCloseable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils#closeQuietly(java.lang.AutoCloseable)");
    }

    public static void closeQuietly(java.io.FileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils#closeQuietly(java.io.FileDescriptor)");
    }

    public static long copy(java.io.InputStream arg0, java.io.OutputStream arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils#copy(java.io.InputStream,java.io.OutputStream)");
    }

    public static long copy(java.io.FileDescriptor arg0, java.io.FileDescriptor arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils#copy(java.io.FileDescriptor,java.io.FileDescriptor)");
    }

    public static long copy(java.io.FileDescriptor arg0, java.io.FileDescriptor arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.os.FileUtils.ProgressListener arg4) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils#copy(java.io.FileDescriptor,java.io.FileDescriptor,android.os.CancellationSignal,java.util.concurrent.Executor,android.os.FileUtils$ProgressListener)");
    }

    public static long copy(java.io.InputStream arg0, java.io.OutputStream arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.os.FileUtils.ProgressListener arg4) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils#copy(java.io.InputStream,java.io.OutputStream,android.os.CancellationSignal,java.util.concurrent.Executor,android.os.FileUtils$ProgressListener)");
    }

    public static final class ProgressListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProgressListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.FileUtils.ProgressListener wrap(android.os.FileUtils.ProgressListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.FileUtils.ProgressListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.FileUtils.ProgressListener getReal() {
            return (android.os.FileUtils.ProgressListener) real;
        }

        public android.os.FileUtils.ProgressListener unwrap() {
            return getReal();
        }

        public void onProgress(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUtils$ProgressListener#onProgress(long)");
        }

    }
}
