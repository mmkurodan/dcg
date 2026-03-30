// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class RemoteConnection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteConnection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection wrap(android.telecom.RemoteConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.RemoteConnection getReal() {
        return (android.telecom.RemoteConnection) real;
    }

    public android.telecom.RemoteConnection unwrap() {
        return getReal();
    }

    public void abort() {
        ((android.telecom.RemoteConnection) real).abort();
    }

    public void answer() {
        ((android.telecom.RemoteConnection) real).answer();
    }

    public void disconnect() {
        ((android.telecom.RemoteConnection) real).disconnect();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.RemoteConnection) real).getAddress());
    }

    public int getAddressPresentation() {
        return ((android.telecom.RemoteConnection) real).getAddressPresentation();
    }

    public java.lang.CharSequence getCallerDisplayName() {
        return ((android.telecom.RemoteConnection) real).getCallerDisplayName();
    }

    public int getCallerDisplayNamePresentation() {
        return ((android.telecom.RemoteConnection) real).getCallerDisplayNamePresentation();
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConference getConference() {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConference.wrap(((android.telecom.RemoteConnection) real).getConference());
    }

    public int getConnectionCapabilities() {
        return ((android.telecom.RemoteConnection) real).getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return ((android.telecom.RemoteConnection) real).getConnectionProperties();
    }

    public com.micklab.dcg.wrapper.android.telecom.DisconnectCause getDisconnectCause() {
        return com.micklab.dcg.wrapper.android.telecom.DisconnectCause.wrap(((android.telecom.RemoteConnection) real).getDisconnectCause());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.RemoteConnection) real).getExtras());
    }

    public int getState() {
        return ((android.telecom.RemoteConnection) real).getState();
    }

    public com.micklab.dcg.wrapper.android.telecom.StatusHints getStatusHints() {
        return com.micklab.dcg.wrapper.android.telecom.StatusHints.wrap(((android.telecom.RemoteConnection) real).getStatusHints());
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider getVideoProvider() {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.wrap(((android.telecom.RemoteConnection) real).getVideoProvider());
    }

    public int getVideoState() {
        return ((android.telecom.RemoteConnection) real).getVideoState();
    }

    public void hold() {
        ((android.telecom.RemoteConnection) real).hold();
    }

    public boolean isRingbackRequested() {
        return ((android.telecom.RemoteConnection) real).isRingbackRequested();
    }

    public boolean isVoipAudioMode() {
        return ((android.telecom.RemoteConnection) real).isVoipAudioMode();
    }

    public void playDtmfTone(char arg0) {
        ((android.telecom.RemoteConnection) real).playDtmfTone(arg0);
    }

    public void postDialContinue(boolean arg0) {
        ((android.telecom.RemoteConnection) real).postDialContinue(arg0);
    }

    public void pullExternalCall() {
        ((android.telecom.RemoteConnection) real).pullExternalCall();
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback arg0) {
        ((android.telecom.RemoteConnection) real).registerCallback(arg0 == null ? null : arg0.getReal());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.telecom.RemoteConnection) real).registerCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void reject() {
        ((android.telecom.RemoteConnection) real).reject();
    }

    public void setCallAudioState(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        ((android.telecom.RemoteConnection) real).setCallAudioState(arg0 == null ? null : arg0.getReal());
    }

    public void stopDtmfTone() {
        ((android.telecom.RemoteConnection) real).stopDtmfTone();
    }

    public void unhold() {
        ((android.telecom.RemoteConnection) real).unhold();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback arg0) {
        ((android.telecom.RemoteConnection) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback wrap(android.telecom.RemoteConnection.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.RemoteConnection.Callback getReal() {
            return (android.telecom.RemoteConnection.Callback) real;
        }

        public android.telecom.RemoteConnection.Callback unwrap() {
            return getReal();
        }

        public void onAddressChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
            ((android.telecom.RemoteConnection.Callback) real).onAddressChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

        public void onCallerDisplayNameChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, java.lang.String arg1, int arg2) {
            ((android.telecom.RemoteConnection.Callback) real).onCallerDisplayNameChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void onConferenceChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConference arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onConferenceChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onConnectionCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onConnectionCapabilitiesChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onConnectionEvent(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.telecom.RemoteConnection.Callback) real).onConnectionEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onConnectionPropertiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onConnectionPropertiesChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onDestroyed(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0) {
            ((android.telecom.RemoteConnection.Callback) real).onDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onDisconnected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onExtrasChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onExtrasChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onPostDialChar(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, char arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onPostDialChar(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onPostDialWait(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, java.lang.String arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onPostDialWait(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onRingbackRequested(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, boolean arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onRingbackRequested(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onStateChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onStatusHintsChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.StatusHints arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onStatusHintsChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onVideoProviderChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onVideoProviderChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onVideoStateChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onVideoStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onVoipAudioChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, boolean arg1) {
            ((android.telecom.RemoteConnection.Callback) real).onVoipAudioChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class VideoProvider {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VideoProvider(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider wrap(android.telecom.RemoteConnection.VideoProvider real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.RemoteConnection.VideoProvider getReal() {
            return (android.telecom.RemoteConnection.VideoProvider) real;
        }

        public android.telecom.RemoteConnection.VideoProvider unwrap() {
            return getReal();
        }

        public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).registerCallback(arg0 == null ? null : arg0.getReal());
        }

        public void requestCallDataUsage() {
            ((android.telecom.RemoteConnection.VideoProvider) real).requestCallDataUsage();
        }

        public void requestCameraCapabilities() {
            ((android.telecom.RemoteConnection.VideoProvider) real).requestCameraCapabilities();
        }

        public void sendSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1) {
            ((android.telecom.RemoteConnection.VideoProvider) real).sendSessionModifyRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void sendSessionModifyResponse(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).sendSessionModifyResponse(arg0 == null ? null : arg0.getReal());
        }

        public void setCamera(java.lang.String arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).setCamera(arg0);
        }

        public void setDeviceOrientation(int arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).setDeviceOrientation(arg0);
        }

        public void setDisplaySurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).setDisplaySurface(arg0 == null ? null : arg0.getReal());
        }

        public void setPauseImage(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).setPauseImage(arg0 == null ? null : arg0.getReal());
        }

        public void setPreviewSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).setPreviewSurface(arg0 == null ? null : arg0.getReal());
        }

        public void setZoom(float arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).setZoom(arg0);
        }

        public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback arg0) {
            ((android.telecom.RemoteConnection.VideoProvider) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
        }

        public static final class Callback {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Callback(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback wrap(android.telecom.RemoteConnection.VideoProvider.Callback real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback(real, (__DcgwBridgeToken) null);
            }

            public android.telecom.RemoteConnection.VideoProvider.Callback getReal() {
                return (android.telecom.RemoteConnection.VideoProvider.Callback) real;
            }

            public android.telecom.RemoteConnection.VideoProvider.Callback unwrap() {
                return getReal();
            }

            public void onCallDataUsageChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, long arg1) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onCallDataUsageChanged(arg0 == null ? null : arg0.getReal(), arg1);
            }

            public void onCallSessionEvent(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onCallSessionEvent(arg0 == null ? null : arg0.getReal(), arg1);
            }

            public void onCameraCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities arg1) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onCameraCapabilitiesChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
            }

            public void onPeerDimensionsChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1, int arg2) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onPeerDimensionsChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
            }

            public void onSessionModifyRequestReceived(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onSessionModifyRequestReceived(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
            }

            public void onSessionModifyResponseReceived(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg2, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg3) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onSessionModifyResponseReceived(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
            }

            public void onVideoQualityChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1) {
                ((android.telecom.RemoteConnection.VideoProvider.Callback) real).onVideoQualityChanged(arg0 == null ? null : arg0.getReal(), arg1);
            }

        }
    }
}
