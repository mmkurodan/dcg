// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class StatsLog {
    private final android.util.StatsLog real;

    public StatsLog(android.util.StatsLog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.StatsLog wrap(android.util.StatsLog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.StatsLog(real);
    }

    public android.util.StatsLog unwrap() {
        return real;
    }

    public static boolean logBinaryPushStateChanged(java.lang.String arg0, long arg1, int arg2, int arg3, long[] arg4) {
        return android.util.StatsLog.logBinaryPushStateChanged(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean logEvent(int arg0) {
        return android.util.StatsLog.logEvent(arg0);
    }

    public static boolean logStart(int arg0) {
        return android.util.StatsLog.logStart(arg0);
    }

    public static boolean logStop(int arg0) {
        return android.util.StatsLog.logStop(arg0);
    }

}
