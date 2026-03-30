// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class RestoreObserver {
    private final android.app.backup.RestoreObserver real;

    public RestoreObserver(android.app.backup.RestoreObserver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.RestoreObserver wrap(android.app.backup.RestoreObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.RestoreObserver(real);
    }

    public android.app.backup.RestoreObserver unwrap() {
        return real;
    }

    public void onUpdate(int arg0, java.lang.String arg1) {
        real.onUpdate(arg0, arg1);
    }

    public void restoreFinished(int arg0) {
        real.restoreFinished(arg0);
    }

    public void restoreStarting(int arg0) {
        real.restoreStarting(arg0);
    }

}
