// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class InCallService {
    private final android.telecom.InCallService real;

    public InCallService(android.telecom.InCallService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.InCallService wrap(android.telecom.InCallService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.InCallService(real);
    }

    public android.telecom.InCallService unwrap() {
        return real;
    }

    public boolean canAddCall() {
        return real.canAddCall();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallAudioState getCallAudioState() {
        return com.micklab.dcg.wrapper.android.telecom.CallAudioState.wrap(real.getCallAudioState());
    }

    public com.micklab.dcg.wrapper.android.telecom.CallEndpoint getCurrentCallEndpoint() {
        return com.micklab.dcg.wrapper.android.telecom.CallEndpoint.wrap(real.getCurrentCallEndpoint());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onBringToForeground(boolean arg0) {
        real.onBringToForeground(arg0);
    }

    public void onCallAdded(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
        real.onCallAdded(arg0 == null ? null : arg0.unwrap());
    }

    public void onCallAudioStateChanged(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        real.onCallAudioStateChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        real.onCallEndpointChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCallRemoved(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
        real.onCallRemoved(arg0 == null ? null : arg0.unwrap());
    }

    public void onCanAddCallChanged(boolean arg0) {
        real.onCanAddCallChanged(arg0);
    }

    public void onConnectionEvent(com.micklab.dcg.wrapper.android.telecom.Call arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.onConnectionEvent(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onMuteStateChanged(boolean arg0) {
        real.onMuteStateChanged(arg0);
    }

    public void onSilenceRinger() {
        real.onSilenceRinger();
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public void requestBluetoothAudio(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        real.requestBluetoothAudio(arg0 == null ? null : arg0.unwrap());
    }

    public void setAudioRoute(int arg0) {
        real.setAudioRoute(arg0);
    }

    public void setMuted(boolean arg0) {
        real.setMuted(arg0);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.InCallService.SERVICE_INTERFACE;

    public static final class VideoCall {
        private final android.telecom.InCallService.VideoCall real;

        public VideoCall(android.telecom.InCallService.VideoCall real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall wrap(android.telecom.InCallService.VideoCall real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall(real);
        }

        public android.telecom.InCallService.VideoCall unwrap() {
            return real;
        }

        public void registerCallback(com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback arg0) {
            real.registerCallback(arg0 == null ? null : arg0.unwrap());
        }

        public void registerCallback(com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
            real.registerCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void requestCallDataUsage() {
            real.requestCallDataUsage();
        }

        public void requestCameraCapabilities() {
            real.requestCameraCapabilities();
        }

        public void sendSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            real.sendSessionModifyRequest(arg0 == null ? null : arg0.unwrap());
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

        public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback arg0) {
            real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
        }

        public static final class Callback {
            private final android.telecom.InCallService.VideoCall.Callback real;

            public Callback(android.telecom.InCallService.VideoCall.Callback real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback wrap(android.telecom.InCallService.VideoCall.Callback real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback(real);
            }

            public android.telecom.InCallService.VideoCall.Callback unwrap() {
                return real;
            }

            public void onCallDataUsageChanged(long arg0) {
                real.onCallDataUsageChanged(arg0);
            }

            public void onCallSessionEvent(int arg0) {
                real.onCallSessionEvent(arg0);
            }

            public void onCameraCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities arg0) {
                real.onCameraCapabilitiesChanged(arg0 == null ? null : arg0.unwrap());
            }

            public void onPeerDimensionsChanged(int arg0, int arg1) {
                real.onPeerDimensionsChanged(arg0, arg1);
            }

            public void onSessionModifyRequestReceived(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
                real.onSessionModifyRequestReceived(arg0 == null ? null : arg0.unwrap());
            }

            public void onSessionModifyResponseReceived(int arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg2) {
                real.onSessionModifyResponseReceived(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
            }

            public void onVideoQualityChanged(int arg0) {
                real.onVideoQualityChanged(arg0);
            }

        }
    }
}
