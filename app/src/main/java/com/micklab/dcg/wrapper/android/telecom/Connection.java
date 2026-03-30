// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Connection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Connection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Connection wrap(android.telecom.Connection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.Connection getReal() {
        return (android.telecom.Connection) real;
    }

    public android.telecom.Connection unwrap() {
        return getReal();
    }

    public static java.lang.String capabilitiesToString(int arg0) {
        return android.telecom.Connection.capabilitiesToString(arg0);
    }

    public static com.micklab.dcg.wrapper.android.telecom.Connection createCanceledConnection() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(android.telecom.Connection.createCanceledConnection());
    }

    public static com.micklab.dcg.wrapper.android.telecom.Connection createFailedConnection(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(android.telecom.Connection.createFailedConnection(arg0 == null ? null : arg0.getReal()));
    }

    public void destroy() {
        ((android.telecom.Connection) real).destroy();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.Connection) real).getAddress());
    }

    public int getAddressPresentation() {
        return ((android.telecom.Connection) real).getAddressPresentation();
    }

    public boolean getAudioModeIsVoip() {
        return ((android.telecom.Connection) real).getAudioModeIsVoip();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallAudioState getCallAudioState() {
        return com.micklab.dcg.wrapper.android.telecom.CallAudioState.wrap(((android.telecom.Connection) real).getCallAudioState());
    }

    public java.lang.String getCallerDisplayName() {
        return ((android.telecom.Connection) real).getCallerDisplayName();
    }

    public int getCallerDisplayNamePresentation() {
        return ((android.telecom.Connection) real).getCallerDisplayNamePresentation();
    }

    public int getCallerNumberVerificationStatus() {
        return ((android.telecom.Connection) real).getCallerNumberVerificationStatus();
    }

    public com.micklab.dcg.wrapper.android.telecom.Conference getConference() {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(((android.telecom.Connection) real).getConference());
    }

    public int getConnectionCapabilities() {
        return ((android.telecom.Connection) real).getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return ((android.telecom.Connection) real).getConnectionProperties();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallEndpoint getCurrentCallEndpoint() {
        return com.micklab.dcg.wrapper.android.telecom.CallEndpoint.wrap(((android.telecom.Connection) real).getCurrentCallEndpoint());
    }

    public com.micklab.dcg.wrapper.android.telecom.DisconnectCause getDisconnectCause() {
        return com.micklab.dcg.wrapper.android.telecom.DisconnectCause.wrap(((android.telecom.Connection) real).getDisconnectCause());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.Connection) real).getExtras());
    }

    public int getState() {
        return ((android.telecom.Connection) real).getState();
    }

    public com.micklab.dcg.wrapper.android.telecom.StatusHints getStatusHints() {
        return com.micklab.dcg.wrapper.android.telecom.StatusHints.wrap(((android.telecom.Connection) real).getStatusHints());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider getVideoProvider() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider.wrap(((android.telecom.Connection) real).getVideoProvider());
    }

    public int getVideoState() {
        return ((android.telecom.Connection) real).getVideoState();
    }

    public void handleRttUpgradeResponse(com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream arg0) {
        ((android.telecom.Connection) real).handleRttUpgradeResponse(arg0 == null ? null : arg0.getReal());
    }

    public boolean isRingbackRequested() {
        return ((android.telecom.Connection) real).isRingbackRequested();
    }

    public void notifyConferenceMergeFailed() {
        ((android.telecom.Connection) real).notifyConferenceMergeFailed();
    }

    public void onAbort() {
        ((android.telecom.Connection) real).onAbort();
    }

    public void onAnswer() {
        ((android.telecom.Connection) real).onAnswer();
    }

    public void onAnswer(int arg0) {
        ((android.telecom.Connection) real).onAnswer(arg0);
    }

    public void onCallAudioStateChanged(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        ((android.telecom.Connection) real).onCallAudioStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        ((android.telecom.Connection) real).onCallEndpointChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCallEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.Connection) real).onCallEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onDeflect(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.telecom.Connection) real).onDeflect(arg0 == null ? null : arg0.getReal());
    }

    public void onDisconnect() {
        ((android.telecom.Connection) real).onDisconnect();
    }

    public void onExtrasChanged(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Connection) real).onExtrasChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onHandoverComplete() {
        ((android.telecom.Connection) real).onHandoverComplete();
    }

    public void onHold() {
        ((android.telecom.Connection) real).onHold();
    }

    public void onMuteStateChanged(boolean arg0) {
        ((android.telecom.Connection) real).onMuteStateChanged(arg0);
    }

    public void onPlayDtmfTone(char arg0) {
        ((android.telecom.Connection) real).onPlayDtmfTone(arg0);
    }

    public void onPostDialContinue(boolean arg0) {
        ((android.telecom.Connection) real).onPostDialContinue(arg0);
    }

    public void onPullExternalCall() {
        ((android.telecom.Connection) real).onPullExternalCall();
    }

    public void onReject() {
        ((android.telecom.Connection) real).onReject();
    }

    public void onReject(java.lang.String arg0) {
        ((android.telecom.Connection) real).onReject(arg0);
    }

    public void onReject(int arg0) {
        ((android.telecom.Connection) real).onReject(arg0);
    }

    public void onSeparate() {
        ((android.telecom.Connection) real).onSeparate();
    }

    public void onShowIncomingCallUi() {
        ((android.telecom.Connection) real).onShowIncomingCallUi();
    }

    public void onSilence() {
        ((android.telecom.Connection) real).onSilence();
    }

    public void onStartRtt(com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream arg0) {
        ((android.telecom.Connection) real).onStartRtt(arg0 == null ? null : arg0.getReal());
    }

    public void onStateChanged(int arg0) {
        ((android.telecom.Connection) real).onStateChanged(arg0);
    }

    public void onStopDtmfTone() {
        ((android.telecom.Connection) real).onStopDtmfTone();
    }

    public void onStopRtt() {
        ((android.telecom.Connection) real).onStopRtt();
    }

    public void onTrackedByNonUiService(boolean arg0) {
        ((android.telecom.Connection) real).onTrackedByNonUiService(arg0);
    }

    public void onUnhold() {
        ((android.telecom.Connection) real).onUnhold();
    }

    public void onUsingAlternativeUi(boolean arg0) {
        ((android.telecom.Connection) real).onUsingAlternativeUi(arg0);
    }

    public static java.lang.String propertiesToString(int arg0) {
        return android.telecom.Connection.propertiesToString(arg0);
    }

    public void putExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Connection) real).putExtras(arg0 == null ? null : arg0.getReal());
    }

    public void removeExtras(java.lang.String... arg0) {
        ((android.telecom.Connection) real).removeExtras(arg0);
    }

    public void requestBluetoothAudio(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        ((android.telecom.Connection) real).requestBluetoothAudio(arg0 == null ? null : arg0.getReal());
    }

    public void sendConnectionEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.Connection) real).sendConnectionEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendRemoteRttRequest() {
        ((android.telecom.Connection) real).sendRemoteRttRequest();
    }

    public void sendRttInitiationFailure(int arg0) {
        ((android.telecom.Connection) real).sendRttInitiationFailure(arg0);
    }

    public void sendRttInitiationSuccess() {
        ((android.telecom.Connection) real).sendRttInitiationSuccess();
    }

    public void sendRttSessionRemotelyTerminated() {
        ((android.telecom.Connection) real).sendRttSessionRemotelyTerminated();
    }

    public void setActive() {
        ((android.telecom.Connection) real).setActive();
    }

    public void setAddress(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        ((android.telecom.Connection) real).setAddress(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setAudioModeIsVoip(boolean arg0) {
        ((android.telecom.Connection) real).setAudioModeIsVoip(arg0);
    }

    public void setAudioRoute(int arg0) {
        ((android.telecom.Connection) real).setAudioRoute(arg0);
    }

    public void setCallerDisplayName(java.lang.String arg0, int arg1) {
        ((android.telecom.Connection) real).setCallerDisplayName(arg0, arg1);
    }

    public void setCallerNumberVerificationStatus(int arg0) {
        ((android.telecom.Connection) real).setCallerNumberVerificationStatus(arg0);
    }

    public void setConnectionCapabilities(int arg0) {
        ((android.telecom.Connection) real).setConnectionCapabilities(arg0);
    }

    public void setConnectionProperties(int arg0) {
        ((android.telecom.Connection) real).setConnectionProperties(arg0);
    }

    public void setDialing() {
        ((android.telecom.Connection) real).setDialing();
    }

    public void setDisconnected(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0) {
        ((android.telecom.Connection) real).setDisconnected(arg0 == null ? null : arg0.getReal());
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Connection) real).setExtras(arg0 == null ? null : arg0.getReal());
    }

    public void setInitialized() {
        ((android.telecom.Connection) real).setInitialized();
    }

    public void setInitializing() {
        ((android.telecom.Connection) real).setInitializing();
    }

    public void setNextPostDialChar(char arg0) {
        ((android.telecom.Connection) real).setNextPostDialChar(arg0);
    }

    public void setOnHold() {
        ((android.telecom.Connection) real).setOnHold();
    }

    public void setPostDialWait(java.lang.String arg0) {
        ((android.telecom.Connection) real).setPostDialWait(arg0);
    }

    public void setPulling() {
        ((android.telecom.Connection) real).setPulling();
    }

    public void setRingbackRequested(boolean arg0) {
        ((android.telecom.Connection) real).setRingbackRequested(arg0);
    }

    public void setRinging() {
        ((android.telecom.Connection) real).setRinging();
    }

    public void setStatusHints(com.micklab.dcg.wrapper.android.telecom.StatusHints arg0) {
        ((android.telecom.Connection) real).setStatusHints(arg0 == null ? null : arg0.getReal());
    }

    public void setVideoProvider(com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider arg0) {
        ((android.telecom.Connection) real).setVideoProvider(arg0 == null ? null : arg0.getReal());
    }

    public void setVideoState(int arg0) {
        ((android.telecom.Connection) real).setVideoState(arg0);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RttModifyStatus(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Connection.RttModifyStatus wrap(android.telecom.Connection.RttModifyStatus real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection.RttModifyStatus(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.Connection.RttModifyStatus getReal() {
            return (android.telecom.Connection.RttModifyStatus) real;
        }

        public android.telecom.Connection.RttModifyStatus unwrap() {
            return getReal();
        }

        public static final int SESSION_MODIFY_REQUEST_FAIL = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_FAIL;
        public static final int SESSION_MODIFY_REQUEST_INVALID = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_INVALID;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE;
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_SUCCESS;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = android.telecom.Connection.RttModifyStatus.SESSION_MODIFY_REQUEST_TIMED_OUT;

    }
    public static final class RttTextStream {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RttTextStream(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream wrap(android.telecom.Connection.RttTextStream real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection.RttTextStream(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.Connection.RttTextStream getReal() {
            return (android.telecom.Connection.RttTextStream) real;
        }

        public android.telecom.Connection.RttTextStream unwrap() {
            return getReal();
        }

        public java.lang.String read() throws java.io.IOException {
            return ((android.telecom.Connection.RttTextStream) real).read();
        }

        public java.lang.String readImmediately() throws java.io.IOException {
            return ((android.telecom.Connection.RttTextStream) real).readImmediately();
        }

        public void write(java.lang.String arg0) throws java.io.IOException {
            ((android.telecom.Connection.RttTextStream) real).write(arg0);
        }

    }
    public static final class VideoProvider {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VideoProvider(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider wrap(android.telecom.Connection.VideoProvider real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.Connection.VideoProvider getReal() {
            return (android.telecom.Connection.VideoProvider) real;
        }

        public android.telecom.Connection.VideoProvider unwrap() {
            return getReal();
        }

        public void changeCameraCapabilities(com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities arg0) {
            ((android.telecom.Connection.VideoProvider) real).changeCameraCapabilities(arg0 == null ? null : arg0.getReal());
        }

        public void changePeerDimensions(int arg0, int arg1) {
            ((android.telecom.Connection.VideoProvider) real).changePeerDimensions(arg0, arg1);
        }

        public void changeVideoQuality(int arg0) {
            ((android.telecom.Connection.VideoProvider) real).changeVideoQuality(arg0);
        }

        public void handleCallSessionEvent(int arg0) {
            ((android.telecom.Connection.VideoProvider) real).handleCallSessionEvent(arg0);
        }

        public void onRequestCameraCapabilities() {
            ((android.telecom.Connection.VideoProvider) real).onRequestCameraCapabilities();
        }

        public void onRequestConnectionDataUsage() {
            ((android.telecom.Connection.VideoProvider) real).onRequestConnectionDataUsage();
        }

        public void onSendSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1) {
            ((android.telecom.Connection.VideoProvider) real).onSendSessionModifyRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onSendSessionModifyResponse(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSendSessionModifyResponse(arg0 == null ? null : arg0.getReal());
        }

        public void onSetCamera(java.lang.String arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSetCamera(arg0);
        }

        public void onSetDeviceOrientation(int arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSetDeviceOrientation(arg0);
        }

        public void onSetDisplaySurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSetDisplaySurface(arg0 == null ? null : arg0.getReal());
        }

        public void onSetPauseImage(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSetPauseImage(arg0 == null ? null : arg0.getReal());
        }

        public void onSetPreviewSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSetPreviewSurface(arg0 == null ? null : arg0.getReal());
        }

        public void onSetZoom(float arg0) {
            ((android.telecom.Connection.VideoProvider) real).onSetZoom(arg0);
        }

        public void receiveSessionModifyRequest(com.micklab.dcg.wrapper.android.telecom.VideoProfile arg0) {
            ((android.telecom.Connection.VideoProvider) real).receiveSessionModifyRequest(arg0 == null ? null : arg0.getReal());
        }

        public void receiveSessionModifyResponse(int arg0, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg1, com.micklab.dcg.wrapper.android.telecom.VideoProfile arg2) {
            ((android.telecom.Connection.VideoProvider) real).receiveSessionModifyResponse(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void setCallDataUsage(long arg0) {
            ((android.telecom.Connection.VideoProvider) real).setCallDataUsage(arg0);
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
