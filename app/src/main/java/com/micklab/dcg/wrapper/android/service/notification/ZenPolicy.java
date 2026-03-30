// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class ZenPolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ZenPolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.ZenPolicy wrap(android.service.notification.ZenPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenPolicy(real, (__DcgwBridgeToken) null);
    }

    public android.service.notification.ZenPolicy getReal() {
        return (android.service.notification.ZenPolicy) real;
    }

    public android.service.notification.ZenPolicy unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.notification.ZenPolicy) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.notification.ZenPolicy) real).equals(arg0);
    }

    public int getPriorityCallSenders() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCallSenders();
    }

    public int getPriorityCategoryAlarms() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryAlarms();
    }

    public int getPriorityCategoryCalls() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryCalls();
    }

    public int getPriorityCategoryConversations() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryConversations();
    }

    public int getPriorityCategoryEvents() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryEvents();
    }

    public int getPriorityCategoryMedia() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryMedia();
    }

    public int getPriorityCategoryMessages() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryMessages();
    }

    public int getPriorityCategoryReminders() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryReminders();
    }

    public int getPriorityCategoryRepeatCallers() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategoryRepeatCallers();
    }

    public int getPriorityCategorySystem() {
        return ((android.service.notification.ZenPolicy) real).getPriorityCategorySystem();
    }

    public int getPriorityChannelsAllowed() {
        return ((android.service.notification.ZenPolicy) real).getPriorityChannelsAllowed();
    }

    public int getPriorityConversationSenders() {
        return ((android.service.notification.ZenPolicy) real).getPriorityConversationSenders();
    }

    public int getPriorityMessageSenders() {
        return ((android.service.notification.ZenPolicy) real).getPriorityMessageSenders();
    }

    public int getVisualEffectAmbient() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectAmbient();
    }

    public int getVisualEffectBadge() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectBadge();
    }

    public int getVisualEffectFullScreenIntent() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectFullScreenIntent();
    }

    public int getVisualEffectLights() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectLights();
    }

    public int getVisualEffectNotificationList() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectNotificationList();
    }

    public int getVisualEffectPeek() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectPeek();
    }

    public int getVisualEffectStatusBar() {
        return ((android.service.notification.ZenPolicy) real).getVisualEffectStatusBar();
    }

    public int hashCode() {
        return ((android.service.notification.ZenPolicy) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.service.notification.ZenPolicy) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.notification.ZenPolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder wrap(android.service.notification.ZenPolicy.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.notification.ZenPolicy.Builder getReal() {
            return (android.service.notification.ZenPolicy.Builder) real;
        }

        public android.service.notification.ZenPolicy.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.notification.ZenPolicy.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowAlarms(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowAlarms(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowAllSounds() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowAllSounds());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowCalls(int arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowCalls(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowConversations(int arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowConversations(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowEvents(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowEvents(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowMedia(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowMedia(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowMessages(int arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowMessages(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowPriorityChannels(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowPriorityChannels(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowReminders(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowReminders(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowRepeatCallers(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowRepeatCallers(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder allowSystem(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).allowSystem(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy build() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.wrap(((android.service.notification.ZenPolicy.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder disallowAllSounds() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).disallowAllSounds());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder hideAllVisualEffects() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).hideAllVisualEffects());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showAllVisualEffects() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showAllVisualEffects());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showBadges(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showBadges(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showFullScreenIntent(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showFullScreenIntent(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showInAmbientDisplay(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showInAmbientDisplay(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showInNotificationList(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showInNotificationList(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showLights(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showLights(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showPeeking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showPeeking(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder showStatusBarIcons(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.Builder.wrap(((android.service.notification.ZenPolicy.Builder) real).showStatusBarIcons(arg0));
        }

    }
}
