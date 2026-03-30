// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SubscriptionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SubscriptionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SubscriptionManager wrap(android.telephony.SubscriptionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SubscriptionManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.SubscriptionManager getReal() {
        return (android.telephony.SubscriptionManager) real;
    }

    public android.telephony.SubscriptionManager unwrap() {
        return getReal();
    }

    public void addOnOpportunisticSubscriptionsChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#addOnOpportunisticSubscriptionsChangedListener(java.util.concurrent.Executor,android.telephony.SubscriptionManager$OnOpportunisticSubscriptionsChangedListener)");
    }

    public void addOnSubscriptionsChangedListener(com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnSubscriptionsChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#addOnSubscriptionsChangedListener(android.telephony.SubscriptionManager$OnSubscriptionsChangedListener)");
    }

    public void addOnSubscriptionsChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnSubscriptionsChangedListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#addOnSubscriptionsChangedListener(java.util.concurrent.Executor,android.telephony.SubscriptionManager$OnSubscriptionsChangedListener)");
    }

    public boolean canManageSubscription(com.micklab.dcg.wrapper.android.telephony.SubscriptionInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#canManageSubscription(android.telephony.SubscriptionInfo)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SubscriptionManager from(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#from(android.content.Context)");
    }

    public static int getActiveDataSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getActiveDataSubscriptionId()");
    }

    public com.micklab.dcg.wrapper.android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getActiveSubscriptionInfo(int)");
    }

    public int getActiveSubscriptionInfoCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getActiveSubscriptionInfoCount()");
    }

    public int getActiveSubscriptionInfoCountMax() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getActiveSubscriptionInfoCountMax()");
    }

    public com.micklab.dcg.wrapper.android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getActiveSubscriptionInfoForSimSlotIndex(int)");
    }

    public static int getDefaultDataSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getDefaultDataSubscriptionId()");
    }

    public static int getDefaultSmsSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getDefaultSmsSubscriptionId()");
    }

    public static int getDefaultSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getDefaultSubscriptionId()");
    }

    public static int getDefaultVoiceSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getDefaultVoiceSubscriptionId()");
    }

    public int getDeviceToDeviceStatusSharingPreference(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getDeviceToDeviceStatusSharingPreference(int)");
    }

    public java.lang.String getPhoneNumber(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getPhoneNumber(int)");
    }

    public java.lang.String getPhoneNumber(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getPhoneNumber(int,int)");
    }

    public static int getSlotIndex(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getSlotIndex(int)");
    }

    public static int getSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getSubscriptionId(int)");
    }

    public int[] getSubscriptionIds(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#getSubscriptionIds(int)");
    }

    public boolean isActiveSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#isActiveSubscriptionId(int)");
    }

    public boolean isNetworkRoaming(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#isNetworkRoaming(int)");
    }

    public static boolean isUsableSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#isUsableSubscriptionId(int)");
    }

    public static boolean isValidSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#isValidSubscriptionId(int)");
    }

    public void removeOnOpportunisticSubscriptionsChangedListener(com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#removeOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager$OnOpportunisticSubscriptionsChangedListener)");
    }

    public void removeOnSubscriptionsChangedListener(com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnSubscriptionsChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#removeOnSubscriptionsChangedListener(android.telephony.SubscriptionManager$OnSubscriptionsChangedListener)");
    }

    public void setCarrierPhoneNumber(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setCarrierPhoneNumber(int,java.lang.String)");
    }

    public void setDeviceToDeviceStatusSharingPreference(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setDeviceToDeviceStatusSharingPreference(int,int)");
    }

    public boolean setOpportunistic(boolean arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setOpportunistic(boolean,int)");
    }

    public void setSubscriptionOverrideCongested(int arg0, boolean arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setSubscriptionOverrideCongested(int,boolean,long)");
    }

    public void setSubscriptionOverrideCongested(int arg0, boolean arg1, int[] arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setSubscriptionOverrideCongested(int,boolean,[I,long)");
    }

    public void setSubscriptionOverrideUnmetered(int arg0, boolean arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setSubscriptionOverrideUnmetered(int,boolean,long)");
    }

    public void setSubscriptionOverrideUnmetered(int arg0, boolean arg1, int[] arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#setSubscriptionOverrideUnmetered(int,boolean,[I,long)");
    }

    public void switchToSubscription(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager#switchToSubscription(int,android.app.PendingIntent)");
    }


    public static final class OnOpportunisticSubscriptionsChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnOpportunisticSubscriptionsChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener wrap(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener getReal() {
            return (android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener) real;
        }

        public android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener unwrap() {
            return getReal();
        }

        public OnOpportunisticSubscriptionsChangedListener() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager$OnOpportunisticSubscriptionsChangedListener#android.telephony.SubscriptionManager$OnOpportunisticSubscriptionsChangedListener()");
        }

        public void onOpportunisticSubscriptionsChanged() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager$OnOpportunisticSubscriptionsChangedListener#onOpportunisticSubscriptionsChanged()");
        }

    }
    public static final class OnSubscriptionsChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSubscriptionsChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnSubscriptionsChangedListener wrap(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SubscriptionManager.OnSubscriptionsChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SubscriptionManager.OnSubscriptionsChangedListener getReal() {
            return (android.telephony.SubscriptionManager.OnSubscriptionsChangedListener) real;
        }

        public android.telephony.SubscriptionManager.OnSubscriptionsChangedListener unwrap() {
            return getReal();
        }

        public OnSubscriptionsChangedListener() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager$OnSubscriptionsChangedListener#android.telephony.SubscriptionManager$OnSubscriptionsChangedListener()");
        }

        public void onSubscriptionsChanged() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SubscriptionManager$OnSubscriptionsChangedListener#onSubscriptionsChanged()");
        }

    }
}
