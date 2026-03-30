// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Notification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Notification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Notification wrap(android.app.Notification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification(real, (__DcgwBridgeToken) null);
    }

    public android.app.Notification getReal() {
        return (android.app.Notification) real;
    }

    public android.app.Notification unwrap() {
        return getReal();
    }

    public Notification() {
        this(new android.app.Notification(), (__DcgwBridgeToken) null);
    }

    public Notification(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.app.Notification(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Notification(int arg0, java.lang.CharSequence arg1, long arg2) {
        this(new android.app.Notification(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.app.Notification clone() {
        return com.micklab.dcg.wrapper.android.app.Notification.wrap(((android.app.Notification) real).clone());
    }

    public int describeContents() {
        return ((android.app.Notification) real).describeContents();
    }

    public boolean getAllowSystemGeneratedContextualActions() {
        return ((android.app.Notification) real).getAllowSystemGeneratedContextualActions();
    }

    public int getBadgeIconType() {
        return ((android.app.Notification) real).getBadgeIconType();
    }

    public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata getBubbleMetadata() {
        return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.wrap(((android.app.Notification) real).getBubbleMetadata());
    }

    public java.lang.String getChannelId() {
        return ((android.app.Notification) real).getChannelId();
    }

    public java.lang.String getGroup() {
        return ((android.app.Notification) real).getGroup();
    }

    public int getGroupAlertBehavior() {
        return ((android.app.Notification) real).getGroupAlertBehavior();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getLargeIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.Notification) real).getLargeIcon());
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(((android.app.Notification) real).getLocusId());
    }

    public java.lang.CharSequence getSettingsText() {
        return ((android.app.Notification) real).getSettingsText();
    }

    public java.lang.String getShortcutId() {
        return ((android.app.Notification) real).getShortcutId();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getSmallIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.Notification) real).getSmallIcon());
    }

    public java.lang.String getSortKey() {
        return ((android.app.Notification) real).getSortKey();
    }

    public long getTimeoutAfter() {
        return ((android.app.Notification) real).getTimeoutAfter();
    }

    public boolean hasImage() {
        return ((android.app.Notification) real).hasImage();
    }

    public java.lang.String toString() {
        return ((android.app.Notification) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.Notification) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.media.AudioAttributes AUDIO_ATTRIBUTES_DEFAULT = com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
    public static final int BADGE_ICON_LARGE = android.app.Notification.BADGE_ICON_LARGE;
    public static final int BADGE_ICON_NONE = android.app.Notification.BADGE_ICON_NONE;
    public static final int BADGE_ICON_SMALL = android.app.Notification.BADGE_ICON_SMALL;
    public static final java.lang.String CATEGORY_ALARM = android.app.Notification.CATEGORY_ALARM;
    public static final java.lang.String CATEGORY_CALL = android.app.Notification.CATEGORY_CALL;
    public static final java.lang.String CATEGORY_EMAIL = android.app.Notification.CATEGORY_EMAIL;
    public static final java.lang.String CATEGORY_ERROR = android.app.Notification.CATEGORY_ERROR;
    public static final java.lang.String CATEGORY_EVENT = android.app.Notification.CATEGORY_EVENT;
    public static final java.lang.String CATEGORY_LOCATION_SHARING = android.app.Notification.CATEGORY_LOCATION_SHARING;
    public static final java.lang.String CATEGORY_MESSAGE = android.app.Notification.CATEGORY_MESSAGE;
    public static final java.lang.String CATEGORY_MISSED_CALL = android.app.Notification.CATEGORY_MISSED_CALL;
    public static final java.lang.String CATEGORY_NAVIGATION = android.app.Notification.CATEGORY_NAVIGATION;
    public static final java.lang.String CATEGORY_PROGRESS = android.app.Notification.CATEGORY_PROGRESS;
    public static final java.lang.String CATEGORY_PROMO = android.app.Notification.CATEGORY_PROMO;
    public static final java.lang.String CATEGORY_RECOMMENDATION = android.app.Notification.CATEGORY_RECOMMENDATION;
    public static final java.lang.String CATEGORY_REMINDER = android.app.Notification.CATEGORY_REMINDER;
    public static final java.lang.String CATEGORY_SERVICE = android.app.Notification.CATEGORY_SERVICE;
    public static final java.lang.String CATEGORY_SOCIAL = android.app.Notification.CATEGORY_SOCIAL;
    public static final java.lang.String CATEGORY_STATUS = android.app.Notification.CATEGORY_STATUS;
    public static final java.lang.String CATEGORY_STOPWATCH = android.app.Notification.CATEGORY_STOPWATCH;
    public static final java.lang.String CATEGORY_SYSTEM = android.app.Notification.CATEGORY_SYSTEM;
    public static final java.lang.String CATEGORY_TRANSPORT = android.app.Notification.CATEGORY_TRANSPORT;
    public static final java.lang.String CATEGORY_VOICEMAIL = android.app.Notification.CATEGORY_VOICEMAIL;
    public static final java.lang.String CATEGORY_WORKOUT = android.app.Notification.CATEGORY_WORKOUT;
    public static final int COLOR_DEFAULT = android.app.Notification.COLOR_DEFAULT;
    public static final int DEFAULT_ALL = android.app.Notification.DEFAULT_ALL;
    public static final int DEFAULT_LIGHTS = android.app.Notification.DEFAULT_LIGHTS;
    public static final int DEFAULT_SOUND = android.app.Notification.DEFAULT_SOUND;
    public static final int DEFAULT_VIBRATE = android.app.Notification.DEFAULT_VIBRATE;
    public static final java.lang.String EXTRA_ANSWER_COLOR = android.app.Notification.EXTRA_ANSWER_COLOR;
    public static final java.lang.String EXTRA_ANSWER_INTENT = android.app.Notification.EXTRA_ANSWER_INTENT;
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = android.app.Notification.EXTRA_AUDIO_CONTENTS_URI;
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = android.app.Notification.EXTRA_BACKGROUND_IMAGE_URI;
    public static final java.lang.String EXTRA_BIG_TEXT = android.app.Notification.EXTRA_BIG_TEXT;
    public static final java.lang.String EXTRA_CALL_IS_VIDEO = android.app.Notification.EXTRA_CALL_IS_VIDEO;
    public static final java.lang.String EXTRA_CALL_PERSON = android.app.Notification.EXTRA_CALL_PERSON;
    public static final java.lang.String EXTRA_CALL_TYPE = android.app.Notification.EXTRA_CALL_TYPE;
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = android.app.Notification.EXTRA_CHANNEL_GROUP_ID;
    public static final java.lang.String EXTRA_CHANNEL_ID = android.app.Notification.EXTRA_CHANNEL_ID;
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = android.app.Notification.EXTRA_CHRONOMETER_COUNT_DOWN;
    public static final java.lang.String EXTRA_COLORIZED = android.app.Notification.EXTRA_COLORIZED;
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = android.app.Notification.EXTRA_COMPACT_ACTIONS;
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = android.app.Notification.EXTRA_CONVERSATION_TITLE;
    public static final java.lang.String EXTRA_DECLINE_COLOR = android.app.Notification.EXTRA_DECLINE_COLOR;
    public static final java.lang.String EXTRA_DECLINE_INTENT = android.app.Notification.EXTRA_DECLINE_INTENT;
    public static final java.lang.String EXTRA_HANG_UP_INTENT = android.app.Notification.EXTRA_HANG_UP_INTENT;
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = android.app.Notification.EXTRA_HISTORIC_MESSAGES;
    public static final java.lang.String EXTRA_INFO_TEXT = android.app.Notification.EXTRA_INFO_TEXT;
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = android.app.Notification.EXTRA_IS_GROUP_CONVERSATION;
    public static final java.lang.String EXTRA_LARGE_ICON = android.app.Notification.EXTRA_LARGE_ICON;
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = android.app.Notification.EXTRA_LARGE_ICON_BIG;
    public static final java.lang.String EXTRA_MEDIA_SESSION = android.app.Notification.EXTRA_MEDIA_SESSION;
    public static final java.lang.String EXTRA_MESSAGES = android.app.Notification.EXTRA_MESSAGES;
    public static final java.lang.String EXTRA_MESSAGING_PERSON = android.app.Notification.EXTRA_MESSAGING_PERSON;
    public static final java.lang.String EXTRA_NOTIFICATION_ID = android.app.Notification.EXTRA_NOTIFICATION_ID;
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = android.app.Notification.EXTRA_NOTIFICATION_TAG;
    public static final java.lang.String EXTRA_PEOPLE = android.app.Notification.EXTRA_PEOPLE;
    public static final java.lang.String EXTRA_PEOPLE_LIST = android.app.Notification.EXTRA_PEOPLE_LIST;
    public static final java.lang.String EXTRA_PICTURE = android.app.Notification.EXTRA_PICTURE;
    public static final java.lang.String EXTRA_PICTURE_CONTENT_DESCRIPTION = android.app.Notification.EXTRA_PICTURE_CONTENT_DESCRIPTION;
    public static final java.lang.String EXTRA_PICTURE_ICON = android.app.Notification.EXTRA_PICTURE_ICON;
    public static final java.lang.String EXTRA_PROGRESS = android.app.Notification.EXTRA_PROGRESS;
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = android.app.Notification.EXTRA_PROGRESS_INDETERMINATE;
    public static final java.lang.String EXTRA_PROGRESS_MAX = android.app.Notification.EXTRA_PROGRESS_MAX;
    public static final java.lang.String EXTRA_REMOTE_INPUT_DRAFT = android.app.Notification.EXTRA_REMOTE_INPUT_DRAFT;
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = android.app.Notification.EXTRA_REMOTE_INPUT_HISTORY;
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = android.app.Notification.EXTRA_SELF_DISPLAY_NAME;
    public static final java.lang.String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = android.app.Notification.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED;
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = android.app.Notification.EXTRA_SHOW_CHRONOMETER;
    public static final java.lang.String EXTRA_SHOW_WHEN = android.app.Notification.EXTRA_SHOW_WHEN;
    public static final java.lang.String EXTRA_SMALL_ICON = android.app.Notification.EXTRA_SMALL_ICON;
    public static final java.lang.String EXTRA_SUB_TEXT = android.app.Notification.EXTRA_SUB_TEXT;
    public static final java.lang.String EXTRA_SUMMARY_TEXT = android.app.Notification.EXTRA_SUMMARY_TEXT;
    public static final java.lang.String EXTRA_TEMPLATE = android.app.Notification.EXTRA_TEMPLATE;
    public static final java.lang.String EXTRA_TEXT = android.app.Notification.EXTRA_TEXT;
    public static final java.lang.String EXTRA_TEXT_LINES = android.app.Notification.EXTRA_TEXT_LINES;
    public static final java.lang.String EXTRA_TITLE = android.app.Notification.EXTRA_TITLE;
    public static final java.lang.String EXTRA_TITLE_BIG = android.app.Notification.EXTRA_TITLE_BIG;
    public static final java.lang.String EXTRA_VERIFICATION_ICON = android.app.Notification.EXTRA_VERIFICATION_ICON;
    public static final java.lang.String EXTRA_VERIFICATION_TEXT = android.app.Notification.EXTRA_VERIFICATION_TEXT;
    public static final int FLAG_AUTO_CANCEL = android.app.Notification.FLAG_AUTO_CANCEL;
    public static final int FLAG_BUBBLE = android.app.Notification.FLAG_BUBBLE;
    public static final int FLAG_FOREGROUND_SERVICE = android.app.Notification.FLAG_FOREGROUND_SERVICE;
    public static final int FLAG_GROUP_SUMMARY = android.app.Notification.FLAG_GROUP_SUMMARY;
    public static final int FLAG_HIGH_PRIORITY = android.app.Notification.FLAG_HIGH_PRIORITY;
    public static final int FLAG_INSISTENT = android.app.Notification.FLAG_INSISTENT;
    public static final int FLAG_LOCAL_ONLY = android.app.Notification.FLAG_LOCAL_ONLY;
    public static final int FLAG_NO_CLEAR = android.app.Notification.FLAG_NO_CLEAR;
    public static final int FLAG_ONGOING_EVENT = android.app.Notification.FLAG_ONGOING_EVENT;
    public static final int FLAG_ONLY_ALERT_ONCE = android.app.Notification.FLAG_ONLY_ALERT_ONCE;
    public static final int FLAG_SHOW_LIGHTS = android.app.Notification.FLAG_SHOW_LIGHTS;
    public static final int FOREGROUND_SERVICE_DEFAULT = android.app.Notification.FOREGROUND_SERVICE_DEFAULT;
    public static final int FOREGROUND_SERVICE_DEFERRED = android.app.Notification.FOREGROUND_SERVICE_DEFERRED;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = android.app.Notification.FOREGROUND_SERVICE_IMMEDIATE;
    public static final int GROUP_ALERT_ALL = android.app.Notification.GROUP_ALERT_ALL;
    public static final int GROUP_ALERT_CHILDREN = android.app.Notification.GROUP_ALERT_CHILDREN;
    public static final int GROUP_ALERT_SUMMARY = android.app.Notification.GROUP_ALERT_SUMMARY;
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = android.app.Notification.INTENT_CATEGORY_NOTIFICATION_PREFERENCES;
    public static final int PRIORITY_DEFAULT = android.app.Notification.PRIORITY_DEFAULT;
    public static final int PRIORITY_HIGH = android.app.Notification.PRIORITY_HIGH;
    public static final int PRIORITY_LOW = android.app.Notification.PRIORITY_LOW;
    public static final int PRIORITY_MAX = android.app.Notification.PRIORITY_MAX;
    public static final int PRIORITY_MIN = android.app.Notification.PRIORITY_MIN;
    public static final int STREAM_DEFAULT = android.app.Notification.STREAM_DEFAULT;
    public static final int VISIBILITY_PRIVATE = android.app.Notification.VISIBILITY_PRIVATE;
    public static final int VISIBILITY_PUBLIC = android.app.Notification.VISIBILITY_PUBLIC;
    public static final int VISIBILITY_SECRET = android.app.Notification.VISIBILITY_SECRET;

    public static final class Action {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Action(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Action wrap(android.app.Notification.Action real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.Action getReal() {
            return (android.app.Notification.Action) real;
        }

        public android.app.Notification.Action unwrap() {
            return getReal();
        }

        public Action(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            this(new android.app.Notification.Action(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Action clone() {
            return com.micklab.dcg.wrapper.android.app.Notification.Action.wrap(((android.app.Notification.Action) real).clone());
        }

        public int describeContents() {
            return ((android.app.Notification.Action) real).describeContents();
        }

        public boolean getAllowGeneratedReplies() {
            return ((android.app.Notification.Action) real).getAllowGeneratedReplies();
        }

        public android.app.RemoteInput[] getDataOnlyRemoteInputs() {
            return ((android.app.Notification.Action) real).getDataOnlyRemoteInputs();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Notification.Action) real).getExtras());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.Notification.Action) real).getIcon());
        }

        public android.app.RemoteInput[] getRemoteInputs() {
            return ((android.app.Notification.Action) real).getRemoteInputs();
        }

        public int getSemanticAction() {
            return ((android.app.Notification.Action) real).getSemanticAction();
        }

        public boolean isAuthenticationRequired() {
            return ((android.app.Notification.Action) real).isAuthenticationRequired();
        }

        public boolean isContextual() {
            return ((android.app.Notification.Action) real).isContextual();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.Notification.Action) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int SEMANTIC_ACTION_ARCHIVE = android.app.Notification.Action.SEMANTIC_ACTION_ARCHIVE;
        public static final int SEMANTIC_ACTION_CALL = android.app.Notification.Action.SEMANTIC_ACTION_CALL;
        public static final int SEMANTIC_ACTION_DELETE = android.app.Notification.Action.SEMANTIC_ACTION_DELETE;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = android.app.Notification.Action.SEMANTIC_ACTION_MARK_AS_READ;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = android.app.Notification.Action.SEMANTIC_ACTION_MARK_AS_UNREAD;
        public static final int SEMANTIC_ACTION_MUTE = android.app.Notification.Action.SEMANTIC_ACTION_MUTE;
        public static final int SEMANTIC_ACTION_NONE = android.app.Notification.Action.SEMANTIC_ACTION_NONE;
        public static final int SEMANTIC_ACTION_REPLY = android.app.Notification.Action.SEMANTIC_ACTION_REPLY;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = android.app.Notification.Action.SEMANTIC_ACTION_THUMBS_DOWN;
        public static final int SEMANTIC_ACTION_THUMBS_UP = android.app.Notification.Action.SEMANTIC_ACTION_THUMBS_UP;
        public static final int SEMANTIC_ACTION_UNMUTE = android.app.Notification.Action.SEMANTIC_ACTION_UNMUTE;

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.Action.Builder wrap(android.app.Notification.Action.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.Action.Builder getReal() {
                return (android.app.Notification.Action.Builder) real;
            }

            public android.app.Notification.Action.Builder unwrap() {
                return getReal();
            }

            public Builder(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
                this(new android.app.Notification.Action.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
            }

            public Builder(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
                this(new android.app.Notification.Action.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
            }

            public Builder(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
                this(new android.app.Notification.Action.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder addExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).addExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder addRemoteInput(com.micklab.dcg.wrapper.android.app.RemoteInput arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).addRemoteInput(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action build() {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.wrap(((android.app.Notification.Action.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Action.Extender arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).extend(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
                return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Notification.Action.Builder) real).getExtras());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setAllowGeneratedReplies(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).setAllowGeneratedReplies(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setAuthenticationRequired(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).setAuthenticationRequired(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setContextual(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).setContextual(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setSemanticAction(int arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Builder) real).setSemanticAction(arg0));
            }

        }
        public static final class Extender {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Extender(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.Action.Extender wrap(android.app.Notification.Action.Extender real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action.Extender(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.Action.Extender getReal() {
                return (android.app.Notification.Action.Extender) real;
            }

            public android.app.Notification.Action.Extender unwrap() {
                return getReal();
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Action.Builder arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.Extender) real).extend(arg0 == null ? null : arg0.getReal()));
            }

        }
        public static final class WearableExtender {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private WearableExtender(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender wrap(android.app.Notification.Action.WearableExtender real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.Action.WearableExtender getReal() {
                return (android.app.Notification.Action.WearableExtender) real;
            }

            public android.app.Notification.Action.WearableExtender unwrap() {
                return getReal();
            }

            public WearableExtender() {
                this(new android.app.Notification.Action.WearableExtender(), (__DcgwBridgeToken) null);
            }

            public WearableExtender(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
                this(new android.app.Notification.Action.WearableExtender(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender clone() {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).clone());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Action.Builder arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(((android.app.Notification.Action.WearableExtender) real).extend(arg0 == null ? null : arg0.getReal()));
            }

            public java.lang.CharSequence getCancelLabel() {
                return ((android.app.Notification.Action.WearableExtender) real).getCancelLabel();
            }

            public java.lang.CharSequence getConfirmLabel() {
                return ((android.app.Notification.Action.WearableExtender) real).getConfirmLabel();
            }

            public boolean getHintDisplayActionInline() {
                return ((android.app.Notification.Action.WearableExtender) real).getHintDisplayActionInline();
            }

            public boolean getHintLaunchesActivity() {
                return ((android.app.Notification.Action.WearableExtender) real).getHintLaunchesActivity();
            }

            public java.lang.CharSequence getInProgressLabel() {
                return ((android.app.Notification.Action.WearableExtender) real).getInProgressLabel();
            }

            public boolean isAvailableOffline() {
                return ((android.app.Notification.Action.WearableExtender) real).isAvailableOffline();
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setAvailableOffline(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).setAvailableOffline(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setCancelLabel(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).setCancelLabel(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setConfirmLabel(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).setConfirmLabel(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setHintDisplayActionInline(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).setHintDisplayActionInline(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setHintLaunchesActivity(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).setHintLaunchesActivity(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setInProgressLabel(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(((android.app.Notification.Action.WearableExtender) real).setInProgressLabel(arg0));
            }

        }
    }
    public static final class BigPictureStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BigPictureStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle wrap(android.app.Notification.BigPictureStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.BigPictureStyle getReal() {
            return (android.app.Notification.BigPictureStyle) real;
        }

        public android.app.Notification.BigPictureStyle unwrap() {
            return getReal();
        }

        public BigPictureStyle() {
            this(new android.app.Notification.BigPictureStyle(), (__DcgwBridgeToken) null);
        }

        public BigPictureStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.BigPictureStyle(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigLargeIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).bigLargeIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigLargeIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).bigLargeIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigPicture(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).bigPicture(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigPicture(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).bigPicture(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle setBigContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).setBigContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle setContentDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).setContentDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle setSummaryText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).setSummaryText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle showBigPictureWhenCollapsed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(((android.app.Notification.BigPictureStyle) real).showBigPictureWhenCollapsed(arg0));
        }

    }
    public static final class BigTextStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BigTextStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle wrap(android.app.Notification.BigTextStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.BigTextStyle getReal() {
            return (android.app.Notification.BigTextStyle) real;
        }

        public android.app.Notification.BigTextStyle unwrap() {
            return getReal();
        }

        public BigTextStyle() {
            this(new android.app.Notification.BigTextStyle(), (__DcgwBridgeToken) null);
        }

        public BigTextStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.BigTextStyle(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle bigText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle.wrap(((android.app.Notification.BigTextStyle) real).bigText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle setBigContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle.wrap(((android.app.Notification.BigTextStyle) real).setBigContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle setSummaryText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle.wrap(((android.app.Notification.BigTextStyle) real).setSummaryText(arg0));
        }

    }
    public static final class BubbleMetadata {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BubbleMetadata(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata wrap(android.app.Notification.BubbleMetadata real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.BubbleMetadata getReal() {
            return (android.app.Notification.BubbleMetadata) real;
        }

        public android.app.Notification.BubbleMetadata unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.app.Notification.BubbleMetadata) real).describeContents();
        }

        public boolean getAutoExpandBubble() {
            return ((android.app.Notification.BubbleMetadata) real).getAutoExpandBubble();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getDeleteIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.BubbleMetadata) real).getDeleteIntent());
        }

        public int getDesiredHeight() {
            return ((android.app.Notification.BubbleMetadata) real).getDesiredHeight();
        }

        public int getDesiredHeightResId() {
            return ((android.app.Notification.BubbleMetadata) real).getDesiredHeightResId();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.Notification.BubbleMetadata) real).getIcon());
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.BubbleMetadata) real).getIntent());
        }

        public java.lang.String getShortcutId() {
            return ((android.app.Notification.BubbleMetadata) real).getShortcutId();
        }

        public boolean isBubbleSuppressable() {
            return ((android.app.Notification.BubbleMetadata) real).isBubbleSuppressable();
        }

        public boolean isBubbleSuppressed() {
            return ((android.app.Notification.BubbleMetadata) real).isBubbleSuppressed();
        }

        public boolean isNotificationSuppressed() {
            return ((android.app.Notification.BubbleMetadata) real).isNotificationSuppressed();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.Notification.BubbleMetadata) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder wrap(android.app.Notification.BubbleMetadata.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.BubbleMetadata.Builder getReal() {
                return (android.app.Notification.BubbleMetadata.Builder) real;
            }

            public android.app.Notification.BubbleMetadata.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.app.Notification.BubbleMetadata.Builder(), (__DcgwBridgeToken) null);
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.Notification.BubbleMetadata.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public Builder(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1) {
                this(new android.app.Notification.BubbleMetadata.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata build() {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.wrap(((android.app.Notification.BubbleMetadata.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setAutoExpandBubble(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setAutoExpandBubble(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setDeleteIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setDeleteIntent(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setDesiredHeight(int arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setDesiredHeight(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setDesiredHeightResId(int arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setDesiredHeightResId(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setIcon(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setIntent(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setSuppressNotification(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setSuppressNotification(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setSuppressableBubble(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(((android.app.Notification.BubbleMetadata.Builder) real).setSuppressableBubble(arg0));
            }

        }
    }
    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Builder wrap(android.app.Notification.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.Builder getReal() {
            return (android.app.Notification.Builder) real;
        }

        public android.app.Notification.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.app.Notification.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
            this(new android.app.Notification.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addAction(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).addAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addAction(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).addAction(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).addExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addPerson(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).addPerson(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addPerson(com.micklab.dcg.wrapper.android.app.Person arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).addPerson(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification build() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(((android.app.Notification.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews createBigContentView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.app.Notification.Builder) real).createBigContentView());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews createContentView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.app.Notification.Builder) real).createContentView());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews createHeadsUpContentView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.app.Notification.Builder) real).createHeadsUpContentView());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Extender arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).extend(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Notification.Builder) real).getExtras());
        }

        public com.micklab.dcg.wrapper.android.app.Notification getNotification() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(((android.app.Notification.Builder) real).getNotification());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Style getStyle() {
            return com.micklab.dcg.wrapper.android.app.Notification.Style.wrap(((android.app.Notification.Builder) real).getStyle());
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Builder recoverBuilder(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(android.app.Notification.Builder.recoverBuilder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setActions(android.app.Notification.Action... arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setActions(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setAllowSystemGeneratedContextualActions(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setAllowSystemGeneratedContextualActions(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setAutoCancel(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setAutoCancel(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setBadgeIconType(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setBadgeIconType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setBubbleMetadata(com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setBubbleMetadata(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCategory(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setCategory(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setChannelId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setChannelId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setChronometerCountDown(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setChronometerCountDown(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setColor(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setColorized(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setColorized(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContent(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setContent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentInfo(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setContentInfo(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setContentIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setContentText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCustomBigContentView(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setCustomBigContentView(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCustomContentView(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setCustomContentView(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCustomHeadsUpContentView(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setCustomHeadsUpContentView(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setDefaults(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setDefaults(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setDeleteIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setDeleteIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setFlag(int arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setFlag(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setForegroundServiceBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setForegroundServiceBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setFullScreenIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setFullScreenIntent(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setGroup(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setGroup(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setGroupAlertBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setGroupAlertBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setGroupSummary(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setGroupSummary(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLargeIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setLargeIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLargeIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setLargeIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLights(int arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setLights(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLocalOnly(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setLocalOnly(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLocusId(com.micklab.dcg.wrapper.android.content.LocusId arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setLocusId(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setNumber(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setOngoing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setOngoing(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setOnlyAlertOnce(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setOnlyAlertOnce(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setPriority(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setPriority(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setProgress(int arg0, int arg1, boolean arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setProgress(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setPublicVersion(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setPublicVersion(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setRemoteInputHistory(java.lang.CharSequence[] arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setRemoteInputHistory(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSettingsText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSettingsText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setShortcutId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setShortcutId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setShowWhen(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setShowWhen(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSmallIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSmallIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSmallIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSmallIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSmallIcon(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSmallIcon(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSortKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSortKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSound(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSound(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSound(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSound(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSound(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSound(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setStyle(com.micklab.dcg.wrapper.android.app.Notification.Style arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setStyle(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSubText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setSubText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setTicker(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setTicker(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setTicker(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setTicker(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setTimeoutAfter(long arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setTimeoutAfter(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setUsesChronometer(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setUsesChronometer(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setVibrate(long[] arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setVibrate(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setVisibility(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setVisibility(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setWhen(long arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Builder) real).setWhen(arg0));
        }

    }
    public static final class CallStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CallStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle wrap(android.app.Notification.CallStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CallStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.CallStyle getReal() {
            return (android.app.Notification.CallStyle) real;
        }

        public android.app.Notification.CallStyle unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle forIncomingCall(com.micklab.dcg.wrapper.android.app.Person arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(android.app.Notification.CallStyle.forIncomingCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle forOngoingCall(com.micklab.dcg.wrapper.android.app.Person arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(android.app.Notification.CallStyle.forOngoingCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle forScreeningCall(com.micklab.dcg.wrapper.android.app.Person arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(android.app.Notification.CallStyle.forScreeningCall(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setAnswerButtonColorHint(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(((android.app.Notification.CallStyle) real).setAnswerButtonColorHint(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setDeclineButtonColorHint(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(((android.app.Notification.CallStyle) real).setDeclineButtonColorHint(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setIsVideo(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(((android.app.Notification.CallStyle) real).setIsVideo(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setVerificationIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(((android.app.Notification.CallStyle) real).setVerificationIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setVerificationText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(((android.app.Notification.CallStyle) real).setVerificationText(arg0));
        }

        public static final int CALL_TYPE_INCOMING = android.app.Notification.CallStyle.CALL_TYPE_INCOMING;
        public static final int CALL_TYPE_ONGOING = android.app.Notification.CallStyle.CALL_TYPE_ONGOING;
        public static final int CALL_TYPE_SCREENING = android.app.Notification.CallStyle.CALL_TYPE_SCREENING;
        public static final int CALL_TYPE_UNKNOWN = android.app.Notification.CallStyle.CALL_TYPE_UNKNOWN;

    }
    public static final class CarExtender {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CarExtender(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CarExtender wrap(android.app.Notification.CarExtender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CarExtender(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.CarExtender getReal() {
            return (android.app.Notification.CarExtender) real;
        }

        public android.app.Notification.CarExtender unwrap() {
            return getReal();
        }

        public CarExtender() {
            this(new android.app.Notification.CarExtender(), (__DcgwBridgeToken) null);
        }

        public CarExtender(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            this(new android.app.Notification.CarExtender(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.CarExtender) real).extend(arg0 == null ? null : arg0.getReal()));
        }

        public int getColor() {
            return ((android.app.Notification.CarExtender) real).getColor();
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getLargeIcon() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.app.Notification.CarExtender) real).getLargeIcon());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation getUnreadConversation() {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation.wrap(((android.app.Notification.CarExtender) real).getUnreadConversation());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender setColor(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.wrap(((android.app.Notification.CarExtender) real).setColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender setLargeIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.wrap(((android.app.Notification.CarExtender) real).setLargeIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender setUnreadConversation(com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.wrap(((android.app.Notification.CarExtender) real).setUnreadConversation(arg0 == null ? null : arg0.getReal()));
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder wrap(android.app.Notification.CarExtender.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.CarExtender.Builder getReal() {
                return (android.app.Notification.CarExtender.Builder) real;
            }

            public android.app.Notification.CarExtender.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.Notification.CarExtender.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder addMessage(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(((android.app.Notification.CarExtender.Builder) real).addMessage(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation build() {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation.wrap(((android.app.Notification.CarExtender.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder setLatestTimestamp(long arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(((android.app.Notification.CarExtender.Builder) real).setLatestTimestamp(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder setReadPendingIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(((android.app.Notification.CarExtender.Builder) real).setReadPendingIntent(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder setReplyAction(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.app.RemoteInput arg1) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(((android.app.Notification.CarExtender.Builder) real).setReplyAction(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
            }

        }
        public static final class UnreadConversation {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private UnreadConversation(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation wrap(android.app.Notification.CarExtender.UnreadConversation real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.CarExtender.UnreadConversation getReal() {
                return (android.app.Notification.CarExtender.UnreadConversation) real;
            }

            public android.app.Notification.CarExtender.UnreadConversation unwrap() {
                return getReal();
            }

            public long getLatestTimestamp() {
                return ((android.app.Notification.CarExtender.UnreadConversation) real).getLatestTimestamp();
            }

            public java.lang.String[] getMessages() {
                return ((android.app.Notification.CarExtender.UnreadConversation) real).getMessages();
            }

            public java.lang.String getParticipant() {
                return ((android.app.Notification.CarExtender.UnreadConversation) real).getParticipant();
            }

            public java.lang.String[] getParticipants() {
                return ((android.app.Notification.CarExtender.UnreadConversation) real).getParticipants();
            }

            public com.micklab.dcg.wrapper.android.app.PendingIntent getReadPendingIntent() {
                return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.CarExtender.UnreadConversation) real).getReadPendingIntent());
            }

            public com.micklab.dcg.wrapper.android.app.RemoteInput getRemoteInput() {
                return com.micklab.dcg.wrapper.android.app.RemoteInput.wrap(((android.app.Notification.CarExtender.UnreadConversation) real).getRemoteInput());
            }

            public com.micklab.dcg.wrapper.android.app.PendingIntent getReplyPendingIntent() {
                return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.CarExtender.UnreadConversation) real).getReplyPendingIntent());
            }

        }
    }
    public static final class DecoratedCustomViewStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DecoratedCustomViewStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.DecoratedCustomViewStyle wrap(android.app.Notification.DecoratedCustomViewStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.DecoratedCustomViewStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.DecoratedCustomViewStyle getReal() {
            return (android.app.Notification.DecoratedCustomViewStyle) real;
        }

        public android.app.Notification.DecoratedCustomViewStyle unwrap() {
            return getReal();
        }

        public DecoratedCustomViewStyle() {
            this(new android.app.Notification.DecoratedCustomViewStyle(), (__DcgwBridgeToken) null);
        }

    }
    public static final class DecoratedMediaCustomViewStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DecoratedMediaCustomViewStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.DecoratedMediaCustomViewStyle wrap(android.app.Notification.DecoratedMediaCustomViewStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.DecoratedMediaCustomViewStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.DecoratedMediaCustomViewStyle getReal() {
            return (android.app.Notification.DecoratedMediaCustomViewStyle) real;
        }

        public android.app.Notification.DecoratedMediaCustomViewStyle unwrap() {
            return getReal();
        }

        public DecoratedMediaCustomViewStyle() {
            this(new android.app.Notification.DecoratedMediaCustomViewStyle(), (__DcgwBridgeToken) null);
        }

    }
    public static final class Extender {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Extender(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Extender wrap(android.app.Notification.Extender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Extender(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.Extender getReal() {
            return (android.app.Notification.Extender) real;
        }

        public android.app.Notification.Extender unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.Extender) real).extend(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class InboxStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InboxStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.InboxStyle wrap(android.app.Notification.InboxStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.InboxStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.InboxStyle getReal() {
            return (android.app.Notification.InboxStyle) real;
        }

        public android.app.Notification.InboxStyle unwrap() {
            return getReal();
        }

        public InboxStyle() {
            this(new android.app.Notification.InboxStyle(), (__DcgwBridgeToken) null);
        }

        public InboxStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.InboxStyle(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.InboxStyle addLine(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.InboxStyle.wrap(((android.app.Notification.InboxStyle) real).addLine(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.InboxStyle setBigContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.InboxStyle.wrap(((android.app.Notification.InboxStyle) real).setBigContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.InboxStyle setSummaryText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.InboxStyle.wrap(((android.app.Notification.InboxStyle) real).setSummaryText(arg0));
        }

    }
    public static final class MediaStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.MediaStyle wrap(android.app.Notification.MediaStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.MediaStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.MediaStyle getReal() {
            return (android.app.Notification.MediaStyle) real;
        }

        public android.app.Notification.MediaStyle unwrap() {
            return getReal();
        }

        public MediaStyle() {
            this(new android.app.Notification.MediaStyle(), (__DcgwBridgeToken) null);
        }

        public MediaStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.MediaStyle(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MediaStyle setMediaSession(com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MediaStyle.wrap(((android.app.Notification.MediaStyle) real).setMediaSession(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MediaStyle setRemotePlaybackInfo(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.MediaStyle.wrap(((android.app.Notification.MediaStyle) real).setRemotePlaybackInfo(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MediaStyle setShowActionsInCompactView(int... arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MediaStyle.wrap(((android.app.Notification.MediaStyle) real).setShowActionsInCompactView(arg0));
        }

    }
    public static final class MessagingStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MessagingStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle wrap(android.app.Notification.MessagingStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.MessagingStyle getReal() {
            return (android.app.Notification.MessagingStyle) real;
        }

        public android.app.Notification.MessagingStyle unwrap() {
            return getReal();
        }

        public MessagingStyle(java.lang.CharSequence arg0) {
            this(new android.app.Notification.MessagingStyle(arg0), (__DcgwBridgeToken) null);
        }

        public MessagingStyle(com.micklab.dcg.wrapper.android.app.Person arg0) {
            this(new android.app.Notification.MessagingStyle(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addHistoricMessage(com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(((android.app.Notification.MessagingStyle) real).addHistoricMessage(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addMessage(com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(((android.app.Notification.MessagingStyle) real).addMessage(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence arg0, long arg1, com.micklab.dcg.wrapper.android.app.Person arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(((android.app.Notification.MessagingStyle) real).addMessage(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence arg0, long arg1, java.lang.CharSequence arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(((android.app.Notification.MessagingStyle) real).addMessage(arg0, arg1, arg2));
        }

        public java.lang.CharSequence getConversationTitle() {
            return ((android.app.Notification.MessagingStyle) real).getConversationTitle();
        }

        public com.micklab.dcg.wrapper.android.app.Person getUser() {
            return com.micklab.dcg.wrapper.android.app.Person.wrap(((android.app.Notification.MessagingStyle) real).getUser());
        }

        public java.lang.CharSequence getUserDisplayName() {
            return ((android.app.Notification.MessagingStyle) real).getUserDisplayName();
        }

        public boolean isGroupConversation() {
            return ((android.app.Notification.MessagingStyle) real).isGroupConversation();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle setConversationTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(((android.app.Notification.MessagingStyle) real).setConversationTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle setGroupConversation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(((android.app.Notification.MessagingStyle) real).setGroupConversation(arg0));
        }

        public static final int MAXIMUM_RETAINED_MESSAGES = android.app.Notification.MessagingStyle.MAXIMUM_RETAINED_MESSAGES;

        public static final class Message {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Message(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message wrap(android.app.Notification.MessagingStyle.Message real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message(real, (__DcgwBridgeToken) null);
            }

            public android.app.Notification.MessagingStyle.Message getReal() {
                return (android.app.Notification.MessagingStyle.Message) real;
            }

            public android.app.Notification.MessagingStyle.Message unwrap() {
                return getReal();
            }

            public Message(java.lang.CharSequence arg0, long arg1, java.lang.CharSequence arg2) {
                this(new android.app.Notification.MessagingStyle.Message(arg0, arg1, arg2), (__DcgwBridgeToken) null);
            }

            public Message(java.lang.CharSequence arg0, long arg1, com.micklab.dcg.wrapper.android.app.Person arg2) {
                this(new android.app.Notification.MessagingStyle.Message(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
            }

            public java.lang.String getDataMimeType() {
                return ((android.app.Notification.MessagingStyle.Message) real).getDataMimeType();
            }

            public com.micklab.dcg.wrapper.android.net.Uri getDataUri() {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.Notification.MessagingStyle.Message) real).getDataUri());
            }

            public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
                return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Notification.MessagingStyle.Message) real).getExtras());
            }

            public java.lang.CharSequence getSender() {
                return ((android.app.Notification.MessagingStyle.Message) real).getSender();
            }

            public com.micklab.dcg.wrapper.android.app.Person getSenderPerson() {
                return com.micklab.dcg.wrapper.android.app.Person.wrap(((android.app.Notification.MessagingStyle.Message) real).getSenderPerson());
            }

            public java.lang.CharSequence getText() {
                return ((android.app.Notification.MessagingStyle.Message) real).getText();
            }

            public long getTimestamp() {
                return ((android.app.Notification.MessagingStyle.Message) real).getTimestamp();
            }

            public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message setData(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
                return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message.wrap(((android.app.Notification.MessagingStyle.Message) real).setData(arg0, arg1 == null ? null : arg1.getReal()));
            }

        }
    }
    public static final class Style {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Style(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Style wrap(android.app.Notification.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Style(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.Style getReal() {
            return (android.app.Notification.Style) real;
        }

        public android.app.Notification.Style unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.app.Notification build() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(((android.app.Notification.Style) real).build());
        }

        public void setBuilder(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            ((android.app.Notification.Style) real).setBuilder(arg0 == null ? null : arg0.getReal());
        }


    }
    public static final class TvExtender {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TvExtender(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.TvExtender wrap(android.app.Notification.TvExtender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.TvExtender(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.TvExtender getReal() {
            return (android.app.Notification.TvExtender) real;
        }

        public android.app.Notification.TvExtender unwrap() {
            return getReal();
        }

        public TvExtender() {
            this(new android.app.Notification.TvExtender(), (__DcgwBridgeToken) null);
        }

        public TvExtender(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            this(new android.app.Notification.TvExtender(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.TvExtender) real).extend(arg0 == null ? null : arg0.getReal()));
        }

        public java.lang.String getChannelId() {
            return ((android.app.Notification.TvExtender) real).getChannelId();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getContentIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.TvExtender) real).getContentIntent());
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getDeleteIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.TvExtender) real).getDeleteIntent());
        }

        public boolean isAvailableOnTv() {
            return ((android.app.Notification.TvExtender) real).isAvailableOnTv();
        }

        public boolean isSuppressShowOverApps() {
            return ((android.app.Notification.TvExtender) real).isSuppressShowOverApps();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setChannelId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(((android.app.Notification.TvExtender) real).setChannelId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setContentIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(((android.app.Notification.TvExtender) real).setContentIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setDeleteIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(((android.app.Notification.TvExtender) real).setDeleteIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setSuppressShowOverApps(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(((android.app.Notification.TvExtender) real).setSuppressShowOverApps(arg0));
        }

    }
    public static final class WearableExtender {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WearableExtender(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.WearableExtender wrap(android.app.Notification.WearableExtender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.WearableExtender(real, (__DcgwBridgeToken) null);
        }

        public android.app.Notification.WearableExtender getReal() {
            return (android.app.Notification.WearableExtender) real;
        }

        public android.app.Notification.WearableExtender unwrap() {
            return getReal();
        }

        public WearableExtender() {
            this(new android.app.Notification.WearableExtender(), (__DcgwBridgeToken) null);
        }

        public WearableExtender(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            this(new android.app.Notification.WearableExtender(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender addAction(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).addAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender addPage(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).addPage(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender clearActions() {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).clearActions());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender clearPages() {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).clearPages());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender clone() {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).clone());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(((android.app.Notification.WearableExtender) real).extend(arg0 == null ? null : arg0.getReal()));
        }

        public java.lang.String getBridgeTag() {
            return ((android.app.Notification.WearableExtender) real).getBridgeTag();
        }

        public int getContentAction() {
            return ((android.app.Notification.WearableExtender) real).getContentAction();
        }

        public int getContentIcon() {
            return ((android.app.Notification.WearableExtender) real).getContentIcon();
        }

        public int getContentIconGravity() {
            return ((android.app.Notification.WearableExtender) real).getContentIconGravity();
        }

        public boolean getContentIntentAvailableOffline() {
            return ((android.app.Notification.WearableExtender) real).getContentIntentAvailableOffline();
        }

        public int getCustomContentHeight() {
            return ((android.app.Notification.WearableExtender) real).getCustomContentHeight();
        }

        public int getCustomSizePreset() {
            return ((android.app.Notification.WearableExtender) real).getCustomSizePreset();
        }

        public java.lang.String getDismissalId() {
            return ((android.app.Notification.WearableExtender) real).getDismissalId();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getDisplayIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Notification.WearableExtender) real).getDisplayIntent());
        }

        public int getGravity() {
            return ((android.app.Notification.WearableExtender) real).getGravity();
        }

        public boolean getHintAmbientBigPicture() {
            return ((android.app.Notification.WearableExtender) real).getHintAmbientBigPicture();
        }

        public boolean getHintAvoidBackgroundClipping() {
            return ((android.app.Notification.WearableExtender) real).getHintAvoidBackgroundClipping();
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return ((android.app.Notification.WearableExtender) real).getHintContentIntentLaunchesActivity();
        }

        public boolean getHintHideIcon() {
            return ((android.app.Notification.WearableExtender) real).getHintHideIcon();
        }

        public int getHintScreenTimeout() {
            return ((android.app.Notification.WearableExtender) real).getHintScreenTimeout();
        }

        public boolean getHintShowBackgroundOnly() {
            return ((android.app.Notification.WearableExtender) real).getHintShowBackgroundOnly();
        }

        public boolean getStartScrollBottom() {
            return ((android.app.Notification.WearableExtender) real).getStartScrollBottom();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setBridgeTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setBridgeTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentAction(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setContentAction(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setContentIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentIconGravity(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setContentIconGravity(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentIntentAvailableOffline(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setContentIntentAvailableOffline(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setCustomContentHeight(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setCustomContentHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setCustomSizePreset(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setCustomSizePreset(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setDismissalId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setDismissalId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setDisplayIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setDisplayIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setGravity(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setGravity(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintAmbientBigPicture(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setHintAmbientBigPicture(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintAvoidBackgroundClipping(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setHintAvoidBackgroundClipping(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintContentIntentLaunchesActivity(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setHintContentIntentLaunchesActivity(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintHideIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setHintHideIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintScreenTimeout(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setHintScreenTimeout(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintShowBackgroundOnly(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setHintShowBackgroundOnly(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setStartScrollBottom(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(((android.app.Notification.WearableExtender) real).setStartScrollBottom(arg0));
        }

        public static final int SCREEN_TIMEOUT_LONG = android.app.Notification.WearableExtender.SCREEN_TIMEOUT_LONG;
        public static final int SCREEN_TIMEOUT_SHORT = android.app.Notification.WearableExtender.SCREEN_TIMEOUT_SHORT;
        public static final int SIZE_DEFAULT = android.app.Notification.WearableExtender.SIZE_DEFAULT;
        public static final int SIZE_FULL_SCREEN = android.app.Notification.WearableExtender.SIZE_FULL_SCREEN;
        public static final int SIZE_LARGE = android.app.Notification.WearableExtender.SIZE_LARGE;
        public static final int SIZE_MEDIUM = android.app.Notification.WearableExtender.SIZE_MEDIUM;
        public static final int SIZE_SMALL = android.app.Notification.WearableExtender.SIZE_SMALL;
        public static final int SIZE_XSMALL = android.app.Notification.WearableExtender.SIZE_XSMALL;
        public static final int UNSET_ACTION_INDEX = android.app.Notification.WearableExtender.UNSET_ACTION_INDEX;

    }
}
