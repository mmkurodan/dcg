// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRecorder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaRecorder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRecorder wrap(android.media.MediaRecorder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaRecorder getReal() {
        return (android.media.MediaRecorder) real;
    }

    public android.media.MediaRecorder unwrap() {
        return getReal();
    }

    public MediaRecorder() {
        this(new android.media.MediaRecorder(), (__DcgwBridgeToken) null);
    }

    public MediaRecorder(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.MediaRecorder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaRecorder) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() {
        return com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration.wrap(((android.media.MediaRecorder) real).getActiveRecordingConfiguration());
    }

    public static int getAudioSourceMax() {
        return android.media.MediaRecorder.getAudioSourceMax();
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.MediaRecorder) real).getLogSessionId());
    }

    public int getMaxAmplitude() throws java.lang.IllegalStateException {
        return ((android.media.MediaRecorder) real).getMaxAmplitude();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.MediaRecorder) real).getMetrics());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.MediaRecorder) real).getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.MediaRecorder) real).getRoutedDevice());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.media.MediaRecorder) real).getSurface());
    }

    public boolean isPrivacySensitive() {
        return ((android.media.MediaRecorder) real).isPrivacySensitive();
    }

    public void pause() throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).pause();
    }

    public void prepare() throws java.io.IOException, java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).prepare();
    }

    public void registerAudioRecordingCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg1) {
        ((android.media.MediaRecorder) real).registerAudioRecordingCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void release() {
        ((android.media.MediaRecorder) real).release();
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        ((android.media.MediaRecorder) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.media.MediaRecorder) real).reset();
    }

    public void resume() throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).resume();
    }

    public void setAudioChannels(int arg0) {
        ((android.media.MediaRecorder) real).setAudioChannels(arg0);
    }

    public void setAudioEncoder(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setAudioEncoder(arg0);
    }

    public void setAudioEncodingBitRate(int arg0) {
        ((android.media.MediaRecorder) real).setAudioEncodingBitRate(arg0);
    }

    public void setAudioProfile(com.micklab.dcg.wrapper.android.media.EncoderProfiles.AudioProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setAudioProfile(android.media.EncoderProfiles$AudioProfile)");
    }

    public void setAudioSamplingRate(int arg0) {
        ((android.media.MediaRecorder) real).setAudioSamplingRate(arg0);
    }

    public void setAudioSource(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setAudioSource(arg0);
    }

    public void setCamera(com.micklab.dcg.wrapper.android.hardware.Camera arg0) {
        ((android.media.MediaRecorder) real).setCamera(arg0 == null ? null : arg0.getReal());
    }

    public void setCaptureRate(double arg0) {
        ((android.media.MediaRecorder) real).setCaptureRate(arg0);
    }

    public void setInputSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.media.MediaRecorder) real).setInputSurface(arg0 == null ? null : arg0.getReal());
    }

    public void setLocation(float arg0, float arg1) {
        ((android.media.MediaRecorder) real).setLocation(arg0, arg1);
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        ((android.media.MediaRecorder) real).setLogSessionId(arg0 == null ? null : arg0.getReal());
    }

    public void setMaxDuration(int arg0) throws java.lang.IllegalArgumentException {
        ((android.media.MediaRecorder) real).setMaxDuration(arg0);
    }

    public void setMaxFileSize(long arg0) throws java.lang.IllegalArgumentException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setMaxFileSize(long)");
    }

    public void setNextOutputFile(java.io.File arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setNextOutputFile(java.io.File)");
    }

    public void setNextOutputFile(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setNextOutputFile(java.io.FileDescriptor)");
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaRecorder.OnErrorListener arg0) {
        ((android.media.MediaRecorder) real).setOnErrorListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.media.MediaRecorder.OnInfoListener arg0) {
        ((android.media.MediaRecorder) real).setOnInfoListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOrientationHint(int arg0) {
        ((android.media.MediaRecorder) real).setOrientationHint(arg0);
    }

    public void setOutputFile(java.io.FileDescriptor arg0) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setOutputFile(java.io.FileDescriptor)");
    }

    public void setOutputFile(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setOutputFile(java.io.File)");
    }

    public void setOutputFile(java.lang.String arg0) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setOutputFile(java.lang.String)");
    }

    public void setOutputFormat(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setOutputFormat(arg0);
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return ((android.media.MediaRecorder) real).setPreferredDevice(arg0 == null ? null : arg0.getReal());
    }

    public boolean setPreferredMicrophoneDirection(int arg0) {
        return ((android.media.MediaRecorder) real).setPreferredMicrophoneDirection(arg0);
    }

    public boolean setPreferredMicrophoneFieldDimension(float arg0) {
        return ((android.media.MediaRecorder) real).setPreferredMicrophoneFieldDimension(arg0);
    }

    public void setPreviewDisplay(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.media.MediaRecorder) real).setPreviewDisplay(arg0 == null ? null : arg0.getReal());
    }

    public void setPrivacySensitive(boolean arg0) {
        ((android.media.MediaRecorder) real).setPrivacySensitive(arg0);
    }

    public void setProfile(com.micklab.dcg.wrapper.android.media.CamcorderProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setProfile(android.media.CamcorderProfile)");
    }

    public void setVideoEncoder(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setVideoEncoder(arg0);
    }

    public void setVideoEncodingBitRate(int arg0) {
        ((android.media.MediaRecorder) real).setVideoEncodingBitRate(arg0);
    }

    public void setVideoEncodingProfileLevel(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setVideoEncodingProfileLevel(int,int)");
    }

    public void setVideoFrameRate(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setVideoFrameRate(arg0);
    }

    public void setVideoProfile(com.micklab.dcg.wrapper.android.media.EncoderProfiles.VideoProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setVideoProfile(android.media.EncoderProfiles$VideoProfile)");
    }

    public void setVideoSize(int arg0, int arg1) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setVideoSize(arg0, arg1);
    }

    public void setVideoSource(int arg0) throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).setVideoSource(arg0);
    }

    public void start() throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).start();
    }

    public void stop() throws java.lang.IllegalStateException {
        ((android.media.MediaRecorder) real).stop();
    }

    public void unregisterAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0) {
        ((android.media.MediaRecorder) real).unregisterAudioRecordingCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int MEDIA_ERROR_SERVER_DIED = android.media.MediaRecorder.MEDIA_ERROR_SERVER_DIED;
    public static final int MEDIA_RECORDER_ERROR_UNKNOWN = android.media.MediaRecorder.MEDIA_RECORDER_ERROR_UNKNOWN;
    public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = android.media.MediaRecorder.MEDIA_RECORDER_INFO_MAX_DURATION_REACHED;
    public static final int MEDIA_RECORDER_INFO_UNKNOWN = android.media.MediaRecorder.MEDIA_RECORDER_INFO_UNKNOWN;

    public static final class AudioEncoder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AudioEncoder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.AudioEncoder wrap(android.media.MediaRecorder.AudioEncoder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.AudioEncoder(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.AudioEncoder getReal() {
            return (android.media.MediaRecorder.AudioEncoder) real;
        }

        public android.media.MediaRecorder.AudioEncoder unwrap() {
            return getReal();
        }

        public static final int AAC = android.media.MediaRecorder.AudioEncoder.AAC;
        public static final int AAC_ELD = android.media.MediaRecorder.AudioEncoder.AAC_ELD;
        public static final int AMR_NB = android.media.MediaRecorder.AudioEncoder.AMR_NB;
        public static final int AMR_WB = android.media.MediaRecorder.AudioEncoder.AMR_WB;
        public static final int DEFAULT = android.media.MediaRecorder.AudioEncoder.DEFAULT;
        public static final int HE_AAC = android.media.MediaRecorder.AudioEncoder.HE_AAC;
        public static final int OPUS = android.media.MediaRecorder.AudioEncoder.OPUS;
        public static final int VORBIS = android.media.MediaRecorder.AudioEncoder.VORBIS;

    }
    public static final class AudioSource {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AudioSource(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.AudioSource wrap(android.media.MediaRecorder.AudioSource real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.AudioSource(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.AudioSource getReal() {
            return (android.media.MediaRecorder.AudioSource) real;
        }

        public android.media.MediaRecorder.AudioSource unwrap() {
            return getReal();
        }

        public static final int CAMCORDER = android.media.MediaRecorder.AudioSource.CAMCORDER;
        public static final int DEFAULT = android.media.MediaRecorder.AudioSource.DEFAULT;
        public static final int MIC = android.media.MediaRecorder.AudioSource.MIC;
        public static final int REMOTE_SUBMIX = android.media.MediaRecorder.AudioSource.REMOTE_SUBMIX;
        public static final int UNPROCESSED = android.media.MediaRecorder.AudioSource.UNPROCESSED;
        public static final int VOICE_CALL = android.media.MediaRecorder.AudioSource.VOICE_CALL;
        public static final int VOICE_COMMUNICATION = android.media.MediaRecorder.AudioSource.VOICE_COMMUNICATION;
        public static final int VOICE_DOWNLINK = android.media.MediaRecorder.AudioSource.VOICE_DOWNLINK;
        public static final int VOICE_PERFORMANCE = android.media.MediaRecorder.AudioSource.VOICE_PERFORMANCE;
        public static final int VOICE_RECOGNITION = android.media.MediaRecorder.AudioSource.VOICE_RECOGNITION;
        public static final int VOICE_UPLINK = android.media.MediaRecorder.AudioSource.VOICE_UPLINK;

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.MetricsConstants wrap(android.media.MediaRecorder.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.MetricsConstants getReal() {
            return (android.media.MediaRecorder.MetricsConstants) real;
        }

        public android.media.MediaRecorder.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String AUDIO_BITRATE = android.media.MediaRecorder.MetricsConstants.AUDIO_BITRATE;
        public static final java.lang.String AUDIO_CHANNELS = android.media.MediaRecorder.MetricsConstants.AUDIO_CHANNELS;
        public static final java.lang.String AUDIO_SAMPLERATE = android.media.MediaRecorder.MetricsConstants.AUDIO_SAMPLERATE;
        public static final java.lang.String AUDIO_TIMESCALE = android.media.MediaRecorder.MetricsConstants.AUDIO_TIMESCALE;
        public static final java.lang.String CAPTURE_FPS = android.media.MediaRecorder.MetricsConstants.CAPTURE_FPS;
        public static final java.lang.String CAPTURE_FPS_ENABLE = android.media.MediaRecorder.MetricsConstants.CAPTURE_FPS_ENABLE;
        public static final java.lang.String FRAMERATE = android.media.MediaRecorder.MetricsConstants.FRAMERATE;
        public static final java.lang.String HEIGHT = android.media.MediaRecorder.MetricsConstants.HEIGHT;
        public static final java.lang.String MOVIE_TIMESCALE = android.media.MediaRecorder.MetricsConstants.MOVIE_TIMESCALE;
        public static final java.lang.String ROTATION = android.media.MediaRecorder.MetricsConstants.ROTATION;
        public static final java.lang.String VIDEO_BITRATE = android.media.MediaRecorder.MetricsConstants.VIDEO_BITRATE;
        public static final java.lang.String VIDEO_IFRAME_INTERVAL = android.media.MediaRecorder.MetricsConstants.VIDEO_IFRAME_INTERVAL;
        public static final java.lang.String VIDEO_LEVEL = android.media.MediaRecorder.MetricsConstants.VIDEO_LEVEL;
        public static final java.lang.String VIDEO_TIMESCALE = android.media.MediaRecorder.MetricsConstants.VIDEO_TIMESCALE;
        public static final java.lang.String WIDTH = android.media.MediaRecorder.MetricsConstants.WIDTH;

    }
    public static final class OnErrorListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnErrorListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.OnErrorListener wrap(android.media.MediaRecorder.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.OnErrorListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.OnErrorListener getReal() {
            return (android.media.MediaRecorder.OnErrorListener) real;
        }

        public android.media.MediaRecorder.OnErrorListener unwrap() {
            return getReal();
        }

        public void onError(com.micklab.dcg.wrapper.android.media.MediaRecorder arg0, int arg1, int arg2) {
            ((android.media.MediaRecorder.OnErrorListener) real).onError(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OnInfoListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnInfoListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.OnInfoListener wrap(android.media.MediaRecorder.OnInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.OnInfoListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.OnInfoListener getReal() {
            return (android.media.MediaRecorder.OnInfoListener) real;
        }

        public android.media.MediaRecorder.OnInfoListener unwrap() {
            return getReal();
        }

        public void onInfo(com.micklab.dcg.wrapper.android.media.MediaRecorder arg0, int arg1, int arg2) {
            ((android.media.MediaRecorder.OnInfoListener) real).onInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OutputFormat {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OutputFormat(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.OutputFormat wrap(android.media.MediaRecorder.OutputFormat real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.OutputFormat(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.OutputFormat getReal() {
            return (android.media.MediaRecorder.OutputFormat) real;
        }

        public android.media.MediaRecorder.OutputFormat unwrap() {
            return getReal();
        }

        public static final int AAC_ADTS = android.media.MediaRecorder.OutputFormat.AAC_ADTS;
        public static final int AMR_NB = android.media.MediaRecorder.OutputFormat.AMR_NB;
        public static final int AMR_WB = android.media.MediaRecorder.OutputFormat.AMR_WB;
        public static final int DEFAULT = android.media.MediaRecorder.OutputFormat.DEFAULT;
        public static final int MPEG_2_TS = android.media.MediaRecorder.OutputFormat.MPEG_2_TS;
        public static final int MPEG_4 = android.media.MediaRecorder.OutputFormat.MPEG_4;
        public static final int OGG = android.media.MediaRecorder.OutputFormat.OGG;
        public static final int RAW_AMR = android.media.MediaRecorder.OutputFormat.RAW_AMR;
        public static final int THREE_GPP = android.media.MediaRecorder.OutputFormat.THREE_GPP;
        public static final int WEBM = android.media.MediaRecorder.OutputFormat.WEBM;

    }
    public static final class VideoEncoder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VideoEncoder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.VideoEncoder wrap(android.media.MediaRecorder.VideoEncoder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.VideoEncoder(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.VideoEncoder getReal() {
            return (android.media.MediaRecorder.VideoEncoder) real;
        }

        public android.media.MediaRecorder.VideoEncoder unwrap() {
            return getReal();
        }

        public static final int AV1 = android.media.MediaRecorder.VideoEncoder.AV1;
        public static final int DEFAULT = android.media.MediaRecorder.VideoEncoder.DEFAULT;
        public static final int DOLBY_VISION = android.media.MediaRecorder.VideoEncoder.DOLBY_VISION;
        public static final int H263 = android.media.MediaRecorder.VideoEncoder.H263;
        public static final int H264 = android.media.MediaRecorder.VideoEncoder.H264;
        public static final int HEVC = android.media.MediaRecorder.VideoEncoder.HEVC;
        public static final int MPEG_4_SP = android.media.MediaRecorder.VideoEncoder.MPEG_4_SP;
        public static final int VP8 = android.media.MediaRecorder.VideoEncoder.VP8;
        public static final int VP9 = android.media.MediaRecorder.VideoEncoder.VP9;

    }
    public static final class VideoSource {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VideoSource(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.VideoSource wrap(android.media.MediaRecorder.VideoSource real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.VideoSource(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRecorder.VideoSource getReal() {
            return (android.media.MediaRecorder.VideoSource) real;
        }

        public android.media.MediaRecorder.VideoSource unwrap() {
            return getReal();
        }

        public static final int CAMERA = android.media.MediaRecorder.VideoSource.CAMERA;
        public static final int DEFAULT = android.media.MediaRecorder.VideoSource.DEFAULT;
        public static final int SURFACE = android.media.MediaRecorder.VideoSource.SURFACE;

    }
}
