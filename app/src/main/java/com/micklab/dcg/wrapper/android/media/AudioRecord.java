// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRecord wrap(android.media.AudioRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecord(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioRecord getReal() {
        return (android.media.AudioRecord) real;
    }

    public android.media.AudioRecord unwrap() {
        return getReal();
    }

    public AudioRecord(int arg0, int arg1, int arg2, int arg3, int arg4) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioRecord(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioRecord) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRecord.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioRecord) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() {
        return com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration.wrap(((android.media.AudioRecord) real).getActiveRecordingConfiguration());
    }

    public int getAudioFormat() {
        return ((android.media.AudioRecord) real).getAudioFormat();
    }

    public int getAudioSessionId() {
        return ((android.media.AudioRecord) real).getAudioSessionId();
    }

    public int getAudioSource() {
        return ((android.media.AudioRecord) real).getAudioSource();
    }

    public int getBufferSizeInFrames() {
        return ((android.media.AudioRecord) real).getBufferSizeInFrames();
    }

    public int getChannelConfiguration() {
        return ((android.media.AudioRecord) real).getChannelConfiguration();
    }

    public int getChannelCount() {
        return ((android.media.AudioRecord) real).getChannelCount();
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(((android.media.AudioRecord) real).getFormat());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.AudioRecord) real).getLogSessionId());
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.AudioRecord) real).getMetrics());
    }

    public static int getMinBufferSize(int arg0, int arg1, int arg2) {
        return android.media.AudioRecord.getMinBufferSize(arg0, arg1, arg2);
    }

    public int getNotificationMarkerPosition() {
        return ((android.media.AudioRecord) real).getNotificationMarkerPosition();
    }

    public int getPositionNotificationPeriod() {
        return ((android.media.AudioRecord) real).getPositionNotificationPeriod();
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioRecord) real).getPreferredDevice());
    }

    public int getRecordingState() {
        return ((android.media.AudioRecord) real).getRecordingState();
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioRecord) real).getRoutedDevice());
    }

    public int getSampleRate() {
        return ((android.media.AudioRecord) real).getSampleRate();
    }

    public int getState() {
        return ((android.media.AudioRecord) real).getState();
    }

    public int getTimestamp(com.micklab.dcg.wrapper.android.media.AudioTimestamp arg0, int arg1) {
        return ((android.media.AudioRecord) real).getTimestamp(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean isPrivacySensitive() {
        return ((android.media.AudioRecord) real).isPrivacySensitive();
    }

    public int read(java.nio.ByteBuffer arg0, int arg1) {
        return ((android.media.AudioRecord) real).read(arg0, arg1);
    }

    public int read(java.nio.ByteBuffer arg0, int arg1, int arg2) {
        return ((android.media.AudioRecord) real).read(arg0, arg1, arg2);
    }

    public int read(byte[] arg0, int arg1, int arg2) {
        return ((android.media.AudioRecord) real).read(arg0, arg1, arg2);
    }

    public int read(short[] arg0, int arg1, int arg2) {
        return ((android.media.AudioRecord) real).read(arg0, arg1, arg2);
    }

    public int read(float[] arg0, int arg1, int arg2, int arg3) {
        return ((android.media.AudioRecord) real).read(arg0, arg1, arg2, arg3);
    }

    public int read(byte[] arg0, int arg1, int arg2, int arg3) {
        return ((android.media.AudioRecord) real).read(arg0, arg1, arg2, arg3);
    }

    public int read(short[] arg0, int arg1, int arg2, int arg3) {
        return ((android.media.AudioRecord) real).read(arg0, arg1, arg2, arg3);
    }

    public void registerAudioRecordingCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg1) {
        ((android.media.AudioRecord) real).registerAudioRecordingCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void release() {
        ((android.media.AudioRecord) real).release();
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        ((android.media.AudioRecord) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRecord.OnRoutingChangedListener arg0) {
        ((android.media.AudioRecord) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        ((android.media.AudioRecord) real).setLogSessionId(arg0 == null ? null : arg0.getReal());
    }

    public int setNotificationMarkerPosition(int arg0) {
        return ((android.media.AudioRecord) real).setNotificationMarkerPosition(arg0);
    }

    public int setPositionNotificationPeriod(int arg0) {
        return ((android.media.AudioRecord) real).setPositionNotificationPeriod(arg0);
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return ((android.media.AudioRecord) real).setPreferredDevice(arg0 == null ? null : arg0.getReal());
    }

    public boolean setPreferredMicrophoneDirection(int arg0) {
        return ((android.media.AudioRecord) real).setPreferredMicrophoneDirection(arg0);
    }

    public boolean setPreferredMicrophoneFieldDimension(float arg0) {
        return ((android.media.AudioRecord) real).setPreferredMicrophoneFieldDimension(arg0);
    }

    public void setRecordPositionUpdateListener(com.micklab.dcg.wrapper.android.media.AudioRecord.OnRecordPositionUpdateListener arg0) {
        ((android.media.AudioRecord) real).setRecordPositionUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRecordPositionUpdateListener(com.micklab.dcg.wrapper.android.media.AudioRecord.OnRecordPositionUpdateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioRecord) real).setRecordPositionUpdateListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void startRecording() throws java.lang.IllegalStateException {
        ((android.media.AudioRecord) real).startRecording();
    }

    public void startRecording(com.micklab.dcg.wrapper.android.media.MediaSyncEvent arg0) throws java.lang.IllegalStateException {
        ((android.media.AudioRecord) real).startRecording(arg0 == null ? null : arg0.getReal());
    }

    public void stop() throws java.lang.IllegalStateException {
        ((android.media.AudioRecord) real).stop();
    }

    public void unregisterAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0) {
        ((android.media.AudioRecord) real).unregisterAudioRecordingCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int ERROR = android.media.AudioRecord.ERROR;
    public static final int ERROR_BAD_VALUE = android.media.AudioRecord.ERROR_BAD_VALUE;
    public static final int ERROR_DEAD_OBJECT = android.media.AudioRecord.ERROR_DEAD_OBJECT;
    public static final int ERROR_INVALID_OPERATION = android.media.AudioRecord.ERROR_INVALID_OPERATION;
    public static final int READ_BLOCKING = android.media.AudioRecord.READ_BLOCKING;
    public static final int READ_NON_BLOCKING = android.media.AudioRecord.READ_NON_BLOCKING;
    public static final int RECORDSTATE_RECORDING = android.media.AudioRecord.RECORDSTATE_RECORDING;
    public static final int RECORDSTATE_STOPPED = android.media.AudioRecord.RECORDSTATE_STOPPED;
    public static final int STATE_INITIALIZED = android.media.AudioRecord.STATE_INITIALIZED;
    public static final int STATE_UNINITIALIZED = android.media.AudioRecord.STATE_UNINITIALIZED;
    public static final int SUCCESS = android.media.AudioRecord.SUCCESS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioRecord.Builder wrap(android.media.AudioRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioRecord.Builder getReal() {
            return (android.media.AudioRecord.Builder) real;
        }

        public android.media.AudioRecord.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.AudioRecord.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord build() throws java.lang.UnsupportedOperationException {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.wrap(((android.media.AudioRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord.Builder setAudioFormat(com.micklab.dcg.wrapper.android.media.AudioFormat arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.Builder.wrap(((android.media.AudioRecord.Builder) real).setAudioFormat(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord.Builder setAudioPlaybackCaptureConfig(com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.Builder.wrap(((android.media.AudioRecord.Builder) real).setAudioPlaybackCaptureConfig(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord.Builder setAudioSource(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.Builder.wrap(((android.media.AudioRecord.Builder) real).setAudioSource(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord.Builder setBufferSizeInBytes(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.Builder.wrap(((android.media.AudioRecord.Builder) real).setBufferSizeInBytes(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord.Builder setContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.Builder.wrap(((android.media.AudioRecord.Builder) real).setContext(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioRecord.Builder setPrivacySensitive(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioRecord.Builder.wrap(((android.media.AudioRecord.Builder) real).setPrivacySensitive(arg0));
        }

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioRecord.MetricsConstants wrap(android.media.AudioRecord.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecord.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioRecord.MetricsConstants getReal() {
            return (android.media.AudioRecord.MetricsConstants) real;
        }

        public android.media.AudioRecord.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String CHANNELS = android.media.AudioRecord.MetricsConstants.CHANNELS;
        public static final java.lang.String ENCODING = android.media.AudioRecord.MetricsConstants.ENCODING;
        public static final java.lang.String LATENCY = android.media.AudioRecord.MetricsConstants.LATENCY;
        public static final java.lang.String SAMPLERATE = android.media.AudioRecord.MetricsConstants.SAMPLERATE;
        public static final java.lang.String SOURCE = android.media.AudioRecord.MetricsConstants.SOURCE;

    }
    public static final class OnRecordPositionUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnRecordPositionUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioRecord.OnRecordPositionUpdateListener wrap(android.media.AudioRecord.OnRecordPositionUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecord.OnRecordPositionUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioRecord.OnRecordPositionUpdateListener getReal() {
            return (android.media.AudioRecord.OnRecordPositionUpdateListener) real;
        }

        public android.media.AudioRecord.OnRecordPositionUpdateListener unwrap() {
            return getReal();
        }

        public void onMarkerReached(com.micklab.dcg.wrapper.android.media.AudioRecord arg0) {
            ((android.media.AudioRecord.OnRecordPositionUpdateListener) real).onMarkerReached(arg0 == null ? null : arg0.getReal());
        }

        public void onPeriodicNotification(com.micklab.dcg.wrapper.android.media.AudioRecord arg0) {
            ((android.media.AudioRecord.OnRecordPositionUpdateListener) real).onPeriodicNotification(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnRoutingChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnRoutingChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioRecord.OnRoutingChangedListener wrap(android.media.AudioRecord.OnRoutingChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecord.OnRoutingChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioRecord.OnRoutingChangedListener getReal() {
            return (android.media.AudioRecord.OnRoutingChangedListener) real;
        }

        public android.media.AudioRecord.OnRoutingChangedListener unwrap() {
            return getReal();
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioRecord arg0) {
            ((android.media.AudioRecord.OnRoutingChangedListener) real).onRoutingChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioRouting arg0) {
            ((android.media.AudioRecord.OnRoutingChangedListener) real).onRoutingChanged(arg0 == null ? null : arg0.getReal());
        }

    }
}
