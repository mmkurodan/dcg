// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RemoteController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RemoteController wrap(android.media.RemoteController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteController(real, (__DcgwBridgeToken) null);
    }

    public android.media.RemoteController getReal() {
        return (android.media.RemoteController) real;
    }

    public android.media.RemoteController unwrap() {
        return getReal();
    }

    public RemoteController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener arg1) throws java.lang.IllegalArgumentException {
        this(new android.media.RemoteController(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public RemoteController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener arg1, com.micklab.dcg.wrapper.android.os.Looper arg2) throws java.lang.IllegalArgumentException {
        this(new android.media.RemoteController(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean clearArtworkConfiguration() {
        return ((android.media.RemoteController) real).clearArtworkConfiguration();
    }

    public android.media.RemoteController.MetadataEditor editMetadata() {
        return ((android.media.RemoteController) real).editMetadata();
    }

    public long getEstimatedMediaPosition() {
        return ((android.media.RemoteController) real).getEstimatedMediaPosition();
    }

    public boolean seekTo(long arg0) throws java.lang.IllegalArgumentException {
        return ((android.media.RemoteController) real).seekTo(arg0);
    }

    public boolean sendMediaKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) throws java.lang.IllegalArgumentException {
        return ((android.media.RemoteController) real).sendMediaKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean setArtworkConfiguration(int arg0, int arg1) throws java.lang.IllegalArgumentException {
        return ((android.media.RemoteController) real).setArtworkConfiguration(arg0, arg1);
    }

    public boolean setSynchronizationMode(int arg0) throws java.lang.IllegalArgumentException {
        return ((android.media.RemoteController) real).setSynchronizationMode(arg0);
    }

    public static final int POSITION_SYNCHRONIZATION_CHECK = android.media.RemoteController.POSITION_SYNCHRONIZATION_CHECK;
    public static final int POSITION_SYNCHRONIZATION_NONE = android.media.RemoteController.POSITION_SYNCHRONIZATION_NONE;

    public static final class OnClientUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnClientUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener wrap(android.media.RemoteController.OnClientUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteController.OnClientUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.RemoteController.OnClientUpdateListener getReal() {
            return (android.media.RemoteController.OnClientUpdateListener) real;
        }

        public android.media.RemoteController.OnClientUpdateListener unwrap() {
            return getReal();
        }

        public void onClientChange(boolean arg0) {
            ((android.media.RemoteController.OnClientUpdateListener) real).onClientChange(arg0);
        }

        public void onClientMetadataUpdate(android.media.RemoteController.MetadataEditor arg0) {
            ((android.media.RemoteController.OnClientUpdateListener) real).onClientMetadataUpdate(arg0);
        }

        public void onClientPlaybackStateUpdate(int arg0) {
            ((android.media.RemoteController.OnClientUpdateListener) real).onClientPlaybackStateUpdate(arg0);
        }

        public void onClientPlaybackStateUpdate(int arg0, long arg1, long arg2, float arg3) {
            ((android.media.RemoteController.OnClientUpdateListener) real).onClientPlaybackStateUpdate(arg0, arg1, arg2, arg3);
        }

        public void onClientTransportControlUpdate(int arg0) {
            ((android.media.RemoteController.OnClientUpdateListener) real).onClientTransportControlUpdate(arg0);
        }

    }
}
