// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class TestLooperManager {
    private final android.os.TestLooperManager real;

    public TestLooperManager(android.os.TestLooperManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.TestLooperManager wrap(android.os.TestLooperManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.TestLooperManager(real);
    }

    public android.os.TestLooperManager unwrap() {
        return real;
    }

    public void execute(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#execute(android.os.Message)");
    }

    public com.micklab.dcg.wrapper.android.os.MessageQueue getMessageQueue() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#getMessageQueue()");
    }

    public boolean hasMessages(com.micklab.dcg.wrapper.android.os.Handler arg0, java.lang.Object arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#hasMessages(android.os.Handler,java.lang.Object,int)");
    }

    public boolean hasMessages(com.micklab.dcg.wrapper.android.os.Handler arg0, java.lang.Object arg1, java.lang.Runnable arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#hasMessages(android.os.Handler,java.lang.Object,java.lang.Runnable)");
    }

    public com.micklab.dcg.wrapper.android.os.Message next() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#next()");
    }

    public void recycle(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#recycle(android.os.Message)");
    }

    public void release() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TestLooperManager#release()");
    }

}
