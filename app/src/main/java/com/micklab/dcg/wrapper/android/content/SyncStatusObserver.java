// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncStatusObserver {
    private final android.content.SyncStatusObserver real;

    public SyncStatusObserver(android.content.SyncStatusObserver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncStatusObserver wrap(android.content.SyncStatusObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncStatusObserver(real);
    }

    public android.content.SyncStatusObserver unwrap() {
        return real;
    }

    public void onStatusChanged(int arg0) {
        real.onStatusChanged(arg0);
    }

}
