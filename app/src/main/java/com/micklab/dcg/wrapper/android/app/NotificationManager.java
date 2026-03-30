// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NotificationManager {
    private final android.app.NotificationManager real;

    public NotificationManager(android.app.NotificationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NotificationManager wrap(android.app.NotificationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NotificationManager(real);
    }

    public android.app.NotificationManager unwrap() {
        return real;
    }

    public java.lang.String addAutomaticZenRule(com.micklab.dcg.wrapper.android.app.AutomaticZenRule arg0) {
        return real.addAutomaticZenRule(arg0 == null ? null : arg0.unwrap());
    }

    public boolean areAutomaticZenRulesUserManaged() {
        return real.areAutomaticZenRulesUserManaged();
    }

    public boolean areBubblesAllowed() {
        return real.areBubblesAllowed();
    }

    public boolean areBubblesEnabled() {
        return real.areBubblesEnabled();
    }

    public boolean areNotificationsEnabled() {
        return real.areNotificationsEnabled();
    }

    public boolean areNotificationsPaused() {
        return real.areNotificationsPaused();
    }

    public boolean canNotifyAsPackage(java.lang.String arg0) {
        return real.canNotifyAsPackage(arg0);
    }

    public boolean canUseFullScreenIntent() {
        return real.canUseFullScreenIntent();
    }

    public void cancel(int arg0) {
        real.cancel(arg0);
    }

    public void cancel(java.lang.String arg0, int arg1) {
        real.cancel(arg0, arg1);
    }

    public void cancelAll() {
        real.cancelAll();
    }

    public void cancelAsPackage(java.lang.String arg0, java.lang.String arg1, int arg2) {
        real.cancelAsPackage(arg0, arg1, arg2);
    }

    public void createNotificationChannel(com.micklab.dcg.wrapper.android.app.NotificationChannel arg0) {
        real.createNotificationChannel(arg0 == null ? null : arg0.unwrap());
    }

    public void createNotificationChannelGroup(com.micklab.dcg.wrapper.android.app.NotificationChannelGroup arg0) {
        real.createNotificationChannelGroup(arg0 == null ? null : arg0.unwrap());
    }

    public void deleteNotificationChannel(java.lang.String arg0) {
        real.deleteNotificationChannel(arg0);
    }

    public void deleteNotificationChannelGroup(java.lang.String arg0) {
        real.deleteNotificationChannelGroup(arg0);
    }

    public android.service.notification.StatusBarNotification[] getActiveNotifications() {
        return real.getActiveNotifications();
    }

    public com.micklab.dcg.wrapper.android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.wrap(real.getAutomaticZenRule(arg0));
    }

    public int getAutomaticZenRuleState(java.lang.String arg0) {
        return real.getAutomaticZenRuleState(arg0);
    }

    public int getBubblePreference() {
        return real.getBubblePreference();
    }

    public com.micklab.dcg.wrapper.android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() {
        return com.micklab.dcg.wrapper.android.app.NotificationManager.Policy.wrap(real.getConsolidatedNotificationPolicy());
    }

    public int getCurrentInterruptionFilter() {
        return real.getCurrentInterruptionFilter();
    }

    public int getImportance() {
        return real.getImportance();
    }

    public com.micklab.dcg.wrapper.android.app.NotificationChannel getNotificationChannel(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.NotificationChannel.wrap(real.getNotificationChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.NotificationChannel getNotificationChannel(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.NotificationChannel.wrap(real.getNotificationChannel(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.NotificationChannelGroup.wrap(real.getNotificationChannelGroup(arg0));
    }

    public java.lang.String getNotificationDelegate() {
        return real.getNotificationDelegate();
    }

    public com.micklab.dcg.wrapper.android.app.NotificationManager.Policy getNotificationPolicy() {
        return com.micklab.dcg.wrapper.android.app.NotificationManager.Policy.wrap(real.getNotificationPolicy());
    }

    public boolean isNotificationListenerAccessGranted(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isNotificationListenerAccessGranted(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isNotificationPolicyAccessGranted() {
        return real.isNotificationPolicyAccessGranted();
    }

    public boolean matchesCallFilter(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.matchesCallFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void notify(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
        real.notify(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void notify(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.app.Notification arg2) {
        real.notify(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void notifyAsPackage(java.lang.String arg0, java.lang.String arg1, int arg2, com.micklab.dcg.wrapper.android.app.Notification arg3) {
        real.notifyAsPackage(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean removeAutomaticZenRule(java.lang.String arg0) {
        return real.removeAutomaticZenRule(arg0);
    }

    public void setAutomaticZenRuleState(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.notification.Condition arg1) {
        real.setAutomaticZenRuleState(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setInterruptionFilter(int arg0) {
        real.setInterruptionFilter(arg0);
    }

    public void setNotificationDelegate(java.lang.String arg0) {
        real.setNotificationDelegate(arg0);
    }

    public void setNotificationPolicy(com.micklab.dcg.wrapper.android.app.NotificationManager.Policy arg0) {
        real.setNotificationPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public boolean shouldHideSilentStatusBarIcons() {
        return real.shouldHideSilentStatusBarIcons();
    }

    public boolean updateAutomaticZenRule(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.AutomaticZenRule arg1) {
        return real.updateAutomaticZenRule(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final java.lang.String ACTION_APP_BLOCK_STATE_CHANGED = android.app.NotificationManager.ACTION_APP_BLOCK_STATE_CHANGED;
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE = android.app.NotificationManager.ACTION_AUTOMATIC_ZEN_RULE;
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE_STATUS_CHANGED = android.app.NotificationManager.ACTION_AUTOMATIC_ZEN_RULE_STATUS_CHANGED;
    public static final java.lang.String ACTION_CONSOLIDATED_NOTIFICATION_POLICY_CHANGED = android.app.NotificationManager.ACTION_CONSOLIDATED_NOTIFICATION_POLICY_CHANGED;
    public static final java.lang.String ACTION_INTERRUPTION_FILTER_CHANGED = android.app.NotificationManager.ACTION_INTERRUPTION_FILTER_CHANGED;
    public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED = android.app.NotificationManager.ACTION_NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED;
    public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED = android.app.NotificationManager.ACTION_NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED;
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = android.app.NotificationManager.ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED;
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_CHANGED = android.app.NotificationManager.ACTION_NOTIFICATION_POLICY_CHANGED;
    public static final int AUTOMATIC_RULE_STATUS_ACTIVATED = android.app.NotificationManager.AUTOMATIC_RULE_STATUS_ACTIVATED;
    public static final int AUTOMATIC_RULE_STATUS_DEACTIVATED = android.app.NotificationManager.AUTOMATIC_RULE_STATUS_DEACTIVATED;
    public static final int AUTOMATIC_RULE_STATUS_DISABLED = android.app.NotificationManager.AUTOMATIC_RULE_STATUS_DISABLED;
    public static final int AUTOMATIC_RULE_STATUS_ENABLED = android.app.NotificationManager.AUTOMATIC_RULE_STATUS_ENABLED;
    public static final int AUTOMATIC_RULE_STATUS_REMOVED = android.app.NotificationManager.AUTOMATIC_RULE_STATUS_REMOVED;
    public static final int AUTOMATIC_RULE_STATUS_UNKNOWN = android.app.NotificationManager.AUTOMATIC_RULE_STATUS_UNKNOWN;
    public static final int BUBBLE_PREFERENCE_ALL = android.app.NotificationManager.BUBBLE_PREFERENCE_ALL;
    public static final int BUBBLE_PREFERENCE_NONE = android.app.NotificationManager.BUBBLE_PREFERENCE_NONE;
    public static final int BUBBLE_PREFERENCE_SELECTED = android.app.NotificationManager.BUBBLE_PREFERENCE_SELECTED;
    public static final java.lang.String EXTRA_AUTOMATIC_RULE_ID = android.app.NotificationManager.EXTRA_AUTOMATIC_RULE_ID;
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_ID = android.app.NotificationManager.EXTRA_AUTOMATIC_ZEN_RULE_ID;
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_STATUS = android.app.NotificationManager.EXTRA_AUTOMATIC_ZEN_RULE_STATUS;
    public static final java.lang.String EXTRA_BLOCKED_STATE = android.app.NotificationManager.EXTRA_BLOCKED_STATE;
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_GROUP_ID = android.app.NotificationManager.EXTRA_NOTIFICATION_CHANNEL_GROUP_ID;
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_ID = android.app.NotificationManager.EXTRA_NOTIFICATION_CHANNEL_ID;
    public static final java.lang.String EXTRA_NOTIFICATION_POLICY = android.app.NotificationManager.EXTRA_NOTIFICATION_POLICY;
    public static final int IMPORTANCE_DEFAULT = android.app.NotificationManager.IMPORTANCE_DEFAULT;
    public static final int IMPORTANCE_HIGH = android.app.NotificationManager.IMPORTANCE_HIGH;
    public static final int IMPORTANCE_LOW = android.app.NotificationManager.IMPORTANCE_LOW;
    public static final int IMPORTANCE_MAX = android.app.NotificationManager.IMPORTANCE_MAX;
    public static final int IMPORTANCE_MIN = android.app.NotificationManager.IMPORTANCE_MIN;
    public static final int IMPORTANCE_NONE = android.app.NotificationManager.IMPORTANCE_NONE;
    public static final int IMPORTANCE_UNSPECIFIED = android.app.NotificationManager.IMPORTANCE_UNSPECIFIED;
    public static final int INTERRUPTION_FILTER_ALARMS = android.app.NotificationManager.INTERRUPTION_FILTER_ALARMS;
    public static final int INTERRUPTION_FILTER_ALL = android.app.NotificationManager.INTERRUPTION_FILTER_ALL;
    public static final int INTERRUPTION_FILTER_NONE = android.app.NotificationManager.INTERRUPTION_FILTER_NONE;
    public static final int INTERRUPTION_FILTER_PRIORITY = android.app.NotificationManager.INTERRUPTION_FILTER_PRIORITY;
    public static final int INTERRUPTION_FILTER_UNKNOWN = android.app.NotificationManager.INTERRUPTION_FILTER_UNKNOWN;
    public static final java.lang.String META_DATA_AUTOMATIC_RULE_TYPE = android.app.NotificationManager.META_DATA_AUTOMATIC_RULE_TYPE;
    public static final java.lang.String META_DATA_RULE_INSTANCE_LIMIT = android.app.NotificationManager.META_DATA_RULE_INSTANCE_LIMIT;

    public static final class Policy {
        private final android.app.NotificationManager.Policy real;

        public Policy(android.app.NotificationManager.Policy real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.NotificationManager.Policy wrap(android.app.NotificationManager.Policy real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.NotificationManager.Policy(real);
        }

        public android.app.NotificationManager.Policy unwrap() {
            return real;
        }

        public Policy(int arg0, int arg1, int arg2) {
            this(new android.app.NotificationManager.Policy(arg0, arg1, arg2));
        }

        public Policy(int arg0, int arg1, int arg2, int arg3) {
            this(new android.app.NotificationManager.Policy(arg0, arg1, arg2, arg3));
        }

        public Policy(int arg0, int arg1, int arg2, int arg3, int arg4) {
            this(new android.app.NotificationManager.Policy(arg0, arg1, arg2, arg3, arg4));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public static java.lang.String priorityCategoriesToString(int arg0) {
            return android.app.NotificationManager.Policy.priorityCategoriesToString(arg0);
        }

        public static java.lang.String prioritySendersToString(int arg0) {
            return android.app.NotificationManager.Policy.prioritySendersToString(arg0);
        }

        public static java.lang.String suppressedEffectsToString(int arg0) {
            return android.app.NotificationManager.Policy.suppressedEffectsToString(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int CONVERSATION_SENDERS_ANYONE = android.app.NotificationManager.Policy.CONVERSATION_SENDERS_ANYONE;
        public static final int CONVERSATION_SENDERS_IMPORTANT = android.app.NotificationManager.Policy.CONVERSATION_SENDERS_IMPORTANT;
        public static final int CONVERSATION_SENDERS_NONE = android.app.NotificationManager.Policy.CONVERSATION_SENDERS_NONE;
        public static final int PRIORITY_CATEGORY_ALARMS = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_ALARMS;
        public static final int PRIORITY_CATEGORY_CALLS = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_CALLS;
        public static final int PRIORITY_CATEGORY_CONVERSATIONS = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_CONVERSATIONS;
        public static final int PRIORITY_CATEGORY_EVENTS = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_EVENTS;
        public static final int PRIORITY_CATEGORY_MEDIA = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_MEDIA;
        public static final int PRIORITY_CATEGORY_MESSAGES = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_MESSAGES;
        public static final int PRIORITY_CATEGORY_REMINDERS = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_REMINDERS;
        public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_REPEAT_CALLERS;
        public static final int PRIORITY_CATEGORY_SYSTEM = android.app.NotificationManager.Policy.PRIORITY_CATEGORY_SYSTEM;
        public static final int PRIORITY_SENDERS_ANY = android.app.NotificationManager.Policy.PRIORITY_SENDERS_ANY;
        public static final int PRIORITY_SENDERS_CONTACTS = android.app.NotificationManager.Policy.PRIORITY_SENDERS_CONTACTS;
        public static final int PRIORITY_SENDERS_STARRED = android.app.NotificationManager.Policy.PRIORITY_SENDERS_STARRED;
        public static final int SUPPRESSED_EFFECT_AMBIENT = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_AMBIENT;
        public static final int SUPPRESSED_EFFECT_BADGE = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_BADGE;
        public static final int SUPPRESSED_EFFECT_FULL_SCREEN_INTENT = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_FULL_SCREEN_INTENT;
        public static final int SUPPRESSED_EFFECT_LIGHTS = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_LIGHTS;
        public static final int SUPPRESSED_EFFECT_NOTIFICATION_LIST = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_NOTIFICATION_LIST;
        public static final int SUPPRESSED_EFFECT_PEEK = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_PEEK;
        public static final int SUPPRESSED_EFFECT_SCREEN_OFF = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_SCREEN_OFF;
        public static final int SUPPRESSED_EFFECT_SCREEN_ON = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_SCREEN_ON;
        public static final int SUPPRESSED_EFFECT_STATUS_BAR = android.app.NotificationManager.Policy.SUPPRESSED_EFFECT_STATUS_BAR;

    }
}
