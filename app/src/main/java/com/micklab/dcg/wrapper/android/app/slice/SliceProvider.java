// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceProvider {
    private final android.app.slice.SliceProvider real;

    public SliceProvider(android.app.slice.SliceProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceProvider wrap(android.app.slice.SliceProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceProvider(real);
    }

    public android.app.slice.SliceProvider unwrap() {
        return real;
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        real.attachInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.call(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return real.delete(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getType(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent onCreatePermissionRequest(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.onCreatePermissionRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri onMapIntentToUri(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.onMapIntentToUri(arg0 == null ? null : arg0.unwrap()));
    }

    public void onSlicePinned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.onSlicePinned(arg0 == null ? null : arg0.unwrap());
    }

    public void onSliceUnpinned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.onSliceUnpinned(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return real.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public static final java.lang.String SLICE_TYPE = android.app.slice.SliceProvider.SLICE_TYPE;

}
