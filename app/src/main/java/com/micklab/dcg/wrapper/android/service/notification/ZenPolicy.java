// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class ZenPolicy {
    private final android.service.notification.ZenPolicy real;

    public ZenPolicy(android.service.notification.ZenPolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.ZenPolicy wrap(android.service.notification.ZenPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenPolicy(real);
    }

    public android.service.notification.ZenPolicy unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getPriorityCallSenders() {
        return real.getPriorityCallSenders();
    }

    public int getPriorityCategoryAlarms() {
        return real.getPriorityCategoryAlarms();
    }

    public int getPriorityCategoryCalls() {
        return real.getPriorityCategoryCalls();
    }

    public int getPriorityCategoryConversations() {
        return real.getPriorityCategoryConversations();
    }

    public int getPriorityCategoryEvents() {
        return real.getPriorityCategoryEvents();
    }

    public int getPriorityCategoryMedia() {
        return real.getPriorityCategoryMedia();
    }

    public int getPriorityCategoryMessages() {
        return real.getPriorityCategoryMessages();
    }

    public int getPriorityCategoryReminders() {
        return real.getPriorityCategoryReminders();
    }

    public int getPriorityCategoryRepeatCallers() {
        return real.getPriorityCategoryRepeatCallers();
    }

    public int getPriorityCategorySystem() {
        return real.getPriorityCategorySystem();
    }

    public int getPriorityChannelsAllowed() {
        return real.getPriorityChannelsAllowed();
    }

    public int getPriorityConversationSenders() {
        return real.getPriorityConversationSenders();
    }

    public int getPriorityMessageSenders() {
        return real.getPriorityMessageSenders();
    }

    public int getVisualEffectAmbient() {
        return real.getVisualEffectAmbient();
    }

    public int getVisualEffectBadge() {
        return real.getVisualEffectBadge();
    }

    public int getVisualEffectFullScreenIntent() {
        return real.getVisualEffectFullScreenIntent();
    }

    public int getVisualEffectLights() {
        return real.getVisualEffectLights();
    }

    public int getVisualEffectNotificationList() {
        return real.getVisualEffectNotificationList();
    }

    public int getVisualEffectPeek() {
        return real.getVisualEffectPeek();
    }

    public int getVisualEffectStatusBar() {
        return real.getVisualEffectStatusBar();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CONVERSATION_SENDERS_ANYONE = android.service.notification.ZenPolicy.CONVERSATION_SENDERS_ANYONE;
    public static final int CONVERSATION_SENDERS_IMPORTANT = android.service.notification.ZenPolicy.CONVERSATION_SENDERS_IMPORTANT;
    public static final int CONVERSATION_SENDERS_NONE = android.service.notification.ZenPolicy.CONVERSATION_SENDERS_NONE;
    public static final int CONVERSATION_SENDERS_UNSET = android.service.notification.ZenPolicy.CONVERSATION_SENDERS_UNSET;
    public static final int PEOPLE_TYPE_ANYONE = android.service.notification.ZenPolicy.PEOPLE_TYPE_ANYONE;
    public static final int PEOPLE_TYPE_CONTACTS = android.service.notification.ZenPolicy.PEOPLE_TYPE_CONTACTS;
    public static final int PEOPLE_TYPE_NONE = android.service.notification.ZenPolicy.PEOPLE_TYPE_NONE;
    public static final int PEOPLE_TYPE_STARRED = android.service.notification.ZenPolicy.PEOPLE_TYPE_STARRED;
    public static final int PEOPLE_TYPE_UNSET = android.service.notification.ZenPolicy.PEOPLE_TYPE_UNSET;
    public static final int STATE_ALLOW = android.service.notification.ZenPolicy.STATE_ALLOW;
    public static final int STATE_DISALLOW = android.service.notification.ZenPolicy.STATE_DISALLOW;
    public static final int STATE_UNSET = android.service.notification.ZenPolicy.STATE_UNSET;

    public static final class Builder {
        private final android.service.notification.ZenPolicy.Builder real;

        public Builder(android.service.notification.ZenPolicy.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder wrap(android.service.notification.ZenPolicy.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder(real);
        }

        public android.service.notification.ZenPolicy.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.notification.ZenPolicy.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowAlarms(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowAlarms(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowAllSounds() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowAllSounds());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowCalls(int arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowCalls(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowConversations(int arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowConversations(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowEvents(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowEvents(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowMedia(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowMedia(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowMessages(int arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowMessages(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowPriorityChannels(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowPriorityChannels(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowReminders(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowReminders(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowRepeatCallers(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowRepeatCallers(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowSystem(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.allowSystem(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy build() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder disallowAllSounds() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.disallowAllSounds());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder hideAllVisualEffects() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.hideAllVisualEffects());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showAllVisualEffects() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showAllVisualEffects());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showBadges(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showBadges(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showFullScreenIntent(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showFullScreenIntent(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showInAmbientDisplay(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showInAmbientDisplay(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showInNotificationList(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showInNotificationList(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showLights(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showLights(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showPeeking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showPeeking(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showStatusBarIcons(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(real.showStatusBarIcons(arg0));
        }

    }
}
