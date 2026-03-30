// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AbstractThreadedSyncAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbstractThreadedSyncAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AbstractThreadedSyncAdapter wrap(android.content.AbstractThreadedSyncAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AbstractThreadedSyncAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.content.AbstractThreadedSyncAdapter getReal() {
        return (android.content.AbstractThreadedSyncAdapter) real;
    }

    public android.content.AbstractThreadedSyncAdapter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.AbstractThreadedSyncAdapter) real).getContext());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getSyncAdapterBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.content.AbstractThreadedSyncAdapter) real).getSyncAdapterBinder());
    }

    public void onPerformSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.ContentProviderClient arg3, com.micklab.dcg.wrapper.android.content.SyncResult arg4) {
        ((android.content.AbstractThreadedSyncAdapter) real).onPerformSync(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void onSecurityException(com.micklab.dcg.wrapper.android.accounts.Account arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.SyncResult arg3) {
        ((android.content.AbstractThreadedSyncAdapter) real).onSecurityException(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onSyncCanceled() {
        ((android.content.AbstractThreadedSyncAdapter) real).onSyncCanceled();
    }

    public void onSyncCanceled(java.lang.Thread arg0) {
        ((android.content.AbstractThreadedSyncAdapter) real).onSyncCanceled(arg0);
    }

    public boolean onUnsyncableAccount() {
        return ((android.content.AbstractThreadedSyncAdapter) real).onUnsyncableAccount();
    }

    public static final int LOG_SYNC_DETAILS = android.content.AbstractThreadedSyncAdapter.LOG_SYNC_DETAILS;

}
