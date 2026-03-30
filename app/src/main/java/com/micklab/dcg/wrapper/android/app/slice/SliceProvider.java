// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SliceProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceProvider wrap(android.app.slice.SliceProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceProvider(real, (__DcgwBridgeToken) null);
    }

    public android.app.slice.SliceProvider getReal() {
        return (android.app.slice.SliceProvider) real;
    }

    public android.app.slice.SliceProvider unwrap() {
        return getReal();
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        ((android.app.slice.SliceProvider) real).attachInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.slice.SliceProvider) real).call(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return ((android.app.slice.SliceProvider) real).delete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.app.slice.SliceProvider) real).getType(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.slice.SliceProvider) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent onCreatePermissionRequest(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.slice.SliceProvider) real).onCreatePermissionRequest(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri onMapIntentToUri(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.slice.SliceProvider) real).onMapIntentToUri(arg0 == null ? null : arg0.getReal()));
    }

    public void onSlicePinned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.app.slice.SliceProvider) real).onSlicePinned(arg0 == null ? null : arg0.getReal());
    }

    public void onSliceUnpinned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.app.slice.SliceProvider) real).onSliceUnpinned(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.app.slice.SliceProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.app.slice.SliceProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.app.slice.SliceProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return ((android.app.slice.SliceProvider) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public static final java.lang.String SLICE_TYPE = android.app.slice.SliceProvider.SLICE_TYPE;

}
