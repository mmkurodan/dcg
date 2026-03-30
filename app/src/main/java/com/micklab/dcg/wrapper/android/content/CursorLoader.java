// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class CursorLoader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorLoader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.CursorLoader wrap(android.content.CursorLoader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.CursorLoader(real, (__DcgwBridgeToken) null);
    }

    public android.content.CursorLoader getReal() {
        return (android.content.CursorLoader) real;
    }

    public android.content.CursorLoader unwrap() {
        return getReal();
    }

    public CursorLoader(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.CursorLoader(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public CursorLoader(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String[] arg4, java.lang.String arg5) {
        this(new android.content.CursorLoader(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public void cancelLoadInBackground() {
        ((android.content.CursorLoader) real).cancelLoadInBackground();
    }

    public void deliverResult(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.content.CursorLoader) real).deliverResult(arg0 == null ? null : arg0.getReal());
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.content.CursorLoader) real).dump(arg0, arg1, arg2, arg3);
    }

    public java.lang.String[] getProjection() {
        return ((android.content.CursorLoader) real).getProjection();
    }

    public java.lang.String getSelection() {
        return ((android.content.CursorLoader) real).getSelection();
    }

    public java.lang.String[] getSelectionArgs() {
        return ((android.content.CursorLoader) real).getSelectionArgs();
    }

    public java.lang.String getSortOrder() {
        return ((android.content.CursorLoader) real).getSortOrder();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.CursorLoader) real).getUri());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor loadInBackground() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.CursorLoader) real).loadInBackground());
    }

    public void onCanceled(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.content.CursorLoader) real).onCanceled(arg0 == null ? null : arg0.getReal());
    }

    public void setProjection(java.lang.String[] arg0) {
        ((android.content.CursorLoader) real).setProjection(arg0);
    }

    public void setSelection(java.lang.String arg0) {
        ((android.content.CursorLoader) real).setSelection(arg0);
    }

    public void setSelectionArgs(java.lang.String[] arg0) {
        ((android.content.CursorLoader) real).setSelectionArgs(arg0);
    }

    public void setSortOrder(java.lang.String arg0) {
        ((android.content.CursorLoader) real).setSortOrder(arg0);
    }

    public void setUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.content.CursorLoader) real).setUri(arg0 == null ? null : arg0.getReal());
    }

}
