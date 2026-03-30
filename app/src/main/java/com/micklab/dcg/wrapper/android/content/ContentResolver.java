// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentResolver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentResolver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentResolver wrap(android.content.ContentResolver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentResolver(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentResolver getReal() {
        return (android.content.ContentResolver) real;
    }

    public android.content.ContentResolver unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.ContentProviderClient acquireContentProviderClient(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderClient.wrap(((android.content.ContentResolver) real).acquireContentProviderClient(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.ContentProviderClient acquireContentProviderClient(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderClient.wrap(((android.content.ContentResolver) real).acquireContentProviderClient(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.ContentProviderClient acquireUnstableContentProviderClient(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderClient.wrap(((android.content.ContentResolver) real).acquireUnstableContentProviderClient(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.ContentProviderClient acquireUnstableContentProviderClient(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderClient.wrap(((android.content.ContentResolver) real).acquireUnstableContentProviderClient(arg0));
    }

    public static void addPeriodicSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, long arg3) {
        android.content.ContentResolver.addPeriodicSync(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public static java.lang.Object addStatusChangeListener(int arg0, com.micklab.dcg.wrapper.android.content.SyncStatusObserver arg1) {
        return android.content.ContentResolver.addStatusChangeListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int bulkInsert(com.micklab.dcg.wrapper.android.net.Uri arg0, android.content.ContentValues[] arg1) {
        return ((android.content.ContentResolver) real).bulkInsert(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentResolver) real).call(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentResolver) real).call(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public void cancelSync(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.content.ContentResolver) real).cancelSync(arg0 == null ? null : arg0.getReal());
    }

    public static void cancelSync(com.micklab.dcg.wrapper.android.content.SyncRequest arg0) {
        android.content.ContentResolver.cancelSync(arg0 == null ? null : arg0.getReal());
    }

    public static void cancelSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        android.content.ContentResolver.cancelSync(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentResolver) real).canonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.content.ContentResolver) real).delete(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return ((android.content.ContentResolver) real).delete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static com.micklab.dcg.wrapper.android.content.SyncInfo getCurrentSync() {
        return com.micklab.dcg.wrapper.android.content.SyncInfo.wrap(android.content.ContentResolver.getCurrentSync());
    }

    public static int getIsSyncable(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return android.content.ContentResolver.getIsSyncable(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static boolean getMasterSyncAutomatically() {
        return android.content.ContentResolver.getMasterSyncAutomatically();
    }

    public java.lang.String[] getStreamTypes(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return ((android.content.ContentResolver) real).getStreamTypes(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static android.content.SyncAdapterType[] getSyncAdapterTypes() {
        return android.content.ContentResolver.getSyncAdapterTypes();
    }

    public static boolean getSyncAutomatically(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return android.content.ContentResolver.getSyncAutomatically(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.ContentResolver) real).getType(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.ContentResolver.MimeTypeInfo getTypeInfo(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentResolver.MimeTypeInfo.wrap(((android.content.ContentResolver) real).getTypeInfo(arg0));
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentResolver) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentResolver) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static boolean isSyncActive(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return android.content.ContentResolver.isSyncActive(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static boolean isSyncPending(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
        return android.content.ContentResolver.isSyncPending(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap loadThumbnail(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.util.Size arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.content.ContentResolver) real).loadThumbnail(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void notifyChange(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.database.ContentObserver arg1) {
        ((android.content.ContentResolver) real).notifyChange(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void notifyChange(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.database.ContentObserver arg1, int arg2) {
        ((android.content.ContentResolver) real).notifyChange(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void notifyChange(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.database.ContentObserver arg1, boolean arg2) {
        ((android.content.ContentResolver) real).notifyChange(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openAssetFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openAssetFileDescriptor(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openAssetFileDescriptor(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openFileDescriptor(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openFileDescriptor(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public java.io.InputStream openInputStream(com.micklab.dcg.wrapper.android.net.Uri arg0) throws java.io.FileNotFoundException {
        return ((android.content.ContentResolver) real).openInputStream(arg0 == null ? null : arg0.getReal());
    }

    public java.io.OutputStream openOutputStream(com.micklab.dcg.wrapper.android.net.Uri arg0) throws java.io.FileNotFoundException {
        return ((android.content.ContentResolver) real).openOutputStream(arg0 == null ? null : arg0.getReal());
    }

    public java.io.OutputStream openOutputStream(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return ((android.content.ContentResolver) real).openOutputStream(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openTypedAssetFileDescriptor(android.net.Uri,java.lang.String,android.os.Bundle)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentResolver#openTypedAssetFileDescriptor(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentResolver) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentResolver) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentResolver) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public boolean refresh(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) {
        return ((android.content.ContentResolver) real).refresh(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void registerContentObserver(com.micklab.dcg.wrapper.android.net.Uri arg0, boolean arg1, com.micklab.dcg.wrapper.android.database.ContentObserver arg2) {
        ((android.content.ContentResolver) real).registerContentObserver(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void releasePersistableUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        ((android.content.ContentResolver) real).releasePersistableUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static void removePeriodicSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        android.content.ContentResolver.removePeriodicSync(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public static void removeStatusChangeListener(java.lang.Object arg0) {
        android.content.ContentResolver.removeStatusChangeListener(arg0);
    }

    public static void requestSync(com.micklab.dcg.wrapper.android.content.SyncRequest arg0) {
        android.content.ContentResolver.requestSync(arg0 == null ? null : arg0.getReal());
    }

    public static void requestSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        android.content.ContentResolver.requestSync(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public static void setIsSyncable(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, int arg2) {
        android.content.ContentResolver.setIsSyncable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static void setMasterSyncAutomatically(boolean arg0) {
        android.content.ContentResolver.setMasterSyncAutomatically(arg0);
    }

    public static void setSyncAutomatically(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, boolean arg2) {
        android.content.ContentResolver.setSyncAutomatically(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void startSync(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.ContentResolver) real).startSync(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void takePersistableUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        ((android.content.ContentResolver) real).takePersistableUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.net.Uri uncanonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentResolver) real).uncanonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public void unregisterContentObserver(com.micklab.dcg.wrapper.android.database.ContentObserver arg0) {
        ((android.content.ContentResolver) real).unregisterContentObserver(arg0 == null ? null : arg0.getReal());
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.content.ContentResolver) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return ((android.content.ContentResolver) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public static void validateSyncExtrasBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        android.content.ContentResolver.validateSyncExtrasBundle(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.content.ContentResolver wrap(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentResolver.wrap(android.content.ContentResolver.wrap(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentResolver wrap(com.micklab.dcg.wrapper.android.content.ContentProvider arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentResolver.wrap(android.content.ContentResolver.wrap(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String ANY_CURSOR_ITEM_TYPE = android.content.ContentResolver.ANY_CURSOR_ITEM_TYPE;
    public static final java.lang.String CURSOR_DIR_BASE_TYPE = android.content.ContentResolver.CURSOR_DIR_BASE_TYPE;
    public static final java.lang.String CURSOR_ITEM_BASE_TYPE = android.content.ContentResolver.CURSOR_ITEM_BASE_TYPE;
    public static final java.lang.String EXTRA_HONORED_ARGS = android.content.ContentResolver.EXTRA_HONORED_ARGS;
    public static final java.lang.String EXTRA_REFRESH_SUPPORTED = android.content.ContentResolver.EXTRA_REFRESH_SUPPORTED;
    public static final java.lang.String EXTRA_SIZE = android.content.ContentResolver.EXTRA_SIZE;
    public static final java.lang.String EXTRA_TOTAL_COUNT = android.content.ContentResolver.EXTRA_TOTAL_COUNT;
    public static final int NOTIFY_DELETE = android.content.ContentResolver.NOTIFY_DELETE;
    public static final int NOTIFY_INSERT = android.content.ContentResolver.NOTIFY_INSERT;
    public static final int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS = android.content.ContentResolver.NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS;
    public static final int NOTIFY_UPDATE = android.content.ContentResolver.NOTIFY_UPDATE;
    public static final java.lang.String QUERY_ARG_GROUP_COLUMNS = android.content.ContentResolver.QUERY_ARG_GROUP_COLUMNS;
    public static final java.lang.String QUERY_ARG_LIMIT = android.content.ContentResolver.QUERY_ARG_LIMIT;
    public static final java.lang.String QUERY_ARG_OFFSET = android.content.ContentResolver.QUERY_ARG_OFFSET;
    public static final java.lang.String QUERY_ARG_SORT_COLLATION = android.content.ContentResolver.QUERY_ARG_SORT_COLLATION;
    public static final java.lang.String QUERY_ARG_SORT_COLUMNS = android.content.ContentResolver.QUERY_ARG_SORT_COLUMNS;
    public static final java.lang.String QUERY_ARG_SORT_DIRECTION = android.content.ContentResolver.QUERY_ARG_SORT_DIRECTION;
    public static final java.lang.String QUERY_ARG_SORT_LOCALE = android.content.ContentResolver.QUERY_ARG_SORT_LOCALE;
    public static final java.lang.String QUERY_ARG_SQL_GROUP_BY = android.content.ContentResolver.QUERY_ARG_SQL_GROUP_BY;
    public static final java.lang.String QUERY_ARG_SQL_HAVING = android.content.ContentResolver.QUERY_ARG_SQL_HAVING;
    public static final java.lang.String QUERY_ARG_SQL_LIMIT = android.content.ContentResolver.QUERY_ARG_SQL_LIMIT;
    public static final java.lang.String QUERY_ARG_SQL_SELECTION = android.content.ContentResolver.QUERY_ARG_SQL_SELECTION;
    public static final java.lang.String QUERY_ARG_SQL_SELECTION_ARGS = android.content.ContentResolver.QUERY_ARG_SQL_SELECTION_ARGS;
    public static final java.lang.String QUERY_ARG_SQL_SORT_ORDER = android.content.ContentResolver.QUERY_ARG_SQL_SORT_ORDER;
    public static final int QUERY_SORT_DIRECTION_ASCENDING = android.content.ContentResolver.QUERY_SORT_DIRECTION_ASCENDING;
    public static final int QUERY_SORT_DIRECTION_DESCENDING = android.content.ContentResolver.QUERY_SORT_DIRECTION_DESCENDING;
    public static final java.lang.String SCHEME_ANDROID_RESOURCE = android.content.ContentResolver.SCHEME_ANDROID_RESOURCE;
    public static final java.lang.String SCHEME_CONTENT = android.content.ContentResolver.SCHEME_CONTENT;
    public static final java.lang.String SYNC_EXTRAS_ACCOUNT = android.content.ContentResolver.SYNC_EXTRAS_ACCOUNT;
    public static final java.lang.String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = android.content.ContentResolver.SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS;
    public static final java.lang.String SYNC_EXTRAS_DO_NOT_RETRY = android.content.ContentResolver.SYNC_EXTRAS_DO_NOT_RETRY;
    public static final java.lang.String SYNC_EXTRAS_EXPEDITED = android.content.ContentResolver.SYNC_EXTRAS_EXPEDITED;
    public static final java.lang.String SYNC_EXTRAS_FORCE = android.content.ContentResolver.SYNC_EXTRAS_FORCE;
    public static final java.lang.String SYNC_EXTRAS_IGNORE_BACKOFF = android.content.ContentResolver.SYNC_EXTRAS_IGNORE_BACKOFF;
    public static final java.lang.String SYNC_EXTRAS_IGNORE_SETTINGS = android.content.ContentResolver.SYNC_EXTRAS_IGNORE_SETTINGS;
    public static final java.lang.String SYNC_EXTRAS_INITIALIZE = android.content.ContentResolver.SYNC_EXTRAS_INITIALIZE;
    public static final java.lang.String SYNC_EXTRAS_MANUAL = android.content.ContentResolver.SYNC_EXTRAS_MANUAL;
    public static final java.lang.String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = android.content.ContentResolver.SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS;
    public static final java.lang.String SYNC_EXTRAS_REQUIRE_CHARGING = android.content.ContentResolver.SYNC_EXTRAS_REQUIRE_CHARGING;
    public static final java.lang.String SYNC_EXTRAS_SCHEDULE_AS_EXPEDITED_JOB = android.content.ContentResolver.SYNC_EXTRAS_SCHEDULE_AS_EXPEDITED_JOB;
    public static final java.lang.String SYNC_EXTRAS_UPLOAD = android.content.ContentResolver.SYNC_EXTRAS_UPLOAD;
    public static final int SYNC_OBSERVER_TYPE_ACTIVE = android.content.ContentResolver.SYNC_OBSERVER_TYPE_ACTIVE;
    public static final int SYNC_OBSERVER_TYPE_PENDING = android.content.ContentResolver.SYNC_OBSERVER_TYPE_PENDING;
    public static final int SYNC_OBSERVER_TYPE_SETTINGS = android.content.ContentResolver.SYNC_OBSERVER_TYPE_SETTINGS;

    public static final class MimeTypeInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MimeTypeInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContentResolver.MimeTypeInfo wrap(android.content.ContentResolver.MimeTypeInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentResolver.MimeTypeInfo(real, (__DcgwBridgeToken) null);
        }

        public android.content.ContentResolver.MimeTypeInfo getReal() {
            return (android.content.ContentResolver.MimeTypeInfo) real;
        }

        public android.content.ContentResolver.MimeTypeInfo unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getContentDescription() {
            return ((android.content.ContentResolver.MimeTypeInfo) real).getContentDescription();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.content.ContentResolver.MimeTypeInfo) real).getIcon());
        }

        public java.lang.CharSequence getLabel() {
            return ((android.content.ContentResolver.MimeTypeInfo) real).getLabel();
        }

    }
}
