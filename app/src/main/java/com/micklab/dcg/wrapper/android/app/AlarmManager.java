// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AlarmManager {
    private final android.app.AlarmManager real;

    public AlarmManager(android.app.AlarmManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AlarmManager wrap(android.app.AlarmManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlarmManager(real);
    }

    public android.app.AlarmManager unwrap() {
        return real;
    }

    public boolean canScheduleExactAlarms() {
        return real.canScheduleExactAlarms();
    }

    public void cancel(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.cancel(arg0 == null ? null : arg0.unwrap());
    }

    public void cancel(com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener arg0) {
        real.cancel(arg0 == null ? null : arg0.unwrap());
    }

    public void cancelAll() {
        real.cancelAll();
    }

    public com.micklab.dcg.wrapper.android.app.AlarmManager.AlarmClockInfo getNextAlarmClock() {
        return com.micklab.dcg.wrapper.android.app.AlarmManager.AlarmClockInfo.wrap(real.getNextAlarmClock());
    }

    public void set(int arg0, long arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        real.set(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void set(int arg0, long arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        real.set(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void setAlarmClock(com.micklab.dcg.wrapper.android.app.AlarmManager.AlarmClockInfo arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.setAlarmClock(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setAndAllowWhileIdle(int arg0, long arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        real.setAndAllowWhileIdle(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setExact(int arg0, long arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        real.setExact(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setExact(int arg0, long arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        real.setExact(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void setExactAndAllowWhileIdle(int arg0, long arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        real.setExactAndAllowWhileIdle(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setInexactRepeating(int arg0, long arg1, long arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        real.setInexactRepeating(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void setRepeating(int arg0, long arg1, long arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        real.setRepeating(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void setTime(long arg0) {
        real.setTime(arg0);
    }

    public void setTimeZone(java.lang.String arg0) {
        real.setTimeZone(arg0);
    }

    public void setWindow(int arg0, long arg1, long arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        real.setWindow(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void setWindow(int arg0, long arg1, long arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener arg4, com.micklab.dcg.wrapper.android.os.Handler arg5) {
        real.setWindow(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public void setWindow(int arg0, long arg1, long arg2, java.lang.String arg3, java.util.concurrent.Executor arg4, com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener arg5) {
        real.setWindow(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public static final java.lang.String ACTION_NEXT_ALARM_CLOCK_CHANGED = android.app.AlarmManager.ACTION_NEXT_ALARM_CLOCK_CHANGED;
    public static final java.lang.String ACTION_SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED = android.app.AlarmManager.ACTION_SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED;
    public static final int ELAPSED_REALTIME = android.app.AlarmManager.ELAPSED_REALTIME;
    public static final int ELAPSED_REALTIME_WAKEUP = android.app.AlarmManager.ELAPSED_REALTIME_WAKEUP;
    public static final long INTERVAL_DAY = android.app.AlarmManager.INTERVAL_DAY;
    public static final long INTERVAL_FIFTEEN_MINUTES = android.app.AlarmManager.INTERVAL_FIFTEEN_MINUTES;
    public static final long INTERVAL_HALF_DAY = android.app.AlarmManager.INTERVAL_HALF_DAY;
    public static final long INTERVAL_HALF_HOUR = android.app.AlarmManager.INTERVAL_HALF_HOUR;
    public static final long INTERVAL_HOUR = android.app.AlarmManager.INTERVAL_HOUR;
    public static final int RTC = android.app.AlarmManager.RTC;
    public static final int RTC_WAKEUP = android.app.AlarmManager.RTC_WAKEUP;

    public static final class AlarmClockInfo {
        private final android.app.AlarmManager.AlarmClockInfo real;

        public AlarmClockInfo(android.app.AlarmManager.AlarmClockInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AlarmManager.AlarmClockInfo wrap(android.app.AlarmManager.AlarmClockInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlarmManager.AlarmClockInfo(real);
        }

        public android.app.AlarmManager.AlarmClockInfo unwrap() {
            return real;
        }

        public AlarmClockInfo(long arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            this(new android.app.AlarmManager.AlarmClockInfo(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.app.PendingIntent getShowIntent() {
            return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getShowIntent());
        }

        public long getTriggerTime() {
            return real.getTriggerTime();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class OnAlarmListener {
        private final android.app.AlarmManager.OnAlarmListener real;

        public OnAlarmListener(android.app.AlarmManager.OnAlarmListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener wrap(android.app.AlarmManager.OnAlarmListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AlarmManager.OnAlarmListener(real);
        }

        public android.app.AlarmManager.OnAlarmListener unwrap() {
            return real;
        }

        public void onAlarm() {
            real.onAlarm();
        }

    }
}
