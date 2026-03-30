// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class FileObserver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FileObserver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.FileObserver wrap(android.os.FileObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.FileObserver(real, (__DcgwBridgeToken) null);
    }

    public android.os.FileObserver getReal() {
        return (android.os.FileObserver) real;
    }

    public android.os.FileObserver unwrap() {
        return getReal();
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
