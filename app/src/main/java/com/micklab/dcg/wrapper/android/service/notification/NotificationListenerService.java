// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class NotificationListenerService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NotificationListenerService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService wrap(android.service.notification.NotificationListenerService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService(real, (__DcgwBridgeToken) null);
    }

    public android.service.notification.NotificationListenerService getReal() {
        return (android.service.notification.NotificationListenerService) real;
    }

    public android.service.notification.NotificationListenerService unwrap() {
        return getReal();
    }

    public void cancelAllNotifications() {
        ((android.service.notification.NotificationListenerService) real).cancelAllNotifications();
    }

    public void cancelNotification(java.lang.String arg0) {
        ((android.service.notification.NotificationListenerService) real).cancelNotification(arg0);
    }

    public void cancelNotification(java.lang.String arg0, java.lang.String arg1, int arg2) {
        ((android.service.notification.NotificationListenerService) real).cancelNotification(arg0, arg1, arg2);
    }

    public void cancelNotifications(java.lang.String[] arg0) {
        ((android.service.notification.NotificationListenerService) real).cancelNotifications(arg0);
    }

    public void clearRequestedListenerHints() {
        ((android.service.notification.NotificationListenerService) real).clearRequestedListenerHints();
    }

    public com.micklab.dcg.wrapper.android.app.NotificationChannel createConversationNotificationChannelForPackage(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2, java.lang.String arg3) {
        return com.micklab.dcg.wrapper.android.app.NotificationChannel.wrap(((android.service.notification.NotificationListenerService) real).createConversationNotificationChannelForPackage(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public android.service.notification.StatusBarNotification[] getActiveNotifications() {
        return ((android.service.notification.NotificationListenerService) real).getActiveNotifications();
    }

    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String[] arg0) {
        return ((android.service.notification.NotificationListenerService) real).getActiveNotifications(arg0);
    }

    public int getCurrentInterruptionFilter() {
        return ((android.service.notification.NotificationListenerService) real).getCurrentInterruptionFilter();
    }

    public int getCurrentListenerHints() {
        return ((android.service.notification.NotificationListenerService) real).getCurrentListenerHints();
    }

    public com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap getCurrentRanking() {
        return com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap.wrap(((android.service.notification.NotificationListenerService) real).getCurrentRanking());
    }

    public android.service.notification.StatusBarNotification[] getSnoozedNotifications() {
        return ((android.service.notification.NotificationListenerService) real).getSnoozedNotifications();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.notification.NotificationListenerService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onDestroy() {
        ((android.service.notification.NotificationListenerService) real).onDestroy();
    }

    public void onInterruptionFilterChanged(int arg0) {
        ((android.service.notification.NotificationListenerService) real).onInterruptionFilterChanged(arg0);
    }

    public void onListenerConnected() {
        ((android.service.notification.NotificationListenerService) real).onListenerConnected();
    }

    public void onListenerDisconnected() {
        ((android.service.notification.NotificationListenerService) real).onListenerDisconnected();
    }

    public void onListenerHintsChanged(int arg0) {
        ((android.service.notification.NotificationListenerService) real).onListenerHintsChanged(arg0);
    }

    public void onNotificationChannelGroupModified(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.app.NotificationChannelGroup arg2, int arg3) {
        ((android.service.notification.NotificationListenerService) real).onNotificationChannelGroupModified(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void onNotificationChannelModified(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.app.NotificationChannel arg2, int arg3) {
        ((android.service.notification.NotificationListenerService) real).onNotificationChannelModified(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void onNotificationPosted(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0) {
        ((android.service.notification.NotificationListenerService) real).onNotificationPosted(arg0 == null ? null : arg0.getReal());
    }

    public void onNotificationPosted(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg1) {
        ((android.service.notification.NotificationListenerService) real).onNotificationPosted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onNotificationRankingUpdate(com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg0) {
        ((android.service.notification.NotificationListenerService) real).onNotificationRankingUpdate(arg0 == null ? null : arg0.getReal());
    }

    public void onNotificationRemoved(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0) {
        ((android.service.notification.NotificationListenerService) real).onNotificationRemoved(arg0 == null ? null : arg0.getReal());
    }

    public void onNotificationRemoved(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg1) {
        ((android.service.notification.NotificationListenerService) real).onNotificationRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onNotificationRemoved(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg1, int arg2) {
        ((android.service.notification.NotificationListenerService) real).onNotificationRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onSilentStatusBarIconsVisibilityChanged(boolean arg0) {
        ((android.service.notification.NotificationListenerService) real).onSilentStatusBarIconsVisibilityChanged(arg0);
    }

    public void requestInterruptionFilter(int arg0) {
        ((android.service.notification.NotificationListenerService) real).requestInterruptionFilter(arg0);
    }

    public void requestListenerHints(int arg0) {
        ((android.service.notification.NotificationListenerService) real).requestListenerHints(arg0);
    }

    public static void requestRebind(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        android.service.notification.NotificationListenerService.requestRebind(arg0 == null ? null : arg0.getReal());
    }

    public void requestUnbind() {
        ((android.service.notification.NotificationListenerService) real).requestUnbind();
    }

    public static void requestUnbind(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        android.service.notification.NotificationListenerService.requestUnbind(arg0 == null ? null : arg0.getReal());
    }

    public void setNotificationsShown(java.lang.String[] arg0) {
        ((android.service.notification.NotificationListenerService) real).setNotificationsShown(arg0);
    }

    public void snoozeNotification(java.lang.String arg0, long arg1) {
        ((android.service.notification.NotificationListenerService) real).snoozeNotification(arg0, arg1);
    }

    public void updateNotificationChannel(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.app.NotificationChannel arg2) {
        ((android.service.notification.NotificationListenerService) real).updateNotificationChannel(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static final java.lang.String ACTION_SETTINGS_HOME = android.service.notification.NotificationListenerService.ACTION_SETTINGS_HOME;
    public static final int FLAG_FILTER_TYPE_ALERTING = android.service.notification.NotificationListenerService.FLAG_FILTER_TYPE_ALERTING;
    public static final int FLAG_FILTER_TYPE_CONVERSATIONS = android.service.notification.NotificationListenerService.FLAG_FILTER_TYPE_CONVERSATIONS;
    public static final int FLAG_FILTER_TYPE_ONGOING = android.service.notification.NotificationListenerService.FLAG_FILTER_TYPE_ONGOING;
    public static final int FLAG_FILTER_TYPE_SILENT = android.service.notification.NotificationListenerService.FLAG_FILTER_TYPE_SILENT;
    public static final int HINT_HOST_DISABLE_CALL_EFFECTS = android.service.notification.NotificationListenerService.HINT_HOST_DISABLE_CALL_EFFECTS;
    public static final int HINT_HOST_DISABLE_EFFECTS = android.service.notification.NotificationListenerService.HINT_HOST_DISABLE_EFFECTS;
    public static final int HINT_HOST_DISABLE_NOTIFICATION_EFFECTS = android.service.notification.NotificationListenerService.HINT_HOST_DISABLE_NOTIFICATION_EFFECTS;
    public static final int INTERRUPTION_FILTER_ALARMS = android.service.notification.NotificationListenerService.INTERRUPTION_FILTER_ALARMS;
    public static final int INTERRUPTION_FILTER_ALL = android.service.notification.NotificationListenerService.INTERRUPTION_FILTER_ALL;
    public static final int INTERRUPTION_FILTER_NONE = android.service.notification.NotificationListenerService.INTERRUPTION_FILTER_NONE;
    public static final int INTERRUPTION_FILTER_PRIORITY = android.service.notification.NotificationListenerService.INTERRUPTION_FILTER_PRIORITY;
    public static final int INTERRUPTION_FILTER_UNKNOWN = android.service.notification.NotificationListenerService.INTERRUPTION_FILTER_UNKNOWN;
    public static final java.lang.String META_DATA_DEFAULT_AUTOBIND = android.service.notification.NotificationListenerService.META_DATA_DEFAULT_AUTOBIND;
    public static final java.lang.String META_DATA_DEFAULT_FILTER_TYPES = android.service.notification.NotificationListenerService.META_DATA_DEFAULT_FILTER_TYPES;
    public static final java.lang.String META_DATA_DISABLED_FILTER_TYPES = android.service.notification.NotificationListenerService.META_DATA_DISABLED_FILTER_TYPES;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_ADDED = android.service.notification.NotificationListenerService.NOTIFICATION_CHANNEL_OR_GROUP_ADDED;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_DELETED = android.service.notification.NotificationListenerService.NOTIFICATION_CHANNEL_OR_GROUP_DELETED;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_UPDATED = android.service.notification.NotificationListenerService.NOTIFICATION_CHANNEL_OR_GROUP_UPDATED;
    public static final int REASON_APP_CANCEL = android.service.notification.NotificationListenerService.REASON_APP_CANCEL;
    public static final int REASON_APP_CANCEL_ALL = android.service.notification.NotificationListenerService.REASON_APP_CANCEL_ALL;
    public static final int REASON_ASSISTANT_CANCEL = android.service.notification.NotificationListenerService.REASON_ASSISTANT_CANCEL;
    public static final int REASON_CANCEL = android.service.notification.NotificationListenerService.REASON_CANCEL;
    public static final int REASON_CANCEL_ALL = android.service.notification.NotificationListenerService.REASON_CANCEL_ALL;
    public static final int REASON_CHANNEL_BANNED = android.service.notification.NotificationListenerService.REASON_CHANNEL_BANNED;
    public static final int REASON_CHANNEL_REMOVED = android.service.notification.NotificationListenerService.REASON_CHANNEL_REMOVED;
    public static final int REASON_CLEAR_DATA = android.service.notification.NotificationListenerService.REASON_CLEAR_DATA;
    public static final int REASON_CLICK = android.service.notification.NotificationListenerService.REASON_CLICK;
    public static final int REASON_ERROR = android.service.notification.NotificationListenerService.REASON_ERROR;
    public static final int REASON_GROUP_OPTIMIZATION = android.service.notification.NotificationListenerService.REASON_GROUP_OPTIMIZATION;
    public static final int REASON_GROUP_SUMMARY_CANCELED = android.service.notification.NotificationListenerService.REASON_GROUP_SUMMARY_CANCELED;
    public static final int REASON_LISTENER_CANCEL = android.service.notification.NotificationListenerService.REASON_LISTENER_CANCEL;
    public static final int REASON_LISTENER_CANCEL_ALL = android.service.notification.NotificationListenerService.REASON_LISTENER_CANCEL_ALL;
    public static final int REASON_LOCKDOWN = android.service.notification.NotificationListenerService.REASON_LOCKDOWN;
    public static final int REASON_PACKAGE_BANNED = android.service.notification.NotificationListenerService.REASON_PACKAGE_BANNED;
    public static final int REASON_PACKAGE_CHANGED = android.service.notification.NotificationListenerService.REASON_PACKAGE_CHANGED;
    public static final int REASON_PACKAGE_SUSPENDED = android.service.notification.NotificationListenerService.REASON_PACKAGE_SUSPENDED;
    public static final int REASON_SNOOZED = android.service.notification.NotificationListenerService.REASON_SNOOZED;
    public static final int REASON_TIMEOUT = android.service.notification.NotificationListenerService.REASON_TIMEOUT;
    public static final int REASON_UNAUTOBUNDLED = android.service.notification.NotificationListenerService.REASON_UNAUTOBUNDLED;
    public static final int REASON_USER_STOPPED = android.service.notification.NotificationListenerService.REASON_USER_STOPPED;
    public static final java.lang.String SERVICE_INTERFACE = android.service.notification.NotificationListenerService.SERVICE_INTERFACE;
    public static final int SUPPRESSED_EFFECT_SCREEN_OFF = android.service.notification.NotificationListenerService.SUPPRESSED_EFFECT_SCREEN_OFF;
    public static final int SUPPRESSED_EFFECT_SCREEN_ON = android.service.notification.NotificationListenerService.SUPPRESSED_EFFECT_SCREEN_ON;

    public static final class Ranking {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Ranking(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.Ranking wrap(android.service.notification.NotificationListenerService.Ranking real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.Ranking(real, (__DcgwBridgeToken) null);
        }

        public android.service.notification.NotificationListenerService.Ranking getReal() {
            return (android.service.notification.NotificationListenerService.Ranking) real;
        }

        public android.service.notification.NotificationListenerService.Ranking unwrap() {
            return getReal();
        }

        public Ranking() {
            this(new android.service.notification.NotificationListenerService.Ranking(), (__DcgwBridgeToken) null);
        }

        public boolean canBubble() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).canBubble();
        }

        public boolean canShowBadge() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).canShowBadge();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.service.notification.NotificationListenerService.Ranking) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.app.NotificationChannel getChannel() {
            return com.micklab.dcg.wrapper.android.app.NotificationChannel.wrap(((android.service.notification.NotificationListenerService.Ranking) real).getChannel());
        }

        public com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo getConversationShortcutInfo() {
            return com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo.wrap(((android.service.notification.NotificationListenerService.Ranking) real).getConversationShortcutInfo());
        }

        public int getImportance() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getImportance();
        }

        public java.lang.CharSequence getImportanceExplanation() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getImportanceExplanation();
        }

        public java.lang.String getKey() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getKey();
        }

        public long getLastAudiblyAlertedMillis() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getLastAudiblyAlertedMillis();
        }

        public int getLockscreenVisibilityOverride() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getLockscreenVisibilityOverride();
        }

        public java.lang.String getOverrideGroupKey() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getOverrideGroupKey();
        }

        public int getRank() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getRank();
        }

        public int getSuppressedVisualEffects() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getSuppressedVisualEffects();
        }

        public int getUserSentiment() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).getUserSentiment();
        }

        public boolean isAmbient() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).isAmbient();
        }

        public boolean isConversation() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).isConversation();
        }

        public boolean isSuspended() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).isSuspended();
        }

        public boolean matchesInterruptionFilter() {
            return ((android.service.notification.NotificationListenerService.Ranking) real).matchesInterruptionFilter();
        }

        public static final int USER_SENTIMENT_NEGATIVE = android.service.notification.NotificationListenerService.Ranking.USER_SENTIMENT_NEGATIVE;
        public static final int USER_SENTIMENT_NEUTRAL = android.service.notification.NotificationListenerService.Ranking.USER_SENTIMENT_NEUTRAL;
        public static final int USER_SENTIMENT_POSITIVE = android.service.notification.NotificationListenerService.Ranking.USER_SENTIMENT_POSITIVE;
        public static final int VISIBILITY_NO_OVERRIDE = android.service.notification.NotificationListenerService.Ranking.VISIBILITY_NO_OVERRIDE;

    }
    public static final class RankingMap {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RankingMap(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap wrap(android.service.notification.NotificationListenerService.RankingMap real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap(real, (__DcgwBridgeToken) null);
        }

        public android.service.notification.NotificationListenerService.RankingMap getReal() {
            return (android.service.notification.NotificationListenerService.RankingMap) real;
        }

        public android.service.notification.NotificationListenerService.RankingMap unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.service.notification.NotificationListenerService.RankingMap) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.service.notification.NotificationListenerService.RankingMap) real).equals(arg0);
        }

        public java.lang.String[] getOrderedKeys() {
            return ((android.service.notification.NotificationListenerService.RankingMap) real).getOrderedKeys();
        }

        public boolean getRanking(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.Ranking arg1) {
            return ((android.service.notification.NotificationListenerService.RankingMap) real).getRanking(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.service.notification.NotificationListenerService.RankingMap) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
