// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncContext wrap(android.content.SyncContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncContext(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncContext getReal() {
        return (android.content.SyncContext) real;
    }

    public android.content.SyncContext unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getSyncContextBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.content.SyncContext) real).getSyncContextBinder());
    }

    public void onFinished(com.micklab.dcg.wrapper.android.content.SyncResult arg0) {
        ((android.content.SyncContext) real).onFinished(arg0 == null ? null : arg0.getReal());
    }

}
