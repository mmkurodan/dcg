// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class SystemClock {
    private final android.os.SystemClock real;

    public SystemClock(android.os.SystemClock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.SystemClock wrap(android.os.SystemClock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.SystemClock(real);
    }

    public android.os.SystemClock unwrap() {
        return real;
    }

    public static java.time.Clock currentGnssTimeClock() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#currentGnssTimeClock()");
    }

    public static java.time.Clock currentNetworkTimeClock() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#currentNetworkTimeClock()");
    }

    public static long currentThreadTimeMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#currentThreadTimeMillis()");
    }

    public static long elapsedRealtime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#elapsedRealtime()");
    }

    public static long elapsedRealtimeNanos() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#elapsedRealtimeNanos()");
    }

    public static boolean setCurrentTimeMillis(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#setCurrentTimeMillis(long)");
    }

    public static void sleep(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#sleep(long)");
    }

    public static long uptimeMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#uptimeMillis()");
    }

    public static long uptimeNanos() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SystemClock#uptimeNanos()");
    }

}
