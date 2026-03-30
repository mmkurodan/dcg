// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipAudioCall {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SipAudioCall(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipAudioCall wrap(android.net.sip.SipAudioCall real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipAudioCall(real, (__DcgwBridgeToken) null);
    }

    public android.net.sip.SipAudioCall getReal() {
        return (android.net.sip.SipAudioCall) real;
    }

    public android.net.sip.SipAudioCall unwrap() {
        return getReal();
    }

    public SipAudioCall(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.sip.SipProfile arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#android.net.sip.SipAudioCall(android.content.Context,android.net.sip.SipProfile)");
    }

    public void answerCall(int arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#answerCall(int)");
    }

    public void attachCall(com.micklab.dcg.wrapper.android.net.sip.SipSession arg0, java.lang.String arg1) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#attachCall(android.net.sip.SipSession,java.lang.String)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#close()");
    }

    public void continueCall(int arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#continueCall(int)");
    }

    public void endCall() throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#endCall()");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipProfile getLocalProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#getLocalProfile()");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipProfile getPeerProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#getPeerProfile()");
    }

    public int getState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#getState()");
    }

    public void holdCall(int arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#holdCall(int)");
    }

    public boolean isInCall() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#isInCall()");
    }

    public boolean isMuted() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#isMuted()");
    }

    public boolean isOnHold() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#isOnHold()");
    }

    public void makeCall(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, com.micklab.dcg.wrapper.android.net.sip.SipSession arg1, int arg2) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#makeCall(android.net.sip.SipProfile,android.net.sip.SipSession,int)");
    }

    public void sendDtmf(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#sendDtmf(int)");
    }

    public void sendDtmf(int arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#sendDtmf(int,android.os.Message)");
    }

    public void setListener(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#setListener(android.net.sip.SipAudioCall$Listener)");
    }

    public void setListener(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#setListener(android.net.sip.SipAudioCall$Listener,boolean)");
    }

    public void setSpeakerMode(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#setSpeakerMode(boolean)");
    }

    public void startAudio() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#startAudio()");
    }

    public void toggleMute() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall#toggleMute()");
    }

    public static final class Listener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Listener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener wrap(android.net.sip.SipAudioCall.Listener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener(real, (__DcgwBridgeToken) null);
        }

        public android.net.sip.SipAudioCall.Listener getReal() {
            return (android.net.sip.SipAudioCall.Listener) real;
        }

        public android.net.sip.SipAudioCall.Listener unwrap() {
            return getReal();
        }

        public Listener() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#android.net.sip.SipAudioCall$Listener()");
        }

        public void onCallBusy(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onCallBusy(android.net.sip.SipAudioCall)");
        }

        public void onCallEnded(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onCallEnded(android.net.sip.SipAudioCall)");
        }

        public void onCallEstablished(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onCallEstablished(android.net.sip.SipAudioCall)");
        }

        public void onCallHeld(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onCallHeld(android.net.sip.SipAudioCall)");
        }

        public void onCalling(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onCalling(android.net.sip.SipAudioCall)");
        }

        public void onChanged(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onChanged(android.net.sip.SipAudioCall)");
        }

        public void onError(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0, int arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onError(android.net.sip.SipAudioCall,int,java.lang.String)");
        }

        public void onReadyToCall(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onReadyToCall(android.net.sip.SipAudioCall)");
        }

        public void onRinging(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0, com.micklab.dcg.wrapper.android.net.sip.SipProfile arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onRinging(android.net.sip.SipAudioCall,android.net.sip.SipProfile)");
        }

        public void onRingingBack(com.micklab.dcg.wrapper.android.net.sip.SipAudioCall arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipAudioCall$Listener#onRingingBack(android.net.sip.SipAudioCall)");
        }

    }
}
