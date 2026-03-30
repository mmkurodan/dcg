// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageEvents {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsageEvents(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageEvents wrap(android.app.usage.UsageEvents real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEvents(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.UsageEvents getReal() {
        return (android.app.usage.UsageEvents) real;
    }

    public android.app.usage.UsageEvents unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.usage.UsageEvents) real).describeContents();
    }

    public boolean getNextEvent(com.micklab.dcg.wrapper.android.app.usage.UsageEvents.Event arg0) {
        return ((android.app.usage.UsageEvents) real).getNextEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasNextEvent() {
        return ((android.app.usage.UsageEvents) real).hasNextEvent();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.UsageEvents) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Event {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Event(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.UsageEvents.Event wrap(android.app.usage.UsageEvents.Event real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEvents.Event(real, (__DcgwBridgeToken) null);
        }

        public android.app.usage.UsageEvents.Event getReal() {
            return (android.app.usage.UsageEvents.Event) real;
        }

        public android.app.usage.UsageEvents.Event unwrap() {
            return getReal();
        }

        public Event() {
            this(new android.app.usage.UsageEvents.Event(), (__DcgwBridgeToken) null);
        }

        public int getAppStandbyBucket() {
            return ((android.app.usage.UsageEvents.Event) real).getAppStandbyBucket();
        }

        public java.lang.String getClassName() {
            return ((android.app.usage.UsageEvents.Event) real).getClassName();
        }

        public com.micklab.dcg.wrapper.android.content.res.Configuration getConfiguration() {
            return com.micklab.dcg.wrapper.android.content.res.Configuration.wrap(((android.app.usage.UsageEvents.Event) real).getConfiguration());
        }

        public int getEventType() {
            return ((android.app.usage.UsageEvents.Event) real).getEventType();
        }

        public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.app.usage.UsageEvents.Event) real).getExtras());
        }

        public java.lang.String getPackageName() {
            return ((android.app.usage.UsageEvents.Event) real).getPackageName();
        }

        public java.lang.String getShortcutId() {
            return ((android.app.usage.UsageEvents.Event) real).getShortcutId();
        }

        public long getTimeStamp() {
            return ((android.app.usage.UsageEvents.Event) real).getTimeStamp();
        }

        public static final int ACTIVITY_PAUSED = android.app.usage.UsageEvents.Event.ACTIVITY_PAUSED;
        public static final int ACTIVITY_RESUMED = android.app.usage.UsageEvents.Event.ACTIVITY_RESUMED;
        public static final int ACTIVITY_STOPPED = android.app.usage.UsageEvents.Event.ACTIVITY_STOPPED;
        public static final int CONFIGURATION_CHANGE = android.app.usage.UsageEvents.Event.CONFIGURATION_CHANGE;
        public static final int DEVICE_SHUTDOWN = android.app.usage.UsageEvents.Event.DEVICE_SHUTDOWN;
        public static final int DEVICE_STARTUP = android.app.usage.UsageEvents.Event.DEVICE_STARTUP;
        public static final int FOREGROUND_SERVICE_START = android.app.usage.UsageEvents.Event.FOREGROUND_SERVICE_START;
        public static final int FOREGROUND_SERVICE_STOP = android.app.usage.UsageEvents.Event.FOREGROUND_SERVICE_STOP;
        public static final int KEYGUARD_HIDDEN = android.app.usage.UsageEvents.Event.KEYGUARD_HIDDEN;
        public static final int KEYGUARD_SHOWN = android.app.usage.UsageEvents.Event.KEYGUARD_SHOWN;
        public static final int MOVE_TO_BACKGROUND = android.app.usage.UsageEvents.Event.MOVE_TO_BACKGROUND;
        public static final int MOVE_TO_FOREGROUND = android.app.usage.UsageEvents.Event.MOVE_TO_FOREGROUND;
        public static final int NONE = android.app.usage.UsageEvents.Event.NONE;
        public static final int SCREEN_INTERACTIVE = android.app.usage.UsageEvents.Event.SCREEN_INTERACTIVE;
        public static final int SCREEN_NON_INTERACTIVE = android.app.usage.UsageEvents.Event.SCREEN_NON_INTERACTIVE;
        public static final int SHORTCUT_INVOCATION = android.app.usage.UsageEvents.Event.SHORTCUT_INVOCATION;
        public static final int STANDBY_BUCKET_CHANGED = android.app.usage.UsageEvents.Event.STANDBY_BUCKET_CHANGED;
        public static final int USER_INTERACTION = android.app.usage.UsageEvents.Event.USER_INTERACTION;

    }
}
