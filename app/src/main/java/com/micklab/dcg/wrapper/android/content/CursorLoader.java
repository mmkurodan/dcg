// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class CursorLoader {
    private final android.content.CursorLoader real;

    public CursorLoader(android.content.CursorLoader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.CursorLoader wrap(android.content.CursorLoader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.CursorLoader(real);
    }

    public android.content.CursorLoader unwrap() {
        return real;
    }

    public CursorLoader(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.CursorLoader(arg0 == null ? null : arg0.unwrap()));
    }

    public CursorLoader(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String[] arg4, java.lang.String arg5) {
        this(new android.content.CursorLoader(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5));
    }

    public void cancelLoadInBackground() {
        real.cancelLoadInBackground();
    }

    public void deliverResult(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.deliverResult(arg0 == null ? null : arg0.unwrap());
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public java.lang.String[] getProjection() {
        return real.getProjection();
    }

    public java.lang.String getSelection() {
        return real.getSelection();
    }

    public java.lang.String[] getSelectionArgs() {
        return real.getSelectionArgs();
    }

    public java.lang.String getSortOrder() {
        return real.getSortOrder();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor loadInBackground() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.loadInBackground());
    }

    public void onCanceled(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.onCanceled(arg0 == null ? null : arg0.unwrap());
    }

    public void setProjection(java.lang.String[] arg0) {
        real.setProjection(arg0);
    }

    public void setSelection(java.lang.String arg0) {
        real.setSelection(arg0);
    }

    public void setSelectionArgs(java.lang.String[] arg0) {
        real.setSelectionArgs(arg0);
    }

    public void setSortOrder(java.lang.String arg0) {
        real.setSortOrder(arg0);
    }

    public void setUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.setUri(arg0 == null ? null : arg0.unwrap());
    }

}
