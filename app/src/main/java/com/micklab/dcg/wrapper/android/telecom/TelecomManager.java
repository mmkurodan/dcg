// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class TelecomManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TelecomManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.TelecomManager wrap(android.telecom.TelecomManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.TelecomManager(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.TelecomManager getReal() {
        return (android.telecom.TelecomManager) real;
    }

    public android.telecom.TelecomManager unwrap() {
        return getReal();
    }

    public void acceptHandover(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg2) {
        ((android.telecom.TelecomManager) real).acceptHandover(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void acceptRingingCall() {
        ((android.telecom.TelecomManager) real).acceptRingingCall();
    }

    public void acceptRingingCall(int arg0) {
        ((android.telecom.TelecomManager) real).acceptRingingCall(arg0);
    }

    public void addNewIncomingCall(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.TelecomManager) real).addNewIncomingCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addNewIncomingConference(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.TelecomManager) real).addNewIncomingConference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void cancelMissedCallsNotification() {
        ((android.telecom.TelecomManager) real).cancelMissedCallsNotification();
    }

    public com.micklab.dcg.wrapper.android.content.Intent createManageBlockedNumbersIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.telecom.TelecomManager) real).createManageBlockedNumbersIntent());
    }

    public boolean endCall() {
        return ((android.telecom.TelecomManager) real).endCall();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAdnUriForPhoneAccount(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.TelecomManager) real).getAdnUriForPhoneAccount(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String getDefaultDialerPackage() {
        return ((android.telecom.TelecomManager) real).getDefaultDialerPackage();
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.TelecomManager) real).getDefaultOutgoingPhoneAccount(arg0));
    }

    public java.lang.String getLine1Number(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        return ((android.telecom.TelecomManager) real).getLine1Number(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccount getPhoneAccount(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.wrap(((android.telecom.TelecomManager) real).getPhoneAccount(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getSimCallManager() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.TelecomManager) real).getSimCallManager());
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getSimCallManagerForSubscription(int arg0) {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.TelecomManager) real).getSimCallManagerForSubscription(arg0));
    }

    public java.lang.String getSystemDialerPackage() {
        return ((android.telecom.TelecomManager) real).getSystemDialerPackage();
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.TelecomManager) real).getUserSelectedOutgoingPhoneAccount());
    }

    public java.lang.String getVoiceMailNumber(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        return ((android.telecom.TelecomManager) real).getVoiceMailNumber(arg0 == null ? null : arg0.getReal());
    }

    public boolean handleMmi(java.lang.String arg0) {
        return ((android.telecom.TelecomManager) real).handleMmi(arg0);
    }

    public boolean handleMmi(java.lang.String arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1) {
        return ((android.telecom.TelecomManager) real).handleMmi(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean hasManageOngoingCallsPermission() {
        return ((android.telecom.TelecomManager) real).hasManageOngoingCallsPermission();
    }

    public boolean isInCall() {
        return ((android.telecom.TelecomManager) real).isInCall();
    }

    public boolean isInManagedCall() {
        return ((android.telecom.TelecomManager) real).isInManagedCall();
    }

    public boolean isIncomingCallPermitted(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        return ((android.telecom.TelecomManager) real).isIncomingCallPermitted(arg0 == null ? null : arg0.getReal());
    }

    public boolean isOutgoingCallPermitted(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        return ((android.telecom.TelecomManager) real).isOutgoingCallPermitted(arg0 == null ? null : arg0.getReal());
    }

    public boolean isTtySupported() {
        return ((android.telecom.TelecomManager) real).isTtySupported();
    }

    public boolean isVoiceMailNumber(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, java.lang.String arg1) {
        return ((android.telecom.TelecomManager) real).isVoiceMailNumber(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void placeCall(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.TelecomManager) real).placeCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void registerPhoneAccount(com.micklab.dcg.wrapper.android.telecom.PhoneAccount arg0) {
        ((android.telecom.TelecomManager) real).registerPhoneAccount(arg0 == null ? null : arg0.getReal());
    }

    public void showInCallScreen(boolean arg0) {
        ((android.telecom.TelecomManager) real).showInCallScreen(arg0);
    }

    public void silenceRinger() {
        ((android.telecom.TelecomManager) real).silenceRinger();
    }

    public void unregisterPhoneAccount(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0) {
        ((android.telecom.TelecomManager) real).unregisterPhoneAccount(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_CHANGE_DEFAULT_DIALER = android.telecom.TelecomManager.ACTION_CHANGE_DEFAULT_DIALER;
    public static final java.lang.String ACTION_CHANGE_PHONE_ACCOUNTS = android.telecom.TelecomManager.ACTION_CHANGE_PHONE_ACCOUNTS;
    public static final java.lang.String ACTION_CONFIGURE_PHONE_ACCOUNT = android.telecom.TelecomManager.ACTION_CONFIGURE_PHONE_ACCOUNT;
    public static final java.lang.String ACTION_DEFAULT_CALL_SCREENING_APP_CHANGED = android.telecom.TelecomManager.ACTION_DEFAULT_CALL_SCREENING_APP_CHANGED;
    public static final java.lang.String ACTION_DEFAULT_DIALER_CHANGED = android.telecom.TelecomManager.ACTION_DEFAULT_DIALER_CHANGED;
    public static final java.lang.String ACTION_INCOMING_CALL = android.telecom.TelecomManager.ACTION_INCOMING_CALL;
    public static final java.lang.String ACTION_PHONE_ACCOUNT_REGISTERED = android.telecom.TelecomManager.ACTION_PHONE_ACCOUNT_REGISTERED;
    public static final java.lang.String ACTION_PHONE_ACCOUNT_UNREGISTERED = android.telecom.TelecomManager.ACTION_PHONE_ACCOUNT_UNREGISTERED;
    public static final java.lang.String ACTION_POST_CALL = android.telecom.TelecomManager.ACTION_POST_CALL;
    public static final java.lang.String ACTION_SHOW_CALL_ACCESSIBILITY_SETTINGS = android.telecom.TelecomManager.ACTION_SHOW_CALL_ACCESSIBILITY_SETTINGS;
    public static final java.lang.String ACTION_SHOW_CALL_SETTINGS = android.telecom.TelecomManager.ACTION_SHOW_CALL_SETTINGS;
    public static final java.lang.String ACTION_SHOW_MISSED_CALLS_NOTIFICATION = android.telecom.TelecomManager.ACTION_SHOW_MISSED_CALLS_NOTIFICATION;
    public static final java.lang.String ACTION_SHOW_RESPOND_VIA_SMS_SETTINGS = android.telecom.TelecomManager.ACTION_SHOW_RESPOND_VIA_SMS_SETTINGS;
    public static final char DTMF_CHARACTER_PAUSE = android.telecom.TelecomManager.DTMF_CHARACTER_PAUSE;
    public static final char DTMF_CHARACTER_WAIT = android.telecom.TelecomManager.DTMF_CHARACTER_WAIT;
    public static final int DURATION_LONG = android.telecom.TelecomManager.DURATION_LONG;
    public static final int DURATION_MEDIUM = android.telecom.TelecomManager.DURATION_MEDIUM;
    public static final int DURATION_SHORT = android.telecom.TelecomManager.DURATION_SHORT;
    public static final int DURATION_VERY_SHORT = android.telecom.TelecomManager.DURATION_VERY_SHORT;
    public static final java.lang.String EXTRA_CALL_BACK_NUMBER = android.telecom.TelecomManager.EXTRA_CALL_BACK_NUMBER;
    public static final java.lang.String EXTRA_CALL_DISCONNECT_CAUSE = android.telecom.TelecomManager.EXTRA_CALL_DISCONNECT_CAUSE;
    public static final java.lang.String EXTRA_CALL_DISCONNECT_MESSAGE = android.telecom.TelecomManager.EXTRA_CALL_DISCONNECT_MESSAGE;
    public static final java.lang.String EXTRA_CALL_DURATION = android.telecom.TelecomManager.EXTRA_CALL_DURATION;
    public static final java.lang.String EXTRA_CALL_LOG_URI = android.telecom.TelecomManager.EXTRA_CALL_LOG_URI;
    public static final java.lang.String EXTRA_CALL_SUBJECT = android.telecom.TelecomManager.EXTRA_CALL_SUBJECT;
    public static final java.lang.String EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME = android.telecom.TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME;
    public static final java.lang.String EXTRA_DEFAULT_CALL_SCREENING_APP_COMPONENT_NAME = android.telecom.TelecomManager.EXTRA_DEFAULT_CALL_SCREENING_APP_COMPONENT_NAME;
    public static final java.lang.String EXTRA_DISCONNECT_CAUSE = android.telecom.TelecomManager.EXTRA_DISCONNECT_CAUSE;
    public static final java.lang.String EXTRA_HANDLE = android.telecom.TelecomManager.EXTRA_HANDLE;
    public static final java.lang.String EXTRA_HAS_PICTURE = android.telecom.TelecomManager.EXTRA_HAS_PICTURE;
    public static final java.lang.String EXTRA_INCOMING_CALL_ADDRESS = android.telecom.TelecomManager.EXTRA_INCOMING_CALL_ADDRESS;
    public static final java.lang.String EXTRA_INCOMING_CALL_EXTRAS = android.telecom.TelecomManager.EXTRA_INCOMING_CALL_EXTRAS;
    public static final java.lang.String EXTRA_INCOMING_VIDEO_STATE = android.telecom.TelecomManager.EXTRA_INCOMING_VIDEO_STATE;
    public static final java.lang.String EXTRA_IS_DEFAULT_CALL_SCREENING_APP = android.telecom.TelecomManager.EXTRA_IS_DEFAULT_CALL_SCREENING_APP;
    public static final java.lang.String EXTRA_LOCATION = android.telecom.TelecomManager.EXTRA_LOCATION;
    public static final java.lang.String EXTRA_NOTIFICATION_COUNT = android.telecom.TelecomManager.EXTRA_NOTIFICATION_COUNT;
    public static final java.lang.String EXTRA_NOTIFICATION_PHONE_NUMBER = android.telecom.TelecomManager.EXTRA_NOTIFICATION_PHONE_NUMBER;
    public static final java.lang.String EXTRA_OUTGOING_CALL_EXTRAS = android.telecom.TelecomManager.EXTRA_OUTGOING_CALL_EXTRAS;
    public static final java.lang.String EXTRA_OUTGOING_PICTURE = android.telecom.TelecomManager.EXTRA_OUTGOING_PICTURE;
    public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = android.telecom.TelecomManager.EXTRA_PHONE_ACCOUNT_HANDLE;
    public static final java.lang.String EXTRA_PICTURE_URI = android.telecom.TelecomManager.EXTRA_PICTURE_URI;
    public static final java.lang.String EXTRA_PRIORITY = android.telecom.TelecomManager.EXTRA_PRIORITY;
    public static final java.lang.String EXTRA_START_CALL_WITH_RTT = android.telecom.TelecomManager.EXTRA_START_CALL_WITH_RTT;
    public static final java.lang.String EXTRA_START_CALL_WITH_SPEAKERPHONE = android.telecom.TelecomManager.EXTRA_START_CALL_WITH_SPEAKERPHONE;
    public static final java.lang.String EXTRA_START_CALL_WITH_VIDEO_STATE = android.telecom.TelecomManager.EXTRA_START_CALL_WITH_VIDEO_STATE;
    public static final java.lang.String EXTRA_USE_ASSISTED_DIALING = android.telecom.TelecomManager.EXTRA_USE_ASSISTED_DIALING;
    public static final java.lang.String GATEWAY_ORIGINAL_ADDRESS = android.telecom.TelecomManager.GATEWAY_ORIGINAL_ADDRESS;
    public static final java.lang.String GATEWAY_PROVIDER_PACKAGE = android.telecom.TelecomManager.GATEWAY_PROVIDER_PACKAGE;
    public static final java.lang.String METADATA_INCLUDE_EXTERNAL_CALLS = android.telecom.TelecomManager.METADATA_INCLUDE_EXTERNAL_CALLS;
    public static final java.lang.String METADATA_INCLUDE_SELF_MANAGED_CALLS = android.telecom.TelecomManager.METADATA_INCLUDE_SELF_MANAGED_CALLS;
    public static final java.lang.String METADATA_IN_CALL_SERVICE_CAR_MODE_UI = android.telecom.TelecomManager.METADATA_IN_CALL_SERVICE_CAR_MODE_UI;
    public static final java.lang.String METADATA_IN_CALL_SERVICE_RINGING = android.telecom.TelecomManager.METADATA_IN_CALL_SERVICE_RINGING;
    public static final java.lang.String METADATA_IN_CALL_SERVICE_UI = android.telecom.TelecomManager.METADATA_IN_CALL_SERVICE_UI;
    public static final int PRESENTATION_ALLOWED = android.telecom.TelecomManager.PRESENTATION_ALLOWED;
    public static final int PRESENTATION_PAYPHONE = android.telecom.TelecomManager.PRESENTATION_PAYPHONE;
    public static final int PRESENTATION_RESTRICTED = android.telecom.TelecomManager.PRESENTATION_RESTRICTED;
    public static final int PRESENTATION_UNAVAILABLE = android.telecom.TelecomManager.PRESENTATION_UNAVAILABLE;
    public static final int PRESENTATION_UNKNOWN = android.telecom.TelecomManager.PRESENTATION_UNKNOWN;
    public static final int PRIORITY_NORMAL = android.telecom.TelecomManager.PRIORITY_NORMAL;
    public static final int PRIORITY_URGENT = android.telecom.TelecomManager.PRIORITY_URGENT;

}
