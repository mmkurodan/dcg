// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioManager {
    private final android.media.AudioManager real;

    public AudioManager(android.media.AudioManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioManager wrap(android.media.AudioManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager(real);
    }

    public android.media.AudioManager unwrap() {
        return real;
    }

    public int abandonAudioFocus(com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener arg0) {
        return real.abandonAudioFocus(arg0 == null ? null : arg0.unwrap());
    }

    public int abandonAudioFocusRequest(com.micklab.dcg.wrapper.android.media.AudioFocusRequest arg0) {
        return real.abandonAudioFocusRequest(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnCommunicationDeviceChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.OnCommunicationDeviceChangedListener arg1) {
        real.addOnCommunicationDeviceChangedListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addOnModeChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.OnModeChangedListener arg1) {
        real.addOnModeChangedListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addOnPreferredMixerAttributesChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.OnPreferredMixerAttributesChangedListener arg1) {
        real.addOnPreferredMixerAttributesChangedListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void adjustStreamVolume(int arg0, int arg1, int arg2) {
        real.adjustStreamVolume(arg0, arg1, arg2);
    }

    public void adjustSuggestedStreamVolume(int arg0, int arg1, int arg2) {
        real.adjustSuggestedStreamVolume(arg0, arg1, arg2);
    }

    public void adjustVolume(int arg0, int arg1) {
        real.adjustVolume(arg0, arg1);
    }

    public void adjustVolumeGroupVolume(int arg0, int arg1, int arg2) {
        real.adjustVolumeGroupVolume(arg0, arg1, arg2);
    }

    public void clearCommunicationDevice() {
        real.clearCommunicationDevice();
    }

    public boolean clearPreferredMixerAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg1) {
        return real.clearPreferredMixerAttributes(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void dispatchMediaKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        real.dispatchMediaKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public int generateAudioSessionId() {
        return real.generateAudioSessionId();
    }

    public int getAllowedCapturePolicy() {
        return real.getAllowedCapturePolicy();
    }

    public int getAudioHwSyncForSession(int arg0) {
        return real.getAudioHwSyncForSession(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getCommunicationDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getCommunicationDevice());
    }

    public android.media.AudioDeviceInfo[] getDevices(int arg0) {
        return real.getDevices(arg0);
    }

    public static int getDirectPlaybackSupport(com.micklab.dcg.wrapper.android.media.AudioFormat arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        return android.media.AudioManager.getDirectPlaybackSupport(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int getEncodedSurroundMode() {
        return real.getEncodedSurroundMode();
    }

    public int getMode() {
        return real.getMode();
    }

    public java.lang.String getParameters(java.lang.String arg0) {
        return real.getParameters(arg0);
    }

    public static int getPlaybackOffloadSupport(com.micklab.dcg.wrapper.android.media.AudioFormat arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        return android.media.AudioManager.getPlaybackOffloadSupport(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.AudioMixerAttributes getPreferredMixerAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg1) {
        return com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.wrap(real.getPreferredMixerAttributes(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.String getProperty(java.lang.String arg0) {
        return real.getProperty(arg0);
    }

    public int getRingerMode() {
        return real.getRingerMode();
    }

    public int getRouting(int arg0) {
        return real.getRouting(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.Spatializer getSpatializer() {
        return com.micklab.dcg.wrapper.android.media.Spatializer.wrap(real.getSpatializer());
    }

    public int getStreamMaxVolume(int arg0) {
        return real.getStreamMaxVolume(arg0);
    }

    public int getStreamMinVolume(int arg0) {
        return real.getStreamMinVolume(arg0);
    }

    public int getStreamVolume(int arg0) {
        return real.getStreamVolume(arg0);
    }

    public float getStreamVolumeDb(int arg0, int arg1, int arg2) {
        return real.getStreamVolumeDb(arg0, arg1, arg2);
    }

    public int getVibrateSetting(int arg0) {
        return real.getVibrateSetting(arg0);
    }

    public int getVolumeGroupIdForAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        return real.getVolumeGroupIdForAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isBluetoothA2dpOn() {
        return real.isBluetoothA2dpOn();
    }

    public boolean isBluetoothScoAvailableOffCall() {
        return real.isBluetoothScoAvailableOffCall();
    }

    public boolean isBluetoothScoOn() {
        return real.isBluetoothScoOn();
    }

    public boolean isCallScreeningModeSupported() {
        return real.isCallScreeningModeSupported();
    }

    public static boolean isHapticPlaybackSupported() {
        return android.media.AudioManager.isHapticPlaybackSupported();
    }

    public boolean isMicrophoneMute() {
        return real.isMicrophoneMute();
    }

    public boolean isMusicActive() {
        return real.isMusicActive();
    }

    public static boolean isOffloadedPlaybackSupported(com.micklab.dcg.wrapper.android.media.AudioFormat arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        return android.media.AudioManager.isOffloadedPlaybackSupported(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean isRampingRingerEnabled() {
        return real.isRampingRingerEnabled();
    }

    public boolean isSpeakerphoneOn() {
        return real.isSpeakerphoneOn();
    }

    public boolean isStreamMute(int arg0) {
        return real.isStreamMute(arg0);
    }

    public boolean isSurroundFormatEnabled(int arg0) {
        return real.isSurroundFormatEnabled(arg0);
    }

    public boolean isVolumeFixed() {
        return real.isVolumeFixed();
    }

    public boolean isVolumeGroupMuted(int arg0) {
        return real.isVolumeGroupMuted(arg0);
    }

    public boolean isWiredHeadsetOn() {
        return real.isWiredHeadsetOn();
    }

    public void loadSoundEffects() {
        real.loadSoundEffects();
    }

    public void playSoundEffect(int arg0) {
        real.playSoundEffect(arg0);
    }

    public void playSoundEffect(int arg0, float arg1) {
        real.playSoundEffect(arg0, arg1);
    }

    public void registerAudioDeviceCallback(com.micklab.dcg.wrapper.android.media.AudioDeviceCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerAudioDeviceCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void registerAudioPlaybackCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioPlaybackCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerAudioPlaybackCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void registerAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerAudioRecordingCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void registerMediaButtonEventReceiver(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.registerMediaButtonEventReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void registerMediaButtonEventReceiver(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.registerMediaButtonEventReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void registerRemoteControlClient(com.micklab.dcg.wrapper.android.media.RemoteControlClient arg0) {
        real.registerRemoteControlClient(arg0 == null ? null : arg0.unwrap());
    }

    public boolean registerRemoteController(com.micklab.dcg.wrapper.android.media.RemoteController arg0) {
        return real.registerRemoteController(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnCommunicationDeviceChangedListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnCommunicationDeviceChangedListener arg0) {
        real.removeOnCommunicationDeviceChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnModeChangedListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnModeChangedListener arg0) {
        real.removeOnModeChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnPreferredMixerAttributesChangedListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnPreferredMixerAttributesChangedListener arg0) {
        real.removeOnPreferredMixerAttributesChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public int requestAudioFocus(com.micklab.dcg.wrapper.android.media.AudioFocusRequest arg0) {
        return real.requestAudioFocus(arg0 == null ? null : arg0.unwrap());
    }

    public int requestAudioFocus(com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener arg0, int arg1, int arg2) {
        return real.requestAudioFocus(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setAllowedCapturePolicy(int arg0) {
        real.setAllowedCapturePolicy(arg0);
    }

    public void setBluetoothA2dpOn(boolean arg0) {
        real.setBluetoothA2dpOn(arg0);
    }

    public void setBluetoothScoOn(boolean arg0) {
        real.setBluetoothScoOn(arg0);
    }

    public boolean setCommunicationDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return real.setCommunicationDevice(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setEncodedSurroundMode(int arg0) {
        return real.setEncodedSurroundMode(arg0);
    }

    public void setMicrophoneMute(boolean arg0) {
        real.setMicrophoneMute(arg0);
    }

    public void setMode(int arg0) {
        real.setMode(arg0);
    }

    public void setParameters(java.lang.String arg0) {
        real.setParameters(arg0);
    }

    public boolean setPreferredMixerAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg1, com.micklab.dcg.wrapper.android.media.AudioMixerAttributes arg2) {
        return real.setPreferredMixerAttributes(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void setRingerMode(int arg0) {
        real.setRingerMode(arg0);
    }

    public void setRouting(int arg0, int arg1, int arg2) {
        real.setRouting(arg0, arg1, arg2);
    }

    public void setSpeakerphoneOn(boolean arg0) {
        real.setSpeakerphoneOn(arg0);
    }

    public void setStreamMute(int arg0, boolean arg1) {
        real.setStreamMute(arg0, arg1);
    }

    public void setStreamSolo(int arg0, boolean arg1) {
        real.setStreamSolo(arg0, arg1);
    }

    public void setStreamVolume(int arg0, int arg1, int arg2) {
        real.setStreamVolume(arg0, arg1, arg2);
    }

    public boolean setSurroundFormatEnabled(int arg0, boolean arg1) {
        return real.setSurroundFormatEnabled(arg0, arg1);
    }

    public void setVibrateSetting(int arg0, int arg1) {
        real.setVibrateSetting(arg0, arg1);
    }

    public void setWiredHeadsetOn(boolean arg0) {
        real.setWiredHeadsetOn(arg0);
    }

    public boolean shouldVibrate(int arg0) {
        return real.shouldVibrate(arg0);
    }

    public void startBluetoothSco() {
        real.startBluetoothSco();
    }

    public void stopBluetoothSco() {
        real.stopBluetoothSco();
    }

    public void unloadSoundEffects() {
        real.unloadSoundEffects();
    }

    public void unregisterAudioDeviceCallback(com.micklab.dcg.wrapper.android.media.AudioDeviceCallback arg0) {
        real.unregisterAudioDeviceCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterAudioPlaybackCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioPlaybackCallback arg0) {
        real.unregisterAudioPlaybackCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0) {
        real.unregisterAudioRecordingCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterMediaButtonEventReceiver(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.unregisterMediaButtonEventReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterMediaButtonEventReceiver(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.unregisterMediaButtonEventReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterRemoteControlClient(com.micklab.dcg.wrapper.android.media.RemoteControlClient arg0) {
        real.unregisterRemoteControlClient(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterRemoteController(com.micklab.dcg.wrapper.android.media.RemoteController arg0) {
        real.unregisterRemoteController(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_AUDIO_BECOMING_NOISY = android.media.AudioManager.ACTION_AUDIO_BECOMING_NOISY;
    public static final java.lang.String ACTION_HDMI_AUDIO_PLUG = android.media.AudioManager.ACTION_HDMI_AUDIO_PLUG;
    public static final java.lang.String ACTION_HEADSET_PLUG = android.media.AudioManager.ACTION_HEADSET_PLUG;
    public static final java.lang.String ACTION_MICROPHONE_MUTE_CHANGED = android.media.AudioManager.ACTION_MICROPHONE_MUTE_CHANGED;
    public static final java.lang.String ACTION_SCO_AUDIO_STATE_CHANGED = android.media.AudioManager.ACTION_SCO_AUDIO_STATE_CHANGED;
    public static final java.lang.String ACTION_SCO_AUDIO_STATE_UPDATED = android.media.AudioManager.ACTION_SCO_AUDIO_STATE_UPDATED;
    public static final java.lang.String ACTION_SPEAKERPHONE_STATE_CHANGED = android.media.AudioManager.ACTION_SPEAKERPHONE_STATE_CHANGED;
    public static final int ADJUST_LOWER = android.media.AudioManager.ADJUST_LOWER;
    public static final int ADJUST_MUTE = android.media.AudioManager.ADJUST_MUTE;
    public static final int ADJUST_RAISE = android.media.AudioManager.ADJUST_RAISE;
    public static final int ADJUST_SAME = android.media.AudioManager.ADJUST_SAME;
    public static final int ADJUST_TOGGLE_MUTE = android.media.AudioManager.ADJUST_TOGGLE_MUTE;
    public static final int ADJUST_UNMUTE = android.media.AudioManager.ADJUST_UNMUTE;
    public static final int AUDIOFOCUS_GAIN = android.media.AudioManager.AUDIOFOCUS_GAIN;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK;
    public static final int AUDIOFOCUS_LOSS = android.media.AudioManager.AUDIOFOCUS_LOSS;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT = android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK;
    public static final int AUDIOFOCUS_NONE = android.media.AudioManager.AUDIOFOCUS_NONE;
    public static final int AUDIOFOCUS_REQUEST_DELAYED = android.media.AudioManager.AUDIOFOCUS_REQUEST_DELAYED;
    public static final int AUDIOFOCUS_REQUEST_FAILED = android.media.AudioManager.AUDIOFOCUS_REQUEST_FAILED;
    public static final int AUDIOFOCUS_REQUEST_GRANTED = android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED;
    public static final int AUDIO_SESSION_ID_GENERATE = android.media.AudioManager.AUDIO_SESSION_ID_GENERATE;
    public static final int DIRECT_PLAYBACK_BITSTREAM_SUPPORTED = android.media.AudioManager.DIRECT_PLAYBACK_BITSTREAM_SUPPORTED;
    public static final int DIRECT_PLAYBACK_NOT_SUPPORTED = android.media.AudioManager.DIRECT_PLAYBACK_NOT_SUPPORTED;
    public static final int DIRECT_PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = android.media.AudioManager.DIRECT_PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED;
    public static final int DIRECT_PLAYBACK_OFFLOAD_SUPPORTED = android.media.AudioManager.DIRECT_PLAYBACK_OFFLOAD_SUPPORTED;
    public static final int ENCODED_SURROUND_OUTPUT_ALWAYS = android.media.AudioManager.ENCODED_SURROUND_OUTPUT_ALWAYS;
    public static final int ENCODED_SURROUND_OUTPUT_AUTO = android.media.AudioManager.ENCODED_SURROUND_OUTPUT_AUTO;
    public static final int ENCODED_SURROUND_OUTPUT_MANUAL = android.media.AudioManager.ENCODED_SURROUND_OUTPUT_MANUAL;
    public static final int ENCODED_SURROUND_OUTPUT_NEVER = android.media.AudioManager.ENCODED_SURROUND_OUTPUT_NEVER;
    public static final int ENCODED_SURROUND_OUTPUT_UNKNOWN = android.media.AudioManager.ENCODED_SURROUND_OUTPUT_UNKNOWN;
    public static final int ERROR = android.media.AudioManager.ERROR;
    public static final int ERROR_DEAD_OBJECT = android.media.AudioManager.ERROR_DEAD_OBJECT;
    public static final java.lang.String EXTRA_AUDIO_PLUG_STATE = android.media.AudioManager.EXTRA_AUDIO_PLUG_STATE;
    public static final java.lang.String EXTRA_ENCODINGS = android.media.AudioManager.EXTRA_ENCODINGS;
    public static final java.lang.String EXTRA_MAX_CHANNEL_COUNT = android.media.AudioManager.EXTRA_MAX_CHANNEL_COUNT;
    public static final java.lang.String EXTRA_RINGER_MODE = android.media.AudioManager.EXTRA_RINGER_MODE;
    public static final java.lang.String EXTRA_SCO_AUDIO_PREVIOUS_STATE = android.media.AudioManager.EXTRA_SCO_AUDIO_PREVIOUS_STATE;
    public static final java.lang.String EXTRA_SCO_AUDIO_STATE = android.media.AudioManager.EXTRA_SCO_AUDIO_STATE;
    public static final java.lang.String EXTRA_VIBRATE_SETTING = android.media.AudioManager.EXTRA_VIBRATE_SETTING;
    public static final java.lang.String EXTRA_VIBRATE_TYPE = android.media.AudioManager.EXTRA_VIBRATE_TYPE;
    public static final int FLAG_ALLOW_RINGER_MODES = android.media.AudioManager.FLAG_ALLOW_RINGER_MODES;
    public static final int FLAG_PLAY_SOUND = android.media.AudioManager.FLAG_PLAY_SOUND;
    public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = android.media.AudioManager.FLAG_REMOVE_SOUND_AND_VIBRATE;
    public static final int FLAG_SHOW_UI = android.media.AudioManager.FLAG_SHOW_UI;
    public static final int FLAG_VIBRATE = android.media.AudioManager.FLAG_VIBRATE;
    public static final int FX_BACK = android.media.AudioManager.FX_BACK;
    public static final int FX_FOCUS_NAVIGATION_DOWN = android.media.AudioManager.FX_FOCUS_NAVIGATION_DOWN;
    public static final int FX_FOCUS_NAVIGATION_LEFT = android.media.AudioManager.FX_FOCUS_NAVIGATION_LEFT;
    public static final int FX_FOCUS_NAVIGATION_RIGHT = android.media.AudioManager.FX_FOCUS_NAVIGATION_RIGHT;
    public static final int FX_FOCUS_NAVIGATION_UP = android.media.AudioManager.FX_FOCUS_NAVIGATION_UP;
    public static final int FX_KEYPRESS_DELETE = android.media.AudioManager.FX_KEYPRESS_DELETE;
    public static final int FX_KEYPRESS_INVALID = android.media.AudioManager.FX_KEYPRESS_INVALID;
    public static final int FX_KEYPRESS_RETURN = android.media.AudioManager.FX_KEYPRESS_RETURN;
    public static final int FX_KEYPRESS_SPACEBAR = android.media.AudioManager.FX_KEYPRESS_SPACEBAR;
    public static final int FX_KEYPRESS_STANDARD = android.media.AudioManager.FX_KEYPRESS_STANDARD;
    public static final int FX_KEY_CLICK = android.media.AudioManager.FX_KEY_CLICK;
    public static final int GET_DEVICES_ALL = android.media.AudioManager.GET_DEVICES_ALL;
    public static final int GET_DEVICES_INPUTS = android.media.AudioManager.GET_DEVICES_INPUTS;
    public static final int GET_DEVICES_OUTPUTS = android.media.AudioManager.GET_DEVICES_OUTPUTS;
    public static final int MODE_CALL_REDIRECT = android.media.AudioManager.MODE_CALL_REDIRECT;
    public static final int MODE_CALL_SCREENING = android.media.AudioManager.MODE_CALL_SCREENING;
    public static final int MODE_COMMUNICATION_REDIRECT = android.media.AudioManager.MODE_COMMUNICATION_REDIRECT;
    public static final int MODE_CURRENT = android.media.AudioManager.MODE_CURRENT;
    public static final int MODE_INVALID = android.media.AudioManager.MODE_INVALID;
    public static final int MODE_IN_CALL = android.media.AudioManager.MODE_IN_CALL;
    public static final int MODE_IN_COMMUNICATION = android.media.AudioManager.MODE_IN_COMMUNICATION;
    public static final int MODE_NORMAL = android.media.AudioManager.MODE_NORMAL;
    public static final int MODE_RINGTONE = android.media.AudioManager.MODE_RINGTONE;
    public static final int NUM_STREAMS = android.media.AudioManager.NUM_STREAMS;
    public static final int PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = android.media.AudioManager.PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED;
    public static final int PLAYBACK_OFFLOAD_NOT_SUPPORTED = android.media.AudioManager.PLAYBACK_OFFLOAD_NOT_SUPPORTED;
    public static final int PLAYBACK_OFFLOAD_SUPPORTED = android.media.AudioManager.PLAYBACK_OFFLOAD_SUPPORTED;
    public static final java.lang.String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = android.media.AudioManager.PROPERTY_OUTPUT_FRAMES_PER_BUFFER;
    public static final java.lang.String PROPERTY_OUTPUT_SAMPLE_RATE = android.media.AudioManager.PROPERTY_OUTPUT_SAMPLE_RATE;
    public static final java.lang.String PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED = android.media.AudioManager.PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED;
    public static final java.lang.String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = android.media.AudioManager.PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND;
    public static final java.lang.String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = android.media.AudioManager.PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND;
    public static final java.lang.String RINGER_MODE_CHANGED_ACTION = android.media.AudioManager.RINGER_MODE_CHANGED_ACTION;
    public static final int RINGER_MODE_NORMAL = android.media.AudioManager.RINGER_MODE_NORMAL;
    public static final int RINGER_MODE_SILENT = android.media.AudioManager.RINGER_MODE_SILENT;
    public static final int RINGER_MODE_VIBRATE = android.media.AudioManager.RINGER_MODE_VIBRATE;
    public static final int ROUTE_ALL = android.media.AudioManager.ROUTE_ALL;
    public static final int ROUTE_BLUETOOTH = android.media.AudioManager.ROUTE_BLUETOOTH;
    public static final int ROUTE_BLUETOOTH_A2DP = android.media.AudioManager.ROUTE_BLUETOOTH_A2DP;
    public static final int ROUTE_BLUETOOTH_SCO = android.media.AudioManager.ROUTE_BLUETOOTH_SCO;
    public static final int ROUTE_EARPIECE = android.media.AudioManager.ROUTE_EARPIECE;
    public static final int ROUTE_HEADSET = android.media.AudioManager.ROUTE_HEADSET;
    public static final int ROUTE_SPEAKER = android.media.AudioManager.ROUTE_SPEAKER;
    public static final int SCO_AUDIO_STATE_CONNECTED = android.media.AudioManager.SCO_AUDIO_STATE_CONNECTED;
    public static final int SCO_AUDIO_STATE_CONNECTING = android.media.AudioManager.SCO_AUDIO_STATE_CONNECTING;
    public static final int SCO_AUDIO_STATE_DISCONNECTED = android.media.AudioManager.SCO_AUDIO_STATE_DISCONNECTED;
    public static final int SCO_AUDIO_STATE_ERROR = android.media.AudioManager.SCO_AUDIO_STATE_ERROR;
    public static final int STREAM_ACCESSIBILITY = android.media.AudioManager.STREAM_ACCESSIBILITY;
    public static final int STREAM_ALARM = android.media.AudioManager.STREAM_ALARM;
    public static final int STREAM_DTMF = android.media.AudioManager.STREAM_DTMF;
    public static final int STREAM_MUSIC = android.media.AudioManager.STREAM_MUSIC;
    public static final int STREAM_NOTIFICATION = android.media.AudioManager.STREAM_NOTIFICATION;
    public static final int STREAM_RING = android.media.AudioManager.STREAM_RING;
    public static final int STREAM_SYSTEM = android.media.AudioManager.STREAM_SYSTEM;
    public static final int STREAM_VOICE_CALL = android.media.AudioManager.STREAM_VOICE_CALL;
    public static final int USE_DEFAULT_STREAM_TYPE = android.media.AudioManager.USE_DEFAULT_STREAM_TYPE;
    public static final java.lang.String VIBRATE_SETTING_CHANGED_ACTION = android.media.AudioManager.VIBRATE_SETTING_CHANGED_ACTION;
    public static final int VIBRATE_SETTING_OFF = android.media.AudioManager.VIBRATE_SETTING_OFF;
    public static final int VIBRATE_SETTING_ON = android.media.AudioManager.VIBRATE_SETTING_ON;
    public static final int VIBRATE_SETTING_ONLY_SILENT = android.media.AudioManager.VIBRATE_SETTING_ONLY_SILENT;
    public static final int VIBRATE_TYPE_NOTIFICATION = android.media.AudioManager.VIBRATE_TYPE_NOTIFICATION;
    public static final int VIBRATE_TYPE_RINGER = android.media.AudioManager.VIBRATE_TYPE_RINGER;

    public static final class AudioPlaybackCallback {
        private final android.media.AudioManager.AudioPlaybackCallback real;

        public AudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioManager.AudioPlaybackCallback wrap(android.media.AudioManager.AudioPlaybackCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager.AudioPlaybackCallback(real);
        }

        public android.media.AudioManager.AudioPlaybackCallback unwrap() {
            return real;
        }

    }
    public static final class AudioRecordingCallback {
        private final android.media.AudioManager.AudioRecordingCallback real;

        public AudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback wrap(android.media.AudioManager.AudioRecordingCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback(real);
        }

        public android.media.AudioManager.AudioRecordingCallback unwrap() {
            return real;
        }

    }
    public static final class OnAudioFocusChangeListener {
        private final android.media.AudioManager.OnAudioFocusChangeListener real;

        public OnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener wrap(android.media.AudioManager.OnAudioFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener(real);
        }

        public android.media.AudioManager.OnAudioFocusChangeListener unwrap() {
            return real;
        }

        public void onAudioFocusChange(int arg0) {
            real.onAudioFocusChange(arg0);
        }

    }
    public static final class OnCommunicationDeviceChangedListener {
        private final android.media.AudioManager.OnCommunicationDeviceChangedListener real;

        public OnCommunicationDeviceChangedListener(android.media.AudioManager.OnCommunicationDeviceChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioManager.OnCommunicationDeviceChangedListener wrap(android.media.AudioManager.OnCommunicationDeviceChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager.OnCommunicationDeviceChangedListener(real);
        }

        public android.media.AudioManager.OnCommunicationDeviceChangedListener unwrap() {
            return real;
        }

        public void onCommunicationDeviceChanged(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
            real.onCommunicationDeviceChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnModeChangedListener {
        private final android.media.AudioManager.OnModeChangedListener real;

        public OnModeChangedListener(android.media.AudioManager.OnModeChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioManager.OnModeChangedListener wrap(android.media.AudioManager.OnModeChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager.OnModeChangedListener(real);
        }

        public android.media.AudioManager.OnModeChangedListener unwrap() {
            return real;
        }

        public void onModeChanged(int arg0) {
            real.onModeChanged(arg0);
        }

    }
    public static final class OnPreferredMixerAttributesChangedListener {
        private final android.media.AudioManager.OnPreferredMixerAttributesChangedListener real;

        public OnPreferredMixerAttributesChangedListener(android.media.AudioManager.OnPreferredMixerAttributesChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioManager.OnPreferredMixerAttributesChangedListener wrap(android.media.AudioManager.OnPreferredMixerAttributesChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioManager.OnPreferredMixerAttributesChangedListener(real);
        }

        public android.media.AudioManager.OnPreferredMixerAttributesChangedListener unwrap() {
            return real;
        }

        public void onPreferredMixerAttributesChanged(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg1, com.micklab.dcg.wrapper.android.media.AudioMixerAttributes arg2) {
            real.onPreferredMixerAttributesChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

    }
}
