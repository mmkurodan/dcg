// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class TokenWatcher {
    private final android.os.TokenWatcher real;

    public TokenWatcher(android.os.TokenWatcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.TokenWatcher wrap(android.os.TokenWatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.TokenWatcher(real);
    }

    public android.os.TokenWatcher unwrap() {
        return real;
    }

    public void acquire(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#acquire(android.os.IBinder,java.lang.String)");
    }

    public void acquired() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#acquired()");
    }

    public void cleanup(com.micklab.dcg.wrapper.android.os.IBinder arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#cleanup(android.os.IBinder,boolean)");
    }

    public void dump() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#dump()");
    }

    public void dump(java.io.PrintWriter arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#dump(java.io.PrintWriter)");
    }

    public boolean isAcquired() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#isAcquired()");
    }

    public void release(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#release(android.os.IBinder)");
    }

    public void released() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TokenWatcher#released()");
    }

}
