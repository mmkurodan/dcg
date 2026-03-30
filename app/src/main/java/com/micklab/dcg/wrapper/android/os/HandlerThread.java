// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class HandlerThread {
    private final android.os.HandlerThread real;

    public HandlerThread(android.os.HandlerThread real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.HandlerThread wrap(android.os.HandlerThread real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.HandlerThread(real);
    }

    public android.os.HandlerThread unwrap() {
        return real;
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
