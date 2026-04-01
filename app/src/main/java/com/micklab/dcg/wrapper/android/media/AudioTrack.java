// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioTrack {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioTrack(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioTrack wrap(android.media.AudioTrack real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioTrack getReal() {
        return (android.media.AudioTrack) real;
    }

    public android.media.AudioTrack unwrap() {
        return getReal();
    }

    public AudioTrack(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioFormat arg1, int arg2, int arg3, int arg4) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioTrack(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public AudioTrack(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioTrack(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public AudioTrack(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioTrack(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public void addOnCodecFormatChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener arg1) {
        ((android.media.AudioTrack) real).addOnCodecFormatChangedListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioTrack) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioTrack) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int attachAuxEffect(int arg0) {
        return ((android.media.AudioTrack) real).attachAuxEffect(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.VolumeShaper createVolumeShaper(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.media.VolumeShaper.wrap(((android.media.AudioTrack) real).createVolumeShaper(arg0 == null ? null : arg0.getReal()));
    }

    public void flush() {
        ((android.media.AudioTrack) real).flush();
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.media.AudioTrack) real).getAudioAttributes());
    }

    public float getAudioDescriptionMixLeveldB() {
        return ((android.media.AudioTrack) real).getAudioDescriptionMixLeveldB();
    }

    public int getAudioFormat() {
        return ((android.media.AudioTrack) real).getAudioFormat();
    }

    public int getAudioSessionId() {
        return ((android.media.AudioTrack) real).getAudioSessionId();
    }

    public int getBufferCapacityInFrames() {
        return ((android.media.AudioTrack) real).getBufferCapacityInFrames();
    }

    public int getBufferSizeInFrames() {
        return ((android.media.AudioTrack) real).getBufferSizeInFrames();
    }

    public int getChannelConfiguration() {
        return ((android.media.AudioTrack) real).getChannelConfiguration();
    }

    public int getChannelCount() {
        return ((android.media.AudioTrack) real).getChannelCount();
    }

    public int getDualMonoMode() {
        return ((android.media.AudioTrack) real).getDualMonoMode();
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(((android.media.AudioTrack) real).getFormat());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.AudioTrack) real).getLogSessionId());
    }

    public static float getMaxVolume() {
        return android.media.AudioTrack.getMaxVolume();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.AudioTrack) real).getMetrics());
    }

    public static int getMinBufferSize(int arg0, int arg1, int arg2) {
        return android.media.AudioTrack.getMinBufferSize(arg0, arg1, arg2);
    }

    public static float getMinVolume() {
        return android.media.AudioTrack.getMinVolume();
    }

    public static int getNativeOutputSampleRate(int arg0) {
        return android.media.AudioTrack.getNativeOutputSampleRate(arg0);
    }

    public int getNotificationMarkerPosition() {
        return ((android.media.AudioTrack) real).getNotificationMarkerPosition();
    }

    public int getOffloadDelay() {
        return ((android.media.AudioTrack) real).getOffloadDelay();
    }

    public int getOffloadPadding() {
        return ((android.media.AudioTrack) real).getOffloadPadding();
    }

    public int getPerformanceMode() {
        return ((android.media.AudioTrack) real).getPerformanceMode();
    }

    public int getPlayState() {
        return ((android.media.AudioTrack) real).getPlayState();
    }

    public int getPlaybackHeadPosition() {
        return ((android.media.AudioTrack) real).getPlaybackHeadPosition();
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams getPlaybackParams() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.AudioTrack) real).getPlaybackParams());
    }

    public int getPlaybackRate() {
        return ((android.media.AudioTrack) real).getPlaybackRate();
    }

    public int getPositionNotificationPeriod() {
        return ((android.media.AudioTrack) real).getPositionNotificationPeriod();
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioTrack) real).getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioTrack) real).getRoutedDevice());
    }

    public int getSampleRate() {
        return ((android.media.AudioTrack) real).getSampleRate();
    }

    public int getStartThresholdInFrames() {
        return ((android.media.AudioTrack) real).getStartThresholdInFrames();
    }

    public int getState() {
        return ((android.media.AudioTrack) real).getState();
    }

    public int getStreamType() {
        return ((android.media.AudioTrack) real).getStreamType();
    }

    public boolean getTimestamp(com.micklab.dcg.wrapper.android.media.AudioTimestamp arg0) {
        return ((android.media.AudioTrack) real).getTimestamp(arg0 == null ? null : arg0.getReal());
    }

    public int getUnderrunCount() {
        return ((android.media.AudioTrack) real).getUnderrunCount();
    }

    public static boolean isDirectPlaybackSupported(com.micklab.dcg.wrapper.android.media.AudioFormat arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        return android.media.AudioTrack.isDirectPlaybackSupported(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean isOffloadedPlayback() {
        return ((android.media.AudioTrack) real).isOffloadedPlayback();
    }

    public void pause() throws java.lang.IllegalStateException {
        ((android.media.AudioTrack) real).pause();
    }

    public void play() throws java.lang.IllegalStateException {
        ((android.media.AudioTrack) real).play();
    }

    public void registerStreamEventCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback arg1) {
        ((android.media.AudioTrack) real).registerStreamEventCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void release() {
        ((android.media.AudioTrack) real).release();
    }

    public int reloadStaticData() {
        return ((android.media.AudioTrack) real).reloadStaticData();
    }

    public void removeOnCodecFormatChangedListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener arg0) {
        ((android.media.AudioTrack) real).removeOnCodecFormatChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        ((android.media.AudioTrack) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener arg0) {
        ((android.media.AudioTrack) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean setAudioDescriptionMixLeveldB(float arg0) {
        return ((android.media.AudioTrack) real).setAudioDescriptionMixLeveldB(arg0);
    }

    public int setAuxEffectSendLevel(float arg0) {
        return ((android.media.AudioTrack) real).setAuxEffectSendLevel(arg0);
    }

    public int setBufferSizeInFrames(int arg0) {
        return ((android.media.AudioTrack) real).setBufferSizeInFrames(arg0);
    }

    public boolean setDualMonoMode(int arg0) {
        return ((android.media.AudioTrack) real).setDualMonoMode(arg0);
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        ((android.media.AudioTrack) real).setLogSessionId(arg0 == null ? null : arg0.getReal());
    }

    public int setLoopPoints(int arg0, int arg1, int arg2) {
        return ((android.media.AudioTrack) real).setLoopPoints(arg0, arg1, arg2);
    }

    public int setNotificationMarkerPosition(int arg0) {
        return ((android.media.AudioTrack) real).setNotificationMarkerPosition(arg0);
    }

    public void setOffloadDelayPadding(int arg0, int arg1) {
        ((android.media.AudioTrack) real).setOffloadDelayPadding(arg0, arg1);
    }

    public void setOffloadEndOfStream() {
        ((android.media.AudioTrack) real).setOffloadEndOfStream();
    }

    public int setPlaybackHeadPosition(int arg0) {
        return ((android.media.AudioTrack) real).setPlaybackHeadPosition(arg0);
    }

    public void setPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        ((android.media.AudioTrack) real).setPlaybackParams(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackPositionUpdateListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener arg0) {
        ((android.media.AudioTrack) real).setPlaybackPositionUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackPositionUpdateListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioTrack) real).setPlaybackPositionUpdateListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int setPlaybackRate(int arg0) {
        return ((android.media.AudioTrack) real).setPlaybackRate(arg0);
    }

    public int setPositionNotificationPeriod(int arg0) {
        return ((android.media.AudioTrack) real).setPositionNotificationPeriod(arg0);
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return ((android.media.AudioTrack) real).setPreferredDevice(arg0 == null ? null : arg0.getReal());
    }

    public int setPresentation(com.micklab.dcg.wrapper.android.media.AudioPresentation arg0) {
        return ((android.media.AudioTrack) real).setPresentation(arg0 == null ? null : arg0.getReal());
    }

    public int setStartThresholdInFrames(int arg0) {
        return ((android.media.AudioTrack) real).setStartThresholdInFrames(arg0);
    }

    public int setStereoVolume(float arg0, float arg1) {
        return ((android.media.AudioTrack) real).setStereoVolume(arg0, arg1);
    }

    public int setVolume(float arg0) {
        return ((android.media.AudioTrack) real).setVolume(arg0);
    }

    public void stop() throws java.lang.IllegalStateException {
        ((android.media.AudioTrack) real).stop();
    }

    public void unregisterStreamEventCallback(com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback arg0) {
        ((android.media.AudioTrack) real).unregisterStreamEventCallback(arg0 == null ? null : arg0.getReal());
    }

    public int write(byte[] arg0, int arg1, int arg2) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2);
    }

    public int write(short[] arg0, int arg1, int arg2) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2);
    }

    public int write(java.nio.ByteBuffer arg0, int arg1, int arg2) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2);
    }

    public int write(byte[] arg0, int arg1, int arg2, int arg3) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2, arg3);
    }

    public int write(short[] arg0, int arg1, int arg2, int arg3) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2, arg3);
    }

    public int write(java.nio.ByteBuffer arg0, int arg1, int arg2, long arg3) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2, arg3);
    }

    public int write(float[] arg0, int arg1, int arg2, int arg3) {
        return ((android.media.AudioTrack) real).write(arg0, arg1, arg2, arg3);
    }

    public static final int DUAL_MONO_MODE_LL = android.media.AudioTrack.DUAL_MONO_MODE_LL;
    public static final int DUAL_MONO_MODE_LR = android.media.AudioTrack.DUAL_MONO_MODE_LR;
    public static final int DUAL_MONO_MODE_OFF = android.media.AudioTrack.DUAL_MONO_MODE_OFF;
    public static final int DUAL_MONO_MODE_RR = android.media.AudioTrack.DUAL_MONO_MODE_RR;
    public static final int ENCAPSULATION_METADATA_TYPE_DVB_AD_DESCRIPTOR = android.media.AudioTrack.ENCAPSULATION_METADATA_TYPE_DVB_AD_DESCRIPTOR;
    public static final int ENCAPSULATION_METADATA_TYPE_FRAMEWORK_TUNER = android.media.AudioTrack.ENCAPSULATION_METADATA_TYPE_FRAMEWORK_TUNER;
    public static final int ENCAPSULATION_METADATA_TYPE_SUPPLEMENTARY_AUDIO_PLACEMENT = android.media.AudioTrack.ENCAPSULATION_METADATA_TYPE_SUPPLEMENTARY_AUDIO_PLACEMENT;
    public static final int ENCAPSULATION_MODE_ELEMENTARY_STREAM = android.media.AudioTrack.ENCAPSULATION_MODE_ELEMENTARY_STREAM;
    public static final int ENCAPSULATION_MODE_NONE = android.media.AudioTrack.ENCAPSULATION_MODE_NONE;
    public static final int ERROR = android.media.AudioTrack.ERROR;
    public static final int ERROR_BAD_VALUE = android.media.AudioTrack.ERROR_BAD_VALUE;
    public static final int ERROR_DEAD_OBJECT = android.media.AudioTrack.ERROR_DEAD_OBJECT;
    public static final int ERROR_INVALID_OPERATION = android.media.AudioTrack.ERROR_INVALID_OPERATION;
    public static final int MODE_STATIC = android.media.AudioTrack.MODE_STATIC;
    public static final int MODE_STREAM = android.media.AudioTrack.MODE_STREAM;
    public static final int PERFORMANCE_MODE_LOW_LATENCY = android.media.AudioTrack.PERFORMANCE_MODE_LOW_LATENCY;
    public static final int PERFORMANCE_MODE_NONE = android.media.AudioTrack.PERFORMANCE_MODE_NONE;
    public static final int PERFORMANCE_MODE_POWER_SAVING = android.media.AudioTrack.PERFORMANCE_MODE_POWER_SAVING;
    public static final int PLAYSTATE_PAUSED = android.media.AudioTrack.PLAYSTATE_PAUSED;
    public static final int PLAYSTATE_PLAYING = android.media.AudioTrack.PLAYSTATE_PLAYING;
    public static final int PLAYSTATE_STOPPED = android.media.AudioTrack.PLAYSTATE_STOPPED;
    public static final int STATE_INITIALIZED = android.media.AudioTrack.STATE_INITIALIZED;
    public static final int STATE_NO_STATIC_DATA = android.media.AudioTrack.STATE_NO_STATIC_DATA;
    public static final int STATE_UNINITIALIZED = android.media.AudioTrack.STATE_UNINITIALIZED;
    public static final int SUCCESS = android.media.AudioTrack.SUCCESS;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_LEFT = android.media.AudioTrack.SUPPLEMENTARY_AUDIO_PLACEMENT_LEFT;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_NORMAL = android.media.AudioTrack.SUPPLEMENTARY_AUDIO_PLACEMENT_NORMAL;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_RIGHT = android.media.AudioTrack.SUPPLEMENTARY_AUDIO_PLACEMENT_RIGHT;
    public static final int WRITE_BLOCKING = android.media.AudioTrack.WRITE_BLOCKING;
    public static final int WRITE_NON_BLOCKING = android.media.AudioTrack.WRITE_NON_BLOCKING;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.Builder wrap(android.media.AudioTrack.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioTrack.Builder getReal() {
            return (android.media.AudioTrack.Builder) real;
        }

        public android.media.AudioTrack.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.AudioTrack.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack build() throws java.lang.UnsupportedOperationException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.wrap(((android.media.AudioTrack.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setAudioAttributes(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setAudioFormat(com.micklab.dcg.wrapper.android.media.AudioFormat arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setAudioFormat(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setBufferSizeInBytes(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setBufferSizeInBytes(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setContext(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setEncapsulationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setEncapsulationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setOffloadedPlayback(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setOffloadedPlayback(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setPerformanceMode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setPerformanceMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setSessionId(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setTransferMode(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(((android.media.AudioTrack.Builder) real).setTransferMode(arg0));
        }

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.MetricsConstants wrap(android.media.AudioTrack.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioTrack.MetricsConstants getReal() {
            return (android.media.AudioTrack.MetricsConstants) real;
        }

        public android.media.AudioTrack.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String CHANNELMASK = android.media.AudioTrack.MetricsConstants.CHANNELMASK;
        public static final java.lang.String CONTENTTYPE = android.media.AudioTrack.MetricsConstants.CONTENTTYPE;
        public static final java.lang.String SAMPLERATE = android.media.AudioTrack.MetricsConstants.SAMPLERATE;
        public static final java.lang.String STREAMTYPE = android.media.AudioTrack.MetricsConstants.STREAMTYPE;
        public static final java.lang.String USAGE = android.media.AudioTrack.MetricsConstants.USAGE;

    }
    public static final class OnCodecFormatChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCodecFormatChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener wrap(android.media.AudioTrack.OnCodecFormatChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioTrack.OnCodecFormatChangedListener getReal() {
            return (android.media.AudioTrack.OnCodecFormatChangedListener) real;
        }

        public android.media.AudioTrack.OnCodecFormatChangedListener unwrap() {
            return getReal();
        }

        public void onCodecFormatChanged(com.micklab.dcg.wrapper.android.media.AudioTrack arg0, com.micklab.dcg.wrapper.android.media.AudioMetadataReadMap arg1) {
            ((android.media.AudioTrack.OnCodecFormatChangedListener) real).onCodecFormatChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnPlaybackPositionUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPlaybackPositionUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener wrap(android.media.AudioTrack.OnPlaybackPositionUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioTrack.OnPlaybackPositionUpdateListener getReal() {
            return (android.media.AudioTrack.OnPlaybackPositionUpdateListener) real;
        }

        public android.media.AudioTrack.OnPlaybackPositionUpdateListener unwrap() {
            return getReal();
        }

        public void onMarkerReached(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            ((android.media.AudioTrack.OnPlaybackPositionUpdateListener) real).onMarkerReached(arg0 == null ? null : arg0.getReal());
        }

        public void onPeriodicNotification(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            ((android.media.AudioTrack.OnPlaybackPositionUpdateListener) real).onPeriodicNotification(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnRoutingChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnRoutingChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener wrap(android.media.AudioTrack.OnRoutingChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioTrack.OnRoutingChangedListener getReal() {
            return (android.media.AudioTrack.OnRoutingChangedListener) real;
        }

        public android.media.AudioTrack.OnRoutingChangedListener unwrap() {
            return getReal();
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioRouting arg0) {
            ((android.media.AudioTrack.OnRoutingChangedListener) real).onRoutingChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            ((android.media.AudioTrack.OnRoutingChangedListener) real).onRoutingChanged(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class StreamEventCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StreamEventCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback wrap(android.media.AudioTrack.StreamEventCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioTrack.StreamEventCallback getReal() {
            return (android.media.AudioTrack.StreamEventCallback) real;
        }

        public android.media.AudioTrack.StreamEventCallback unwrap() {
            return getReal();
        }

        public void onDataRequest(com.micklab.dcg.wrapper.android.media.AudioTrack arg0, int arg1) {
            ((android.media.AudioTrack.StreamEventCallback) real).onDataRequest(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onPresentationEnded(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            ((android.media.AudioTrack.StreamEventCallback) real).onPresentationEnded(arg0 == null ? null : arg0.getReal());
        }

        public void onTearDown(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            ((android.media.AudioTrack.StreamEventCallback) real).onTearDown(arg0 == null ? null : arg0.getReal());
        }

    }
}
