// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaPlayer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaPlayer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer wrap(android.media.MediaPlayer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaPlayer getReal() {
        return (android.media.MediaPlayer) real;
    }

    public android.media.MediaPlayer unwrap() {
        return getReal();
    }

    public MediaPlayer() {
        this(new android.media.MediaPlayer(), (__DcgwBridgeToken) null);
    }

    public MediaPlayer(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.MediaPlayer(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaPlayer) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addTimedTextSource(java.io.FileDescriptor arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).addTimedTextSource(arg0, arg1);
    }

    public void addTimedTextSource(java.lang.String arg0, java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).addTimedTextSource(arg0, arg1);
    }

    public void addTimedTextSource(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).addTimedTextSource(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void addTimedTextSource(java.io.FileDescriptor arg0, long arg1, long arg2, java.lang.String arg3) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).addTimedTextSource(arg0, arg1, arg2, arg3);
    }

    public void attachAuxEffect(int arg0) {
        ((android.media.MediaPlayer) real).attachAuxEffect(arg0);
    }

    public void clearOnMediaTimeDiscontinuityListener() {
        ((android.media.MediaPlayer) real).clearOnMediaTimeDiscontinuityListener();
    }

    public void clearOnSubtitleDataListener() {
        ((android.media.MediaPlayer) real).clearOnSubtitleDataListener();
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.view.SurfaceHolder arg2) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.media.AudioAttributes arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.view.SurfaceHolder arg2, com.micklab.dcg.wrapper.android.media.AudioAttributes arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4));
    }

    public com.micklab.dcg.wrapper.android.media.VolumeShaper createVolumeShaper(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.media.VolumeShaper.wrap(((android.media.MediaPlayer) real).createVolumeShaper(arg0 == null ? null : arg0.getReal()));
    }

    public void deselectTrack(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).deselectTrack(arg0);
    }

    public int getAudioSessionId() {
        return ((android.media.MediaPlayer) real).getAudioSessionId();
    }

    public int getCurrentPosition() {
        return ((android.media.MediaPlayer) real).getCurrentPosition();
    }

    public com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo getDrmInfo() {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo.wrap(((android.media.MediaPlayer) real).getDrmInfo());
    }

    public java.lang.String getDrmPropertyString(java.lang.String arg0) throws android.media.MediaPlayer.NoDrmSchemeException {
        return ((android.media.MediaPlayer) real).getDrmPropertyString(arg0);
    }

    public int getDuration() {
        return ((android.media.MediaPlayer) real).getDuration();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.MediaPlayer) real).getMetrics());
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams getPlaybackParams() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.MediaPlayer) real).getPlaybackParams());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.MediaPlayer) real).getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.MediaPlayer) real).getRoutedDevice());
    }

    public int getSelectedTrack(int arg0) throws java.lang.IllegalStateException {
        return ((android.media.MediaPlayer) real).getSelectedTrack(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams getSyncParams() {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.MediaPlayer) real).getSyncParams());
    }

    public com.micklab.dcg.wrapper.android.media.MediaTimestamp getTimestamp() {
        return com.micklab.dcg.wrapper.android.media.MediaTimestamp.wrap(((android.media.MediaPlayer) real).getTimestamp());
    }

    public android.media.MediaPlayer.TrackInfo[] getTrackInfo() throws java.lang.IllegalStateException {
        return ((android.media.MediaPlayer) real).getTrackInfo();
    }

    public int getVideoHeight() {
        return ((android.media.MediaPlayer) real).getVideoHeight();
    }

    public int getVideoWidth() {
        return ((android.media.MediaPlayer) real).getVideoWidth();
    }

    public boolean isLooping() {
        return ((android.media.MediaPlayer) real).isLooping();
    }

    public boolean isPlaying() {
        return ((android.media.MediaPlayer) real).isPlaying();
    }

    public void pause() throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).pause();
    }

    public void prepare() throws java.io.IOException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).prepare();
    }

    public void prepareAsync() throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).prepareAsync();
    }

    public void prepareDrm(java.util.UUID arg0) throws android.media.MediaPlayer.ProvisioningNetworkErrorException, android.media.MediaPlayer.ProvisioningServerErrorException, android.media.ResourceBusyException, android.media.UnsupportedSchemeException {
        ((android.media.MediaPlayer) real).prepareDrm(arg0);
    }

    public byte[] provideKeyResponse(byte[] arg0, byte[] arg1) throws android.media.DeniedByServerException, android.media.MediaPlayer.NoDrmSchemeException {
        return ((android.media.MediaPlayer) real).provideKeyResponse(arg0, arg1);
    }

    public void release() {
        ((android.media.MediaPlayer) real).release();
    }

    public void releaseDrm() throws android.media.MediaPlayer.NoDrmSchemeException {
        ((android.media.MediaPlayer) real).releaseDrm();
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        ((android.media.MediaPlayer) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.media.MediaPlayer) real).reset();
    }

    public void restoreKeys(byte[] arg0) throws android.media.MediaPlayer.NoDrmSchemeException {
        ((android.media.MediaPlayer) real).restoreKeys(arg0);
    }

    public void seekTo(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).seekTo(arg0);
    }

    public void seekTo(long arg0, int arg1) {
        ((android.media.MediaPlayer) real).seekTo(arg0, arg1);
    }

    public void selectTrack(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).selectTrack(arg0);
    }

    public void setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
        ((android.media.MediaPlayer) real).setAudioAttributes(arg0 == null ? null : arg0.getReal());
    }

    public void setAudioSessionId(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).setAudioSessionId(arg0);
    }

    public void setAudioStreamType(int arg0) {
        ((android.media.MediaPlayer) real).setAudioStreamType(arg0);
    }

    public void setAuxEffectSendLevel(float arg0) {
        ((android.media.MediaPlayer) real).setAuxEffectSendLevel(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.media.MediaDataSource arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).setDataSource(arg0 == null ? null : arg0.getReal());
    }

    public void setDataSource(java.lang.String arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.SecurityException {
        ((android.media.MediaPlayer) real).setDataSource(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).setDataSource(arg0 == null ? null : arg0.getReal());
    }

    public void setDataSource(java.io.FileDescriptor arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).setDataSource(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.SecurityException {
        ((android.media.MediaPlayer) real).setDataSource(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setDataSource(java.io.FileDescriptor arg0, long arg1, long arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).setDataSource(arg0, arg1, arg2);
    }

    public void setDisplay(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.media.MediaPlayer) real).setDisplay(arg0 == null ? null : arg0.getReal());
    }

    public void setDrmPropertyString(java.lang.String arg0, java.lang.String arg1) throws android.media.MediaPlayer.NoDrmSchemeException {
        ((android.media.MediaPlayer) real).setDrmPropertyString(arg0, arg1);
    }

    public void setLooping(boolean arg0) {
        ((android.media.MediaPlayer) real).setLooping(arg0);
    }

    public void setNextMediaPlayer(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
        ((android.media.MediaPlayer) real).setNextMediaPlayer(arg0 == null ? null : arg0.getReal());
    }

    public void setOnBufferingUpdateListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnBufferingUpdateListener arg0) {
        ((android.media.MediaPlayer) real).setOnBufferingUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnCompletionListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener arg0) {
        ((android.media.MediaPlayer) real).setOnCompletionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDrmConfigHelper(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmConfigHelper arg0) {
        ((android.media.MediaPlayer) real).setOnDrmConfigHelper(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDrmInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener arg0) {
        ((android.media.MediaPlayer) real).setOnDrmInfoListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDrmInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaPlayer) real).setOnDrmInfoListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnDrmPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener arg0) {
        ((android.media.MediaPlayer) real).setOnDrmPreparedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDrmPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaPlayer) real).setOnDrmPreparedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener arg0) {
        ((android.media.MediaPlayer) real).setOnErrorListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener arg0) {
        ((android.media.MediaPlayer) real).setOnInfoListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnMediaTimeDiscontinuityListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener arg0) {
        ((android.media.MediaPlayer) real).setOnMediaTimeDiscontinuityListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnMediaTimeDiscontinuityListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaPlayer) real).setOnMediaTimeDiscontinuityListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener arg0) {
        ((android.media.MediaPlayer) real).setOnPreparedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnSeekCompleteListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSeekCompleteListener arg0) {
        ((android.media.MediaPlayer) real).setOnSeekCompleteListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnSubtitleDataListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener arg0) {
        ((android.media.MediaPlayer) real).setOnSubtitleDataListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnSubtitleDataListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaPlayer) real).setOnSubtitleDataListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnTimedMetaDataAvailableListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedMetaDataAvailableListener arg0) {
        ((android.media.MediaPlayer) real).setOnTimedMetaDataAvailableListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnTimedTextListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedTextListener arg0) {
        ((android.media.MediaPlayer) real).setOnTimedTextListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnVideoSizeChangedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnVideoSizeChangedListener arg0) {
        ((android.media.MediaPlayer) real).setOnVideoSizeChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        ((android.media.MediaPlayer) real).setPlaybackParams(arg0 == null ? null : arg0.getReal());
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return ((android.media.MediaPlayer) real).setPreferredDevice(arg0 == null ? null : arg0.getReal());
    }

    public void setScreenOnWhilePlaying(boolean arg0) {
        ((android.media.MediaPlayer) real).setScreenOnWhilePlaying(arg0);
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.media.MediaPlayer) real).setSurface(arg0 == null ? null : arg0.getReal());
    }

    public void setSyncParams(com.micklab.dcg.wrapper.android.media.SyncParams arg0) {
        ((android.media.MediaPlayer) real).setSyncParams(arg0 == null ? null : arg0.getReal());
    }

    public void setVideoScalingMode(int arg0) {
        ((android.media.MediaPlayer) real).setVideoScalingMode(arg0);
    }

    public void setVolume(float arg0, float arg1) {
        ((android.media.MediaPlayer) real).setVolume(arg0, arg1);
    }

    public void setWakeMode(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.media.MediaPlayer) real).setWakeMode(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void start() throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).start();
    }

    public void stop() throws java.lang.IllegalStateException {
        ((android.media.MediaPlayer) real).stop();
    }

    public static final int MEDIA_ERROR_IO = android.media.MediaPlayer.MEDIA_ERROR_IO;
    public static final int MEDIA_ERROR_MALFORMED = android.media.MediaPlayer.MEDIA_ERROR_MALFORMED;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = android.media.MediaPlayer.MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK;
    public static final int MEDIA_ERROR_SERVER_DIED = android.media.MediaPlayer.MEDIA_ERROR_SERVER_DIED;
    public static final int MEDIA_ERROR_TIMED_OUT = android.media.MediaPlayer.MEDIA_ERROR_TIMED_OUT;
    public static final int MEDIA_ERROR_UNKNOWN = android.media.MediaPlayer.MEDIA_ERROR_UNKNOWN;
    public static final int MEDIA_ERROR_UNSUPPORTED = android.media.MediaPlayer.MEDIA_ERROR_UNSUPPORTED;
    public static final int MEDIA_INFO_AUDIO_NOT_PLAYING = android.media.MediaPlayer.MEDIA_INFO_AUDIO_NOT_PLAYING;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = android.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
    public static final int MEDIA_INFO_BUFFERING_END = android.media.MediaPlayer.MEDIA_INFO_BUFFERING_END;
    public static final int MEDIA_INFO_BUFFERING_START = android.media.MediaPlayer.MEDIA_INFO_BUFFERING_START;
    public static final int MEDIA_INFO_METADATA_UPDATE = android.media.MediaPlayer.MEDIA_INFO_METADATA_UPDATE;
    public static final int MEDIA_INFO_NOT_SEEKABLE = android.media.MediaPlayer.MEDIA_INFO_NOT_SEEKABLE;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = android.media.MediaPlayer.MEDIA_INFO_STARTED_AS_NEXT;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = android.media.MediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT;
    public static final int MEDIA_INFO_UNKNOWN = android.media.MediaPlayer.MEDIA_INFO_UNKNOWN;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = android.media.MediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE;
    public static final int MEDIA_INFO_VIDEO_NOT_PLAYING = android.media.MediaPlayer.MEDIA_INFO_VIDEO_NOT_PLAYING;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = android.media.MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = android.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
    public static final java.lang.String MEDIA_MIMETYPE_TEXT_SUBRIP = android.media.MediaPlayer.MEDIA_MIMETYPE_TEXT_SUBRIP;
    public static final int PREPARE_DRM_STATUS_PREPARATION_ERROR = android.media.MediaPlayer.PREPARE_DRM_STATUS_PREPARATION_ERROR;
    public static final int PREPARE_DRM_STATUS_PROVISIONING_SERVER_ERROR = android.media.MediaPlayer.PREPARE_DRM_STATUS_PROVISIONING_SERVER_ERROR;
    public static final int PREPARE_DRM_STATUS_SUCCESS = android.media.MediaPlayer.PREPARE_DRM_STATUS_SUCCESS;
    public static final int SEEK_CLOSEST = android.media.MediaPlayer.SEEK_CLOSEST;
    public static final int SEEK_CLOSEST_SYNC = android.media.MediaPlayer.SEEK_CLOSEST_SYNC;
    public static final int SEEK_NEXT_SYNC = android.media.MediaPlayer.SEEK_NEXT_SYNC;
    public static final int SEEK_PREVIOUS_SYNC = android.media.MediaPlayer.SEEK_PREVIOUS_SYNC;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = android.media.MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = android.media.MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING;

    public static final class DrmInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DrmInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo wrap(android.media.MediaPlayer.DrmInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.DrmInfo getReal() {
            return (android.media.MediaPlayer.DrmInfo) real;
        }

        public android.media.MediaPlayer.DrmInfo unwrap() {
            return getReal();
        }

        public java.util.UUID[] getSupportedSchemes() {
            return ((android.media.MediaPlayer.DrmInfo) real).getSupportedSchemes();
        }

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.MetricsConstants wrap(android.media.MediaPlayer.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.MetricsConstants getReal() {
            return (android.media.MediaPlayer.MetricsConstants) real;
        }

        public android.media.MediaPlayer.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String CODEC_AUDIO = android.media.MediaPlayer.MetricsConstants.CODEC_AUDIO;
        public static final java.lang.String CODEC_VIDEO = android.media.MediaPlayer.MetricsConstants.CODEC_VIDEO;
        public static final java.lang.String DURATION = android.media.MediaPlayer.MetricsConstants.DURATION;
        public static final java.lang.String ERRORS = android.media.MediaPlayer.MetricsConstants.ERRORS;
        public static final java.lang.String ERROR_CODE = android.media.MediaPlayer.MetricsConstants.ERROR_CODE;
        public static final java.lang.String FRAMES = android.media.MediaPlayer.MetricsConstants.FRAMES;
        public static final java.lang.String FRAMES_DROPPED = android.media.MediaPlayer.MetricsConstants.FRAMES_DROPPED;
        public static final java.lang.String HEIGHT = android.media.MediaPlayer.MetricsConstants.HEIGHT;
        public static final java.lang.String MIME_TYPE_AUDIO = android.media.MediaPlayer.MetricsConstants.MIME_TYPE_AUDIO;
        public static final java.lang.String MIME_TYPE_VIDEO = android.media.MediaPlayer.MetricsConstants.MIME_TYPE_VIDEO;
        public static final java.lang.String PLAYING = android.media.MediaPlayer.MetricsConstants.PLAYING;
        public static final java.lang.String WIDTH = android.media.MediaPlayer.MetricsConstants.WIDTH;

    }
    public static final class NoDrmSchemeException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NoDrmSchemeException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.NoDrmSchemeException wrap(android.media.MediaPlayer.NoDrmSchemeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.NoDrmSchemeException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.NoDrmSchemeException getReal() {
            return (android.media.MediaPlayer.NoDrmSchemeException) real;
        }

        public android.media.MediaPlayer.NoDrmSchemeException unwrap() {
            return getReal();
        }

        public NoDrmSchemeException(java.lang.String arg0) {
            this(new android.media.MediaPlayer.NoDrmSchemeException(arg0), (__DcgwBridgeToken) null);
        }

    }
    public static final class OnBufferingUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnBufferingUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnBufferingUpdateListener wrap(android.media.MediaPlayer.OnBufferingUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnBufferingUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnBufferingUpdateListener getReal() {
            return (android.media.MediaPlayer.OnBufferingUpdateListener) real;
        }

        public android.media.MediaPlayer.OnBufferingUpdateListener unwrap() {
            return getReal();
        }

        public void onBufferingUpdate(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1) {
            ((android.media.MediaPlayer.OnBufferingUpdateListener) real).onBufferingUpdate(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class OnCompletionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCompletionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener wrap(android.media.MediaPlayer.OnCompletionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnCompletionListener getReal() {
            return (android.media.MediaPlayer.OnCompletionListener) real;
        }

        public android.media.MediaPlayer.OnCompletionListener unwrap() {
            return getReal();
        }

        public void onCompletion(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            ((android.media.MediaPlayer.OnCompletionListener) real).onCompletion(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnDrmConfigHelper {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrmConfigHelper(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmConfigHelper wrap(android.media.MediaPlayer.OnDrmConfigHelper real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmConfigHelper(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnDrmConfigHelper getReal() {
            return (android.media.MediaPlayer.OnDrmConfigHelper) real;
        }

        public android.media.MediaPlayer.OnDrmConfigHelper unwrap() {
            return getReal();
        }

        public void onDrmConfig(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            ((android.media.MediaPlayer.OnDrmConfigHelper) real).onDrmConfig(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnDrmInfoListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrmInfoListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener wrap(android.media.MediaPlayer.OnDrmInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnDrmInfoListener getReal() {
            return (android.media.MediaPlayer.OnDrmInfoListener) real;
        }

        public android.media.MediaPlayer.OnDrmInfoListener unwrap() {
            return getReal();
        }

        public void onDrmInfo(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo arg1) {
            ((android.media.MediaPlayer.OnDrmInfoListener) real).onDrmInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnDrmPreparedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrmPreparedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener wrap(android.media.MediaPlayer.OnDrmPreparedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnDrmPreparedListener getReal() {
            return (android.media.MediaPlayer.OnDrmPreparedListener) real;
        }

        public android.media.MediaPlayer.OnDrmPreparedListener unwrap() {
            return getReal();
        }

        public void onDrmPrepared(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1) {
            ((android.media.MediaPlayer.OnDrmPreparedListener) real).onDrmPrepared(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class OnErrorListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnErrorListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener wrap(android.media.MediaPlayer.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnErrorListener getReal() {
            return (android.media.MediaPlayer.OnErrorListener) real;
        }

        public android.media.MediaPlayer.OnErrorListener unwrap() {
            return getReal();
        }

        public boolean onError(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1, int arg2) {
            return ((android.media.MediaPlayer.OnErrorListener) real).onError(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OnInfoListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnInfoListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener wrap(android.media.MediaPlayer.OnInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnInfoListener getReal() {
            return (android.media.MediaPlayer.OnInfoListener) real;
        }

        public android.media.MediaPlayer.OnInfoListener unwrap() {
            return getReal();
        }

        public boolean onInfo(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1, int arg2) {
            return ((android.media.MediaPlayer.OnInfoListener) real).onInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OnMediaTimeDiscontinuityListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMediaTimeDiscontinuityListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener wrap(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnMediaTimeDiscontinuityListener getReal() {
            return (android.media.MediaPlayer.OnMediaTimeDiscontinuityListener) real;
        }

        public android.media.MediaPlayer.OnMediaTimeDiscontinuityListener unwrap() {
            return getReal();
        }

        public void onMediaTimeDiscontinuity(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.MediaTimestamp arg1) {
            ((android.media.MediaPlayer.OnMediaTimeDiscontinuityListener) real).onMediaTimeDiscontinuity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnPreparedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPreparedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener wrap(android.media.MediaPlayer.OnPreparedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnPreparedListener getReal() {
            return (android.media.MediaPlayer.OnPreparedListener) real;
        }

        public android.media.MediaPlayer.OnPreparedListener unwrap() {
            return getReal();
        }

        public void onPrepared(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            ((android.media.MediaPlayer.OnPreparedListener) real).onPrepared(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnSeekCompleteListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSeekCompleteListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSeekCompleteListener wrap(android.media.MediaPlayer.OnSeekCompleteListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSeekCompleteListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnSeekCompleteListener getReal() {
            return (android.media.MediaPlayer.OnSeekCompleteListener) real;
        }

        public android.media.MediaPlayer.OnSeekCompleteListener unwrap() {
            return getReal();
        }

        public void onSeekComplete(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            ((android.media.MediaPlayer.OnSeekCompleteListener) real).onSeekComplete(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnSubtitleDataListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSubtitleDataListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener wrap(android.media.MediaPlayer.OnSubtitleDataListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnSubtitleDataListener getReal() {
            return (android.media.MediaPlayer.OnSubtitleDataListener) real;
        }

        public android.media.MediaPlayer.OnSubtitleDataListener unwrap() {
            return getReal();
        }

        public void onSubtitleData(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.SubtitleData arg1) {
            ((android.media.MediaPlayer.OnSubtitleDataListener) real).onSubtitleData(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnTimedMetaDataAvailableListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTimedMetaDataAvailableListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedMetaDataAvailableListener wrap(android.media.MediaPlayer.OnTimedMetaDataAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedMetaDataAvailableListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnTimedMetaDataAvailableListener getReal() {
            return (android.media.MediaPlayer.OnTimedMetaDataAvailableListener) real;
        }

        public android.media.MediaPlayer.OnTimedMetaDataAvailableListener unwrap() {
            return getReal();
        }

        public void onTimedMetaDataAvailable(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.TimedMetaData arg1) {
            ((android.media.MediaPlayer.OnTimedMetaDataAvailableListener) real).onTimedMetaDataAvailable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnTimedTextListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTimedTextListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedTextListener wrap(android.media.MediaPlayer.OnTimedTextListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedTextListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnTimedTextListener getReal() {
            return (android.media.MediaPlayer.OnTimedTextListener) real;
        }

        public android.media.MediaPlayer.OnTimedTextListener unwrap() {
            return getReal();
        }

        public void onTimedText(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.TimedText arg1) {
            ((android.media.MediaPlayer.OnTimedTextListener) real).onTimedText(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnVideoSizeChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnVideoSizeChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnVideoSizeChangedListener wrap(android.media.MediaPlayer.OnVideoSizeChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnVideoSizeChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.OnVideoSizeChangedListener getReal() {
            return (android.media.MediaPlayer.OnVideoSizeChangedListener) real;
        }

        public android.media.MediaPlayer.OnVideoSizeChangedListener unwrap() {
            return getReal();
        }

        public void onVideoSizeChanged(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1, int arg2) {
            ((android.media.MediaPlayer.OnVideoSizeChangedListener) real).onVideoSizeChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class ProvisioningNetworkErrorException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProvisioningNetworkErrorException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningNetworkErrorException wrap(android.media.MediaPlayer.ProvisioningNetworkErrorException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningNetworkErrorException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.ProvisioningNetworkErrorException getReal() {
            return (android.media.MediaPlayer.ProvisioningNetworkErrorException) real;
        }

        public android.media.MediaPlayer.ProvisioningNetworkErrorException unwrap() {
            return getReal();
        }

        public ProvisioningNetworkErrorException(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaPlayer$ProvisioningNetworkErrorException#android.media.MediaPlayer$ProvisioningNetworkErrorException(java.lang.String)");
        }

    }
    public static final class ProvisioningServerErrorException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProvisioningServerErrorException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningServerErrorException wrap(android.media.MediaPlayer.ProvisioningServerErrorException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningServerErrorException(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.ProvisioningServerErrorException getReal() {
            return (android.media.MediaPlayer.ProvisioningServerErrorException) real;
        }

        public android.media.MediaPlayer.ProvisioningServerErrorException unwrap() {
            return getReal();
        }

        public ProvisioningServerErrorException(java.lang.String arg0) {
            this(new android.media.MediaPlayer.ProvisioningServerErrorException(arg0), (__DcgwBridgeToken) null);
        }

    }
    public static final class TrackInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TrackInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.TrackInfo wrap(android.media.MediaPlayer.TrackInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.TrackInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaPlayer.TrackInfo getReal() {
            return (android.media.MediaPlayer.TrackInfo) real;
        }

        public android.media.MediaPlayer.TrackInfo unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.MediaPlayer.TrackInfo) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.media.MediaFormat getFormat() {
            return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(((android.media.MediaPlayer.TrackInfo) real).getFormat());
        }

        public java.lang.String getLanguage() {
            return ((android.media.MediaPlayer.TrackInfo) real).getLanguage();
        }

        public int getTrackType() {
            return ((android.media.MediaPlayer.TrackInfo) real).getTrackType();
        }

        public java.lang.String toString() {
            return ((android.media.MediaPlayer.TrackInfo) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.MediaPlayer.TrackInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int MEDIA_TRACK_TYPE_AUDIO = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_AUDIO;
        public static final int MEDIA_TRACK_TYPE_METADATA = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_METADATA;
        public static final int MEDIA_TRACK_TYPE_SUBTITLE = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_SUBTITLE;
        public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_TIMEDTEXT;
        public static final int MEDIA_TRACK_TYPE_UNKNOWN = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_UNKNOWN;
        public static final int MEDIA_TRACK_TYPE_VIDEO = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_VIDEO;

    }
}
