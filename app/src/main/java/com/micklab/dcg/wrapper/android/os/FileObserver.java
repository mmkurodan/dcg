// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class FileObserver {
    private final android.os.FileObserver real;

    public FileObserver(android.os.FileObserver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.FileObserver wrap(android.os.FileObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.FileObserver(real);
    }

    public android.os.FileObserver unwrap() {
        return real;
    }

    public void onEvent(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileObserver#onEvent(int,java.lang.String)");
    }

    public void startWatching() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileObserver#startWatching()");
    }

    public void stopWatching() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileObserver#stopWatching()");
    }


}
