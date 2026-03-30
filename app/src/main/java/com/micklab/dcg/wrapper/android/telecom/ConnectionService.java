// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class ConnectionService {
    private final android.telecom.ConnectionService real;

    public ConnectionService(android.telecom.ConnectionService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.ConnectionService wrap(android.telecom.ConnectionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.ConnectionService(real);
    }

    public android.telecom.ConnectionService unwrap() {
        return real;
    }

    public void addConference(com.micklab.dcg.wrapper.android.telecom.Conference arg0) {
        real.addConference(arg0 == null ? null : arg0.unwrap());
    }

    public void addExistingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.Connection arg1) {
        real.addExistingConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void conferenceRemoteConnections(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0, com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg1) {
        real.conferenceRemoteConnections(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void connectionServiceFocusReleased() {
        real.connectionServiceFocusReleased();
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConference createRemoteIncomingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConference.wrap(real.createRemoteIncomingConference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConnection createRemoteIncomingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConnection.wrap(real.createRemoteIncomingConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConference createRemoteOutgoingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConference.wrap(real.createRemoteOutgoingConference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.telecom.RemoteConnection createRemoteOutgoingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.RemoteConnection.wrap(real.createRemoteOutgoingConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onConference(com.micklab.dcg.wrapper.android.telecom.Connection arg0, com.micklab.dcg.wrapper.android.telecom.Connection arg1) {
        real.onConference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onConnectionServiceFocusGained() {
        real.onConnectionServiceFocusGained();
    }

    public void onConnectionServiceFocusLost() {
        real.onConnectionServiceFocusLost();
    }

    public com.micklab.dcg.wrapper.android.telecom.Conference onCreateIncomingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(real.onCreateIncomingConference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void onCreateIncomingConferenceFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        real.onCreateIncomingConferenceFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateIncomingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(real.onCreateIncomingConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void onCreateIncomingConnectionFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        real.onCreateIncomingConnectionFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateIncomingHandoverConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(real.onCreateIncomingHandoverConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.telecom.Conference onCreateOutgoingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Conference.wrap(real.onCreateOutgoingConference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void onCreateOutgoingConferenceFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        real.onCreateOutgoingConferenceFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateOutgoingConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(real.onCreateOutgoingConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void onCreateOutgoingConnectionFailed(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        real.onCreateOutgoingConnectionFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.telecom.Connection onCreateOutgoingHandoverConnection(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg1) {
        return com.micklab.dcg.wrapper.android.telecom.Connection.wrap(real.onCreateOutgoingHandoverConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void onHandoverFailed(com.micklab.dcg.wrapper.android.telecom.ConnectionRequest arg0, int arg1) {
        real.onHandoverFailed(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onRemoteConferenceAdded(com.micklab.dcg.wrapper.android.telecom.RemoteConference arg0) {
        real.onRemoteConferenceAdded(arg0 == null ? null : arg0.unwrap());
    }

    public void onRemoteExistingConnectionAdded(com.micklab.dcg.wrapper.android.telecom.RemoteConnection arg0) {
        real.onRemoteExistingConnectionAdded(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.telecom.ConnectionService.SERVICE_INTERFACE;

}
