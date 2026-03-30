// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Call {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Call(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Call wrap(android.telecom.Call real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Call(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.Call getReal() {
        return (android.telecom.Call) real;
    }

    public android.telecom.Call unwrap() {
        return getReal();
    }

    public void answer(int arg0) {
        ((android.telecom.Call) real).answer(arg0);
    }

    public void conference(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
        ((android.telecom.Call) real).conference(arg0 == null ? null : arg0.getReal());
    }

    public void deflect(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.telecom.Call) real).deflect(arg0 == null ? null : arg0.getReal());
    }

    public void disconnect() {
        ((android.telecom.Call) real).disconnect();
    }

    public com.micklab.dcg.wrapper.android.telecom.Call.Details getDetails() {
        return com.micklab.dcg.wrapper.android.telecom.Call.Details.wrap(((android.telecom.Call) real).getDetails());
    }

    public com.micklab.dcg.wrapper.android.telecom.Call getGenericConferenceActiveChildCall() {
        return com.micklab.dcg.wrapper.android.telecom.Call.wrap(((android.telecom.Call) real).getGenericConferenceActiveChildCall());
    }

    public com.micklab.dcg.wrapper.android.telecom.Call getParent() {
        return com.micklab.dcg.wrapper.android.telecom.Call.wrap(((android.telecom.Call) real).getParent());
    }

    public java.lang.String getRemainingPostDialSequence() {
        return ((android.telecom.Call) real).getRemainingPostDialSequence();
    }

    public com.micklab.dcg.wrapper.android.telecom.Call.RttCall getRttCall() {
        return com.micklab.dcg.wrapper.android.telecom.Call.RttCall.wrap(((android.telecom.Call) real).getRttCall());
    }

    public int getState() {
        return ((android.telecom.Call) real).getState();
    }

    public com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall getVideoCall() {
        return com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall.wrap(((android.telecom.Call) real).getVideoCall());
    }

    public void handoverTo(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.telecom.Call) real).handoverTo(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void hold() {
        ((android.telecom.Call) real).hold();
    }

    public boolean isRttActive() {
        return ((android.telecom.Call) real).isRttActive();
    }

    public void mergeConference() {
        ((android.telecom.Call) real).mergeConference();
    }

    public void phoneAccountSelected(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, boolean arg1) {
        ((android.telecom.Call) real).phoneAccountSelected(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void playDtmfTone(char arg0) {
        ((android.telecom.Call) real).playDtmfTone(arg0);
    }

    public void postDialContinue(boolean arg0) {
        ((android.telecom.Call) real).postDialContinue(arg0);
    }

    public void pullExternalCall() {
        ((android.telecom.Call) real).pullExternalCall();
    }

    public void putExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Call) real).putExtras(arg0 == null ? null : arg0.getReal());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.Call.Callback arg0) {
        ((android.telecom.Call) real).registerCallback(arg0 == null ? null : arg0.getReal());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.telecom.Call.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.telecom.Call) real).registerCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void reject(int arg0) {
        ((android.telecom.Call) real).reject(arg0);
    }

    public void reject(boolean arg0, java.lang.String arg1) {
        ((android.telecom.Call) real).reject(arg0, arg1);
    }

    public void removeExtras(java.lang.String... arg0) {
        ((android.telecom.Call) real).removeExtras(arg0);
    }

    public void respondToRttRequest(int arg0, boolean arg1) {
        ((android.telecom.Call) real).respondToRttRequest(arg0, arg1);
    }

    public void sendCallEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.Call) real).sendCallEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendRttRequest() {
        ((android.telecom.Call) real).sendRttRequest();
    }

    public void splitFromConference() {
        ((android.telecom.Call) real).splitFromConference();
    }

    public void stopDtmfTone() {
        ((android.telecom.Call) real).stopDtmfTone();
    }

    public void stopRtt() {
        ((android.telecom.Call) real).stopRtt();
    }

    public void swapConference() {
        ((android.telecom.Call) real).swapConference();
    }

    public java.lang.String toString() {
        return ((android.telecom.Call) real).toString();
    }

    public void unhold() {
        ((android.telecom.Call) real).unhold();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.telecom.Call.Callback arg0) {
        ((android.telecom.Call) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String AVAILABLE_PHONE_ACCOUNTS = android.telecom.Call.AVAILABLE_PHONE_ACCOUNTS;
    public static final java.lang.String EVENT_CLEAR_DIAGNOSTIC_MESSAGE = android.telecom.Call.EVENT_CLEAR_DIAGNOSTIC_MESSAGE;
    public static final java.lang.String EVENT_DISPLAY_DIAGNOSTIC_MESSAGE = android.telecom.Call.EVENT_DISPLAY_DIAGNOSTIC_MESSAGE;
    public static final java.lang.String EXTRA_ASSERTED_DISPLAY_NAME = android.telecom.Call.EXTRA_ASSERTED_DISPLAY_NAME;
    public static final java.lang.String EXTRA_DIAGNOSTIC_MESSAGE = android.telecom.Call.EXTRA_DIAGNOSTIC_MESSAGE;
    public static final java.lang.String EXTRA_DIAGNOSTIC_MESSAGE_ID = android.telecom.Call.EXTRA_DIAGNOSTIC_MESSAGE_ID;
    public static final java.lang.String EXTRA_IS_BUSINESS_CALL = android.telecom.Call.EXTRA_IS_BUSINESS_CALL;
    public static final java.lang.String EXTRA_IS_SUPPRESSED_BY_DO_NOT_DISTURB = android.telecom.Call.EXTRA_IS_SUPPRESSED_BY_DO_NOT_DISTURB;
    public static final java.lang.String EXTRA_LAST_EMERGENCY_CALLBACK_TIME_MILLIS = android.telecom.Call.EXTRA_LAST_EMERGENCY_CALLBACK_TIME_MILLIS;
    public static final java.lang.String EXTRA_SILENT_RINGING_REQUESTED = android.telecom.Call.EXTRA_SILENT_RINGING_REQUESTED;
    public static final java.lang.String EXTRA_SUGGESTED_PHONE_ACCOUNTS = android.telecom.Call.EXTRA_SUGGESTED_PHONE_ACCOUNTS;
    public static final int REJECT_REASON_DECLINED = android.telecom.Call.REJECT_REASON_DECLINED;
    public static final int REJECT_REASON_UNWANTED = android.telecom.Call.REJECT_REASON_UNWANTED;
    public static final int STATE_ACTIVE = android.telecom.Call.STATE_ACTIVE;
    public static final int STATE_AUDIO_PROCESSING = android.telecom.Call.STATE_AUDIO_PROCESSING;
    public static final int STATE_CONNECTING = android.telecom.Call.STATE_CONNECTING;
    public static final int STATE_DIALING = android.telecom.Call.STATE_DIALING;
    public static final int STATE_DISCONNECTED = android.telecom.Call.STATE_DISCONNECTED;
    public static final int STATE_DISCONNECTING = android.telecom.Call.STATE_DISCONNECTING;
    public static final int STATE_HOLDING = android.telecom.Call.STATE_HOLDING;
    public static final int STATE_NEW = android.telecom.Call.STATE_NEW;
    public static final int STATE_PULLING_CALL = android.telecom.Call.STATE_PULLING_CALL;
    public static final int STATE_RINGING = android.telecom.Call.STATE_RINGING;
    public static final int STATE_SELECT_PHONE_ACCOUNT = android.telecom.Call.STATE_SELECT_PHONE_ACCOUNT;
    public static final int STATE_SIMULATED_RINGING = android.telecom.Call.STATE_SIMULATED_RINGING;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Call.Callback wrap(android.telecom.Call.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Call.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.Call.Callback getReal() {
            return (android.telecom.Call.Callback) real;
        }

        public android.telecom.Call.Callback unwrap() {
            return getReal();
        }

        public void onCallDestroyed(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
            ((android.telecom.Call.Callback) real).onCallDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onConnectionEvent(com.micklab.dcg.wrapper.android.telecom.Call arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.telecom.Call.Callback) real).onConnectionEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onDetailsChanged(com.micklab.dcg.wrapper.android.telecom.Call arg0, com.micklab.dcg.wrapper.android.telecom.Call.Details arg1) {
            ((android.telecom.Call.Callback) real).onDetailsChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onHandoverComplete(com.micklab.dcg.wrapper.android.telecom.Call arg0) {
            ((android.telecom.Call.Callback) real).onHandoverComplete(arg0 == null ? null : arg0.getReal());
        }

        public void onHandoverFailed(com.micklab.dcg.wrapper.android.telecom.Call arg0, int arg1) {
            ((android.telecom.Call.Callback) real).onHandoverFailed(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onParentChanged(com.micklab.dcg.wrapper.android.telecom.Call arg0, com.micklab.dcg.wrapper.android.telecom.Call arg1) {
            ((android.telecom.Call.Callback) real).onParentChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onPostDialWait(com.micklab.dcg.wrapper.android.telecom.Call arg0, java.lang.String arg1) {
            ((android.telecom.Call.Callback) real).onPostDialWait(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onRttInitiationFailure(com.micklab.dcg.wrapper.android.telecom.Call arg0, int arg1) {
            ((android.telecom.Call.Callback) real).onRttInitiationFailure(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onRttModeChanged(com.micklab.dcg.wrapper.android.telecom.Call arg0, int arg1) {
            ((android.telecom.Call.Callback) real).onRttModeChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onRttRequest(com.micklab.dcg.wrapper.android.telecom.Call arg0, int arg1) {
            ((android.telecom.Call.Callback) real).onRttRequest(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onRttStatusChanged(com.micklab.dcg.wrapper.android.telecom.Call arg0, boolean arg1, com.micklab.dcg.wrapper.android.telecom.Call.RttCall arg2) {
            ((android.telecom.Call.Callback) real).onRttStatusChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onStateChanged(com.micklab.dcg.wrapper.android.telecom.Call arg0, int arg1) {
            ((android.telecom.Call.Callback) real).onStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onVideoCallChanged(com.micklab.dcg.wrapper.android.telecom.Call arg0, com.micklab.dcg.wrapper.android.telecom.InCallService.VideoCall arg1) {
            ((android.telecom.Call.Callback) real).onVideoCallChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public static final int HANDOVER_FAILURE_DEST_APP_REJECTED = android.telecom.Call.Callback.HANDOVER_FAILURE_DEST_APP_REJECTED;
        public static final int HANDOVER_FAILURE_NOT_SUPPORTED = android.telecom.Call.Callback.HANDOVER_FAILURE_NOT_SUPPORTED;
        public static final int HANDOVER_FAILURE_ONGOING_EMERGENCY_CALL = android.telecom.Call.Callback.HANDOVER_FAILURE_ONGOING_EMERGENCY_CALL;
        public static final int HANDOVER_FAILURE_UNKNOWN = android.telecom.Call.Callback.HANDOVER_FAILURE_UNKNOWN;
        public static final int HANDOVER_FAILURE_USER_REJECTED = android.telecom.Call.Callback.HANDOVER_FAILURE_USER_REJECTED;

    }
    public static final class Details {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Details(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Call.Details wrap(android.telecom.Call.Details real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Call.Details(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.Call.Details getReal() {
            return (android.telecom.Call.Details) real;
        }

        public android.telecom.Call.Details unwrap() {
            return getReal();
        }

        public boolean can(int arg0) {
            return ((android.telecom.Call.Details) real).can(arg0);
        }

        public static boolean can(int arg0, int arg1) {
            return android.telecom.Call.Details.can(arg0, arg1);
        }

        public static java.lang.String capabilitiesToString(int arg0) {
            return android.telecom.Call.Details.capabilitiesToString(arg0);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.telecom.Call.Details) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getAccountHandle() {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.Call.Details) real).getAccountHandle());
        }

        public int getCallCapabilities() {
            return ((android.telecom.Call.Details) real).getCallCapabilities();
        }

        public int getCallDirection() {
            return ((android.telecom.Call.Details) real).getCallDirection();
        }

        public int getCallProperties() {
            return ((android.telecom.Call.Details) real).getCallProperties();
        }

        public java.lang.String getCallerDisplayName() {
            return ((android.telecom.Call.Details) real).getCallerDisplayName();
        }

        public int getCallerDisplayNamePresentation() {
            return ((android.telecom.Call.Details) real).getCallerDisplayNamePresentation();
        }

        public int getCallerNumberVerificationStatus() {
            return ((android.telecom.Call.Details) real).getCallerNumberVerificationStatus();
        }

        public long getConnectTimeMillis() {
            return ((android.telecom.Call.Details) real).getConnectTimeMillis();
        }

        public java.lang.String getContactDisplayName() {
            return ((android.telecom.Call.Details) real).getContactDisplayName();
        }

        public com.micklab.dcg.wrapper.android.net.Uri getContactPhotoUri() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.Call.Details) real).getContactPhotoUri());
        }

        public long getCreationTimeMillis() {
            return ((android.telecom.Call.Details) real).getCreationTimeMillis();
        }

        public com.micklab.dcg.wrapper.android.telecom.DisconnectCause getDisconnectCause() {
            return com.micklab.dcg.wrapper.android.telecom.DisconnectCause.wrap(((android.telecom.Call.Details) real).getDisconnectCause());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.Call.Details) real).getExtras());
        }

        public com.micklab.dcg.wrapper.android.telecom.GatewayInfo getGatewayInfo() {
            return com.micklab.dcg.wrapper.android.telecom.GatewayInfo.wrap(((android.telecom.Call.Details) real).getGatewayInfo());
        }

        public com.micklab.dcg.wrapper.android.net.Uri getHandle() {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.Call.Details) real).getHandle());
        }

        public int getHandlePresentation() {
            return ((android.telecom.Call.Details) real).getHandlePresentation();
        }

        public java.lang.String getId() {
            return ((android.telecom.Call.Details) real).getId();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getIntentExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.Call.Details) real).getIntentExtras());
        }

        public int getState() {
            return ((android.telecom.Call.Details) real).getState();
        }

        public com.micklab.dcg.wrapper.android.telecom.StatusHints getStatusHints() {
            return com.micklab.dcg.wrapper.android.telecom.StatusHints.wrap(((android.telecom.Call.Details) real).getStatusHints());
        }

        public int getVideoState() {
            return ((android.telecom.Call.Details) real).getVideoState();
        }

        public boolean hasProperty(int arg0) {
            return ((android.telecom.Call.Details) real).hasProperty(arg0);
        }

        public static boolean hasProperty(int arg0, int arg1) {
            return android.telecom.Call.Details.hasProperty(arg0, arg1);
        }

        public int hashCode() {
            return ((android.telecom.Call.Details) real).hashCode();
        }

        public static java.lang.String propertiesToString(int arg0) {
            return android.telecom.Call.Details.propertiesToString(arg0);
        }

        public java.lang.String toString() {
            return ((android.telecom.Call.Details) real).toString();
        }

        public static final int CAPABILITY_ADD_PARTICIPANT = android.telecom.Call.Details.CAPABILITY_ADD_PARTICIPANT;
        public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = android.telecom.Call.Details.CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO;
        public static final int CAPABILITY_CAN_PAUSE_VIDEO = android.telecom.Call.Details.CAPABILITY_CAN_PAUSE_VIDEO;
        public static final int CAPABILITY_CAN_PULL_CALL = android.telecom.Call.Details.CAPABILITY_CAN_PULL_CALL;
        public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = android.telecom.Call.Details.CAPABILITY_DISCONNECT_FROM_CONFERENCE;
        public static final int CAPABILITY_HOLD = android.telecom.Call.Details.CAPABILITY_HOLD;
        public static final int CAPABILITY_MANAGE_CONFERENCE = android.telecom.Call.Details.CAPABILITY_MANAGE_CONFERENCE;
        public static final int CAPABILITY_MERGE_CONFERENCE = android.telecom.Call.Details.CAPABILITY_MERGE_CONFERENCE;
        public static final int CAPABILITY_MUTE = android.telecom.Call.Details.CAPABILITY_MUTE;
        public static final int CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT = android.telecom.Call.Details.CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT;
        public static final int CAPABILITY_RESPOND_VIA_TEXT = android.telecom.Call.Details.CAPABILITY_RESPOND_VIA_TEXT;
        public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = android.telecom.Call.Details.CAPABILITY_SEPARATE_FROM_CONFERENCE;
        public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = android.telecom.Call.Details.CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL;
        public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = android.telecom.Call.Details.CAPABILITY_SUPPORTS_VT_LOCAL_RX;
        public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = android.telecom.Call.Details.CAPABILITY_SUPPORTS_VT_LOCAL_TX;
        public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = android.telecom.Call.Details.CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL;
        public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = android.telecom.Call.Details.CAPABILITY_SUPPORTS_VT_REMOTE_RX;
        public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = android.telecom.Call.Details.CAPABILITY_SUPPORTS_VT_REMOTE_TX;
        public static final int CAPABILITY_SUPPORT_DEFLECT = android.telecom.Call.Details.CAPABILITY_SUPPORT_DEFLECT;
        public static final int CAPABILITY_SUPPORT_HOLD = android.telecom.Call.Details.CAPABILITY_SUPPORT_HOLD;
        public static final int CAPABILITY_SWAP_CONFERENCE = android.telecom.Call.Details.CAPABILITY_SWAP_CONFERENCE;
        public static final int DIRECTION_INCOMING = android.telecom.Call.Details.DIRECTION_INCOMING;
        public static final int DIRECTION_OUTGOING = android.telecom.Call.Details.DIRECTION_OUTGOING;
        public static final int DIRECTION_UNKNOWN = android.telecom.Call.Details.DIRECTION_UNKNOWN;
        public static final int PROPERTY_ASSISTED_DIALING = android.telecom.Call.Details.PROPERTY_ASSISTED_DIALING;
        public static final int PROPERTY_CONFERENCE = android.telecom.Call.Details.PROPERTY_CONFERENCE;
        public static final int PROPERTY_CROSS_SIM = android.telecom.Call.Details.PROPERTY_CROSS_SIM;
        public static final int PROPERTY_EMERGENCY_CALLBACK_MODE = android.telecom.Call.Details.PROPERTY_EMERGENCY_CALLBACK_MODE;
        public static final int PROPERTY_ENTERPRISE_CALL = android.telecom.Call.Details.PROPERTY_ENTERPRISE_CALL;
        public static final int PROPERTY_GENERIC_CONFERENCE = android.telecom.Call.Details.PROPERTY_GENERIC_CONFERENCE;
        public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = android.telecom.Call.Details.PROPERTY_HAS_CDMA_VOICE_PRIVACY;
        public static final int PROPERTY_HIGH_DEF_AUDIO = android.telecom.Call.Details.PROPERTY_HIGH_DEF_AUDIO;
        public static final int PROPERTY_IS_ADHOC_CONFERENCE = android.telecom.Call.Details.PROPERTY_IS_ADHOC_CONFERENCE;
        public static final int PROPERTY_IS_EXTERNAL_CALL = android.telecom.Call.Details.PROPERTY_IS_EXTERNAL_CALL;
        public static final int PROPERTY_IS_TRANSACTIONAL = android.telecom.Call.Details.PROPERTY_IS_TRANSACTIONAL;
        public static final int PROPERTY_RTT = android.telecom.Call.Details.PROPERTY_RTT;
        public static final int PROPERTY_SELF_MANAGED = android.telecom.Call.Details.PROPERTY_SELF_MANAGED;
        public static final int PROPERTY_VOIP_AUDIO_MODE = android.telecom.Call.Details.PROPERTY_VOIP_AUDIO_MODE;
        public static final int PROPERTY_WIFI = android.telecom.Call.Details.PROPERTY_WIFI;

    }
    public static final class RttCall {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RttCall(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.Call.RttCall wrap(android.telecom.Call.RttCall real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Call.RttCall(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.Call.RttCall getReal() {
            return (android.telecom.Call.RttCall) real;
        }

        public android.telecom.Call.RttCall unwrap() {
            return getReal();
        }

        public int getRttAudioMode() {
            return ((android.telecom.Call.RttCall) real).getRttAudioMode();
        }

        public java.lang.String read() {
            return ((android.telecom.Call.RttCall) real).read();
        }

        public java.lang.String readImmediately() throws java.io.IOException {
            return ((android.telecom.Call.RttCall) real).readImmediately();
        }

        public void setRttMode(int arg0) {
            ((android.telecom.Call.RttCall) real).setRttMode(arg0);
        }

        public void write(java.lang.String arg0) throws java.io.IOException {
            ((android.telecom.Call.RttCall) real).write(arg0);
        }

        public static final int RTT_MODE_FULL = android.telecom.Call.RttCall.RTT_MODE_FULL;
        public static final int RTT_MODE_HCO = android.telecom.Call.RttCall.RTT_MODE_HCO;
        public static final int RTT_MODE_VCO = android.telecom.Call.RttCall.RTT_MODE_VCO;

    }
}
