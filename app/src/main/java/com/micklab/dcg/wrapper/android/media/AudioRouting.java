// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRouting {
    private final android.media.AudioRouting real;

    public AudioRouting(android.media.AudioRouting real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRouting wrap(android.media.AudioRouting real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRouting(real);
    }

    public android.media.AudioRouting unwrap() {
        return real;
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getRoutedDevice());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        real.removeOnRoutingChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return real.setPreferredDevice(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnRoutingChangedListener {
        private final android.media.AudioRouting.OnRoutingChangedListener real;

        public OnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener wrap(android.media.AudioRouting.OnRoutingChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener(real);
        }

        public android.media.AudioRouting.OnRoutingChangedListener unwrap() {
            return real;
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioRouting arg0) {
            real.onRoutingChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
}
