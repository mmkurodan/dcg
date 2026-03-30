// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Conference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Conference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Conference wrap(android.telecom.Conference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Conference(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.Conference getReal() {
        return (android.telecom.Conference) real;
    }

    public android.telecom.Conference unwrap() {
        return getReal();
    }

    public boolean addConnection(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        return ((android.telecom.Conference) real).addConnection(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.telecom.Conference createFailedConference(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(android.telecom.Conference.createFailedConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void destroy() {
        ((android.telecom.Conference) real).destroy();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallAudioState getCallAudioState() {
        return com.micklab.dcg.wrapper.android.telecom.CallAudioState.wrap(((android.telecom.Conference) real).getCallAudioState());
    }

    public int getConnectionCapabilities() {
        return ((android.telecom.Conference) real).getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return ((android.telecom.Conference) real).getConnectionProperties();
    }

    public long getConnectionStartElapsedRealtimeMillis() {
        return ((android.telecom.Conference) real).getConnectionStartElapsedRealtimeMillis();
    }

    public long getConnectionTime() {
        return ((android.telecom.Conference) real).getConnectionTime();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallEndpoint getCurrentCallEndpoint() {
        return com.micklab.dcg.wrapper.android.telecom.CallEndpoint.wrap(((android.telecom.Conference) real).getCurrentCallEndpoint());
    }

    public com.micklab.dcg.wrapper.android.telecom.DisconnectCause getDisconnectCause() {
        return com.micklab.dcg.wrapper.android.telecom.DisconnectCause.wrap(((android.telecom.Conference) real).getDisconnectCause());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.Conference) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getPhoneAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.Conference) real).getPhoneAccountHandle());
    }

    public int getState() {
        return ((android.telecom.Conference) real).getState();
    }

    public com.micklab.dcg.wrapper.android.telecom.StatusHints getStatusHints() {
        return com.micklab.dcg.wrapper.android.telecom.StatusHints.wrap(((android.telecom.Conference) real).getStatusHints());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider getVideoProvider() {
        return com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider.wrap(((android.telecom.Conference) real).getVideoProvider());
    }

    public int getVideoState() {
        return ((android.telecom.Conference) real).getVideoState();
    }

    public boolean isRingbackRequested() {
        return ((android.telecom.Conference) real).isRingbackRequested();
    }

    public void onAnswer(int arg0) {
        ((android.telecom.Conference) real).onAnswer(arg0);
    }

    public void onCallAudioStateChanged(com.micklab.dcg.wrapper.android.telecom.CallAudioState arg0) {
        ((android.telecom.Conference) real).onCallAudioStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        ((android.telecom.Conference) real).onCallEndpointChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onConnectionAdded(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        ((android.telecom.Conference) real).onConnectionAdded(arg0 == null ? null : arg0.getReal());
    }

    public void onDisconnect() {
        ((android.telecom.Conference) real).onDisconnect();
    }

    public void onExtrasChanged(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Conference) real).onExtrasChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onHold() {
        ((android.telecom.Conference) real).onHold();
    }

    public void onMerge() {
        ((android.telecom.Conference) real).onMerge();
    }

    public void onMerge(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        ((android.telecom.Conference) real).onMerge(arg0 == null ? null : arg0.getReal());
    }

    public void onMuteStateChanged(boolean arg0) {
        ((android.telecom.Conference) real).onMuteStateChanged(arg0);
    }

    public void onPlayDtmfTone(char arg0) {
        ((android.telecom.Conference) real).onPlayDtmfTone(arg0);
    }

    public void onReject() {
        ((android.telecom.Conference) real).onReject();
    }

    public void onSeparate(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        ((android.telecom.Conference) real).onSeparate(arg0 == null ? null : arg0.getReal());
    }

    public void onStopDtmfTone() {
        ((android.telecom.Conference) real).onStopDtmfTone();
    }

    public void onSwap() {
        ((android.telecom.Conference) real).onSwap();
    }

    public void onUnhold() {
        ((android.telecom.Conference) real).onUnhold();
    }

    public void putExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Conference) real).putExtras(arg0 == null ? null : arg0.getReal());
    }

    public void removeConnection(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        ((android.telecom.Conference) real).removeConnection(arg0 == null ? null : arg0.getReal());
    }

    public void removeExtras(java.lang.String... arg0) {
        ((android.telecom.Conference) real).removeExtras(arg0);
    }

    public void sendConferenceEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.Conference) real).sendConferenceEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setActive() {
        ((android.telecom.Conference) real).setActive();
    }

    public void setConnectionCapabilities(int arg0) {
        ((android.telecom.Conference) real).setConnectionCapabilities(arg0);
    }

    public void setConnectionProperties(int arg0) {
        ((android.telecom.Conference) real).setConnectionProperties(arg0);
    }

    public void setConnectionStartElapsedRealTime(long arg0) {
        ((android.telecom.Conference) real).setConnectionStartElapsedRealTime(arg0);
    }

    public void setConnectionStartElapsedRealtimeMillis(long arg0) {
        ((android.telecom.Conference) real).setConnectionStartElapsedRealtimeMillis(arg0);
    }

    public void setConnectionTime(long arg0) {
        ((android.telecom.Conference) real).setConnectionTime(arg0);
    }

    public void setDialing() {
        ((android.telecom.Conference) real).setDialing();
    }

    public void setDisconnected(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0) {
        ((android.telecom.Conference) real).setDisconnected(arg0 == null ? null : arg0.getReal());
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.telecom.Conference) real).setExtras(arg0 == null ? null : arg0.getReal());
    }

    public void setOnHold() {
        ((android.telecom.Conference) real).setOnHold();
    }

    public void setRingbackRequested(boolean arg0) {
        ((android.telecom.Conference) real).setRingbackRequested(arg0);
    }

    public void setRinging() {
        ((android.telecom.Conference) real).setRinging();
    }

    public void setStatusHints(com.micklab.dcg.wrapper.android.telecom.StatusHints arg0) {
        ((android.telecom.Conference) real).setStatusHints(arg0 == null ? null : arg0.getReal());
    }

    public void setVideoProvider(com.micklab.dcg.wrapper.android.telecom.Connection arg0, com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider arg1) {
        ((android.telecom.Conference) real).setVideoProvider(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setVideoState(com.micklab.dcg.wrapper.android.telecom.Connection arg0, int arg1) {
        ((android.telecom.Conference) real).setVideoState(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String toString() {
        return ((android.telecom.Conference) real).toString();
    }

    public static final long CONNECT_TIME_NOT_SPECIFIED = android.telecom.Conference.CONNECT_TIME_NOT_SPECIFIED;

}
