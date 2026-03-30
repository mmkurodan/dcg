// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.euicc;

public final class EuiccManager {
    private final android.telephony.euicc.EuiccManager real;

    public EuiccManager(android.telephony.euicc.EuiccManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.euicc.EuiccManager wrap(android.telephony.euicc.EuiccManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.euicc.EuiccManager(real);
    }

    public android.telephony.euicc.EuiccManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.telephony.euicc.EuiccManager createForCardId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#createForCardId(int)");
    }

    public void deleteSubscription(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#deleteSubscription(int,android.app.PendingIntent)");
    }

    public void downloadSubscription(com.micklab.dcg.wrapper.android.telephony.euicc.DownloadableSubscription arg0, boolean arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#downloadSubscription(android.telephony.euicc.DownloadableSubscription,boolean,android.app.PendingIntent)");
    }

    public long getAvailableMemoryInBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#getAvailableMemoryInBytes()");
    }

    public java.lang.String getEid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#getEid()");
    }

    public com.micklab.dcg.wrapper.android.telephony.euicc.EuiccInfo getEuiccInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#getEuiccInfo()");
    }

    public boolean isEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#isEnabled()");
    }

    public boolean isSimPortAvailable(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#isSimPortAvailable(int)");
    }

    public void startResolutionActivity(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) throws android.content.IntentSender.SendIntentException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#startResolutionActivity(android.app.Activity,int,android.content.Intent,android.app.PendingIntent)");
    }

    public void switchToSubscription(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#switchToSubscription(int,android.app.PendingIntent)");
    }

    public void switchToSubscription(int arg0, int arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#switchToSubscription(int,int,android.app.PendingIntent)");
    }

    public void updateSubscriptionNickname(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.euicc.EuiccManager#updateSubscriptionNickname(int,java.lang.String,android.app.PendingIntent)");
    }


}
