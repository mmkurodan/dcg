// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class PhoneStateListener {
    private final android.telephony.PhoneStateListener real;

    public PhoneStateListener(android.telephony.PhoneStateListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.PhoneStateListener wrap(android.telephony.PhoneStateListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.PhoneStateListener(real);
    }

    public android.telephony.PhoneStateListener unwrap() {
        return real;
    }

    public PhoneStateListener() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#android.telephony.PhoneStateListener()");
    }

    public PhoneStateListener(java.util.concurrent.Executor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#android.telephony.PhoneStateListener(java.util.concurrent.Executor)");
    }

    public void onActiveDataSubscriptionIdChanged(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onActiveDataSubscriptionIdChanged(int)");
    }

    public void onBarringInfoChanged(com.micklab.dcg.wrapper.android.telephony.BarringInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onBarringInfoChanged(android.telephony.BarringInfo)");
    }

    public void onCallDisconnectCauseChanged(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onCallDisconnectCauseChanged(int,int)");
    }

    public void onCallForwardingIndicatorChanged(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onCallForwardingIndicatorChanged(boolean)");
    }

    public void onCallStateChanged(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onCallStateChanged(int,java.lang.String)");
    }

    public void onCellLocationChanged(com.micklab.dcg.wrapper.android.telephony.CellLocation arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onCellLocationChanged(android.telephony.CellLocation)");
    }

    public void onDataActivity(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onDataActivity(int)");
    }

    public void onDataConnectionStateChanged(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onDataConnectionStateChanged(int)");
    }

    public void onDataConnectionStateChanged(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onDataConnectionStateChanged(int,int)");
    }

    public void onDisplayInfoChanged(com.micklab.dcg.wrapper.android.telephony.TelephonyDisplayInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo)");
    }

    public void onImsCallDisconnectCauseChanged(com.micklab.dcg.wrapper.android.telephony.ims.ImsReasonInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo)");
    }

    public void onMessageWaitingIndicatorChanged(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onMessageWaitingIndicatorChanged(boolean)");
    }

    public void onPreciseDataConnectionStateChanged(com.micklab.dcg.wrapper.android.telephony.PreciseDataConnectionState arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState)");
    }

    public void onRegistrationFailed(com.micklab.dcg.wrapper.android.telephony.CellIdentity arg0, java.lang.String arg1, int arg2, int arg3, int arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onRegistrationFailed(android.telephony.CellIdentity,java.lang.String,int,int,int)");
    }

    public void onServiceStateChanged(com.micklab.dcg.wrapper.android.telephony.ServiceState arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onServiceStateChanged(android.telephony.ServiceState)");
    }

    public void onSignalStrengthChanged(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onSignalStrengthChanged(int)");
    }

    public void onSignalStrengthsChanged(com.micklab.dcg.wrapper.android.telephony.SignalStrength arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onSignalStrengthsChanged(android.telephony.SignalStrength)");
    }

    public void onUserMobileDataStateChanged(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.PhoneStateListener#onUserMobileDataStateChanged(boolean)");
    }


}
