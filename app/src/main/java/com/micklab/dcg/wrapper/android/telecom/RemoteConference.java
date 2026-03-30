// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class RemoteConference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteConference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.RemoteConference wrap(android.telecom.RemoteConference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConference(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.RemoteConference getReal() {
        return (android.telecom.RemoteConference) real;
    }

    public android.telecom.RemoteConference unwrap() {
        return getReal();
    }

    public void disconnect() {
        ((android.telecom.RemoteConference) real).disconnect();
    }

    public int getConnectionCapabilities() {
        return ((android.telecom.RemoteConference) real).getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return ((android.telecom.RemoteConference) real).getConnectionProperties();
    }

    public com.micklab.dcg.wrapper.android.telecom.DisconnectCause getDisconnectCause() {
        return com.micklab.dcg.wrapper.android.telecom.DisconnectCause.wrap(((android.telecom.RemoteConference) real).getDisconnectCause());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.RemoteConference) real).getExtras());
    }

    public int getState() {
        return ((android.telecom.RemoteConference) real).getState();
    }

    public void hold() {
        ((android.telecom.RemoteConference) real).hold();
    }

    public void merge() {
        ((android.telecom.RemoteConference) real).merge();
    }

    public void playDtmfTone(char arg0) {
        ((android.telecom.RemoteConference) real).playDtmfTone(arg0);
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback arg0) {
        ((android.telecom.RemoteConference) real).registerCallback(arg0 == null ? null : arg0.getReal());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.telecom.RemoteConference) real).registerCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void separate(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0) {
        ((android.telecom.RemoteConference) real).separate(arg0 == null ? null : arg0.getReal());
    }

    public void setCallAudioState(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        ((android.telecom.RemoteConference) real).setCallAudioState(arg0 == null ? null : arg0.getReal());
    }

    public void stopDtmfTone() {
        ((android.telecom.RemoteConference) real).stopDtmfTone();
    }

    public void swap() {
        ((android.telecom.RemoteConference) real).swap();
    }

    public void unhold() {
        ((android.telecom.RemoteConference) real).unhold();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback arg0) {
        ((android.telecom.RemoteConference) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback wrap(android.telecom.RemoteConference.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConference.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.RemoteConference.Callback getReal() {
            return (android.telecom.RemoteConference.Callback) real;
        }

        public android.telecom.RemoteConference.Callback unwrap() {
            return getReal();
        }

        public void onConnectionAdded(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg1) {
            ((android.telecom.RemoteConference.Callback) real).onConnectionAdded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onConnectionCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, int arg1) {
            ((android.telecom.RemoteConference.Callback) real).onConnectionCapabilitiesChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onConnectionPropertiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, int arg1) {
            ((android.telecom.RemoteConference.Callback) real).onConnectionPropertiesChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onConnectionRemoved(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg1) {
            ((android.telecom.RemoteConference.Callback) real).onConnectionRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onDestroyed(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0) {
            ((android.telecom.RemoteConference.Callback) real).onDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg1) {
            ((android.telecom.RemoteConference.Callback) real).onDisconnected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onExtrasChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.telecom.RemoteConference.Callback) real).onExtrasChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onStateChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0, int arg1, int arg2) {
            ((android.telecom.RemoteConference.Callback) real).onStateChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
