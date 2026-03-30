// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class RemoteConference {
    private final android.telecom.RemoteConference real;

    public RemoteConference(android.telecom.RemoteConference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.RemoteConference wrap(android.telecom.RemoteConference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConference(real);
    }

    public android.telecom.RemoteConference unwrap() {
        return real;
    }

    public void disconnect() {
        real.disconnect();
    }

    public int getConnectionCapabilities() {
        return real.getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return real.getConnectionProperties();
    }

    public com.micklab.dcg.wrapper.android.telecom.DisconnectCause getDisconnectCause() {
        return com.micklab.dcg.wrapper.android.telecom.DisconnectCause.wrap(real.getDisconnectCause());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public int getState() {
        return real.getState();
    }

    public void hold() {
        real.hold();
    }

    public void merge() {
        real.merge();
    }

    public void playDtmfTone(char arg0) {
        real.playDtmfTone(arg0);
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback arg0) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void separate(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0) {
        real.separate(arg0 == null ? null : arg0.unwrap());
    }

    public void setCallAudioState(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        real.setCallAudioState(arg0 == null ? null : arg0.unwrap());
    }

    public void stopDtmfTone() {
        real.stopDtmfTone();
    }

    public void swap() {
        real.swap();
    }

    public void unhold() {
        real.unhold();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback arg0) {
        real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Callback {
        private final android.telecom.RemoteConference.Callback real;

        public Callback(android.telecom.RemoteConference.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback wrap(android.telecom.RemoteConference.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback(real);
        }

        public android.telecom.RemoteConference.Callback unwrap() {
            return real;
        }

        public void onConnectionAdded(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg1) {
            real.onConnectionAdded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onConnectionCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, int arg1) {
            real.onConnectionCapabilitiesChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onConnectionPropertiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, int arg1) {
            real.onConnectionPropertiesChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onConnectionRemoved(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg1) {
            real.onConnectionRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onDestroyed(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0) {
            real.onDestroyed(arg0 == null ? null : arg0.unwrap());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg1) {
            real.onDisconnected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onExtrasChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onExtrasChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onStateChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, int arg1, int arg2) {
            real.onStateChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
