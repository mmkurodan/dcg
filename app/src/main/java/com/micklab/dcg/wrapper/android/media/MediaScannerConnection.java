// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaScannerConnection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaScannerConnection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaScannerConnection wrap(android.media.MediaScannerConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaScannerConnection(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaScannerConnection getReal() {
        return (android.media.MediaScannerConnection) real;
    }

    public android.media.MediaScannerConnection unwrap() {
        return getReal();
    }

    public MediaScannerConnection(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.MediaScannerConnection.MediaScannerConnectionClient arg1) {
        this(new android.media.MediaScannerConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void connect() {
        ((android.media.MediaScannerConnection) real).connect();
    }

    public void disconnect() {
        ((android.media.MediaScannerConnection) real).disconnect();
    }

    public boolean isConnected() {
        return ((android.media.MediaScannerConnection) real).isConnected();
    }

    public void onServiceConnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1) {
        ((android.media.MediaScannerConnection) real).onServiceConnected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onServiceDisconnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.media.MediaScannerConnection) real).onServiceDisconnected(arg0 == null ? null : arg0.getReal());
    }

    public void scanFile(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaScannerConnection#scanFile(java.lang.String,java.lang.String)");
    }

    public static void scanFile(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String[] arg1, java.lang.String[] arg2, com.micklab.dcg.wrapper.android.media.MediaScannerConnection.OnScanCompletedListener arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaScannerConnection#scanFile(android.content.Context,[Ljava.lang.String;,[Ljava.lang.String;,android.media.MediaScannerConnection$OnScanCompletedListener)");
    }

    public static final class MediaScannerConnectionClient {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaScannerConnectionClient(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaScannerConnection.MediaScannerConnectionClient wrap(android.media.MediaScannerConnection.MediaScannerConnectionClient real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaScannerConnection.MediaScannerConnectionClient(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaScannerConnection.MediaScannerConnectionClient getReal() {
            return (android.media.MediaScannerConnection.MediaScannerConnectionClient) real;
        }

        public android.media.MediaScannerConnection.MediaScannerConnectionClient unwrap() {
            return getReal();
        }

        public void onMediaScannerConnected() {
            ((android.media.MediaScannerConnection.MediaScannerConnectionClient) real).onMediaScannerConnected();
        }

    }
    public static final class OnScanCompletedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnScanCompletedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaScannerConnection.OnScanCompletedListener wrap(android.media.MediaScannerConnection.OnScanCompletedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaScannerConnection.OnScanCompletedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaScannerConnection.OnScanCompletedListener getReal() {
            return (android.media.MediaScannerConnection.OnScanCompletedListener) real;
        }

        public android.media.MediaScannerConnection.OnScanCompletedListener unwrap() {
            return getReal();
        }

        public void onScanCompleted(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            ((android.media.MediaScannerConnection.OnScanCompletedListener) real).onScanCompleted(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
}
