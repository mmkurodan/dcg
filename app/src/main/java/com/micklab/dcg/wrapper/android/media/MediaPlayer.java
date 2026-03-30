// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaPlayer {
    private final android.media.MediaPlayer real;

    public MediaPlayer(android.media.MediaPlayer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer wrap(android.media.MediaPlayer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer(real);
    }

    public android.media.MediaPlayer unwrap() {
        return real;
    }

    public MediaPlayer() {
        this(new android.media.MediaPlayer());
    }

    public MediaPlayer(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.MediaPlayer(arg0 == null ? null : arg0.unwrap()));
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addTimedTextSource(java.io.FileDescriptor arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.addTimedTextSource(arg0, arg1);
    }

    public void addTimedTextSource(java.lang.String arg0, java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.addTimedTextSource(arg0, arg1);
    }

    public void addTimedTextSource(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.addTimedTextSource(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void addTimedTextSource(java.io.FileDescriptor arg0, long arg1, long arg2, java.lang.String arg3) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.addTimedTextSource(arg0, arg1, arg2, arg3);
    }

    public void attachAuxEffect(int arg0) {
        real.attachAuxEffect(arg0);
    }

    public void clearOnMediaTimeDiscontinuityListener() {
        real.clearOnMediaTimeDiscontinuityListener();
    }

    public void clearOnSubtitleDataListener() {
        real.clearOnSubtitleDataListener();
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.view.SurfaceHolder arg2) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.media.AudioAttributes arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaPlayer create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.view.SurfaceHolder arg2, com.micklab.dcg.wrapper.android.media.AudioAttributes arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.wrap(android.media.MediaPlayer.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4));
    }

    public com.micklab.dcg.wrapper.android.media.VolumeShaper createVolumeShaper(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.media.VolumeShaper.wrap(real.createVolumeShaper(arg0 == null ? null : arg0.unwrap()));
    }

    public void deselectTrack(int arg0) throws java.lang.IllegalStateException {
        real.deselectTrack(arg0);
    }

    public int getAudioSessionId() {
        return real.getAudioSessionId();
    }

    public int getCurrentPosition() {
        return real.getCurrentPosition();
    }

    public com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo getDrmInfo() {
        return com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo.wrap(real.getDrmInfo());
    }

    public java.lang.String getDrmPropertyString(java.lang.String arg0) throws android.media.MediaPlayer.NoDrmSchemeException {
        return real.getDrmPropertyString(arg0);
    }

    public int getDuration() {
        return real.getDuration();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getMetrics());
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams getPlaybackParams() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.getPlaybackParams());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getRoutedDevice());
    }

    public int getSelectedTrack(int arg0) throws java.lang.IllegalStateException {
        return real.getSelectedTrack(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams getSyncParams() {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(real.getSyncParams());
    }

    public com.micklab.dcg.wrapper.android.media.MediaTimestamp getTimestamp() {
        return com.micklab.dcg.wrapper.android.media.MediaTimestamp.wrap(real.getTimestamp());
    }

    public android.media.MediaPlayer.TrackInfo[] getTrackInfo() throws java.lang.IllegalStateException {
        return real.getTrackInfo();
    }

    public int getVideoHeight() {
        return real.getVideoHeight();
    }

    public int getVideoWidth() {
        return real.getVideoWidth();
    }

    public boolean isLooping() {
        return real.isLooping();
    }

    public boolean isPlaying() {
        return real.isPlaying();
    }

    public void pause() throws java.lang.IllegalStateException {
        real.pause();
    }

    public void prepare() throws java.io.IOException, java.lang.IllegalStateException {
        real.prepare();
    }

    public void prepareAsync() throws java.lang.IllegalStateException {
        real.prepareAsync();
    }

    public void prepareDrm(java.util.UUID arg0) throws android.media.MediaPlayer.ProvisioningNetworkErrorException, android.media.MediaPlayer.ProvisioningServerErrorException, android.media.ResourceBusyException, android.media.UnsupportedSchemeException {
        real.prepareDrm(arg0);
    }

    public byte[] provideKeyResponse(byte[] arg0, byte[] arg1) throws android.media.DeniedByServerException, android.media.MediaPlayer.NoDrmSchemeException {
        return real.provideKeyResponse(arg0, arg1);
    }

    public void release() {
        real.release();
    }

    public void releaseDrm() throws android.media.MediaPlayer.NoDrmSchemeException {
        real.releaseDrm();
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        real.removeOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public void restoreKeys(byte[] arg0) throws android.media.MediaPlayer.NoDrmSchemeException {
        real.restoreKeys(arg0);
    }

    public void seekTo(int arg0) throws java.lang.IllegalStateException {
        real.seekTo(arg0);
    }

    public void seekTo(long arg0, int arg1) {
        real.seekTo(arg0, arg1);
    }

    public void selectTrack(int arg0) throws java.lang.IllegalStateException {
        real.selectTrack(arg0);
    }

    public void setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
        real.setAudioAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public void setAudioSessionId(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.setAudioSessionId(arg0);
    }

    public void setAudioStreamType(int arg0) {
        real.setAudioStreamType(arg0);
    }

    public void setAuxEffectSendLevel(float arg0) {
        real.setAuxEffectSendLevel(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.media.MediaDataSource arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setDataSource(java.lang.String arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.SecurityException {
        real.setDataSource(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setDataSource(java.io.FileDescriptor arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.setDataSource(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.SecurityException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setDataSource(java.io.FileDescriptor arg0, long arg1, long arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.setDataSource(arg0, arg1, arg2);
    }

    public void setDisplay(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.setDisplay(arg0 == null ? null : arg0.unwrap());
    }

    public void setDrmPropertyString(java.lang.String arg0, java.lang.String arg1) throws android.media.MediaPlayer.NoDrmSchemeException {
        real.setDrmPropertyString(arg0, arg1);
    }

    public void setLooping(boolean arg0) {
        real.setLooping(arg0);
    }

    public void setNextMediaPlayer(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
        real.setNextMediaPlayer(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnBufferingUpdateListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnBufferingUpdateListener arg0) {
        real.setOnBufferingUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnCompletionListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener arg0) {
        real.setOnCompletionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDrmConfigHelper(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmConfigHelper arg0) {
        real.setOnDrmConfigHelper(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDrmInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener arg0) {
        real.setOnDrmInfoListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDrmInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnDrmInfoListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOnDrmPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener arg0) {
        real.setOnDrmPreparedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDrmPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnDrmPreparedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener arg0) {
        real.setOnErrorListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener arg0) {
        real.setOnInfoListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnMediaTimeDiscontinuityListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener arg0) {
        real.setOnMediaTimeDiscontinuityListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnMediaTimeDiscontinuityListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnMediaTimeDiscontinuityListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOnPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener arg0) {
        real.setOnPreparedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnSeekCompleteListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSeekCompleteListener arg0) {
        real.setOnSeekCompleteListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnSubtitleDataListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener arg0) {
        real.setOnSubtitleDataListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnSubtitleDataListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnSubtitleDataListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOnTimedMetaDataAvailableListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedMetaDataAvailableListener arg0) {
        real.setOnTimedMetaDataAvailableListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnTimedTextListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedTextListener arg0) {
        real.setOnTimedTextListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnVideoSizeChangedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnVideoSizeChangedListener arg0) {
        real.setOnVideoSizeChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        real.setPlaybackParams(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return real.setPreferredDevice(arg0 == null ? null : arg0.unwrap());
    }

    public void setScreenOnWhilePlaying(boolean arg0) {
        real.setScreenOnWhilePlaying(arg0);
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void setSyncParams(com.micklab.dcg.wrapper.android.media.SyncParams arg0) {
        real.setSyncParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setVideoScalingMode(int arg0) {
        real.setVideoScalingMode(arg0);
    }

    public void setVolume(float arg0, float arg1) {
        real.setVolume(arg0, arg1);
    }

    public void setWakeMode(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setWakeMode(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void start() throws java.lang.IllegalStateException {
        real.start();
    }

    public void stop() throws java.lang.IllegalStateException {
        real.stop();
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
        private final android.media.MediaPlayer.DrmInfo real;

        public DrmInfo(android.media.MediaPlayer.DrmInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo wrap(android.media.MediaPlayer.DrmInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo(real);
        }

        public android.media.MediaPlayer.DrmInfo unwrap() {
            return real;
        }

        public java.util.UUID[] getSupportedSchemes() {
            return real.getSupportedSchemes();
        }

    }
    public static final class MetricsConstants {
        private final android.media.MediaPlayer.MetricsConstants real;

        public MetricsConstants(android.media.MediaPlayer.MetricsConstants real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.MetricsConstants wrap(android.media.MediaPlayer.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.MetricsConstants(real);
        }

        public android.media.MediaPlayer.MetricsConstants unwrap() {
            return real;
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
        private final android.media.MediaPlayer.NoDrmSchemeException real;

        public NoDrmSchemeException(android.media.MediaPlayer.NoDrmSchemeException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.NoDrmSchemeException wrap(android.media.MediaPlayer.NoDrmSchemeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.NoDrmSchemeException(real);
        }

        public android.media.MediaPlayer.NoDrmSchemeException unwrap() {
            return real;
        }

        public NoDrmSchemeException(java.lang.String arg0) {
            this(new android.media.MediaPlayer.NoDrmSchemeException(arg0));
        }

    }
    public static final class OnBufferingUpdateListener {
        private final android.media.MediaPlayer.OnBufferingUpdateListener real;

        public OnBufferingUpdateListener(android.media.MediaPlayer.OnBufferingUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnBufferingUpdateListener wrap(android.media.MediaPlayer.OnBufferingUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnBufferingUpdateListener(real);
        }

        public android.media.MediaPlayer.OnBufferingUpdateListener unwrap() {
            return real;
        }

        public void onBufferingUpdate(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1) {
            real.onBufferingUpdate(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnCompletionListener {
        private final android.media.MediaPlayer.OnCompletionListener real;

        public OnCompletionListener(android.media.MediaPlayer.OnCompletionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener wrap(android.media.MediaPlayer.OnCompletionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener(real);
        }

        public android.media.MediaPlayer.OnCompletionListener unwrap() {
            return real;
        }

        public void onCompletion(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            real.onCompletion(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnDrmConfigHelper {
        private final android.media.MediaPlayer.OnDrmConfigHelper real;

        public OnDrmConfigHelper(android.media.MediaPlayer.OnDrmConfigHelper real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmConfigHelper wrap(android.media.MediaPlayer.OnDrmConfigHelper real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmConfigHelper(real);
        }

        public android.media.MediaPlayer.OnDrmConfigHelper unwrap() {
            return real;
        }

        public void onDrmConfig(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            real.onDrmConfig(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnDrmInfoListener {
        private final android.media.MediaPlayer.OnDrmInfoListener real;

        public OnDrmInfoListener(android.media.MediaPlayer.OnDrmInfoListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener wrap(android.media.MediaPlayer.OnDrmInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmInfoListener(real);
        }

        public android.media.MediaPlayer.OnDrmInfoListener unwrap() {
            return real;
        }

        public void onDrmInfo(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.MediaPlayer.DrmInfo arg1) {
            real.onDrmInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnDrmPreparedListener {
        private final android.media.MediaPlayer.OnDrmPreparedListener real;

        public OnDrmPreparedListener(android.media.MediaPlayer.OnDrmPreparedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener wrap(android.media.MediaPlayer.OnDrmPreparedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnDrmPreparedListener(real);
        }

        public android.media.MediaPlayer.OnDrmPreparedListener unwrap() {
            return real;
        }

        public void onDrmPrepared(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1) {
            real.onDrmPrepared(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnErrorListener {
        private final android.media.MediaPlayer.OnErrorListener real;

        public OnErrorListener(android.media.MediaPlayer.OnErrorListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener wrap(android.media.MediaPlayer.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener(real);
        }

        public android.media.MediaPlayer.OnErrorListener unwrap() {
            return real;
        }

        public boolean onError(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1, int arg2) {
            return real.onError(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class OnInfoListener {
        private final android.media.MediaPlayer.OnInfoListener real;

        public OnInfoListener(android.media.MediaPlayer.OnInfoListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener wrap(android.media.MediaPlayer.OnInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener(real);
        }

        public android.media.MediaPlayer.OnInfoListener unwrap() {
            return real;
        }

        public boolean onInfo(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1, int arg2) {
            return real.onInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class OnMediaTimeDiscontinuityListener {
        private final android.media.MediaPlayer.OnMediaTimeDiscontinuityListener real;

        public OnMediaTimeDiscontinuityListener(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener wrap(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnMediaTimeDiscontinuityListener(real);
        }

        public android.media.MediaPlayer.OnMediaTimeDiscontinuityListener unwrap() {
            return real;
        }

        public void onMediaTimeDiscontinuity(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.MediaTimestamp arg1) {
            real.onMediaTimeDiscontinuity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnPreparedListener {
        private final android.media.MediaPlayer.OnPreparedListener real;

        public OnPreparedListener(android.media.MediaPlayer.OnPreparedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener wrap(android.media.MediaPlayer.OnPreparedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener(real);
        }

        public android.media.MediaPlayer.OnPreparedListener unwrap() {
            return real;
        }

        public void onPrepared(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            real.onPrepared(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnSeekCompleteListener {
        private final android.media.MediaPlayer.OnSeekCompleteListener real;

        public OnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSeekCompleteListener wrap(android.media.MediaPlayer.OnSeekCompleteListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSeekCompleteListener(real);
        }

        public android.media.MediaPlayer.OnSeekCompleteListener unwrap() {
            return real;
        }

        public void onSeekComplete(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0) {
            real.onSeekComplete(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnSubtitleDataListener {
        private final android.media.MediaPlayer.OnSubtitleDataListener real;

        public OnSubtitleDataListener(android.media.MediaPlayer.OnSubtitleDataListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener wrap(android.media.MediaPlayer.OnSubtitleDataListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnSubtitleDataListener(real);
        }

        public android.media.MediaPlayer.OnSubtitleDataListener unwrap() {
            return real;
        }

        public void onSubtitleData(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.SubtitleData arg1) {
            real.onSubtitleData(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnTimedMetaDataAvailableListener {
        private final android.media.MediaPlayer.OnTimedMetaDataAvailableListener real;

        public OnTimedMetaDataAvailableListener(android.media.MediaPlayer.OnTimedMetaDataAvailableListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedMetaDataAvailableListener wrap(android.media.MediaPlayer.OnTimedMetaDataAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedMetaDataAvailableListener(real);
        }

        public android.media.MediaPlayer.OnTimedMetaDataAvailableListener unwrap() {
            return real;
        }

        public void onTimedMetaDataAvailable(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.TimedMetaData arg1) {
            real.onTimedMetaDataAvailable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnTimedTextListener {
        private final android.media.MediaPlayer.OnTimedTextListener real;

        public OnTimedTextListener(android.media.MediaPlayer.OnTimedTextListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedTextListener wrap(android.media.MediaPlayer.OnTimedTextListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnTimedTextListener(real);
        }

        public android.media.MediaPlayer.OnTimedTextListener unwrap() {
            return real;
        }

        public void onTimedText(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, com.micklab.dcg.wrapper.android.media.TimedText arg1) {
            real.onTimedText(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnVideoSizeChangedListener {
        private final android.media.MediaPlayer.OnVideoSizeChangedListener real;

        public OnVideoSizeChangedListener(android.media.MediaPlayer.OnVideoSizeChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.OnVideoSizeChangedListener wrap(android.media.MediaPlayer.OnVideoSizeChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.OnVideoSizeChangedListener(real);
        }

        public android.media.MediaPlayer.OnVideoSizeChangedListener unwrap() {
            return real;
        }

        public void onVideoSizeChanged(com.micklab.dcg.wrapper.android.media.MediaPlayer arg0, int arg1, int arg2) {
            real.onVideoSizeChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class ProvisioningNetworkErrorException {
        private final android.media.MediaPlayer.ProvisioningNetworkErrorException real;

        public ProvisioningNetworkErrorException(android.media.MediaPlayer.ProvisioningNetworkErrorException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningNetworkErrorException wrap(android.media.MediaPlayer.ProvisioningNetworkErrorException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningNetworkErrorException(real);
        }

        public android.media.MediaPlayer.ProvisioningNetworkErrorException unwrap() {
            return real;
        }

        public ProvisioningNetworkErrorException(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaPlayer$ProvisioningNetworkErrorException#android.media.MediaPlayer$ProvisioningNetworkErrorException(java.lang.String)");
        }

    }
    public static final class ProvisioningServerErrorException {
        private final android.media.MediaPlayer.ProvisioningServerErrorException real;

        public ProvisioningServerErrorException(android.media.MediaPlayer.ProvisioningServerErrorException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningServerErrorException wrap(android.media.MediaPlayer.ProvisioningServerErrorException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.ProvisioningServerErrorException(real);
        }

        public android.media.MediaPlayer.ProvisioningServerErrorException unwrap() {
            return real;
        }

        public ProvisioningServerErrorException(java.lang.String arg0) {
            this(new android.media.MediaPlayer.ProvisioningServerErrorException(arg0));
        }

    }
    public static final class TrackInfo {
        private final android.media.MediaPlayer.TrackInfo real;

        public TrackInfo(android.media.MediaPlayer.TrackInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaPlayer.TrackInfo wrap(android.media.MediaPlayer.TrackInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaPlayer.TrackInfo(real);
        }

        public android.media.MediaPlayer.TrackInfo unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.media.MediaFormat getFormat() {
            return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getFormat());
        }

        public java.lang.String getLanguage() {
            return real.getLanguage();
        }

        public int getTrackType() {
            return real.getTrackType();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int MEDIA_TRACK_TYPE_AUDIO = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_AUDIO;
        public static final int MEDIA_TRACK_TYPE_METADATA = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_METADATA;
        public static final int MEDIA_TRACK_TYPE_SUBTITLE = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_SUBTITLE;
        public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_TIMEDTEXT;
        public static final int MEDIA_TRACK_TYPE_UNKNOWN = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_UNKNOWN;
        public static final int MEDIA_TRACK_TYPE_VIDEO = android.media.MediaPlayer.TrackInfo.MEDIA_TRACK_TYPE_VIDEO;

    }
}
