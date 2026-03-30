// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioTrack {
    private final android.media.AudioTrack real;

    public AudioTrack(android.media.AudioTrack real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioTrack wrap(android.media.AudioTrack real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack(real);
    }

    public android.media.AudioTrack unwrap() {
        return real;
    }

    public AudioTrack(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioFormat arg1, int arg2, int arg3, int arg4) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioTrack(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public AudioTrack(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioTrack(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public AudioTrack(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws java.lang.IllegalArgumentException {
        this(new android.media.AudioTrack(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
    }

    public void addOnCodecFormatChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener arg1) {
        real.addOnCodecFormatChangedListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int attachAuxEffect(int arg0) {
        return real.attachAuxEffect(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.VolumeShaper createVolumeShaper(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.media.VolumeShaper.wrap(real.createVolumeShaper(arg0 == null ? null : arg0.unwrap()));
    }

    public void flush() {
        real.flush();
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(real.getAudioAttributes());
    }

    public float getAudioDescriptionMixLeveldB() {
        return real.getAudioDescriptionMixLeveldB();
    }

    public int getAudioFormat() {
        return real.getAudioFormat();
    }

    public int getAudioSessionId() {
        return real.getAudioSessionId();
    }

    public int getBufferCapacityInFrames() {
        return real.getBufferCapacityInFrames();
    }

    public int getBufferSizeInFrames() {
        return real.getBufferSizeInFrames();
    }

    public int getChannelConfiguration() {
        return real.getChannelConfiguration();
    }

    public int getChannelCount() {
        return real.getChannelCount();
    }

    public int getDualMonoMode() {
        return real.getDualMonoMode();
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(real.getFormat());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(real.getLogSessionId());
    }

    public static float getMaxVolume() {
        return android.media.AudioTrack.getMaxVolume();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getMetrics());
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
        return real.getNotificationMarkerPosition();
    }

    public int getOffloadDelay() {
        return real.getOffloadDelay();
    }

    public int getOffloadPadding() {
        return real.getOffloadPadding();
    }

    public int getPerformanceMode() {
        return real.getPerformanceMode();
    }

    public int getPlayState() {
        return real.getPlayState();
    }

    public int getPlaybackHeadPosition() {
        return real.getPlaybackHeadPosition();
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams getPlaybackParams() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.getPlaybackParams());
    }

    public int getPlaybackRate() {
        return real.getPlaybackRate();
    }

    public int getPositionNotificationPeriod() {
        return real.getPositionNotificationPeriod();
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getRoutedDevice());
    }

    public int getSampleRate() {
        return real.getSampleRate();
    }

    public int getStartThresholdInFrames() {
        return real.getStartThresholdInFrames();
    }

    public int getState() {
        return real.getState();
    }

    public int getStreamType() {
        return real.getStreamType();
    }

    public boolean getTimestamp(com.micklab.dcg.wrapper.android.media.AudioTimestamp arg0) {
        return real.getTimestamp(arg0 == null ? null : arg0.unwrap());
    }

    public int getUnderrunCount() {
        return real.getUnderrunCount();
    }

    public static boolean isDirectPlaybackSupported(com.micklab.dcg.wrapper.android.media.AudioFormat arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        return android.media.AudioTrack.isDirectPlaybackSupported(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean isOffloadedPlayback() {
        return real.isOffloadedPlayback();
    }

    public void pause() throws java.lang.IllegalStateException {
        real.pause();
    }

    public void play() throws java.lang.IllegalStateException {
        real.play();
    }

    public void registerStreamEventCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback arg1) {
        real.registerStreamEventCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void release() {
        real.release();
    }

    public int reloadStaticData() {
        return real.reloadStaticData();
    }

    public void removeOnCodecFormatChangedListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener arg0) {
        real.removeOnCodecFormatChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        real.removeOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener arg0) {
        real.removeOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setAudioDescriptionMixLeveldB(float arg0) {
        return real.setAudioDescriptionMixLeveldB(arg0);
    }

    public int setAuxEffectSendLevel(float arg0) {
        return real.setAuxEffectSendLevel(arg0);
    }

    public int setBufferSizeInFrames(int arg0) {
        return real.setBufferSizeInFrames(arg0);
    }

    public boolean setDualMonoMode(int arg0) {
        return real.setDualMonoMode(arg0);
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        real.setLogSessionId(arg0 == null ? null : arg0.unwrap());
    }

    public int setLoopPoints(int arg0, int arg1, int arg2) {
        return real.setLoopPoints(arg0, arg1, arg2);
    }

    public int setNotificationMarkerPosition(int arg0) {
        return real.setNotificationMarkerPosition(arg0);
    }

    public void setOffloadDelayPadding(int arg0, int arg1) {
        real.setOffloadDelayPadding(arg0, arg1);
    }

    public void setOffloadEndOfStream() {
        real.setOffloadEndOfStream();
    }

    public int setPlaybackHeadPosition(int arg0) {
        return real.setPlaybackHeadPosition(arg0);
    }

    public void setPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        real.setPlaybackParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackPositionUpdateListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener arg0) {
        real.setPlaybackPositionUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackPositionUpdateListener(com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setPlaybackPositionUpdateListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int setPlaybackRate(int arg0) {
        return real.setPlaybackRate(arg0);
    }

    public int setPositionNotificationPeriod(int arg0) {
        return real.setPositionNotificationPeriod(arg0);
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return real.setPreferredDevice(arg0 == null ? null : arg0.unwrap());
    }

    public int setPresentation(com.micklab.dcg.wrapper.android.media.AudioPresentation arg0) {
        return real.setPresentation(arg0 == null ? null : arg0.unwrap());
    }

    public int setStartThresholdInFrames(int arg0) {
        return real.setStartThresholdInFrames(arg0);
    }

    public int setStereoVolume(float arg0, float arg1) {
        return real.setStereoVolume(arg0, arg1);
    }

    public int setVolume(float arg0) {
        return real.setVolume(arg0);
    }

    public void stop() throws java.lang.IllegalStateException {
        real.stop();
    }

    public void unregisterStreamEventCallback(com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback arg0) {
        real.unregisterStreamEventCallback(arg0 == null ? null : arg0.unwrap());
    }

    public int write(byte[] arg0, int arg1, int arg2) {
        return real.write(arg0, arg1, arg2);
    }

    public int write(short[] arg0, int arg1, int arg2) {
        return real.write(arg0, arg1, arg2);
    }

    public int write(java.nio.ByteBuffer arg0, int arg1, int arg2) {
        return real.write(arg0, arg1, arg2);
    }

    public int write(byte[] arg0, int arg1, int arg2, int arg3) {
        return real.write(arg0, arg1, arg2, arg3);
    }

    public int write(java.nio.ByteBuffer arg0, int arg1, int arg2, long arg3) {
        return real.write(arg0, arg1, arg2, arg3);
    }

    public int write(float[] arg0, int arg1, int arg2, int arg3) {
        return real.write(arg0, arg1, arg2, arg3);
    }

    public int write(short[] arg0, int arg1, int arg2, int arg3) {
        return real.write(arg0, arg1, arg2, arg3);
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
        private final android.media.AudioTrack.Builder real;

        public Builder(android.media.AudioTrack.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.Builder wrap(android.media.AudioTrack.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.Builder(real);
        }

        public android.media.AudioTrack.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.AudioTrack.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack build() throws java.lang.UnsupportedOperationException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setAudioAttributes(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setAudioFormat(com.micklab.dcg.wrapper.android.media.AudioFormat arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setAudioFormat(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setBufferSizeInBytes(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setBufferSizeInBytes(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setContext(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setEncapsulationMode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setEncapsulationMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setOffloadedPlayback(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setOffloadedPlayback(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setPerformanceMode(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setPerformanceMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setSessionId(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioTrack.Builder setTransferMode(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioTrack.Builder.wrap(real.setTransferMode(arg0));
        }

    }
    public static final class MetricsConstants {
        private final android.media.AudioTrack.MetricsConstants real;

        public MetricsConstants(android.media.AudioTrack.MetricsConstants real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.MetricsConstants wrap(android.media.AudioTrack.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.MetricsConstants(real);
        }

        public android.media.AudioTrack.MetricsConstants unwrap() {
            return real;
        }

        public static final java.lang.String CHANNELMASK = android.media.AudioTrack.MetricsConstants.CHANNELMASK;
        public static final java.lang.String CONTENTTYPE = android.media.AudioTrack.MetricsConstants.CONTENTTYPE;
        public static final java.lang.String SAMPLERATE = android.media.AudioTrack.MetricsConstants.SAMPLERATE;
        public static final java.lang.String STREAMTYPE = android.media.AudioTrack.MetricsConstants.STREAMTYPE;
        public static final java.lang.String USAGE = android.media.AudioTrack.MetricsConstants.USAGE;

    }
    public static final class OnCodecFormatChangedListener {
        private final android.media.AudioTrack.OnCodecFormatChangedListener real;

        public OnCodecFormatChangedListener(android.media.AudioTrack.OnCodecFormatChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener wrap(android.media.AudioTrack.OnCodecFormatChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.OnCodecFormatChangedListener(real);
        }

        public android.media.AudioTrack.OnCodecFormatChangedListener unwrap() {
            return real;
        }

        public void onCodecFormatChanged(com.micklab.dcg.wrapper.android.media.AudioTrack arg0, com.micklab.dcg.wrapper.android.media.AudioMetadataReadMap arg1) {
            real.onCodecFormatChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnPlaybackPositionUpdateListener {
        private final android.media.AudioTrack.OnPlaybackPositionUpdateListener real;

        public OnPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener wrap(android.media.AudioTrack.OnPlaybackPositionUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.OnPlaybackPositionUpdateListener(real);
        }

        public android.media.AudioTrack.OnPlaybackPositionUpdateListener unwrap() {
            return real;
        }

        public void onMarkerReached(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            real.onMarkerReached(arg0 == null ? null : arg0.unwrap());
        }

        public void onPeriodicNotification(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            real.onPeriodicNotification(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnRoutingChangedListener {
        private final android.media.AudioTrack.OnRoutingChangedListener real;

        public OnRoutingChangedListener(android.media.AudioTrack.OnRoutingChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener wrap(android.media.AudioTrack.OnRoutingChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.OnRoutingChangedListener(real);
        }

        public android.media.AudioTrack.OnRoutingChangedListener unwrap() {
            return real;
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            real.onRoutingChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioRouting arg0) {
            real.onRoutingChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class StreamEventCallback {
        private final android.media.AudioTrack.StreamEventCallback real;

        public StreamEventCallback(android.media.AudioTrack.StreamEventCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback wrap(android.media.AudioTrack.StreamEventCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTrack.StreamEventCallback(real);
        }

        public android.media.AudioTrack.StreamEventCallback unwrap() {
            return real;
        }

        public void onDataRequest(com.micklab.dcg.wrapper.android.media.AudioTrack arg0, int arg1) {
            real.onDataRequest(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onPresentationEnded(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            real.onPresentationEnded(arg0 == null ? null : arg0.unwrap());
        }

        public void onTearDown(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
            real.onTearDown(arg0 == null ? null : arg0.unwrap());
        }

    }
}
