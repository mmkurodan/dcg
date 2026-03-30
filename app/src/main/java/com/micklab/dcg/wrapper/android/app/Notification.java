// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Notification {
    private final android.app.Notification real;

    public Notification(android.app.Notification real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Notification wrap(android.app.Notification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification(real);
    }

    public android.app.Notification unwrap() {
        return real;
    }

    public Notification() {
        this(new android.app.Notification());
    }

    public Notification(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.app.Notification(arg0 == null ? null : arg0.unwrap()));
    }

    public Notification(int arg0, java.lang.CharSequence arg1, long arg2) {
        this(new android.app.Notification(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.app.Notification clone() {
        return com.micklab.dcg.wrapper.android.app.Notification.wrap(real.clone());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean getAllowSystemGeneratedContextualActions() {
        return real.getAllowSystemGeneratedContextualActions();
    }

    public int getBadgeIconType() {
        return real.getBadgeIconType();
    }

    public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata getBubbleMetadata() {
        return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.wrap(real.getBubbleMetadata());
    }

    public java.lang.String getChannelId() {
        return real.getChannelId();
    }

    public java.lang.String getGroup() {
        return real.getGroup();
    }

    public int getGroupAlertBehavior() {
        return real.getGroupAlertBehavior();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getLargeIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getLargeIcon());
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(real.getLocusId());
    }

    public java.lang.CharSequence getSettingsText() {
        return real.getSettingsText();
    }

    public java.lang.String getShortcutId() {
        return real.getShortcutId();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getSmallIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getSmallIcon());
    }

    public java.lang.String getSortKey() {
        return real.getSortKey();
    }

    public long getTimeoutAfter() {
        return real.getTimeoutAfter();
    }

    public boolean hasImage() {
        return real.hasImage();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.app.Notification.Action real;

        public Action(android.app.Notification.Action real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Action wrap(android.app.Notification.Action real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action(real);
        }

        public android.app.Notification.Action unwrap() {
            return real;
        }

        public Action(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            this(new android.app.Notification.Action(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Action clone() {
            return com.micklab.dcg.wrapper.android.app.Notification.Action.wrap(real.clone());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean getAllowGeneratedReplies() {
            return real.getAllowGeneratedReplies();
        }

        public android.app.RemoteInput[] getDataOnlyRemoteInputs() {
            return real.getDataOnlyRemoteInputs();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
        }

        public android.app.RemoteInput[] getRemoteInputs() {
            return real.getRemoteInputs();
        }

        public int getSemanticAction() {
            return real.getSemanticAction();
        }

        public boolean isAuthenticationRequired() {
            return real.isAuthenticationRequired();
        }

        public boolean isContextual() {
            return real.isContextual();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
            private final android.app.Notification.Action.Builder real;

            public Builder(android.app.Notification.Action.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.Action.Builder wrap(android.app.Notification.Action.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action.Builder(real);
            }

            public android.app.Notification.Action.Builder unwrap() {
                return real;
            }

            public Builder(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
                this(new android.app.Notification.Action.Builder(arg0 == null ? null : arg0.unwrap()));
            }

            public Builder(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
                this(new android.app.Notification.Action.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
            }

            public Builder(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
                this(new android.app.Notification.Action.Builder(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder addExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.addExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder addRemoteInput(com.micklab.dcg.wrapper.android.app.RemoteInput arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.addRemoteInput(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action build() {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Action.Extender arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
                return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setAllowGeneratedReplies(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.setAllowGeneratedReplies(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setAuthenticationRequired(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.setAuthenticationRequired(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setContextual(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.setContextual(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder setSemanticAction(int arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.setSemanticAction(arg0));
            }

        }
        public static final class Extender {
            private final android.app.Notification.Action.Extender real;

            public Extender(android.app.Notification.Action.Extender real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.Action.Extender wrap(android.app.Notification.Action.Extender real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action.Extender(real);
            }

            public android.app.Notification.Action.Extender unwrap() {
                return real;
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Action.Builder arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
            }

        }
        public static final class WearableExtender {
            private final android.app.Notification.Action.WearableExtender real;

            public WearableExtender(android.app.Notification.Action.WearableExtender real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender wrap(android.app.Notification.Action.WearableExtender real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender(real);
            }

            public android.app.Notification.Action.WearableExtender unwrap() {
                return real;
            }

            public WearableExtender() {
                this(new android.app.Notification.Action.WearableExtender());
            }

            public WearableExtender(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
                this(new android.app.Notification.Action.WearableExtender(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender clone() {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.clone());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Action.Builder arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
            }

            public java.lang.CharSequence getCancelLabel() {
                return real.getCancelLabel();
            }

            public java.lang.CharSequence getConfirmLabel() {
                return real.getConfirmLabel();
            }

            public boolean getHintDisplayActionInline() {
                return real.getHintDisplayActionInline();
            }

            public boolean getHintLaunchesActivity() {
                return real.getHintLaunchesActivity();
            }

            public java.lang.CharSequence getInProgressLabel() {
                return real.getInProgressLabel();
            }

            public boolean isAvailableOffline() {
                return real.isAvailableOffline();
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setAvailableOffline(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.setAvailableOffline(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setCancelLabel(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.setCancelLabel(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setConfirmLabel(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.setConfirmLabel(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setHintDisplayActionInline(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.setHintDisplayActionInline(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setHintLaunchesActivity(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.setHintLaunchesActivity(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender setInProgressLabel(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.Action.WearableExtender.wrap(real.setInProgressLabel(arg0));
            }

        }
    }
    public static final class BigPictureStyle {
        private final android.app.Notification.BigPictureStyle real;

        public BigPictureStyle(android.app.Notification.BigPictureStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle wrap(android.app.Notification.BigPictureStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle(real);
        }

        public android.app.Notification.BigPictureStyle unwrap() {
            return real;
        }

        public BigPictureStyle() {
            this(new android.app.Notification.BigPictureStyle());
        }

        public BigPictureStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.BigPictureStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigLargeIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.bigLargeIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigLargeIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.bigLargeIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigPicture(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.bigPicture(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle bigPicture(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.bigPicture(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle setBigContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.setBigContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle setContentDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.setContentDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle setSummaryText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.setSummaryText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle showBigPictureWhenCollapsed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigPictureStyle.wrap(real.showBigPictureWhenCollapsed(arg0));
        }

    }
    public static final class BigTextStyle {
        private final android.app.Notification.BigTextStyle real;

        public BigTextStyle(android.app.Notification.BigTextStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle wrap(android.app.Notification.BigTextStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle(real);
        }

        public android.app.Notification.BigTextStyle unwrap() {
            return real;
        }

        public BigTextStyle() {
            this(new android.app.Notification.BigTextStyle());
        }

        public BigTextStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.BigTextStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle bigText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle.wrap(real.bigText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle setBigContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle.wrap(real.setBigContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle setSummaryText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.BigTextStyle.wrap(real.setSummaryText(arg0));
        }

    }
    public static final class BubbleMetadata {
        private final android.app.Notification.BubbleMetadata real;

        public BubbleMetadata(android.app.Notification.BubbleMetadata real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata wrap(android.app.Notification.BubbleMetadata real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata(real);
        }

        public android.app.Notification.BubbleMetadata unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean getAutoExpandBubble() {
            return real.getAutoExpandBubble();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getDeleteIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getDeleteIntent());
        }

        public int getDesiredHeight() {
            return real.getDesiredHeight();
        }

        public int getDesiredHeightResId() {
            return real.getDesiredHeightResId();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getIntent());
        }

        public java.lang.String getShortcutId() {
            return real.getShortcutId();
        }

        public boolean isBubbleSuppressable() {
            return real.isBubbleSuppressable();
        }

        public boolean isBubbleSuppressed() {
            return real.isBubbleSuppressed();
        }

        public boolean isNotificationSuppressed() {
            return real.isNotificationSuppressed();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.app.Notification.BubbleMetadata.Builder real;

            public Builder(android.app.Notification.BubbleMetadata.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder wrap(android.app.Notification.BubbleMetadata.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder(real);
            }

            public android.app.Notification.BubbleMetadata.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.app.Notification.BubbleMetadata.Builder());
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.Notification.BubbleMetadata.Builder(arg0));
            }

            public Builder(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg1) {
                this(new android.app.Notification.BubbleMetadata.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata build() {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setAutoExpandBubble(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setAutoExpandBubble(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setDeleteIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setDeleteIntent(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setDesiredHeight(int arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setDesiredHeight(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setDesiredHeightResId(int arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setDesiredHeightResId(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setIntent(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setSuppressNotification(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setSuppressNotification(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder setSuppressableBubble(boolean arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata.Builder.wrap(real.setSuppressableBubble(arg0));
            }

        }
    }
    public static final class Builder {
        private final android.app.Notification.Builder real;

        public Builder(android.app.Notification.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Builder wrap(android.app.Notification.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Builder(real);
        }

        public android.app.Notification.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.app.Notification.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
            this(new android.app.Notification.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addAction(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.addAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addAction(int arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.addAction(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.addExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addPerson(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.addPerson(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder addPerson(com.micklab.dcg.wrapper.android.app.Person arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.addPerson(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification build() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews createBigContentView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.createBigContentView());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews createContentView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.createContentView());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews createHeadsUpContentView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.createHeadsUpContentView());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Extender arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public com.micklab.dcg.wrapper.android.app.Notification getNotification() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(real.getNotification());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Style getStyle() {
            return com.micklab.dcg.wrapper.android.app.Notification.Style.wrap(real.getStyle());
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Builder recoverBuilder(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(android.app.Notification.Builder.recoverBuilder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setActions(android.app.Notification.Action... arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setActions(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setAllowSystemGeneratedContextualActions(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setAllowSystemGeneratedContextualActions(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setAutoCancel(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setAutoCancel(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setBadgeIconType(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setBadgeIconType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setBubbleMetadata(com.micklab.dcg.wrapper.android.app.Notification.BubbleMetadata arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setBubbleMetadata(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCategory(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setCategory(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setChannelId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setChannelId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setChronometerCountDown(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setChronometerCountDown(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setColor(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setColorized(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setColorized(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContent(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setContent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentInfo(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setContentInfo(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setContentIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setContentText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCustomBigContentView(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setCustomBigContentView(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCustomContentView(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setCustomContentView(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setCustomHeadsUpContentView(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setCustomHeadsUpContentView(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setDefaults(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setDefaults(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setDeleteIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setDeleteIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setFlag(int arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setFlag(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setForegroundServiceBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setForegroundServiceBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setFullScreenIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setFullScreenIntent(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setGroup(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setGroup(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setGroupAlertBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setGroupAlertBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setGroupSummary(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setGroupSummary(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLargeIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setLargeIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLargeIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setLargeIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLights(int arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setLights(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLocalOnly(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setLocalOnly(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setLocusId(com.micklab.dcg.wrapper.android.content.LocusId arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setLocusId(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setNumber(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setOngoing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setOngoing(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setOnlyAlertOnce(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setOnlyAlertOnce(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setPriority(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setPriority(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setProgress(int arg0, int arg1, boolean arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setProgress(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setPublicVersion(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setPublicVersion(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setRemoteInputHistory(java.lang.CharSequence[] arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setRemoteInputHistory(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSettingsText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSettingsText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setShortcutId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setShortcutId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setShowWhen(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setShowWhen(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSmallIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSmallIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSmallIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSmallIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSmallIcon(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSmallIcon(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSortKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSortKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSound(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSound(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSound(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSound(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSound(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSound(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setStyle(com.micklab.dcg.wrapper.android.app.Notification.Style arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setSubText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setSubText(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setTicker(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setTicker(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setTicker(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setTicker(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setTimeoutAfter(long arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setTimeoutAfter(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setUsesChronometer(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setUsesChronometer(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setVibrate(long[] arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setVibrate(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setVisibility(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setVisibility(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder setWhen(long arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.setWhen(arg0));
        }

    }
    public static final class CallStyle {
        private final android.app.Notification.CallStyle real;

        public CallStyle(android.app.Notification.CallStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle wrap(android.app.Notification.CallStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CallStyle(real);
        }

        public android.app.Notification.CallStyle unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle forIncomingCall(com.micklab.dcg.wrapper.android.app.Person arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(android.app.Notification.CallStyle.forIncomingCall(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle forOngoingCall(com.micklab.dcg.wrapper.android.app.Person arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(android.app.Notification.CallStyle.forOngoingCall(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CallStyle forScreeningCall(com.micklab.dcg.wrapper.android.app.Person arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(android.app.Notification.CallStyle.forScreeningCall(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setAnswerButtonColorHint(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(real.setAnswerButtonColorHint(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setDeclineButtonColorHint(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(real.setDeclineButtonColorHint(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setIsVideo(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(real.setIsVideo(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setVerificationIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(real.setVerificationIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CallStyle setVerificationText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CallStyle.wrap(real.setVerificationText(arg0));
        }

        public static final int CALL_TYPE_INCOMING = android.app.Notification.CallStyle.CALL_TYPE_INCOMING;
        public static final int CALL_TYPE_ONGOING = android.app.Notification.CallStyle.CALL_TYPE_ONGOING;
        public static final int CALL_TYPE_SCREENING = android.app.Notification.CallStyle.CALL_TYPE_SCREENING;
        public static final int CALL_TYPE_UNKNOWN = android.app.Notification.CallStyle.CALL_TYPE_UNKNOWN;

    }
    public static final class CarExtender {
        private final android.app.Notification.CarExtender real;

        public CarExtender(android.app.Notification.CarExtender real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.CarExtender wrap(android.app.Notification.CarExtender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CarExtender(real);
        }

        public android.app.Notification.CarExtender unwrap() {
            return real;
        }

        public CarExtender() {
            this(new android.app.Notification.CarExtender());
        }

        public CarExtender(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            this(new android.app.Notification.CarExtender(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
        }

        public int getColor() {
            return real.getColor();
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getLargeIcon() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getLargeIcon());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation getUnreadConversation() {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation.wrap(real.getUnreadConversation());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender setColor(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.wrap(real.setColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender setLargeIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.wrap(real.setLargeIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.CarExtender setUnreadConversation(com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.wrap(real.setUnreadConversation(arg0 == null ? null : arg0.unwrap()));
        }

        public static final class Builder {
            private final android.app.Notification.CarExtender.Builder real;

            public Builder(android.app.Notification.CarExtender.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder wrap(android.app.Notification.CarExtender.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder(real);
            }

            public android.app.Notification.CarExtender.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.Notification.CarExtender.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder addMessage(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(real.addMessage(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation build() {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder setLatestTimestamp(long arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(real.setLatestTimestamp(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder setReadPendingIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(real.setReadPendingIntent(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder setReplyAction(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.app.RemoteInput arg1) {
                return com.micklab.dcg.wrapper.android.app.Notification.CarExtender.Builder.wrap(real.setReplyAction(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
            }

        }
        public static final class UnreadConversation {
            private final android.app.Notification.CarExtender.UnreadConversation real;

            public UnreadConversation(android.app.Notification.CarExtender.UnreadConversation real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation wrap(android.app.Notification.CarExtender.UnreadConversation real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.CarExtender.UnreadConversation(real);
            }

            public android.app.Notification.CarExtender.UnreadConversation unwrap() {
                return real;
            }

            public long getLatestTimestamp() {
                return real.getLatestTimestamp();
            }

            public java.lang.String[] getMessages() {
                return real.getMessages();
            }

            public java.lang.String getParticipant() {
                return real.getParticipant();
            }

            public java.lang.String[] getParticipants() {
                return real.getParticipants();
            }

            public com.micklab.dcg.wrapper.android.app.PendingIntent getReadPendingIntent() {
                return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getReadPendingIntent());
            }

            public com.micklab.dcg.wrapper.android.app.RemoteInput getRemoteInput() {
                return com.micklab.dcg.wrapper.android.app.RemoteInput.wrap(real.getRemoteInput());
            }

            public com.micklab.dcg.wrapper.android.app.PendingIntent getReplyPendingIntent() {
                return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getReplyPendingIntent());
            }

        }
    }
    public static final class DecoratedCustomViewStyle {
        private final android.app.Notification.DecoratedCustomViewStyle real;

        public DecoratedCustomViewStyle(android.app.Notification.DecoratedCustomViewStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.DecoratedCustomViewStyle wrap(android.app.Notification.DecoratedCustomViewStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.DecoratedCustomViewStyle(real);
        }

        public android.app.Notification.DecoratedCustomViewStyle unwrap() {
            return real;
        }

        public DecoratedCustomViewStyle() {
            this(new android.app.Notification.DecoratedCustomViewStyle());
        }

    }
    public static final class DecoratedMediaCustomViewStyle {
        private final android.app.Notification.DecoratedMediaCustomViewStyle real;

        public DecoratedMediaCustomViewStyle(android.app.Notification.DecoratedMediaCustomViewStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.DecoratedMediaCustomViewStyle wrap(android.app.Notification.DecoratedMediaCustomViewStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.DecoratedMediaCustomViewStyle(real);
        }

        public android.app.Notification.DecoratedMediaCustomViewStyle unwrap() {
            return real;
        }

        public DecoratedMediaCustomViewStyle() {
            this(new android.app.Notification.DecoratedMediaCustomViewStyle());
        }

    }
    public static final class Extender {
        private final android.app.Notification.Extender real;

        public Extender(android.app.Notification.Extender real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Extender wrap(android.app.Notification.Extender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Extender(real);
        }

        public android.app.Notification.Extender unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class InboxStyle {
        private final android.app.Notification.InboxStyle real;

        public InboxStyle(android.app.Notification.InboxStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.InboxStyle wrap(android.app.Notification.InboxStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.InboxStyle(real);
        }

        public android.app.Notification.InboxStyle unwrap() {
            return real;
        }

        public InboxStyle() {
            this(new android.app.Notification.InboxStyle());
        }

        public InboxStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.InboxStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.InboxStyle addLine(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.InboxStyle.wrap(real.addLine(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.InboxStyle setBigContentTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.InboxStyle.wrap(real.setBigContentTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.InboxStyle setSummaryText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.InboxStyle.wrap(real.setSummaryText(arg0));
        }

    }
    public static final class MediaStyle {
        private final android.app.Notification.MediaStyle real;

        public MediaStyle(android.app.Notification.MediaStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.MediaStyle wrap(android.app.Notification.MediaStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.MediaStyle(real);
        }

        public android.app.Notification.MediaStyle unwrap() {
            return real;
        }

        public MediaStyle() {
            this(new android.app.Notification.MediaStyle());
        }

        public MediaStyle(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            this(new android.app.Notification.MediaStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MediaStyle setMediaSession(com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MediaStyle.wrap(real.setMediaSession(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MediaStyle setRemotePlaybackInfo(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.MediaStyle.wrap(real.setRemotePlaybackInfo(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MediaStyle setShowActionsInCompactView(int... arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MediaStyle.wrap(real.setShowActionsInCompactView(arg0));
        }

    }
    public static final class MessagingStyle {
        private final android.app.Notification.MessagingStyle real;

        public MessagingStyle(android.app.Notification.MessagingStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle wrap(android.app.Notification.MessagingStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle(real);
        }

        public android.app.Notification.MessagingStyle unwrap() {
            return real;
        }

        public MessagingStyle(java.lang.CharSequence arg0) {
            this(new android.app.Notification.MessagingStyle(arg0));
        }

        public MessagingStyle(com.micklab.dcg.wrapper.android.app.Person arg0) {
            this(new android.app.Notification.MessagingStyle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addHistoricMessage(com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(real.addHistoricMessage(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addMessage(com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(real.addMessage(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence arg0, long arg1, com.micklab.dcg.wrapper.android.app.Person arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(real.addMessage(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle addMessage(java.lang.CharSequence arg0, long arg1, java.lang.CharSequence arg2) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(real.addMessage(arg0, arg1, arg2));
        }

        public java.lang.CharSequence getConversationTitle() {
            return real.getConversationTitle();
        }

        public com.micklab.dcg.wrapper.android.app.Person getUser() {
            return com.micklab.dcg.wrapper.android.app.Person.wrap(real.getUser());
        }

        public java.lang.CharSequence getUserDisplayName() {
            return real.getUserDisplayName();
        }

        public boolean isGroupConversation() {
            return real.isGroupConversation();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle setConversationTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(real.setConversationTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle setGroupConversation(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.wrap(real.setGroupConversation(arg0));
        }

        public static final int MAXIMUM_RETAINED_MESSAGES = android.app.Notification.MessagingStyle.MAXIMUM_RETAINED_MESSAGES;

        public static final class Message {
            private final android.app.Notification.MessagingStyle.Message real;

            public Message(android.app.Notification.MessagingStyle.Message real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message wrap(android.app.Notification.MessagingStyle.Message real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message(real);
            }

            public android.app.Notification.MessagingStyle.Message unwrap() {
                return real;
            }

            public Message(java.lang.CharSequence arg0, long arg1, java.lang.CharSequence arg2) {
                this(new android.app.Notification.MessagingStyle.Message(arg0, arg1, arg2));
            }

            public Message(java.lang.CharSequence arg0, long arg1, com.micklab.dcg.wrapper.android.app.Person arg2) {
                this(new android.app.Notification.MessagingStyle.Message(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
            }

            public java.lang.String getDataMimeType() {
                return real.getDataMimeType();
            }

            public com.micklab.dcg.wrapper.android.net.Uri getDataUri() {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getDataUri());
            }

            public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
                return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
            }

            public java.lang.CharSequence getSender() {
                return real.getSender();
            }

            public com.micklab.dcg.wrapper.android.app.Person getSenderPerson() {
                return com.micklab.dcg.wrapper.android.app.Person.wrap(real.getSenderPerson());
            }

            public java.lang.CharSequence getText() {
                return real.getText();
            }

            public long getTimestamp() {
                return real.getTimestamp();
            }

            public com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message setData(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
                return com.micklab.dcg.wrapper.android.app.Notification.MessagingStyle.Message.wrap(real.setData(arg0, arg1 == null ? null : arg1.unwrap()));
            }

        }
    }
    public static final class Style {
        private final android.app.Notification.Style real;

        public Style(android.app.Notification.Style real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.Style wrap(android.app.Notification.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.Style(real);
        }

        public android.app.Notification.Style unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.app.Notification build() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(real.build());
        }

        public void setBuilder(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            real.setBuilder(arg0 == null ? null : arg0.unwrap());
        }


    }
    public static final class TvExtender {
        private final android.app.Notification.TvExtender real;

        public TvExtender(android.app.Notification.TvExtender real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.TvExtender wrap(android.app.Notification.TvExtender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.TvExtender(real);
        }

        public android.app.Notification.TvExtender unwrap() {
            return real;
        }

        public TvExtender() {
            this(new android.app.Notification.TvExtender());
        }

        public TvExtender(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            this(new android.app.Notification.TvExtender(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
        }

        public java.lang.String getChannelId() {
            return real.getChannelId();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getContentIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getContentIntent());
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getDeleteIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getDeleteIntent());
        }

        public boolean isAvailableOnTv() {
            return real.isAvailableOnTv();
        }

        public boolean isSuppressShowOverApps() {
            return real.isSuppressShowOverApps();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setChannelId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(real.setChannelId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setContentIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(real.setContentIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setDeleteIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(real.setDeleteIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.TvExtender setSuppressShowOverApps(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.TvExtender.wrap(real.setSuppressShowOverApps(arg0));
        }

    }
    public static final class WearableExtender {
        private final android.app.Notification.WearableExtender real;

        public WearableExtender(android.app.Notification.WearableExtender real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Notification.WearableExtender wrap(android.app.Notification.WearableExtender real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Notification.WearableExtender(real);
        }

        public android.app.Notification.WearableExtender unwrap() {
            return real;
        }

        public WearableExtender() {
            this(new android.app.Notification.WearableExtender());
        }

        public WearableExtender(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            this(new android.app.Notification.WearableExtender(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender addAction(com.micklab.dcg.wrapper.android.app.Notification.Action arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.addAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender addPage(com.micklab.dcg.wrapper.android.app.Notification arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.addPage(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender clearActions() {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.clearActions());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender clearPages() {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.clearPages());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender clone() {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.clone());
        }

        public com.micklab.dcg.wrapper.android.app.Notification.Builder extend(com.micklab.dcg.wrapper.android.app.Notification.Builder arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.Builder.wrap(real.extend(arg0 == null ? null : arg0.unwrap()));
        }

        public java.lang.String getBridgeTag() {
            return real.getBridgeTag();
        }

        public int getContentAction() {
            return real.getContentAction();
        }

        public int getContentIcon() {
            return real.getContentIcon();
        }

        public int getContentIconGravity() {
            return real.getContentIconGravity();
        }

        public boolean getContentIntentAvailableOffline() {
            return real.getContentIntentAvailableOffline();
        }

        public int getCustomContentHeight() {
            return real.getCustomContentHeight();
        }

        public int getCustomSizePreset() {
            return real.getCustomSizePreset();
        }

        public java.lang.String getDismissalId() {
            return real.getDismissalId();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getDisplayIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getDisplayIntent());
        }

        public int getGravity() {
            return real.getGravity();
        }

        public boolean getHintAmbientBigPicture() {
            return real.getHintAmbientBigPicture();
        }

        public boolean getHintAvoidBackgroundClipping() {
            return real.getHintAvoidBackgroundClipping();
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return real.getHintContentIntentLaunchesActivity();
        }

        public boolean getHintHideIcon() {
            return real.getHintHideIcon();
        }

        public int getHintScreenTimeout() {
            return real.getHintScreenTimeout();
        }

        public boolean getHintShowBackgroundOnly() {
            return real.getHintShowBackgroundOnly();
        }

        public boolean getStartScrollBottom() {
            return real.getStartScrollBottom();
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setBridgeTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setBridgeTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentAction(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setContentAction(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentIcon(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setContentIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentIconGravity(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setContentIconGravity(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setContentIntentAvailableOffline(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setContentIntentAvailableOffline(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setCustomContentHeight(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setCustomContentHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setCustomSizePreset(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setCustomSizePreset(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setDismissalId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setDismissalId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setDisplayIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setDisplayIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setGravity(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setGravity(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintAmbientBigPicture(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setHintAmbientBigPicture(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintAvoidBackgroundClipping(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setHintAvoidBackgroundClipping(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintContentIntentLaunchesActivity(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setHintContentIntentLaunchesActivity(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintHideIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setHintHideIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintScreenTimeout(int arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setHintScreenTimeout(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setHintShowBackgroundOnly(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setHintShowBackgroundOnly(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.Notification.WearableExtender setStartScrollBottom(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.Notification.WearableExtender.wrap(real.setStartScrollBottom(arg0));
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
