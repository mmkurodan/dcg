// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncContext {
    private final android.content.SyncContext real;

    public SyncContext(android.content.SyncContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncContext wrap(android.content.SyncContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncContext(real);
    }

    public android.content.SyncContext unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getSyncContextBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getSyncContextBinder());
    }

    public void onFinished(com.micklab.dcg.wrapper.android.content.SyncResult arg0) {
        real.onFinished(arg0 == null ? null : arg0.unwrap());
    }

}
