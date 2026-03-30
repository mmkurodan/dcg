// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaScannerConnection {
    private final android.media.MediaScannerConnection real;

    public MediaScannerConnection(android.media.MediaScannerConnection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaScannerConnection wrap(android.media.MediaScannerConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaScannerConnection(real);
    }

    public android.media.MediaScannerConnection unwrap() {
        return real;
    }

    public MediaScannerConnection(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.MediaScannerConnection.MediaScannerConnectionClient arg1) {
        this(new android.media.MediaScannerConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void connect() {
        real.connect();
    }

    public void disconnect() {
        real.disconnect();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public void onServiceConnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1) {
        real.onServiceConnected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onServiceDisconnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.onServiceDisconnected(arg0 == null ? null : arg0.unwrap());
    }

    public void scanFile(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaScannerConnection#scanFile(java.lang.String,java.lang.String)");
    }

    public static void scanFile(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String[] arg1, java.lang.String[] arg2, com.micklab.dcg.wrapper.android.media.MediaScannerConnection.OnScanCompletedListener arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaScannerConnection#scanFile(android.content.Context,[Ljava.lang.String;,[Ljava.lang.String;,android.media.MediaScannerConnection$OnScanCompletedListener)");
    }

    public static final class MediaScannerConnectionClient {
        private final android.media.MediaScannerConnection.MediaScannerConnectionClient real;

        public MediaScannerConnectionClient(android.media.MediaScannerConnection.MediaScannerConnectionClient real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaScannerConnection.MediaScannerConnectionClient wrap(android.media.MediaScannerConnection.MediaScannerConnectionClient real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaScannerConnection.MediaScannerConnectionClient(real);
        }

        public android.media.MediaScannerConnection.MediaScannerConnectionClient unwrap() {
            return real;
        }

        public void onMediaScannerConnected() {
            real.onMediaScannerConnected();
        }

    }
    public static final class OnScanCompletedListener {
        private final android.media.MediaScannerConnection.OnScanCompletedListener real;

        public OnScanCompletedListener(android.media.MediaScannerConnection.OnScanCompletedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaScannerConnection.OnScanCompletedListener wrap(android.media.MediaScannerConnection.OnScanCompletedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaScannerConnection.OnScanCompletedListener(real);
        }

        public android.media.MediaScannerConnection.OnScanCompletedListener unwrap() {
            return real;
        }

        public void onScanCompleted(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            real.onScanCompleted(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
}
