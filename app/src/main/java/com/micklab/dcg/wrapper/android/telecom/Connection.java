// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Connection {
    private final android.telecom.Connection real;

    public Connection(android.telecom.Connection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Connection wrap(android.telecom.Connection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection(real);
    }

    public android.telecom.Connection unwrap() {
        return real;
    }

    public static java.lang.String capabilitiesToString(int arg0) {
        return android.telecom.Connection.capabilitiesToString(arg0);
    }

    public static com.micklab.dcg.wrapper.android.telecom.Connection createCanceledConnection() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(android.telecom.Connection.createCanceledConnection());
    }

    public static com.micklab.dcg.wrapper.android.telecom.Connection createFailedConnection(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(android.telecom.Connection.createFailedConnection(arg0 == null ? null : arg0.unwrap()));
    }

    public void destroy() {
        real.destroy();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getAddress());
    }

    public int getAddressPresentation() {
        return real.getAddressPresentation();
    }

    public boolean getAudioModeIsVoip() {
        return real.getAudioModeIsVoip();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallAudioState getCallAudioState() {
        return com.micklab.dcg.wrapper.android.telecom.CallAudioState.wrap(real.getCallAudioState());
    }

    public java.lang.String getCallerDisplayName() {
        return real.getCallerDisplayName();
    }

    public int getCallerDisplayNamePresentation() {
        return real.getCallerDisplayNamePresentation();
    }

    public int getCallerNumberVerificationStatus() {
        return real.getCallerNumberVerificationStatus();
    }

    public com.micklab.dcg.wrapper.android.telecom.Conference getConference() {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(real.getConference());
    }

    public int getConnectionCapabilities() {
        return real.getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return real.getConnectionProperties();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallEndpoint getCurrentCallEndpoint() {
        return com.micklab.dcg.wrapper.android.telecom.CallEndpoint.wrap(real.getCurrentCallEndpoint());
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

    public com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider getVideoProvider() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider.wrap(real.getVideoProvider());
    }

    public int getVideoState() {
        return real.getVideoState();
    }

    public void handleRttUpgradeResponse(com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream arg0) {
        real.handleRttUpgradeResponse(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isRingbackRequested() {
        return real.isRingbackRequested();
    }

    public void notifyConferenceMergeFailed() {
        real.notifyConferenceMergeFailed();
    }

    public void onAbort() {
        real.onAbort();
    }

    public void onAnswer() {
        real.onAnswer();
    }

    public void onAnswer(int arg0) {
        real.onAnswer(arg0);
    }

    public void onCallAudioStateChanged(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        real.onCallAudioStateChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        real.onCallEndpointChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCallEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onCallEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onDeflect(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.onDeflect(arg0 == null ? null : arg0.unwrap());
    }

    public void onDisconnect() {
        real.onDisconnect();
    }

    public void onExtrasChanged(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onExtrasChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onHandoverComplete() {
        real.onHandoverComplete();
    }

    public void onHold() {
        real.onHold();
    }

    public void onMuteStateChanged(boolean arg0) {
        real.onMuteStateChanged(arg0);
    }

    public void onPlayDtmfTone(char arg0) {
        real.onPlayDtmfTone(arg0);
    }

    public void onPostDialContinue(boolean arg0) {
        real.onPostDialContinue(arg0);
    }

    public void onPullExternalCall() {
        real.onPullExternalCall();
    }

    public void onReject() {
        real.onReject();
    }

    public void onReject(java.lang.String arg0) {
        real.onReject(arg0);
    }

    public void onReject(int arg0) {
        real.onReject(arg0);
    }

    public void onSeparate() {
        real.onSeparate();
    }

    public void onShowIncomingCallUi() {
        real.onShowIncomingCallUi();
    }

    public void onSilence() {
        real.onSilence();
    }

    public void onStartRtt(com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream arg0) {
        real.onStartRtt(arg0 == null ? null : arg0.unwrap());
    }

    public void onStateChanged(int arg0) {
        real.onStateChanged(arg0);
    }

    public void onStopDtmfTone() {
        real.onStopDtmfTone();
    }

    public void onStopRtt() {
        real.onStopRtt();
    }

    public void onTrackedByNonUiService(boolean arg0) {
        real.onTrackedByNonUiService(arg0);
    }

    public void onUnhold() {
        real.onUnhold();
    }

    public void onUsingAlternativeUi(boolean arg0) {
        real.onUsingAlternativeUi(arg0);
    }

    public static java.lang.String propertiesToString(int arg0) {
        return android.telecom.Connection.propertiesToString(arg0);
    }

    public void putExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.putExtras(arg0 == null ? null : arg0.unwrap());
    }

    public void removeExtras(java.lang.String... arg0) {
        real.removeExtras(arg0);
    }

    public void requestBluetoothAudio(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        real.requestBluetoothAudio(arg0 == null ? null : arg0.unwrap());
    }

    public void sendConnectionEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendConnectionEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void sendRemoteRttRequest() {
        real.sendRemoteRttRequest();
    }

    public void sendRttInitiationFailure(int arg0) {
        real.sendRttInitiationFailure(arg0);
    }

    public void sendRttInitiationSuccess() {
        real.sendRttInitiationSuccess();
    }

    public void sendRttSessionRemotelyTerminated() {
        real.sendRttSessionRemotelyTerminated();
    }

    public void setActive() {
        real.setActive();
    }

    public void setAddress(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        real.setAddress(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setAudioModeIsVoip(boolean arg0) {
        real.setAudioModeIsVoip(arg0);
    }

    public void setAudioRoute(int arg0) {
        real.setAudioRoute(arg0);
    }

    public void setCallerDisplayName(java.lang.String arg0, int arg1) {
        real.setCallerDisplayName(arg0, arg1);
    }

    public void setCallerNumberVerificationStatus(int arg0) {
        real.setCallerNumberVerificationStatus(arg0);
    }

    public void setConnectionCapabilities(int arg0) {
        real.setConnectionCapabilities(arg0);
    }

    public void setConnectionProperties(int arg0) {
        real.setConnectionProperties(arg0);
    }

    public void setDialing() {
        real.setDialing();
    }

    public void setDisconnected(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0) {
        real.setDisconnected(arg0 == null ? null : arg0.unwrap());
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setExtras(arg0 == null ? null : arg0.unwrap());
    }

    public void setInitialized() {
        real.setInitialized();
    }

    public void setInitializing() {
        real.setInitializing();
    }

    public void setNextPostDialChar(char arg0) {
        real.setNextPostDialChar(arg0);
    }

    public void setOnHold() {
        real.setOnHold();
    }

    public void setPostDialWait(java.lang.String arg0) {
        real.setPostDialWait(arg0);
    }

    public void setPulling() {
        real.setPulling();
    }

    public void setRingbackRequested(boolean arg0) {
        real.setRingbackRequested(arg0);
    }

    public void setRinging() {
        real.setRinging();
    }

    public void setStatusHints(com.micklab.dcg.wrapper.android.telecom.StatusHints arg0) {
        real.setStatusHints(arg0 == null ? null : arg0.unwrap());
    }

    public void setVideoProvider(com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider arg0) {
        real.setVideoProvider(arg0 == null ? null : arg0.unwrap());
    }

    public void setVideoState(int arg0) {
        real.setVideoState(arg0);
    }

    public static java.lang.String stateToString(int arg0) {
        return android.telecom.Connection.stateToString(arg0);
    }

    public static final int AUDIO_CODEC_AMR = android.telecom.Connection.AUDIO_CODEC_AMR;
    public static final int AUDIO_CODEC_AMR_WB = android.telecom.Connection.AUDIO_CODEC_AMR_WB;
    public static final int AUDIO_CODEC_EVRC = android.telecom.Connection.AUDIO_CODEC_EVRC;
    public static final int AUDIO_CODEC_EVRC_B = android.telecom.Connection.AUDIO_CODEC_EVRC_B;
    public static final int AUDIO_CODEC_EVRC_NW = android.telecom.Connection.AUDIO_CODEC_EVRC_NW;
    public static final int AUDIO_CODEC_EVRC_WB = android.telecom.Connection.AUDIO_CODEC_EVRC_WB;
    public static final int AUDIO_CODEC_EVS_FB = android.telecom.Connection.AUDIO_CODEC_EVS_FB;
    public static final int AUDIO_CODEC_EVS_NB = android.telecom.Connection.AUDIO_CODEC_EVS_NB;
    public static final int AUDIO_CODEC_EVS_SWB = android.telecom.Connection.AUDIO_CODEC_EVS_SWB;
    public static final int AUDIO_CODEC_EVS_WB = android.telecom.Connection.AUDIO_CODEC_EVS_WB;
    public static final int AUDIO_CODEC_G711A = android.telecom.Connection.AUDIO_CODEC_G711A;
    public static final int AUDIO_CODEC_G711AB = android.telecom.Connection.AUDIO_CODEC_G711AB;
    public static final int AUDIO_CODEC_G711U = android.telecom.Connection.AUDIO_CODEC_G711U;
    public static final int AUDIO_CODEC_G722 = android.telecom.Connection.AUDIO_CODEC_G722;
    public static final int AUDIO_CODEC_G723 = android.telecom.Connection.AUDIO_CODEC_G723;
    public static final int AUDIO_CODEC_G729 = android.telecom.Connection.AUDIO_CODEC_G729;
    public static final int AUDIO_CODEC_GSM_EFR = android.telecom.Connection.AUDIO_CODEC_GSM_EFR;
    public static final int AUDIO_CODEC_GSM_FR = android.telecom.Connection.AUDIO_CODEC_GSM_FR;
    public static final int AUDIO_CODEC_GSM_HR = android.telecom.Connection.AUDIO_CODEC_GSM_HR;
    public static final int AUDIO_CODEC_NONE = android.telecom.Connection.AUDIO_CODEC_NONE;
    public static final int AUDIO_CODEC_QCELP13K = android.telecom.Connection.AUDIO_CODEC_QCELP13K;
    public static final int CAPABILITY_ADD_PARTICIPANT = android.telecom.Connection.CAPABILITY_ADD_PARTICIPANT;
    public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = android.telecom.Connection.CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO;
    public static final int CAPABILITY_CAN_PAUSE_VIDEO = android.telecom.Connection.CAPABILITY_CAN_PAUSE_VIDEO;
    public static final int CAPABILITY_CAN_PULL_CALL = android.telecom.Connection.CAPABILITY_CAN_PULL_CALL;
    public static final int CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION = android.telecom.Connection.CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION;
    public static final int CAPABILITY_CAN_UPGRADE_TO_VIDEO = android.telecom.Connection.CAPABILITY_CAN_UPGRADE_TO_VIDEO;
    public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = android.telecom.Connection.CAPABILITY_DISCONNECT_FROM_CONFERENCE;
    public static final int CAPABILITY_HOLD = android.telecom.Connection.CAPABILITY_HOLD;
    public static final int CAPABILITY_MANAGE_CONFERENCE = android.telecom.Connection.CAPABILITY_MANAGE_CONFERENCE;
    public static final int CAPABILITY_MERGE_CONFERENCE = android.telecom.Connection.CAPABILITY_MERGE_CONFERENCE;
    public static final int CAPABILITY_MUTE = android.telecom.Connection.CAPABILITY_MUTE;
    public static final int CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT = android.telecom.Connection.CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT;
    public static final int CAPABILITY_RESPOND_VIA_TEXT = android.telecom.Connection.CAPABILITY_RESPOND_VIA_TEXT;
    public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = android.telecom.Connection.CAPABILITY_SEPARATE_FROM_CONFERENCE;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = android.telecom.Connection.CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = android.telecom.Connection.CAPABILITY_SUPPORTS_VT_LOCAL_RX;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = android.telecom.Connection.CAPABILITY_SUPPORTS_VT_LOCAL_TX;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = android.telecom.Connection.CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = android.telecom.Connection.CAPABILITY_SUPPORTS_VT_REMOTE_RX;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = android.telecom.Connection.CAPABILITY_SUPPORTS_VT_REMOTE_TX;
    public static final int CAPABILITY_SUPPORT_DEFLECT = android.telecom.Connection.CAPABILITY_SUPPORT_DEFLECT;
    public static final int CAPABILITY_SUPPORT_HOLD = android.telecom.Connection.CAPABILITY_SUPPORT_HOLD;
    public static final int CAPABILITY_SWAP_CONFERENCE = android.telecom.Connection.CAPABILITY_SWAP_CONFERENCE;
    public static final java.lang.String EVENT_CALL_HOLD_FAILED = android.telecom.Connection.EVENT_CALL_HOLD_FAILED;
    public static final java.lang.String EVENT_CALL_MERGE_FAILED = android.telecom.Connection.EVENT_CALL_MERGE_FAILED;
    public static final java.lang.String EVENT_CALL_PULL_FAILED = android.telecom.Connection.EVENT_CALL_PULL_FAILED;
    public static final java.lang.String EVENT_CALL_REMOTELY_HELD = android.telecom.Connection.EVENT_CALL_REMOTELY_HELD;
    public static final java.lang.String EVENT_CALL_REMOTELY_UNHELD = android.telecom.Connection.EVENT_CALL_REMOTELY_UNHELD;
    public static final java.lang.String EVENT_CALL_SWITCH_FAILED = android.telecom.Connection.EVENT_CALL_SWITCH_FAILED;
    public static final java.lang.String EVENT_MERGE_COMPLETE = android.telecom.Connection.EVENT_MERGE_COMPLETE;
    public static final java.lang.String EVENT_MERGE_START = android.telecom.Connection.EVENT_MERGE_START;
    public static final java.lang.String EVENT_ON_HOLD_TONE_END = android.telecom.Connection.EVENT_ON_HOLD_TONE_END;
    public static final java.lang.String EVENT_ON_HOLD_TONE_START = android.telecom.Connection.EVENT_ON_HOLD_TONE_START;
    public static final java.lang.String EVENT_RTT_AUDIO_INDICATION_CHANGED = android.telecom.Connection.EVENT_RTT_AUDIO_INDICATION_CHANGED;
    public static final java.lang.String EXTRA_ANSWERING_DROPS_FG_CALL = android.telecom.Connection.EXTRA_ANSWERING_DROPS_FG_CALL;
    public static final java.lang.String EXTRA_ANSWERING_DROPS_FG_CALL_APP_NAME = android.telecom.Connection.EXTRA_ANSWERING_DROPS_FG_CALL_APP_NAME;
    public static final java.lang.String EXTRA_AUDIO_CODEC = android.telecom.Connection.EXTRA_AUDIO_CODEC;
    public static final java.lang.String EXTRA_AUDIO_CODEC_BANDWIDTH_KHZ = android.telecom.Connection.EXTRA_AUDIO_CODEC_BANDWIDTH_KHZ;
    public static final java.lang.String EXTRA_AUDIO_CODEC_BITRATE_KBPS = android.telecom.Connection.EXTRA_AUDIO_CODEC_BITRATE_KBPS;
    public static final java.lang.String EXTRA_CALL_SUBJECT = android.telecom.Connection.EXTRA_CALL_SUBJECT;
    public static final java.lang.String EXTRA_CHILD_ADDRESS = android.telecom.Connection.EXTRA_CHILD_ADDRESS;
    public static final java.lang.String EXTRA_IS_RTT_AUDIO_PRESENT = android.telecom.Connection.EXTRA_IS_RTT_AUDIO_PRESENT;
    public static final java.lang.String EXTRA_LAST_FORWARDED_NUMBER = android.telecom.Connection.EXTRA_LAST_FORWARDED_NUMBER;
    public static final java.lang.String EXTRA_LAST_KNOWN_CELL_IDENTITY = android.telecom.Connection.EXTRA_LAST_KNOWN_CELL_IDENTITY;
    public static final java.lang.String EXTRA_SIP_INVITE = android.telecom.Connection.EXTRA_SIP_INVITE;
    public static final int PROPERTY_ASSISTED_DIALING = android.telecom.Connection.PROPERTY_ASSISTED_DIALING;
    public static final int PROPERTY_CROSS_SIM = android.telecom.Connection.PROPERTY_CROSS_SIM;
    public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = android.telecom.Connection.PROPERTY_HAS_CDMA_VOICE_PRIVACY;
    public static final int PROPERTY_HIGH_DEF_AUDIO = android.telecom.Connection.PROPERTY_HIGH_DEF_AUDIO;
    public static final int PROPERTY_IS_ADHOC_CONFERENCE = android.telecom.Connection.PROPERTY_IS_ADHOC_CONFERENCE;
    public static final int PROPERTY_IS_EXTERNAL_CALL = android.telecom.Connection.PROPERTY_IS_EXTERNAL_CALL;
    public static final int PROPERTY_IS_RTT = android.telecom.Connection.PROPERTY_IS_RTT;
    public static final int PROPERTY_SELF_MANAGED = android.telecom.Connection.PROPERTY_SELF_MANAGED;
    public static final int PROPERTY_WIFI = android.telecom.Connection.PROPERTY_WIFI;
    public static final int STATE_ACTIVE = android.telecom.Connection.STATE_ACTIVE;
    public static final int STATE_DIALING = android.telecom.Connection.STATE_DIALING;
    public static final int STATE_DISCONNECTED = android.telecom.Connection.STATE_DISCONNECTED;
    public static final int STATE_HOLDING = android.telecom.Connection.STATE_HOLDING;
    public static final int STATE_INITIALIZING = android.telecom.Connection.STATE_INITIALIZING;
    public static final int STATE_NEW = android.telecom.Connection.STATE_NEW;
    public static final int STATE_PULLING_CALL = android.telecom.Connection.STATE_PULLING_CALL;
    public static final int STATE_RINGING = android.telecom.Connection.STATE_RINGING;
    public static final int VERIFICATION_STATUS_FAILED = android.telecom.Connection.VERIFICATION_STATUS_FAILED;
    public static final int VERIFICATION_STATUS_NOT_VERIFIED = android.telecom.Connection.VERIFICATION_STATUS_NOT_VERIFIED;
    public static final int VERIFICATION_STATUS_PASSED = android.telecom.Connection.VERIFICATION_STATUS_PASSED;

    public static final class RttModifyStatus {
        private final android.telecom.Connection.RttModifyStatus real;

        public RttModifyStatus(android.telecom.Connection.RttModifyStatus real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Connection.RttModifyStatus wrap(android.telecom.Connection.RttModifyStatus real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection.RttModifyStatus(real);
        }

        public android.telecom.Connection.RttModifyStatus unwrap() {
            return real;
        }

        public static final int SESSION_MODIFY_REQUEST_FAIL = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_FAIL;
        public static final int SESSION_MODIFY_REQUEST_INVALID = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_INVALID;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE;
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_SUCCESS;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_TIMED_OUT;

    }
    public static final class RttTextStream {
        private final android.telecom.Connection.RttTextStream real;

        public RttTextStream(android.telecom.Connection.RttTextStream real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream wrap(android.telecom.Connection.RttTextStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream(real);
        }

        public android.telecom.Connection.RttTextStream unwrap() {
            return real;
        }

        public java.lang.String read() throws java.io.IOException {
            return real.read();
        }

        public java.lang.String readImmediately() throws java.io.IOException {
            return real.readImmediately();
        }

        public void write(java.lang.String arg0) throws java.io.IOException {
            real.write(arg0);
        }

    }
    public static final class VideoProvider {
        private final android.telecom.Connection.VideoProvider real;

        public VideoProvider(android.telecom.Connection.VideoProvider real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider wrap(android.telecom.Connection.VideoProvider real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider(real);
        }

        public android.telecom.Connection.VideoProvider unwrap() {
            return real;
        }

        public void changeCameraCapabilities(com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities arg0) {
            real.changeCameraCapabilities(arg0 == null ? null : arg0.unwrap());
        }

        public void changePeerDimensions(int arg0, int arg1) {
            real.changePeerDimensions(arg0, arg1);
        }

        public void changeVideoQuality(int arg0) {
            real.changeVideoQuality(arg0);
        }

        public void handleCallSessionEvent(int arg0) {
            real.handleCallSessionEvent(arg0);
        }

        public void onRequestCameraCapabilities() {
            real.onRequestCameraCapabilities();
        }

        public void onRequestConnectionDataUsage() {
            real.onRequestConnectionDataUsage();
        }

        public void onSendSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1) {
            real.onSendSessionModifyRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onSendSessionModifyResponse(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            real.onSendSessionModifyResponse(arg0 == null ? null : arg0.unwrap());
        }

        public void onSetCamera(java.lang.String arg0) {
            real.onSetCamera(arg0);
        }

        public void onSetDeviceOrientation(int arg0) {
            real.onSetDeviceOrientation(arg0);
        }

        public void onSetDisplaySurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            real.onSetDisplaySurface(arg0 == null ? null : arg0.unwrap());
        }

        public void onSetPauseImage(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onSetPauseImage(arg0 == null ? null : arg0.unwrap());
        }

        public void onSetPreviewSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            real.onSetPreviewSurface(arg0 == null ? null : arg0.unwrap());
        }

        public void onSetZoom(float arg0) {
            real.onSetZoom(arg0);
        }

        public void receiveSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            real.receiveSessionModifyRequest(arg0 == null ? null : arg0.unwrap());
        }

        public void receiveSessionModifyResponse(int arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg2) {
            real.receiveSessionModifyResponse(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void setCallDataUsage(long arg0) {
            real.setCallDataUsage(arg0);
        }

        public static final int SESSION_EVENT_CAMERA_FAILURE = android.telecom.Connection.VideoProvider.SESSION_EVENT_CAMERA_FAILURE;
        public static final int SESSION_EVENT_CAMERA_PERMISSION_ERROR = android.telecom.Connection.VideoProvider.SESSION_EVENT_CAMERA_PERMISSION_ERROR;
        public static final int SESSION_EVENT_CAMERA_READY = android.telecom.Connection.VideoProvider.SESSION_EVENT_CAMERA_READY;
        public static final int SESSION_EVENT_RX_PAUSE = android.telecom.Connection.VideoProvider.SESSION_EVENT_RX_PAUSE;
        public static final int SESSION_EVENT_RX_RESUME = android.telecom.Connection.VideoProvider.SESSION_EVENT_RX_RESUME;
        public static final int SESSION_EVENT_TX_START = android.telecom.Connection.VideoProvider.SESSION_EVENT_TX_START;
        public static final int SESSION_EVENT_TX_STOP = android.telecom.Connection.VideoProvider.SESSION_EVENT_TX_STOP;
        public static final int SESSION_MODIFY_REQUEST_FAIL = android.telecom.Connection.VideoProvider.SESSION_MODIFY_REQUEST_FAIL;
        public static final int SESSION_MODIFY_REQUEST_INVALID = android.telecom.Connection.VideoProvider.SESSION_MODIFY_REQUEST_INVALID;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = android.telecom.Connection.VideoProvider.SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE;
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = android.telecom.Connection.VideoProvider.SESSION_MODIFY_REQUEST_SUCCESS;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = android.telecom.Connection.VideoProvider.SESSION_MODIFY_REQUEST_TIMED_OUT;

    }
}
