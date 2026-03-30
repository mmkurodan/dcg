// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class HandlerThread {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HandlerThread(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.HandlerThread wrap(android.os.HandlerThread real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.HandlerThread(real, (__DcgwBridgeToken) null);
    }

    public android.os.HandlerThread getReal() {
        return (android.os.HandlerThread) real;
    }

    public android.os.HandlerThread unwrap() {
        return getReal();
    }

    public HandlerThread(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#android.os.HandlerThread(java.lang.String)");
    }

    public HandlerThread(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#android.os.HandlerThread(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.os.Looper getLooper() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#getLooper()");
    }

    public int getThreadId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#getThreadId()");
    }

    public boolean quit() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#quit()");
    }

    public boolean quitSafely() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#quitSafely()");
    }

    public void run() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HandlerThread#run()");
    }

}
