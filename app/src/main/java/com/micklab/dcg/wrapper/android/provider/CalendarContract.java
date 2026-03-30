// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class CalendarContract {
    private final android.provider.CalendarContract real;

    public CalendarContract(android.provider.CalendarContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.CalendarContract wrap(android.provider.CalendarContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract(real);
    }

    public android.provider.CalendarContract unwrap() {
        return real;
    }

    public static boolean startViewCalendarEventInManagedProfile(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1, long arg2, long arg3, boolean arg4, int arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.CalendarContract#startViewCalendarEventInManagedProfile(android.content.Context,long,long,long,boolean,int)");
    }

    public static final java.lang.String ACCOUNT_TYPE_LOCAL = android.provider.CalendarContract.ACCOUNT_TYPE_LOCAL;
    public static final java.lang.String ACTION_EVENT_REMINDER = android.provider.CalendarContract.ACTION_EVENT_REMINDER;
    public static final java.lang.String ACTION_HANDLE_CUSTOM_EVENT = android.provider.CalendarContract.ACTION_HANDLE_CUSTOM_EVENT;
    public static final java.lang.String AUTHORITY = android.provider.CalendarContract.AUTHORITY;
    public static final java.lang.String CALLER_IS_SYNCADAPTER = android.provider.CalendarContract.CALLER_IS_SYNCADAPTER;
    public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CONTENT_URI);
    public static final java.lang.String EXTRA_CUSTOM_APP_URI = android.provider.CalendarContract.EXTRA_CUSTOM_APP_URI;
    public static final java.lang.String EXTRA_EVENT_ALL_DAY = android.provider.CalendarContract.EXTRA_EVENT_ALL_DAY;
    public static final java.lang.String EXTRA_EVENT_BEGIN_TIME = android.provider.CalendarContract.EXTRA_EVENT_BEGIN_TIME;
    public static final java.lang.String EXTRA_EVENT_END_TIME = android.provider.CalendarContract.EXTRA_EVENT_END_TIME;
    public static final java.lang.String EXTRA_EVENT_ID = android.provider.CalendarContract.EXTRA_EVENT_ID;

    public static final class Attendees {
        private final android.provider.CalendarContract.Attendees real;

        public Attendees(android.provider.CalendarContract.Attendees real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Attendees wrap(android.provider.CalendarContract.Attendees real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Attendees(real);
        }

        public android.provider.CalendarContract.Attendees unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, java.lang.String[] arg2) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Attendees.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Attendees.CONTENT_URI);

    }
    public static final class CalendarAlerts {
        private final android.provider.CalendarContract.CalendarAlerts real;

        public CalendarAlerts(android.provider.CalendarContract.CalendarAlerts real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarAlerts wrap(android.provider.CalendarContract.CalendarAlerts real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarAlerts(real);
        }

        public android.provider.CalendarContract.CalendarAlerts unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarAlerts.CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI_BY_INSTANCE = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarAlerts.CONTENT_URI_BY_INSTANCE);

    }
    public static final class CalendarCache {
        private final android.provider.CalendarContract.CalendarCache real;

        public CalendarCache(android.provider.CalendarContract.CalendarCache real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarCache wrap(android.provider.CalendarContract.CalendarCache real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarCache(real);
        }

        public android.provider.CalendarContract.CalendarCache unwrap() {
            return real;
        }

        public static final java.lang.String KEY_TIMEZONE_INSTANCES = android.provider.CalendarContract.CalendarCache.KEY_TIMEZONE_INSTANCES;
        public static final java.lang.String KEY_TIMEZONE_INSTANCES_PREVIOUS = android.provider.CalendarContract.CalendarCache.KEY_TIMEZONE_INSTANCES_PREVIOUS;
        public static final java.lang.String KEY_TIMEZONE_TYPE = android.provider.CalendarContract.CalendarCache.KEY_TIMEZONE_TYPE;
        public static final java.lang.String TIMEZONE_TYPE_AUTO = android.provider.CalendarContract.CalendarCache.TIMEZONE_TYPE_AUTO;
        public static final java.lang.String TIMEZONE_TYPE_HOME = android.provider.CalendarContract.CalendarCache.TIMEZONE_TYPE_HOME;
        public static final com.micklab.dcg.wrapper.android.net.Uri URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarCache.URI);

    }
    public static final class CalendarEntity {
        private final android.provider.CalendarContract.CalendarEntity real;

        public CalendarEntity(android.provider.CalendarContract.CalendarEntity real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarEntity wrap(android.provider.CalendarContract.CalendarEntity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarEntity(real);
        }

        public android.provider.CalendarContract.CalendarEntity unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.CalendarContract.CalendarEntity.newEntityIterator(arg0 == null ? null : arg0.unwrap()));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarEntity.CONTENT_URI);

    }
    public static final class Calendars {
        private final android.provider.CalendarContract.Calendars real;

        public Calendars(android.provider.CalendarContract.Calendars real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Calendars wrap(android.provider.CalendarContract.Calendars real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Calendars(real);
        }

        public android.provider.CalendarContract.Calendars unwrap() {
            return real;
        }

        public static final java.lang.String CALENDAR_LOCATION = android.provider.CalendarContract.Calendars.CALENDAR_LOCATION;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Calendars.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.CalendarContract.Calendars.DEFAULT_SORT_ORDER;
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Calendars.ENTERPRISE_CONTENT_URI);
        public static final java.lang.String NAME = android.provider.CalendarContract.Calendars.NAME;

    }
    public static final class Colors {
        private final android.provider.CalendarContract.Colors real;

        public Colors(android.provider.CalendarContract.Colors real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Colors wrap(android.provider.CalendarContract.Colors real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Colors(real);
        }

        public android.provider.CalendarContract.Colors unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Colors.CONTENT_URI);

    }
    public static final class EventDays {
        private final android.provider.CalendarContract.EventDays real;

        public EventDays(android.provider.CalendarContract.EventDays real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.EventDays wrap(android.provider.CalendarContract.EventDays real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.EventDays(real);
        }

        public android.provider.CalendarContract.EventDays unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, int arg1, int arg2, java.lang.String[] arg3) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.EventDays.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.EventDays.CONTENT_URI);

    }
    public static final class Events {
        private final android.provider.CalendarContract.Events real;

        public Events(android.provider.CalendarContract.Events real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Events wrap(android.provider.CalendarContract.Events real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Events(real);
        }

        public android.provider.CalendarContract.Events unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_EXCEPTION_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Events.CONTENT_EXCEPTION_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Events.CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Events.ENTERPRISE_CONTENT_URI);

    }
    public static final class EventsEntity {
        private final android.provider.CalendarContract.EventsEntity real;

        public EventsEntity(android.provider.CalendarContract.EventsEntity real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.EventsEntity wrap(android.provider.CalendarContract.EventsEntity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.EventsEntity(real);
        }

        public android.provider.CalendarContract.EventsEntity unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0, com.micklab.dcg.wrapper.android.content.ContentResolver arg1) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.CalendarContract.EventsEntity.newEntityIterator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0, com.micklab.dcg.wrapper.android.content.ContentProviderClient arg1) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.CalendarContract.EventsEntity.newEntityIterator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.EventsEntity.CONTENT_URI);

    }
    public static final class ExtendedProperties {
        private final android.provider.CalendarContract.ExtendedProperties real;

        public ExtendedProperties(android.provider.CalendarContract.ExtendedProperties real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.ExtendedProperties wrap(android.provider.CalendarContract.ExtendedProperties real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.ExtendedProperties(real);
        }

        public android.provider.CalendarContract.ExtendedProperties unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.ExtendedProperties.CONTENT_URI);

    }
    public static final class Instances {
        private final android.provider.CalendarContract.Instances real;

        public Instances(android.provider.CalendarContract.Instances real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Instances wrap(android.provider.CalendarContract.Instances real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Instances(real);
        }

        public android.provider.CalendarContract.Instances unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String[] arg1, long arg2, long arg3) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Instances.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String[] arg1, long arg2, long arg3, java.lang.String arg4) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Instances.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
        }

        public static final java.lang.String BEGIN = android.provider.CalendarContract.Instances.BEGIN;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_BY_DAY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.CONTENT_BY_DAY_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_SEARCH_BY_DAY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.CONTENT_SEARCH_BY_DAY_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_SEARCH_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.CONTENT_SEARCH_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.CONTENT_URI);
        public static final java.lang.String END = android.provider.CalendarContract.Instances.END;
        public static final java.lang.String END_DAY = android.provider.CalendarContract.Instances.END_DAY;
        public static final java.lang.String END_MINUTE = android.provider.CalendarContract.Instances.END_MINUTE;
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_BY_DAY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.ENTERPRISE_CONTENT_BY_DAY_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_SEARCH_BY_DAY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.ENTERPRISE_CONTENT_SEARCH_BY_DAY_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_SEARCH_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.ENTERPRISE_CONTENT_SEARCH_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Instances.ENTERPRISE_CONTENT_URI);
        public static final java.lang.String EVENT_ID = android.provider.CalendarContract.Instances.EVENT_ID;
        public static final java.lang.String START_DAY = android.provider.CalendarContract.Instances.START_DAY;
        public static final java.lang.String START_MINUTE = android.provider.CalendarContract.Instances.START_MINUTE;

    }
    public static final class Reminders {
        private final android.provider.CalendarContract.Reminders real;

        public Reminders(android.provider.CalendarContract.Reminders real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Reminders wrap(android.provider.CalendarContract.Reminders real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Reminders(real);
        }

        public android.provider.CalendarContract.Reminders unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, java.lang.String[] arg2) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Reminders.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Reminders.CONTENT_URI);

    }
    public static final class SyncState {
        private final android.provider.CalendarContract.SyncState real;

        public SyncState(android.provider.CalendarContract.SyncState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.SyncState wrap(android.provider.CalendarContract.SyncState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.SyncState(real);
        }

        public android.provider.CalendarContract.SyncState unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.SyncState.CONTENT_URI);

    }
}
