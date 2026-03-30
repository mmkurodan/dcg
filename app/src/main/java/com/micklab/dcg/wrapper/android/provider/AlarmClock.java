// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class AlarmClock {
    private final android.provider.AlarmClock real;

    public AlarmClock(android.provider.AlarmClock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.AlarmClock wrap(android.provider.AlarmClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.AlarmClock(real);
    }

    public android.provider.AlarmClock unwrap() {
        return real;
    }

    public AlarmClock() {
        this(new android.provider.AlarmClock());
    }

    public static final java.lang.String ACTION_DISMISS_ALARM = android.provider.AlarmClock.ACTION_DISMISS_ALARM;
    public static final java.lang.String ACTION_DISMISS_TIMER = android.provider.AlarmClock.ACTION_DISMISS_TIMER;
    public static final java.lang.String ACTION_SET_ALARM = android.provider.AlarmClock.ACTION_SET_ALARM;
    public static final java.lang.String ACTION_SET_TIMER = android.provider.AlarmClock.ACTION_SET_TIMER;
    public static final java.lang.String ACTION_SHOW_ALARMS = android.provider.AlarmClock.ACTION_SHOW_ALARMS;
    public static final java.lang.String ACTION_SHOW_TIMERS = android.provider.AlarmClock.ACTION_SHOW_TIMERS;
    public static final java.lang.String ACTION_SNOOZE_ALARM = android.provider.AlarmClock.ACTION_SNOOZE_ALARM;
    public static final java.lang.String ALARM_SEARCH_MODE_ALL = android.provider.AlarmClock.ALARM_SEARCH_MODE_ALL;
    public static final java.lang.String ALARM_SEARCH_MODE_LABEL = android.provider.AlarmClock.ALARM_SEARCH_MODE_LABEL;
    public static final java.lang.String ALARM_SEARCH_MODE_NEXT = android.provider.AlarmClock.ALARM_SEARCH_MODE_NEXT;
    public static final java.lang.String ALARM_SEARCH_MODE_TIME = android.provider.AlarmClock.ALARM_SEARCH_MODE_TIME;
    public static final java.lang.String EXTRA_ALARM_SEARCH_MODE = android.provider.AlarmClock.EXTRA_ALARM_SEARCH_MODE;
    public static final java.lang.String EXTRA_ALARM_SNOOZE_DURATION = android.provider.AlarmClock.EXTRA_ALARM_SNOOZE_DURATION;
    public static final java.lang.String EXTRA_DAYS = android.provider.AlarmClock.EXTRA_DAYS;
    public static final java.lang.String EXTRA_HOUR = android.provider.AlarmClock.EXTRA_HOUR;
    public static final java.lang.String EXTRA_IS_PM = android.provider.AlarmClock.EXTRA_IS_PM;
    public static final java.lang.String EXTRA_LENGTH = android.provider.AlarmClock.EXTRA_LENGTH;
    public static final java.lang.String EXTRA_MESSAGE = android.provider.AlarmClock.EXTRA_MESSAGE;
    public static final java.lang.String EXTRA_MINUTES = android.provider.AlarmClock.EXTRA_MINUTES;
    public static final java.lang.String EXTRA_RINGTONE = android.provider.AlarmClock.EXTRA_RINGTONE;
    public static final java.lang.String EXTRA_SKIP_UI = android.provider.AlarmClock.EXTRA_SKIP_UI;
    public static final java.lang.String EXTRA_VIBRATE = android.provider.AlarmClock.EXTRA_VIBRATE;
    public static final java.lang.String VALUE_RINGTONE_SILENT = android.provider.AlarmClock.VALUE_RINGTONE_SILENT;

}
