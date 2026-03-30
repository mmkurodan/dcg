// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class InCallService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InCallService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.InCallService wrap(android.telecom.InCallService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.InCallService(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.InCallService getReal() {
        return (android.telecom.InCallService) real;
    }

    public android.telecom.InCallService unwrap() {
        return getReal();
    }

    public boolean canAddCall() {
        return ((android.telecom.InCallService) real).canAddCall();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallAudioState getCallAudioState() {
        return com.micklab.dcg.wrapper.android.telecom.CallAudioState.wrap(((android.telecom.InCallService) real).getCallAudioState());
    }

    public com.micklab.dcg.wrapper.android.telecom.CallEndpoint getCurrentCallEndpoint() {
        return com.micklab.dcg.wrapper.android.telecom.CallEndpoint.wrap(((android.telecom.InCallService) real).getCurrentCallEndpoint());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.telecom.InCallService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onBringToForeground(boolean arg0) {
        ((android.telecom.InCallService) real).onBringToForeground(arg0);
    }

    public void onCallAdded(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
        ((android.telecom.InCallService) real).onCallAdded(arg0 == null ? null : arg0.getReal());
    }

    public void onCallAudioStateChanged(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        ((android.telecom.InCallService) real).onCallAudioStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        ((android.telecom.InCallService) real).onCallEndpointChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCallRemoved(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
        ((android.telecom.InCallService) real).onCallRemoved(arg0 == null ? null : arg0.getReal());
    }

    public void onCanAddCallChanged(boolean arg0) {
        ((android.telecom.InCallService) real).onCanAddCallChanged(arg0);
    }

    public void onConnectionEvent(com.micklab.dcg.wrapper.android.telecom.Call arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.telecom.InCallService) real).onConnectionEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onMuteStateChanged(boolean arg0) {
        ((android.telecom.InCallService) real).onMuteStateChanged(arg0);
    }

    public void onSilenceRinger() {
        ((android.telecom.InCallService) real).onSilenceRinger();
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.telecom.InCallService) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

    public void requestBluetoothAudio(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        ((android.telecom.InCallService) real).requestBluetoothAudio(arg0 == null ? null : arg0.getReal());
    }

    public void setAudioRoute(int arg0) {
        ((android.telecom.InCallService) real).setAudioRoute(arg0);
    }

    public void setMuted(boolean arg0) {
        ((android.telecom.InCallService) real).setMuted(arg0);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.InCallService.SERVICE_INTERFACE;

    public static final class VideoCall {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VideoCall(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall wrap(android.telecom.InCallService.VideoCall real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.InCallService.VideoCall getReal() {
            return (android.telecom.InCallService.VideoCall) real;
        }

        public android.telecom.InCallService.VideoCall unwrap() {
            return getReal();
        }

        public void registerCallback(com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback arg0) {
            ((android.telecom.InCallService.VideoCall) real).registerCallback(arg0 == null ? null : arg0.getReal());
        }

        public void registerCallback(com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
            ((android.telecom.InCallService.VideoCall) real).registerCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void requestCallDataUsage() {
            ((android.telecom.InCallService.VideoCall) real).requestCallDataUsage();
        }

        public void requestCameraCapabilities() {
            ((android.telecom.InCallService.VideoCall) real).requestCameraCapabilities();
        }

        public void sendSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            ((android.telecom.InCallService.VideoCall) real).sendSessionModifyRequest(arg0 == null ? null : arg0.getReal());
        }

        public void sendSessionModifyResponse(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            ((android.telecom.InCallService.VideoCall) real).sendSessionModifyResponse(arg0 == null ? null : arg0.getReal());
        }

        public void setCamera(java.lang.String arg0) {
            ((android.telecom.InCallService.VideoCall) real).setCamera(arg0);
        }

        public void setDeviceOrientation(int arg0) {
            ((android.telecom.InCallService.VideoCall) real).setDeviceOrientation(arg0);
        }

        public void setDisplaySurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.telecom.InCallService.VideoCall) real).setDisplaySurface(arg0 == null ? null : arg0.getReal());
        }

        public void setPauseImage(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.telecom.InCallService.VideoCall) real).setPauseImage(arg0 == null ? null : arg0.getReal());
        }

        public void setPreviewSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.telecom.InCallService.VideoCall) real).setPreviewSurface(arg0 == null ? null : arg0.getReal());
        }

        public void setZoom(float arg0) {
            ((android.telecom.InCallService.VideoCall) real).setZoom(arg0);
        }

        public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback arg0) {
            ((android.telecom.InCallService.VideoCall) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
        }

        public static final class Callback {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Callback(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback wrap(android.telecom.InCallService.VideoCall.Callback real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.Callback(real, (__DcgwBridgeToken) null);
            }

            public android.telecom.InCallService.VideoCall.Callback getReal() {
                return (android.telecom.InCallService.VideoCall.Callback) real;
            }

            public android.telecom.InCallService.VideoCall.Callback unwrap() {
                return getReal();
            }

            public void onCallDataUsageChanged(long arg0) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onCallDataUsageChanged(arg0);
            }

            public void onCallSessionEvent(int arg0) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onCallSessionEvent(arg0);
            }

            public void onCameraCapabilitiesChanged(com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities arg0) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onCameraCapabilitiesChanged(arg0 == null ? null : arg0.getReal());
            }

            public void onPeerDimensionsChanged(int arg0, int arg1) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onPeerDimensionsChanged(arg0, arg1);
            }

            public void onSessionModifyRequestReceived(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onSessionModifyRequestReceived(arg0 == null ? null : arg0.getReal());
            }

            public void onSessionModifyResponseReceived(int arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg2) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onSessionModifyResponseReceived(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
            }

            public void onVideoQualityChanged(int arg0) {
                ((android.telecom.InCallService.VideoCall.Callback) real).onVideoQualityChanged(arg0);
            }

        }
    }
}
