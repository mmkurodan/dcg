// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.sip;

public final class SipManager {
    private final android.net.sip.SipManager real;

    public SipManager(android.net.sip.SipManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipManager wrap(android.net.sip.SipManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.sip.SipManager(real);
    }

    public android.net.sip.SipManager unwrap() {
        return real;
    }

    public void close(java.lang.String arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#close(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipSession createSipSession(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, com.micklab.dcg.wrapper.android.net.sip.SipSession.Listener arg1) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#createSipSession(android.net.sip.SipProfile,android.net.sip.SipSession$Listener)");
    }

    public static java.lang.String getCallId(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#getCallId(android.content.Intent)");
    }

    public static java.lang.String getOfferSessionDescription(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#getOfferSessionDescription(android.content.Intent)");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipSession getSessionFor(com.micklab.dcg.wrapper.android.content.Intent arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#getSessionFor(android.content.Intent)");
    }

    public static boolean isApiSupported(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#isApiSupported(android.content.Context)");
    }

    public static boolean isIncomingCallIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#isIncomingCallIntent(android.content.Intent)");
    }

    public boolean isOpened(java.lang.String arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#isOpened(java.lang.String)");
    }

    public boolean isRegistered(java.lang.String arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#isRegistered(java.lang.String)");
    }

    public static boolean isSipWifiOnly(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#isSipWifiOnly(android.content.Context)");
    }

    public static boolean isVoipSupported(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#isVoipSupported(android.content.Context)");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipAudioCall makeAudioCall(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener arg2, int arg3) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#makeAudioCall(java.lang.String,java.lang.String,android.net.sip.SipAudioCall$Listener,int)");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipAudioCall makeAudioCall(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, com.micklab.dcg.wrapper.android.net.sip.SipProfile arg1, com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener arg2, int arg3) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#makeAudioCall(android.net.sip.SipProfile,android.net.sip.SipProfile,android.net.sip.SipAudioCall$Listener,int)");
    }

    public static com.micklab.dcg.wrapper.android.net.sip.SipManager newInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#newInstance(android.content.Context)");
    }

    public void open(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#open(android.net.sip.SipProfile)");
    }

    public void open(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, com.micklab.dcg.wrapper.android.net.sip.SipRegistrationListener arg2) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#open(android.net.sip.SipProfile,android.app.PendingIntent,android.net.sip.SipRegistrationListener)");
    }

    public void register(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, int arg1, com.micklab.dcg.wrapper.android.net.sip.SipRegistrationListener arg2) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#register(android.net.sip.SipProfile,int,android.net.sip.SipRegistrationListener)");
    }

    public void setRegistrationListener(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.sip.SipRegistrationListener arg1) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#setRegistrationListener(java.lang.String,android.net.sip.SipRegistrationListener)");
    }

    public com.micklab.dcg.wrapper.android.net.sip.SipAudioCall takeAudioCall(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.net.sip.SipAudioCall.Listener arg1) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#takeAudioCall(android.content.Intent,android.net.sip.SipAudioCall$Listener)");
    }

    public void unregister(com.micklab.dcg.wrapper.android.net.sip.SipProfile arg0, com.micklab.dcg.wrapper.android.net.sip.SipRegistrationListener arg1) throws android.net.sip.SipException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.sip.SipManager#unregister(android.net.sip.SipProfile,android.net.sip.SipRegistrationListener)");
    }


}
