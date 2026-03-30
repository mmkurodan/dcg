// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class CalendarContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CalendarContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.CalendarContract wrap(android.provider.CalendarContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract(real, (__DcgwBridgeToken) null);
    }

    public android.provider.CalendarContract getReal() {
        return (android.provider.CalendarContract) real;
    }

    public android.provider.CalendarContract unwrap() {
        return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Attendees(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Attendees wrap(android.provider.CalendarContract.Attendees real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Attendees(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.Attendees getReal() {
            return (android.provider.CalendarContract.Attendees) real;
        }

        public android.provider.CalendarContract.Attendees unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, java.lang.String[] arg2) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Attendees.query(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Attendees.CONTENT_URI);

    }
    public static final class CalendarAlerts {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CalendarAlerts(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarAlerts wrap(android.provider.CalendarContract.CalendarAlerts real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarAlerts(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.CalendarAlerts getReal() {
            return (android.provider.CalendarContract.CalendarAlerts) real;
        }

        public android.provider.CalendarContract.CalendarAlerts unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarAlerts.CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI_BY_INSTANCE = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarAlerts.CONTENT_URI_BY_INSTANCE);

    }
    public static final class CalendarCache {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CalendarCache(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarCache wrap(android.provider.CalendarContract.CalendarCache real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarCache(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.CalendarCache getReal() {
            return (android.provider.CalendarContract.CalendarCache) real;
        }

        public android.provider.CalendarContract.CalendarCache unwrap() {
            return getReal();
        }

        public static final java.lang.String KEY_TIMEZONE_INSTANCES = android.provider.CalendarContract.CalendarCache.KEY_TIMEZONE_INSTANCES;
        public static final java.lang.String KEY_TIMEZONE_INSTANCES_PREVIOUS = android.provider.CalendarContract.CalendarCache.KEY_TIMEZONE_INSTANCES_PREVIOUS;
        public static final java.lang.String KEY_TIMEZONE_TYPE = android.provider.CalendarContract.CalendarCache.KEY_TIMEZONE_TYPE;
        public static final java.lang.String TIMEZONE_TYPE_AUTO = android.provider.CalendarContract.CalendarCache.TIMEZONE_TYPE_AUTO;
        public static final java.lang.String TIMEZONE_TYPE_HOME = android.provider.CalendarContract.CalendarCache.TIMEZONE_TYPE_HOME;
        public static final com.micklab.dcg.wrapper.android.net.Uri URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarCache.URI);

    }
    public static final class CalendarEntity {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CalendarEntity(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarEntity wrap(android.provider.CalendarContract.CalendarEntity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.CalendarEntity(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.CalendarEntity getReal() {
            return (android.provider.CalendarContract.CalendarEntity) real;
        }

        public android.provider.CalendarContract.CalendarEntity unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.CalendarContract.CalendarEntity.newEntityIterator(arg0 == null ? null : arg0.getReal()));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.CalendarEntity.CONTENT_URI);

    }
    public static final class Calendars {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Calendars(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Calendars wrap(android.provider.CalendarContract.Calendars real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Calendars(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.Calendars getReal() {
            return (android.provider.CalendarContract.Calendars) real;
        }

        public android.provider.CalendarContract.Calendars unwrap() {
            return getReal();
        }

        public static final java.lang.String CALENDAR_LOCATION = android.provider.CalendarContract.Calendars.CALENDAR_LOCATION;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Calendars.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.CalendarContract.Calendars.DEFAULT_SORT_ORDER;
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Calendars.ENTERPRISE_CONTENT_URI);
        public static final java.lang.String NAME = android.provider.CalendarContract.Calendars.NAME;

    }
    public static final class Colors {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Colors(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Colors wrap(android.provider.CalendarContract.Colors real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Colors(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.Colors getReal() {
            return (android.provider.CalendarContract.Colors) real;
        }

        public android.provider.CalendarContract.Colors unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Colors.CONTENT_URI);

    }
    public static final class EventDays {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EventDays(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.EventDays wrap(android.provider.CalendarContract.EventDays real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.EventDays(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.EventDays getReal() {
            return (android.provider.CalendarContract.EventDays) real;
        }

        public android.provider.CalendarContract.EventDays unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, int arg1, int arg2, java.lang.String[] arg3) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.EventDays.query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.EventDays.CONTENT_URI);

    }
    public static final class Events {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Events(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Events wrap(android.provider.CalendarContract.Events real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Events(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.Events getReal() {
            return (android.provider.CalendarContract.Events) real;
        }

        public android.provider.CalendarContract.Events unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_EXCEPTION_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Events.CONTENT_EXCEPTION_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Events.CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Events.ENTERPRISE_CONTENT_URI);

    }
    public static final class EventsEntity {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EventsEntity(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.EventsEntity wrap(android.provider.CalendarContract.EventsEntity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.EventsEntity(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.EventsEntity getReal() {
            return (android.provider.CalendarContract.EventsEntity) real;
        }

        public android.provider.CalendarContract.EventsEntity unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0, com.micklab.dcg.wrapper.android.content.ContentResolver arg1) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.CalendarContract.EventsEntity.newEntityIterator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0, com.micklab.dcg.wrapper.android.content.ContentProviderClient arg1) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.CalendarContract.EventsEntity.newEntityIterator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.EventsEntity.CONTENT_URI);

    }
    public static final class ExtendedProperties {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExtendedProperties(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.ExtendedProperties wrap(android.provider.CalendarContract.ExtendedProperties real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.ExtendedProperties(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.ExtendedProperties getReal() {
            return (android.provider.CalendarContract.ExtendedProperties) real;
        }

        public android.provider.CalendarContract.ExtendedProperties unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.ExtendedProperties.CONTENT_URI);

    }
    public static final class Instances {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Instances(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Instances wrap(android.provider.CalendarContract.Instances real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Instances(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.Instances getReal() {
            return (android.provider.CalendarContract.Instances) real;
        }

        public android.provider.CalendarContract.Instances unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String[] arg1, long arg2, long arg3) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Instances.query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String[] arg1, long arg2, long arg3, java.lang.String arg4) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Instances.query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Reminders(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.Reminders wrap(android.provider.CalendarContract.Reminders real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.Reminders(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.Reminders getReal() {
            return (android.provider.CalendarContract.Reminders) real;
        }

        public android.provider.CalendarContract.Reminders unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, java.lang.String[] arg2) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.CalendarContract.Reminders.query(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.Reminders.CONTENT_URI);

    }
    public static final class SyncState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SyncState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CalendarContract.SyncState wrap(android.provider.CalendarContract.SyncState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CalendarContract.SyncState(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CalendarContract.SyncState getReal() {
            return (android.provider.CalendarContract.SyncState) real;
        }

        public android.provider.CalendarContract.SyncState unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CalendarContract.SyncState.CONTENT_URI);

    }
}
