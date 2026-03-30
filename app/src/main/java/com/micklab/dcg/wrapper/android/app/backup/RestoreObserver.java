// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class RestoreObserver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RestoreObserver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.RestoreObserver wrap(android.app.backup.RestoreObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.RestoreObserver(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.RestoreObserver getReal() {
        return (android.app.backup.RestoreObserver) real;
    }

    public android.app.backup.RestoreObserver unwrap() {
        return getReal();
    }

    public void onUpdate(int arg0, java.lang.String arg1) {
        ((android.app.backup.RestoreObserver) real).onUpdate(arg0, arg1);
    }

    public void restoreFinished(int arg0) {
        ((android.app.backup.RestoreObserver) real).restoreFinished(arg0);
    }

    public void restoreStarting(int arg0) {
        ((android.app.backup.RestoreObserver) real).restoreStarting(arg0);
    }

}
