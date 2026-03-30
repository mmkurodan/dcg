// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncStatusObserver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncStatusObserver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncStatusObserver wrap(android.content.SyncStatusObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncStatusObserver(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncStatusObserver getReal() {
        return (android.content.SyncStatusObserver) real;
    }

    public android.content.SyncStatusObserver unwrap() {
        return getReal();
    }

    public void onStatusChanged(int arg0) {
        ((android.content.SyncStatusObserver) real).onStatusChanged(arg0);
    }

}
