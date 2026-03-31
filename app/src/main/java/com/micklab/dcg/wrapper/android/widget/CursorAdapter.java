// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CursorAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CursorAdapter wrap(android.widget.CursorAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CursorAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.CursorAdapter getReal() {
        return (android.widget.CursorAdapter) real;
    }

    public android.widget.CursorAdapter unwrap() {
        return getReal();
    }

    public void bindView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2) {
        ((android.widget.CursorAdapter) real).bindView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void changeCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.widget.CursorAdapter) real).changeCursor(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return ((android.widget.CursorAdapter) real).convertToString(arg0 == null ? null : arg0.getReal());
    }

    public int getCount() {
        return ((android.widget.CursorAdapter) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getCursor() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorAdapter) real).getCursor());
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.CursorAdapter) real).getDropDownView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources.Theme getDropDownViewTheme() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.Theme.wrap(((android.widget.CursorAdapter) real).getDropDownViewTheme());
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(((android.widget.CursorAdapter) real).getFilter());
    }

    public com.micklab.dcg.wrapper.android.widget.FilterQueryProvider getFilterQueryProvider() {
        return com.micklab.dcg.wrapper.android.widget.FilterQueryProvider.wrap(((android.widget.CursorAdapter) real).getFilterQueryProvider());
    }

    public java.lang.Object getItem(int arg0) {
        return ((android.widget.CursorAdapter) real).getItem(arg0);
    }

    public long getItemId(int arg0) {
        return ((android.widget.CursorAdapter) real).getItemId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.CursorAdapter) real).getView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public boolean hasStableIds() {
        return ((android.widget.CursorAdapter) real).hasStableIds();
    }

    public com.micklab.dcg.wrapper.android.view.View newDropDownView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.CursorAdapter) real).newDropDownView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View newView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.CursorAdapter) real).newView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorAdapter) real).runQueryOnBackgroundThread(arg0));
    }

    public void setDropDownViewTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.widget.CursorAdapter) real).setDropDownViewTheme(arg0 == null ? null : arg0.getReal());
    }

    public void setFilterQueryProvider(com.micklab.dcg.wrapper.android.widget.FilterQueryProvider arg0) {
        ((android.widget.CursorAdapter) real).setFilterQueryProvider(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor swapCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorAdapter) real).swapCursor(arg0 == null ? null : arg0.getReal()));
    }

    public static final int FLAG_AUTO_REQUERY = android.widget.CursorAdapter.FLAG_AUTO_REQUERY;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = android.widget.CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER;

}
