// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class RemoteConnection {
    private final android.telecom.RemoteConnection real;

    public RemoteConnection(android.telecom.RemoteConnection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection wrap(android.telecom.RemoteConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection(real);
    }

    public android.telecom.RemoteConnection unwrap() {
        return real;
    }

    public void abort() {
        real.abort();
    }

    public void answer() {
        real.answer();
    }

    public void disconnect() {
        real.disconnect();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getAddress());
    }

    public int getAddressPresentation() {
        return real.getAddressPresentation();
    }

    public java.lang.CharSequence getCallerDisplayName() {
        return real.getCallerDisplayName();
    }

    public int getCallerDisplayNamePresentation() {
        return real.getCallerDisplayNamePresentation();
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConference getConference() {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConference.wrap(real.getConference());
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

    public com.micklab.dcg.wrapper.android.telecom.StatusHints getStatusHints() {
        return com.micklab.dcg.wrapper.android.telecom.StatusHints.wrap(real.getStatusHints());
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider getVideoProvider() {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.wrap(real.getVideoProvider());
    }

    public int getVideoState() {
        return real.getVideoState();
    }

    public void hold() {
        real.hold();
    }

    public boolean isRingbackRequested() {
        return real.isRingbackRequested();
    }

    public boolean isVoipAudioMode() {
        return real.isVoipAudioMode();
    }

    public void playDtmfTone(char arg0) {
        real.playDtmfTone(arg0);
    }

    public void postDialContinue(boolean arg0) {
        real.postDialContinue(arg0);
    }

    public void pullExternalCall() {
        real.pullExternalCall();
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback arg0) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void reject() {
        real.reject();
    }

    public void setCallAudioState(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        real.setCallAudioState(arg0 == null ? null : arg0.unwrap());
    }

    public void stopDtmfTone() {
        real.stopDtmfTone();
    }

    public void unhold() {
        real.unhold();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback arg0) {
        real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Callback {
        private final android.telecom.RemoteConnection.Callback real;

        public Callback(android.telecom.RemoteConnection.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback wrap(android.telecom.RemoteConnection.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection.Callback(real);
        }

        public android.telecom.RemoteConnection.Callback unwrap() {
            return real;
        }

        public void onAddressChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
            real.onAddressChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public void onCallerDisplayNameChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, java.lang.String arg1, int arg2) {
            real.onCallerDisplayNameChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public void onConferenceChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConference arg1) {
            real.onConferenceChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onConnectionCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            real.onConnectionCapabilitiesChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onConnectionEvent(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onConnectionEvent(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onConnectionPropertiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            real.onConnectionPropertiesChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onDestroyed(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0) {
            real.onDestroyed(arg0 == null ? null : arg0.unwrap());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg1) {
            real.onDisconnected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onExtrasChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onExtrasChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onPostDialChar(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, char arg1) {
            real.onPostDialChar(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onPostDialWait(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, java.lang.String arg1) {
            real.onPostDialWait(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onRingbackRequested(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, boolean arg1) {
            real.onRingbackRequested(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onStateChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            real.onStateChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onStatusHintsChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.StatusHints arg1) {
            real.onStatusHintsChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onVideoProviderChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg1) {
            real.onVideoProviderChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onVideoStateChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, int arg1) {
            real.onVideoStateChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onVoipAudioChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, boolean arg1) {
            real.onVoipAudioChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class VideoProvider {
        private final android.telecom.RemoteConnection.VideoProvider real;

        public VideoProvider(android.telecom.RemoteConnection.VideoProvider real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider wrap(android.telecom.RemoteConnection.VideoProvider real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider(real);
        }

        public android.telecom.RemoteConnection.VideoProvider unwrap() {
            return real;
        }

        public void registerCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback arg0) {
            real.registerCallback(arg0 == null ? null : arg0.unwrap());
        }

        public void requestCallDataUsage() {
            real.requestCallDataUsage();
        }

        public void requestCameraCapabilities() {
            real.requestCameraCapabilities();
        }

        public void sendSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1) {
            real.sendSessionModifyRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void sendSessionModifyResponse(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            real.sendSessionModifyResponse(arg0 == null ? null : arg0.unwrap());
        }

        public void setCamera(java.lang.String arg0) {
            real.setCamera(arg0);
        }

        public void setDeviceOrientation(int arg0) {
            real.setDeviceOrientation(arg0);
        }

        public void setDisplaySurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            real.setDisplaySurface(arg0 == null ? null : arg0.unwrap());
        }

        public void setPauseImage(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.setPauseImage(arg0 == null ? null : arg0.unwrap());
        }

        public void setPreviewSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            real.setPreviewSurface(arg0 == null ? null : arg0.unwrap());
        }

        public void setZoom(float arg0) {
            real.setZoom(arg0);
        }

        public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback arg0) {
            real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
        }

        public static final class Callback {
            private final android.telecom.RemoteConnection.VideoProvider.Callback real;

            public Callback(android.telecom.RemoteConnection.VideoProvider.Callback real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback wrap(android.telecom.RemoteConnection.VideoProvider.Callback real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider.Callback(real);
            }

            public android.telecom.RemoteConnection.VideoProvider.Callback unwrap() {
                return real;
            }

            public void onCallDataUsageChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, long arg1) {
                real.onCallDataUsageChanged(arg0 == null ? null : arg0.unwrap(), arg1);
            }

            public void onCallSessionEvent(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1) {
                real.onCallSessionEvent(arg0 == null ? null : arg0.unwrap(), arg1);
            }

            public void onCameraCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities arg1) {
                real.onCameraCapabilitiesChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
            }

            public void onPeerDimensionsChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1, int arg2) {
                real.onPeerDimensionsChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public void onSessionModifyRequestReceived(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1) {
                real.onSessionModifyRequestReceived(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
            }

            public void onSessionModifyResponseReceived(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg2, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg3) {
                real.onSessionModifyResponseReceived(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
            }

            public void onVideoQualityChanged(com.micklab.dcg.wrapper.android.telecom.RemoteConnection.VideoProvider arg0, int arg1) {
                real.onVideoQualityChanged(arg0 == null ? null : arg0.unwrap(), arg1);
            }

        }
    }
}
