// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageEvents {
    private final android.app.usage.UsageEvents real;

    public UsageEvents(android.app.usage.UsageEvents real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageEvents wrap(android.app.usage.UsageEvents real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEvents(real);
    }

    public android.app.usage.UsageEvents unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean getNextEvent(com.micklab.dcg.wrapper.android.app.usage.UsageEvents.Event arg0) {
        return real.getNextEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasNextEvent() {
        return real.hasNextEvent();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Event {
        private final android.app.usage.UsageEvents.Event real;

        public Event(android.app.usage.UsageEvents.Event real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.UsageEvents.Event wrap(android.app.usage.UsageEvents.Event real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageEvents.Event(real);
        }

        public android.app.usage.UsageEvents.Event unwrap() {
            return real;
        }

        public Event() {
            this(new android.app.usage.UsageEvents.Event());
        }

        public int getAppStandbyBucket() {
            return real.getAppStandbyBucket();
        }

        public java.lang.String getClassName() {
            return real.getClassName();
        }

        public com.micklab.dcg.wrapper.android.content.res.Configuration getConfiguration() {
            return com.micklab.dcg.wrapper.android.content.res.Configuration.wrap(real.getConfiguration());
        }

        public int getEventType() {
            return real.getEventType();
        }

        public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getExtras());
        }

        public java.lang.String getPackageName() {
            return real.getPackageName();
        }

        public java.lang.String getShortcutId() {
            return real.getShortcutId();
        }

        public long getTimeStamp() {
            return real.getTimeStamp();
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
