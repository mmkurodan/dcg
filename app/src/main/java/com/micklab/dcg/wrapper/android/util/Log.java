// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Log {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Log(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Log wrap(android.util.Log real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Log(real, (__DcgwBridgeToken) null);
    }

    public android.util.Log getReal() {
        return (android.util.Log) real;
    }

    public android.util.Log unwrap() {
        return getReal();
    }

    public static int d(java.lang.String arg0, java.lang.String arg1) {
        return android.util.Log.d(arg0, arg1);
    }

    public static int d(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        return android.util.Log.d(arg0, arg1, arg2);
    }

    public static int e(java.lang.String arg0, java.lang.String arg1) {
        return android.util.Log.e(arg0, arg1);
    }

    public static int e(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        return android.util.Log.e(arg0, arg1, arg2);
    }

    public static java.lang.String getStackTraceString(java.lang.Throwable arg0) {
        return android.util.Log.getStackTraceString(arg0);
    }

    public static int i(java.lang.String arg0, java.lang.String arg1) {
        return android.util.Log.i(arg0, arg1);
    }

    public static int i(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        return android.util.Log.i(arg0, arg1, arg2);
    }

    public static boolean isLoggable(java.lang.String arg0, int arg1) {
        return android.util.Log.isLoggable(arg0, arg1);
    }

    public static int println(int arg0, java.lang.String arg1, java.lang.String arg2) {
        return android.util.Log.println(arg0, arg1, arg2);
    }

    public static int v(java.lang.String arg0, java.lang.String arg1) {
        return android.util.Log.v(arg0, arg1);
    }

    public static int v(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        return android.util.Log.v(arg0, arg1, arg2);
    }

    public static int w(java.lang.String arg0, java.lang.Throwable arg1) {
        return android.util.Log.w(arg0, arg1);
    }

    public static int w(java.lang.String arg0, java.lang.String arg1) {
        return android.util.Log.w(arg0, arg1);
    }

    public static int w(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        return android.util.Log.w(arg0, arg1, arg2);
    }

    public static int wtf(java.lang.String arg0, java.lang.Throwable arg1) {
        return android.util.Log.wtf(arg0, arg1);
    }

    public static int wtf(java.lang.String arg0, java.lang.String arg1) {
        return android.util.Log.wtf(arg0, arg1);
    }

    public static int wtf(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        return android.util.Log.wtf(arg0, arg1, arg2);
    }

    public static final int ASSERT = android.util.Log.ASSERT;
    public static final int DEBUG = android.util.Log.DEBUG;
    public static final int ERROR = android.util.Log.ERROR;
    public static final int INFO = android.util.Log.INFO;
    public static final int VERBOSE = android.util.Log.VERBOSE;
    public static final int WARN = android.util.Log.WARN;

}
