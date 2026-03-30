// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Conference {
    private final android.telecom.Conference real;

    public Conference(android.telecom.Conference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Conference wrap(android.telecom.Conference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Conference(real);
    }

    public android.telecom.Conference unwrap() {
        return real;
    }

    public boolean addConnection(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        return real.addConnection(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.telecom.Conference createFailedConference(com.micklab.dcg.wrapper.android.telecom.DisconnectCause arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(android.telecom.Conference.createFailedConference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void destroy() {
        real.destroy();
    }

    public com.micklab.dcg.wrapper.android.telecom.CallAudioState getCallAudioState() {
        return com.micklab.dcg.wrapper.android.telecom.CallAudioState.wrap(real.getCallAudioState());
    }

    public int getConnectionCapabilities() {
        return real.getConnectionCapabilities();
    }

    public int getConnectionProperties() {
        return real.getConnectionProperties();
    }

    public long getConnectionStartElapsedRealtimeMillis() {
        return real.getConnectionStartElapsedRealtimeMillis();
    }

    public long getConnectionTime() {
        return real.getConnectionTime();
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

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getPhoneAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(real.getPhoneAccountHandle());
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

    public boolean isRingbackRequested() {
        return real.isRingbackRequested();
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

    public void onConnectionAdded(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        real.onConnectionAdded(arg0 == null ? null : arg0.unwrap());
    }

    public void onDisconnect() {
        real.onDisconnect();
    }

    public void onExtrasChanged(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onExtrasChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onHold() {
        real.onHold();
    }

    public void onMerge() {
        real.onMerge();
    }

    public void onMerge(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        real.onMerge(arg0 == null ? null : arg0.unwrap());
    }

    public void onMuteStateChanged(boolean arg0) {
        real.onMuteStateChanged(arg0);
    }

    public void onPlayDtmfTone(char arg0) {
        real.onPlayDtmfTone(arg0);
    }

    public void onReject() {
        real.onReject();
    }

    public void onSeparate(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        real.onSeparate(arg0 == null ? null : arg0.unwrap());
    }

    public void onStopDtmfTone() {
        real.onStopDtmfTone();
    }

    public void onSwap() {
        real.onSwap();
    }

    public void onUnhold() {
        real.onUnhold();
    }

    public void putExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.putExtras(arg0 == null ? null : arg0.unwrap());
    }

    public void removeConnection(com.micklab.dcg.wrapper.android.telecom.Connection arg0) {
        real.removeConnection(arg0 == null ? null : arg0.unwrap());
    }

    public void removeExtras(java.lang.String... arg0) {
        real.removeExtras(arg0);
    }

    public void sendConferenceEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendConferenceEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setActive() {
        real.setActive();
    }

    public void setConnectionCapabilities(int arg0) {
        real.setConnectionCapabilities(arg0);
    }

    public void setConnectionProperties(int arg0) {
        real.setConnectionProperties(arg0);
    }

    public void setConnectionStartElapsedRealTime(long arg0) {
        real.setConnectionStartElapsedRealTime(arg0);
    }

    public void setConnectionStartElapsedRealtimeMillis(long arg0) {
        real.setConnectionStartElapsedRealtimeMillis(arg0);
    }

    public void setConnectionTime(long arg0) {
        real.setConnectionTime(arg0);
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

    public void setOnHold() {
        real.setOnHold();
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

    public void setVideoProvider(com.micklab.dcg.wrapper.android.telecom.Connection arg0, com.micklab.dcg.wrapper.android.telecom.Connection.VideoProvider arg1) {
        real.setVideoProvider(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setVideoState(com.micklab.dcg.wrapper.android.telecom.Connection arg0, int arg1) {
        real.setVideoState(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final long CONNECT_TIME_NOT_SPECIFIED = android.telecom.Conference.CONNECT_TIME_NOT_SPECIFIED;

}
