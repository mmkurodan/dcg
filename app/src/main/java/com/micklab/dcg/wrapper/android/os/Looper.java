// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Looper {
    private final android.os.Looper real;

    public Looper(android.os.Looper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Looper wrap(android.os.Looper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Looper(real);
    }

    public android.os.Looper unwrap() {
        return real;
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#dump(android.util.Printer,java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.os.Looper getMainLooper() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#getMainLooper()");
    }

    public com.micklab.dcg.wrapper.android.os.MessageQueue getQueue() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#getQueue()");
    }

    public java.lang.Thread getThread() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#getThread()");
    }

    public boolean isCurrentThread() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#isCurrentThread()");
    }

    public static void loop() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#loop()");
    }

    public static com.micklab.dcg.wrapper.android.os.Looper myLooper() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#myLooper()");
    }

    public static com.micklab.dcg.wrapper.android.os.MessageQueue myQueue() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#myQueue()");
    }

    public static void prepare() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#prepare()");
    }

    public static void prepareMainLooper() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#prepareMainLooper()");
    }

    public void quit() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#quit()");
    }

    public void quitSafely() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#quitSafely()");
    }

    public void setMessageLogging(com.micklab.dcg.wrapper.android.util.Printer arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#setMessageLogging(android.util.Printer)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Looper#toString()");
    }

}
