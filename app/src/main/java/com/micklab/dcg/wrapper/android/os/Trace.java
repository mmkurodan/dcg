// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Trace {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Trace(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Trace wrap(android.os.Trace real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Trace(real, (__DcgwBridgeToken) null);
    }

    public android.os.Trace getReal() {
        return (android.os.Trace) real;
    }

    public android.os.Trace unwrap() {
        return getReal();
    }

    public static void beginAsyncSection(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Trace#beginAsyncSection(java.lang.String,int)");
    }

    public static void beginSection(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Trace#beginSection(java.lang.String)");
    }

    public static void endAsyncSection(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Trace#endAsyncSection(java.lang.String,int)");
    }

    public static void endSection() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Trace#endSection()");
    }

    public static boolean isEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Trace#isEnabled()");
    }

    public static void setCounter(java.lang.String arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Trace#setCounter(java.lang.String,long)");
    }

}
