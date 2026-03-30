// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRecorder {
    private final android.media.MediaRecorder real;

    public MediaRecorder(android.media.MediaRecorder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRecorder wrap(android.media.MediaRecorder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder(real);
    }

    public android.media.MediaRecorder unwrap() {
        return real;
    }

    public MediaRecorder() {
        this(new android.media.MediaRecorder());
    }

    public MediaRecorder(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.MediaRecorder(arg0 == null ? null : arg0.unwrap()));
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() {
        return com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration.wrap(real.getActiveRecordingConfiguration());
    }

    public static int getAudioSourceMax() {
        return android.media.MediaRecorder.getAudioSourceMax();
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(real.getLogSessionId());
    }

    public int getMaxAmplitude() throws java.lang.IllegalStateException {
        return real.getMaxAmplitude();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getMetrics());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getRoutedDevice());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public boolean isPrivacySensitive() {
        return real.isPrivacySensitive();
    }

    public void pause() throws java.lang.IllegalStateException {
        real.pause();
    }

    public void prepare() throws java.io.IOException, java.lang.IllegalStateException {
        real.prepare();
    }

    public void registerAudioRecordingCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg1) {
        real.registerAudioRecordingCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void release() {
        real.release();
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        real.removeOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public void resume() throws java.lang.IllegalStateException {
        real.resume();
    }

    public void setAudioChannels(int arg0) {
        real.setAudioChannels(arg0);
    }

    public void setAudioEncoder(int arg0) throws java.lang.IllegalStateException {
        real.setAudioEncoder(arg0);
    }

    public void setAudioEncodingBitRate(int arg0) {
        real.setAudioEncodingBitRate(arg0);
    }

    public void setAudioProfile(com.micklab.dcg.wrapper.android.media.EncoderProfiles.AudioProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setAudioProfile(android.media.EncoderProfiles$AudioProfile)");
    }

    public void setAudioSamplingRate(int arg0) {
        real.setAudioSamplingRate(arg0);
    }

    public void setAudioSource(int arg0) throws java.lang.IllegalStateException {
        real.setAudioSource(arg0);
    }

    public void setCamera(com.micklab.dcg.wrapper.android.hardware.Camera arg0) {
        real.setCamera(arg0 == null ? null : arg0.unwrap());
    }

    public void setCaptureRate(double arg0) {
        real.setCaptureRate(arg0);
    }

    public void setInputSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setInputSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void setLocation(float arg0, float arg1) {
        real.setLocation(arg0, arg1);
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        real.setLogSessionId(arg0 == null ? null : arg0.unwrap());
    }

    public void setMaxDuration(int arg0) throws java.lang.IllegalArgumentException {
        real.setMaxDuration(arg0);
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
        real.setOnErrorListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.media.MediaRecorder.OnInfoListener arg0) {
        real.setOnInfoListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOrientationHint(int arg0) {
        real.setOrientationHint(arg0);
    }

    public void setOutputFile(java.io.FileDescriptor arg0) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setOutputFile(java.io.FileDescriptor)");
    }

    public void setOutputFile(java.lang.String arg0) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setOutputFile(java.lang.String)");
    }

    public void setOutputFile(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setOutputFile(java.io.File)");
    }

    public void setOutputFormat(int arg0) throws java.lang.IllegalStateException {
        real.setOutputFormat(arg0);
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return real.setPreferredDevice(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setPreferredMicrophoneDirection(int arg0) {
        return real.setPreferredMicrophoneDirection(arg0);
    }

    public boolean setPreferredMicrophoneFieldDimension(float arg0) {
        return real.setPreferredMicrophoneFieldDimension(arg0);
    }

    public void setPreviewDisplay(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setPreviewDisplay(arg0 == null ? null : arg0.unwrap());
    }

    public void setPrivacySensitive(boolean arg0) {
        real.setPrivacySensitive(arg0);
    }

    public void setProfile(com.micklab.dcg.wrapper.android.media.CamcorderProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setProfile(android.media.CamcorderProfile)");
    }

    public void setVideoEncoder(int arg0) throws java.lang.IllegalStateException {
        real.setVideoEncoder(arg0);
    }

    public void setVideoEncodingBitRate(int arg0) {
        real.setVideoEncodingBitRate(arg0);
    }

    public void setVideoEncodingProfileLevel(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setVideoEncodingProfileLevel(int,int)");
    }

    public void setVideoFrameRate(int arg0) throws java.lang.IllegalStateException {
        real.setVideoFrameRate(arg0);
    }

    public void setVideoProfile(com.micklab.dcg.wrapper.android.media.EncoderProfiles.VideoProfile arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaRecorder#setVideoProfile(android.media.EncoderProfiles$VideoProfile)");
    }

    public void setVideoSize(int arg0, int arg1) throws java.lang.IllegalStateException {
        real.setVideoSize(arg0, arg1);
    }

    public void setVideoSource(int arg0) throws java.lang.IllegalStateException {
        real.setVideoSource(arg0);
    }

    public void start() throws java.lang.IllegalStateException {
        real.start();
    }

    public void stop() throws java.lang.IllegalStateException {
        real.stop();
    }

    public void unregisterAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0) {
        real.unregisterAudioRecordingCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final int MEDIA_ERROR_SERVER_DIED = android.media.MediaRecorder.MEDIA_ERROR_SERVER_DIED;
    public static final int MEDIA_RECORDER_ERROR_UNKNOWN = android.media.MediaRecorder.MEDIA_RECORDER_ERROR_UNKNOWN;
    public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = android.media.MediaRecorder.MEDIA_RECORDER_INFO_MAX_DURATION_REACHED;
    public static final int MEDIA_RECORDER_INFO_UNKNOWN = android.media.MediaRecorder.MEDIA_RECORDER_INFO_UNKNOWN;

    public static final class MetricsConstants {
        private final android.media.MediaRecorder.MetricsConstants real;

        public MetricsConstants(android.media.MediaRecorder.MetricsConstants real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.MetricsConstants wrap(android.media.MediaRecorder.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.MetricsConstants(real);
        }

        public android.media.MediaRecorder.MetricsConstants unwrap() {
            return real;
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
        private final android.media.MediaRecorder.OnErrorListener real;

        public OnErrorListener(android.media.MediaRecorder.OnErrorListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.OnErrorListener wrap(android.media.MediaRecorder.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.OnErrorListener(real);
        }

        public android.media.MediaRecorder.OnErrorListener unwrap() {
            return real;
        }

        public void onError(com.micklab.dcg.wrapper.android.media.MediaRecorder arg0, int arg1, int arg2) {
            real.onError(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class OnInfoListener {
        private final android.media.MediaRecorder.OnInfoListener real;

        public OnInfoListener(android.media.MediaRecorder.OnInfoListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRecorder.OnInfoListener wrap(android.media.MediaRecorder.OnInfoListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRecorder.OnInfoListener(real);
        }

        public android.media.MediaRecorder.OnInfoListener unwrap() {
            return real;
        }

        public void onInfo(com.micklab.dcg.wrapper.android.media.MediaRecorder arg0, int arg1, int arg2) {
            real.onInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
