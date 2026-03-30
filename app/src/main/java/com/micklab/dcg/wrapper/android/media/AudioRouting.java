// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRouting {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioRouting(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRouting wrap(android.media.AudioRouting real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRouting(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioRouting getReal() {
        return (android.media.AudioRouting) real;
    }

    public android.media.AudioRouting unwrap() {
        return getReal();
    }

    public void addOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.AudioRouting) real).addOnRoutingChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getPreferredDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioRouting) real).getPreferredDevice());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getRoutedDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioRouting) real).getRoutedDevice());
    }

    public void removeOnRoutingChangedListener(com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener arg0) {
        ((android.media.AudioRouting) real).removeOnRoutingChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean setPreferredDevice(com.micklab.dcg.wrapper.android.media.AudioDeviceInfo arg0) {
        return ((android.media.AudioRouting) real).setPreferredDevice(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnRoutingChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnRoutingChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener wrap(android.media.AudioRouting.OnRoutingChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRouting.OnRoutingChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioRouting.OnRoutingChangedListener getReal() {
            return (android.media.AudioRouting.OnRoutingChangedListener) real;
        }

        public android.media.AudioRouting.OnRoutingChangedListener unwrap() {
            return getReal();
        }

        public void onRoutingChanged(com.micklab.dcg.wrapper.android.media.AudioRouting arg0) {
            ((android.media.AudioRouting.OnRoutingChangedListener) real).onRoutingChanged(arg0 == null ? null : arg0.getReal());
        }

    }
}
