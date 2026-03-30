// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class NotificationListenerService {
    private final android.service.notification.NotificationListenerService real;

    public NotificationListenerService(android.service.notification.NotificationListenerService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService wrap(android.service.notification.NotificationListenerService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService(real);
    }

    public android.service.notification.NotificationListenerService unwrap() {
        return real;
    }

    public void cancelAllNotifications() {
        real.cancelAllNotifications();
    }

    public void cancelNotification(java.lang.String arg0) {
        real.cancelNotification(arg0);
    }

    public void cancelNotification(java.lang.String arg0, java.lang.String arg1, int arg2) {
        real.cancelNotification(arg0, arg1, arg2);
    }

    public void cancelNotifications(java.lang.String[] arg0) {
        real.cancelNotifications(arg0);
    }

    public void clearRequestedListenerHints() {
        real.clearRequestedListenerHints();
    }

    public android.service.notification.StatusBarNotification[] getActiveNotifications() {
        return real.getActiveNotifications();
    }

    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String[] arg0) {
        return real.getActiveNotifications(arg0);
    }

    public int getCurrentInterruptionFilter() {
        return real.getCurrentInterruptionFilter();
    }

    public int getCurrentListenerHints() {
        return real.getCurrentListenerHints();
    }

    public com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap getCurrentRanking() {
        return com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap.wrap(real.getCurrentRanking());
    }

    public android.service.notification.StatusBarNotification[] getSnoozedNotifications() {
        return real.getSnoozedNotifications();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onInterruptionFilterChanged(int arg0) {
        real.onInterruptionFilterChanged(arg0);
    }

    public void onListenerConnected() {
        real.onListenerConnected();
    }

    public void onListenerDisconnected() {
        real.onListenerDisconnected();
    }

    public void onListenerHintsChanged(int arg0) {
        real.onListenerHintsChanged(arg0);
    }

    public void onNotificationChannelGroupModified(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.app.NotificationChannelGroup arg2, int arg3) {
        real.onNotificationChannelGroupModified(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void onNotificationChannelModified(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.app.NotificationChannel arg2, int arg3) {
        real.onNotificationChannelModified(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void onNotificationPosted(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0) {
        real.onNotificationPosted(arg0 == null ? null : arg0.unwrap());
    }

    public void onNotificationPosted(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg1) {
        real.onNotificationPosted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onNotificationRankingUpdate(com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg0) {
        real.onNotificationRankingUpdate(arg0 == null ? null : arg0.unwrap());
    }

    public void onNotificationRemoved(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0) {
        real.onNotificationRemoved(arg0 == null ? null : arg0.unwrap());
    }

    public void onNotificationRemoved(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg1) {
        real.onNotificationRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onNotificationRemoved(com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap arg1, int arg2) {
        real.onNotificationRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onSilentStatusBarIconsVisibilityChanged(boolean arg0) {
        real.onSilentStatusBarIconsVisibilityChanged(arg0);
    }

    public void requestInterruptionFilter(int arg0) {
        real.requestInterruptionFilter(arg0);
    }

    public void requestListenerHints(int arg0) {
        real.requestListenerHints(arg0);
    }

    public static void requestRebind(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        android.service.notification.NotificationListenerService.requestRebind(arg0 == null ? null : arg0.unwrap());
    }

    public void requestUnbind() {
        real.requestUnbind();
    }

    public static void requestUnbind(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        android.service.notification.NotificationListenerService.requestUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public void setNotificationsShown(java.lang.String[] arg0) {
        real.setNotificationsShown(arg0);
    }

    public void snoozeNotification(java.lang.String arg0, long arg1) {
        real.snoozeNotification(arg0, arg1);
    }

    public void updateNotificationChannel(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.app.NotificationChannel arg2) {
        real.updateNotificationChannel(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
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
        private final android.service.notification.NotificationListenerService.Ranking real;

        public Ranking(android.service.notification.NotificationListenerService.Ranking real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.Ranking wrap(android.service.notification.NotificationListenerService.Ranking real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.Ranking(real);
        }

        public android.service.notification.NotificationListenerService.Ranking unwrap() {
            return real;
        }

        public Ranking() {
            this(new android.service.notification.NotificationListenerService.Ranking());
        }

        public boolean canBubble() {
            return real.canBubble();
        }

        public boolean canShowBadge() {
            return real.canShowBadge();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.app.NotificationChannel getChannel() {
            return com.micklab.dcg.wrapper.android.app.NotificationChannel.wrap(real.getChannel());
        }

        public com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo getConversationShortcutInfo() {
            return com.micklab.dcg.wrapper.android.content.pm.ShortcutInfo.wrap(real.getConversationShortcutInfo());
        }

        public int getImportance() {
            return real.getImportance();
        }

        public java.lang.CharSequence getImportanceExplanation() {
            return real.getImportanceExplanation();
        }

        public java.lang.String getKey() {
            return real.getKey();
        }

        public long getLastAudiblyAlertedMillis() {
            return real.getLastAudiblyAlertedMillis();
        }

        public int getLockscreenVisibilityOverride() {
            return real.getLockscreenVisibilityOverride();
        }

        public java.lang.String getOverrideGroupKey() {
            return real.getOverrideGroupKey();
        }

        public int getRank() {
            return real.getRank();
        }

        public int getSuppressedVisualEffects() {
            return real.getSuppressedVisualEffects();
        }

        public int getUserSentiment() {
            return real.getUserSentiment();
        }

        public boolean isAmbient() {
            return real.isAmbient();
        }

        public boolean isConversation() {
            return real.isConversation();
        }

        public boolean isSuspended() {
            return real.isSuspended();
        }

        public boolean matchesInterruptionFilter() {
            return real.matchesInterruptionFilter();
        }

        public static final int USER_SENTIMENT_NEGATIVE = android.service.notification.NotificationListenerService.Ranking.USER_SENTIMENT_NEGATIVE;
        public static final int USER_SENTIMENT_NEUTRAL = android.service.notification.NotificationListenerService.Ranking.USER_SENTIMENT_NEUTRAL;
        public static final int USER_SENTIMENT_POSITIVE = android.service.notification.NotificationListenerService.Ranking.USER_SENTIMENT_POSITIVE;
        public static final int VISIBILITY_NO_OVERRIDE = android.service.notification.NotificationListenerService.Ranking.VISIBILITY_NO_OVERRIDE;

    }
    public static final class RankingMap {
        private final android.service.notification.NotificationListenerService.RankingMap real;

        public RankingMap(android.service.notification.NotificationListenerService.RankingMap real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap wrap(android.service.notification.NotificationListenerService.RankingMap real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.RankingMap(real);
        }

        public android.service.notification.NotificationListenerService.RankingMap unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String[] getOrderedKeys() {
            return real.getOrderedKeys();
        }

        public boolean getRanking(java.lang.String arg0, com.micklab.dcg.wrapper.android.service.notification.NotificationListenerService.Ranking arg1) {
            return real.getRanking(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
