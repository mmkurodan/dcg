// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRoute2Info {
    private final android.media.MediaRoute2Info real;

    public MediaRoute2Info(android.media.MediaRoute2Info real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRoute2Info wrap(android.media.MediaRoute2Info real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRoute2Info(real);
    }

    public android.media.MediaRoute2Info unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getClientPackageName() {
        return real.getClientPackageName();
    }

    public int getConnectionState() {
        return real.getConnectionState();
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getIconUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getIconUri());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.CharSequence getName() {
        return real.getName();
    }

    public int getSuitabilityStatus() {
        return real.getSuitabilityStatus();
    }

    public int getType() {
        return real.getType();
    }

    public int getVolume() {
        return real.getVolume();
    }

    public int getVolumeHandling() {
        return real.getVolumeHandling();
    }

    public int getVolumeMax() {
        return real.getVolumeMax();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isSystemRoute() {
        return real.isSystemRoute();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CONNECTION_STATE_CONNECTED = android.media.MediaRoute2Info.CONNECTION_STATE_CONNECTED;
    public static final int CONNECTION_STATE_CONNECTING = android.media.MediaRoute2Info.CONNECTION_STATE_CONNECTING;
    public static final int CONNECTION_STATE_DISCONNECTED = android.media.MediaRoute2Info.CONNECTION_STATE_DISCONNECTED;
    public static final java.lang.String FEATURE_LIVE_AUDIO = android.media.MediaRoute2Info.FEATURE_LIVE_AUDIO;
    public static final java.lang.String FEATURE_LIVE_VIDEO = android.media.MediaRoute2Info.FEATURE_LIVE_VIDEO;
    public static final java.lang.String FEATURE_REMOTE_AUDIO_PLAYBACK = android.media.MediaRoute2Info.FEATURE_REMOTE_AUDIO_PLAYBACK;
    public static final java.lang.String FEATURE_REMOTE_PLAYBACK = android.media.MediaRoute2Info.FEATURE_REMOTE_PLAYBACK;
    public static final java.lang.String FEATURE_REMOTE_VIDEO_PLAYBACK = android.media.MediaRoute2Info.FEATURE_REMOTE_VIDEO_PLAYBACK;
    public static final int PLAYBACK_VOLUME_FIXED = android.media.MediaRoute2Info.PLAYBACK_VOLUME_FIXED;
    public static final int PLAYBACK_VOLUME_VARIABLE = android.media.MediaRoute2Info.PLAYBACK_VOLUME_VARIABLE;
    public static final int SUITABILITY_STATUS_NOT_SUITABLE_FOR_TRANSFER = android.media.MediaRoute2Info.SUITABILITY_STATUS_NOT_SUITABLE_FOR_TRANSFER;
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_DEFAULT_TRANSFER = android.media.MediaRoute2Info.SUITABILITY_STATUS_SUITABLE_FOR_DEFAULT_TRANSFER;
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_MANUAL_TRANSFER = android.media.MediaRoute2Info.SUITABILITY_STATUS_SUITABLE_FOR_MANUAL_TRANSFER;
    public static final int TYPE_BLE_HEADSET = android.media.MediaRoute2Info.TYPE_BLE_HEADSET;
    public static final int TYPE_BLUETOOTH_A2DP = android.media.MediaRoute2Info.TYPE_BLUETOOTH_A2DP;
    public static final int TYPE_BUILTIN_SPEAKER = android.media.MediaRoute2Info.TYPE_BUILTIN_SPEAKER;
    public static final int TYPE_DOCK = android.media.MediaRoute2Info.TYPE_DOCK;
    public static final int TYPE_GROUP = android.media.MediaRoute2Info.TYPE_GROUP;
    public static final int TYPE_HDMI = android.media.MediaRoute2Info.TYPE_HDMI;
    public static final int TYPE_HDMI_ARC = android.media.MediaRoute2Info.TYPE_HDMI_ARC;
    public static final int TYPE_HDMI_EARC = android.media.MediaRoute2Info.TYPE_HDMI_EARC;
    public static final int TYPE_HEARING_AID = android.media.MediaRoute2Info.TYPE_HEARING_AID;
    public static final int TYPE_REMOTE_AUDIO_VIDEO_RECEIVER = android.media.MediaRoute2Info.TYPE_REMOTE_AUDIO_VIDEO_RECEIVER;
    public static final int TYPE_REMOTE_CAR = android.media.MediaRoute2Info.TYPE_REMOTE_CAR;
    public static final int TYPE_REMOTE_COMPUTER = android.media.MediaRoute2Info.TYPE_REMOTE_COMPUTER;
    public static final int TYPE_REMOTE_GAME_CONSOLE = android.media.MediaRoute2Info.TYPE_REMOTE_GAME_CONSOLE;
    public static final int TYPE_REMOTE_SMARTPHONE = android.media.MediaRoute2Info.TYPE_REMOTE_SMARTPHONE;
    public static final int TYPE_REMOTE_SMARTWATCH = android.media.MediaRoute2Info.TYPE_REMOTE_SMARTWATCH;
    public static final int TYPE_REMOTE_SPEAKER = android.media.MediaRoute2Info.TYPE_REMOTE_SPEAKER;
    public static final int TYPE_REMOTE_TABLET = android.media.MediaRoute2Info.TYPE_REMOTE_TABLET;
    public static final int TYPE_REMOTE_TABLET_DOCKED = android.media.MediaRoute2Info.TYPE_REMOTE_TABLET_DOCKED;
    public static final int TYPE_REMOTE_TV = android.media.MediaRoute2Info.TYPE_REMOTE_TV;
    public static final int TYPE_UNKNOWN = android.media.MediaRoute2Info.TYPE_UNKNOWN;
    public static final int TYPE_USB_ACCESSORY = android.media.MediaRoute2Info.TYPE_USB_ACCESSORY;
    public static final int TYPE_USB_DEVICE = android.media.MediaRoute2Info.TYPE_USB_DEVICE;
    public static final int TYPE_USB_HEADSET = android.media.MediaRoute2Info.TYPE_USB_HEADSET;
    public static final int TYPE_WIRED_HEADPHONES = android.media.MediaRoute2Info.TYPE_WIRED_HEADPHONES;
    public static final int TYPE_WIRED_HEADSET = android.media.MediaRoute2Info.TYPE_WIRED_HEADSET;

    public static final class Builder {
        private final android.media.MediaRoute2Info.Builder real;

        public Builder(android.media.MediaRoute2Info.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder wrap(android.media.MediaRoute2Info.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder(real);
        }

        public android.media.MediaRoute2Info.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            this(new android.media.MediaRoute2Info.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(java.lang.String arg0, java.lang.CharSequence arg1) {
            this(new android.media.MediaRoute2Info.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder addFeature(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.addFeature(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info build() {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder clearFeatures() {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.clearFeatures());
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setClientPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setClientPackageName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setConnectionState(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setConnectionState(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setIconUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setIconUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setSuitabilityStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setSuitabilityStatus(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setVisibilityPublic() {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setVisibilityPublic());
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setVolume(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setVolume(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setVolumeHandling(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setVolumeHandling(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder setVolumeMax(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRoute2Info.Builder.wrap(real.setVolumeMax(arg0));
        }

    }
}
