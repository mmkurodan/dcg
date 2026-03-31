// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class EventLog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventLog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.EventLog wrap(android.util.EventLog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLog(real, (__DcgwBridgeToken) null);
    }

    public android.util.EventLog getReal() {
        return (android.util.EventLog) real;
    }

    public android.util.EventLog unwrap() {
        return getReal();
    }

    public static int getTagCode(java.lang.String arg0) {
        return android.util.EventLog.getTagCode(arg0);
    }

    public static java.lang.String getTagName(int arg0) {
        return android.util.EventLog.getTagName(arg0);
    }

    public static int writeEvent(int arg0, long arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, java.lang.String arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, java.lang.Object... arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, int arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static int writeEvent(int arg0, float arg1) {
        return android.util.EventLog.writeEvent(arg0, arg1);
    }

    public static final class Event {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Event(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.util.EventLog.Event wrap(android.util.EventLog.Event real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.util.EventLog.Event(real, (__DcgwBridgeToken) null);
        }

        public android.util.EventLog.Event getReal() {
            return (android.util.EventLog.Event) real;
        }

        public android.util.EventLog.Event unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.util.EventLog.Event) real).equals(arg0);
        }

        public java.lang.Object getData() {
            return ((android.util.EventLog.Event) real).getData();
        }

        public int getProcessId() {
            return ((android.util.EventLog.Event) real).getProcessId();
        }

        public int getTag() {
            return ((android.util.EventLog.Event) real).getTag();
        }

        public int getThreadId() {
            return ((android.util.EventLog.Event) real).getThreadId();
        }

        public long getTimeNanos() {
            return ((android.util.EventLog.Event) real).getTimeNanos();
        }

        public int hashCode() {
            return ((android.util.EventLog.Event) real).hashCode();
        }

    }
}
