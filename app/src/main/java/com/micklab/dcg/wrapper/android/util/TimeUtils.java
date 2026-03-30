// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class TimeUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.TimeUtils wrap(android.util.TimeUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.TimeUtils(real, (__DcgwBridgeToken) null);
    }

    public android.util.TimeUtils getReal() {
        return (android.util.TimeUtils) real;
    }

    public android.util.TimeUtils unwrap() {
        return getReal();
    }

    public static java.util.TimeZone getTimeZone(int arg0, boolean arg1, long arg2, java.lang.String arg3) {
        return android.util.TimeUtils.getTimeZone(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String getTimeZoneDatabaseVersion() {
        return android.util.TimeUtils.getTimeZoneDatabaseVersion();
    }

    public static boolean isTimeBetween(java.time.LocalTime arg0, java.time.LocalTime arg1, java.time.LocalTime arg2) {
        return android.util.TimeUtils.isTimeBetween(arg0, arg1, arg2);
    }

}
