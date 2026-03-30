// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AbstractThreadedSyncAdapter {
    private final android.content.AbstractThreadedSyncAdapter real;

    public AbstractThreadedSyncAdapter(android.content.AbstractThreadedSyncAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AbstractThreadedSyncAdapter wrap(android.content.AbstractThreadedSyncAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AbstractThreadedSyncAdapter(real);
    }

    public android.content.AbstractThreadedSyncAdapter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getSyncAdapterBinder() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getSyncAdapterBinder());
    }

    public void onPerformSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.ContentProviderClient arg3, com.micklab.dcg.wrapper.android.content.SyncResult arg4) {
        real.onPerformSync(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void onSecurityException(com.micklab.dcg.wrapper.android.accounts.Account arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.SyncResult arg3) {
        real.onSecurityException(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onSyncCanceled() {
        real.onSyncCanceled();
    }

    public void onSyncCanceled(java.lang.Thread arg0) {
        real.onSyncCanceled(arg0);
    }

    public boolean onUnsyncableAccount() {
        return real.onUnsyncableAccount();
    }

    public static final int LOG_SYNC_DETAILS = android.content.AbstractThreadedSyncAdapter.LOG_SYNC_DETAILS;

}
