// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SipSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipSession wrap(android.net.sip.SipSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipSession(real, (__DcgwBridgeToken) null);
    }

    public android.net.sip.SipSession getReal() {
        return (android.net.sip.SipSession) real;
    }

    public android.net.sip.SipSession unwrap() {
        return getReal();
    }

    public void answerCall(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#answerCall(java.lang.String,int)");
    }

    public void changeCall(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#changeCall(java.lang.String,int)");
    }

    public void endCall() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#endCall()");
    }

    public java.lang.String getCallId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#getCallId()");
    }

    public java.lang.String getLocalIp() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#getLocalIp()");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipProfile getLocalProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#getLocalProfile()");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipProfile getPeerProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#getPeerProfile()");
    }

    public int getState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#getState()");
    }

    public boolean isInCall() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#isInCall()");
    }

    public void makeCall(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, java.lang.String arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#makeCall(android.net.sip.SipProfile,java.lang.String,int)");
    }

    public void register(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#register(int)");
    }

    public void setListener(com.micklab.dcg.wrapper.android.net.sip.SipSession.Listener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#setListener(android.net.sip.SipSession$Listener)");
    }

    public void unregister() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession#unregister()");
    }

    public static final class Listener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Listener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.sip.SipSession.Listener wrap(android.net.sip.SipSession.Listener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipSession.Listener(real, (__DcgwBridgeToken) null);
        }

        public android.net.sip.SipSession.Listener getReal() {
            return (android.net.sip.SipSession.Listener) real;
        }

        public android.net.sip.SipSession.Listener unwrap() {
            return getReal();
        }

        public Listener() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#android.net.sip.SipSession$Listener()");
        }

        public void onCallBusy(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onCallBusy(android.net.sip.SipSession)");
        }

        public void onCallChangeFailed(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, int arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onCallChangeFailed(android.net.sip.SipSession,int,java.lang.String)");
        }

        public void onCallEnded(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onCallEnded(android.net.sip.SipSession)");
        }

        public void onCallEstablished(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, java.lang.String arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onCallEstablished(android.net.sip.SipSession,java.lang.String)");
        }

        public void onCalling(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onCalling(android.net.sip.SipSession)");
        }

        public void onError(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, int arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onError(android.net.sip.SipSession,int,java.lang.String)");
        }

        public void onRegistering(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onRegistering(android.net.sip.SipSession)");
        }

        public void onRegistrationDone(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onRegistrationDone(android.net.sip.SipSession,int)");
        }

        public void onRegistrationFailed(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, int arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onRegistrationFailed(android.net.sip.SipSession,int,java.lang.String)");
        }

        public void onRegistrationTimeout(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onRegistrationTimeout(android.net.sip.SipSession)");
        }

        public void onRinging(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, com.micklab.dcg.wrapper.android.net.sip.SipProfile arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onRinging(android.net.sip.SipSession,android.net.sip.SipProfile,java.lang.String)");
        }

        public void onRingingBack(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$Listener#onRingingBack(android.net.sip.SipSession)");
        }

    }
    public static final class State {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private State(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.sip.SipSession.State wrap(android.net.sip.SipSession.State real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipSession.State(real, (__DcgwBridgeToken) null);
        }

        public android.net.sip.SipSession.State getReal() {
            return (android.net.sip.SipSession.State) real;
        }

        public android.net.sip.SipSession.State unwrap() {
            return getReal();
        }

        public static java.lang.String toString(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipSession$State#toString(int)");
        }


    }
}
