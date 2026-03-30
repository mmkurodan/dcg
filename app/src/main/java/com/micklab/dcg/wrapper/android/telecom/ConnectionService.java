// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class ConnectionService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConnectionService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.ConnectionService wrap(android.telecom.ConnectionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.ConnectionService(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.ConnectionService getReal() {
        return (android.telecom.ConnectionService) real;
    }

    public android.telecom.ConnectionService unwrap() {
        return getReal();
    }

    public void addConference(com.micklab.dcg.wrapper.android.telecom.Conference arg0) {
        ((android.telecom.ConnectionService) real).addConference(arg0 == null ? null : arg0.getReal());
    }

    public void addExistingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.Connection arg1) {
        ((android.telecom.ConnectionService) real).addExistingConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void conferenceRemoteConnections(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg1) {
        ((android.telecom.ConnectionService) real).conferenceRemoteConnections(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void connectionServiceFocusReleased() {
        ((android.telecom.ConnectionService) real).connectionServiceFocusReleased();
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConference createRemoteIncomingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConference.wrap(((android.telecom.ConnectionService) real).createRemoteIncomingConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConnection createRemoteIncomingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConnection.wrap(((android.telecom.ConnectionService) real).createRemoteIncomingConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConference createRemoteOutgoingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConference.wrap(((android.telecom.ConnectionService) real).createRemoteOutgoingConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConnection createRemoteOutgoingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConnection.wrap(((android.telecom.ConnectionService) real).createRemoteOutgoingConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.telecom.ConnectionService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onConference(com.micklab.dcg.wrapper.android.telecom.Connection arg0, com.micklab.dcg.wrapper.android.telecom.Connection arg1) {
        ((android.telecom.ConnectionService) real).onConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onConnectionServiceFocusGained() {
        ((android.telecom.ConnectionService) real).onConnectionServiceFocusGained();
    }

    public void onConnectionServiceFocusLost() {
        ((android.telecom.ConnectionService) real).onConnectionServiceFocusLost();
    }

    public com.micklab.dcg.wrapper.android.telecom.Conference onCreateIncomingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(((android.telecom.ConnectionService) real).onCreateIncomingConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void onCreateIncomingConferenceFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        ((android.telecom.ConnectionService) real).onCreateIncomingConferenceFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateIncomingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(((android.telecom.ConnectionService) real).onCreateIncomingConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void onCreateIncomingConnectionFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        ((android.telecom.ConnectionService) real).onCreateIncomingConnectionFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateIncomingHandoverConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(((android.telecom.ConnectionService) real).onCreateIncomingHandoverConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.telecom.Conference onCreateOutgoingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(((android.telecom.ConnectionService) real).onCreateOutgoingConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void onCreateOutgoingConferenceFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        ((android.telecom.ConnectionService) real).onCreateOutgoingConferenceFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateOutgoingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(((android.telecom.ConnectionService) real).onCreateOutgoingConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void onCreateOutgoingConnectionFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        ((android.telecom.ConnectionService) real).onCreateOutgoingConnectionFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateOutgoingHandoverConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(((android.telecom.ConnectionService) real).onCreateOutgoingHandoverConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void onHandoverFailed(com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg0, int arg1) {
        ((android.telecom.ConnectionService) real).onHandoverFailed(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onRemoteConferenceAdded(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0) {
        ((android.telecom.ConnectionService) real).onRemoteConferenceAdded(arg0 == null ? null : arg0.getReal());
    }

    public void onRemoteExistingConnectionAdded(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0) {
        ((android.telecom.ConnectionService) real).onRemoteExistingConnectionAdded(arg0 == null ? null : arg0.getReal());
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.telecom.ConnectionService) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.ConnectionService.SERVICE_INTERFACE;

}
