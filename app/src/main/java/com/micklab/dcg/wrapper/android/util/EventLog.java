// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class EventLog {
    private final android.util.EventLog real;

    public EventLog(android.util.EventLog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.EventLog wrap(android.util.EventLog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLog(real);
    }

    public android.util.EventLog unwrap() {
        return real;
    }

    public static int getTagCode(java.lang.String arg0) {
        return android.util.EventLog.getTagCode(arg0);
    }

    public static java.lang.String getTagName(int arg0) {
        return android.util.EventLog.getTagName(arg0);
    }

    public static int writeEvent(int arg0, float arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, java.lang.String arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, java.lang.Object... arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, long arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, int arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static final class Event {
        private final android.util.EventLog.Event real;

        public Event(android.util.EventLog.Event real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.util.EventLog.Event wrap(android.util.EventLog.Event real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLog.Event(real);
        }

        public android.util.EventLog.Event unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.Object getData() {
            return real.getData();
        }

        public int getProcessId() {
            return real.getProcessId();
        }

        public int getTag() {
            return real.getTag();
        }

        public int getThreadId() {
            return real.getThreadId();
        }

        public long getTimeNanos() {
            return real.getTimeNanos();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
