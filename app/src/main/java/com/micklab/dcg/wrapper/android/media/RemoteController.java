// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RemoteController {
    private final android.media.RemoteController real;

    public RemoteController(android.media.RemoteController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RemoteController wrap(android.media.RemoteController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteController(real);
    }

    public android.media.RemoteController unwrap() {
        return real;
    }

    public RemoteController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener arg1) throws java.lang.IllegalArgumentException {
        this(new android.media.RemoteController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RemoteController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener arg1, com.micklab.dcg.wrapper.android.os.Looper arg2) throws java.lang.IllegalArgumentException {
        this(new android.media.RemoteController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public boolean clearArtworkConfiguration() {
        return real.clearArtworkConfiguration();
    }

    public android.media.RemoteController.MetadataEditor editMetadata() {
        return real.editMetadata();
    }

    public long getEstimatedMediaPosition() {
        return real.getEstimatedMediaPosition();
    }

    public boolean seekTo(long arg0) throws java.lang.IllegalArgumentException {
        return real.seekTo(arg0);
    }

    public boolean sendMediaKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) throws java.lang.IllegalArgumentException {
        return real.sendMediaKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setArtworkConfiguration(int arg0, int arg1) throws java.lang.IllegalArgumentException {
        return real.setArtworkConfiguration(arg0, arg1);
    }

    public boolean setSynchronizationMode(int arg0) throws java.lang.IllegalArgumentException {
        return real.setSynchronizationMode(arg0);
    }

    public static final int POSITION_SYNCHRONIZATION_CHECK = android.media.RemoteController.POSITION_SYNCHRONIZATION_CHECK;
    public static final int POSITION_SYNCHRONIZATION_NONE = android.media.RemoteController.POSITION_SYNCHRONIZATION_NONE;

    public static final class OnClientUpdateListener {
        private final android.media.RemoteController.OnClientUpdateListener real;

        public OnClientUpdateListener(android.media.RemoteController.OnClientUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener wrap(android.media.RemoteController.OnClientUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener(real);
        }

        public android.media.RemoteController.OnClientUpdateListener unwrap() {
            return real;
        }

        public void onClientChange(boolean arg0) {
            real.onClientChange(arg0);
        }

        public void onClientMetadataUpdate(android.media.RemoteController.MetadataEditor arg0) {
            real.onClientMetadataUpdate(arg0);
        }

        public void onClientPlaybackStateUpdate(int arg0) {
            real.onClientPlaybackStateUpdate(arg0);
        }

        public void onClientPlaybackStateUpdate(int arg0, long arg1, long arg2, float arg3) {
            real.onClientPlaybackStateUpdate(arg0, arg1, arg2, arg3);
        }

        public void onClientTransportControlUpdate(int arg0) {
            real.onClientTransportControlUpdate(arg0);
        }

    }
}
