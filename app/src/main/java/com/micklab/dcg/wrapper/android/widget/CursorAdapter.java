// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CursorAdapter {
    private final android.widget.CursorAdapter real;

    public CursorAdapter(android.widget.CursorAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CursorAdapter wrap(android.widget.CursorAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CursorAdapter(real);
    }

    public android.widget.CursorAdapter unwrap() {
        return real;
    }

    public void bindView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.database.Cursor arg2) {
        real.bindView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void changeCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.changeCursor(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return real.convertToString(arg0 == null ? null : arg0.unwrap());
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getCursor() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.getCursor());
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getDropDownView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public android.content.res.Resources.Theme getDropDownViewTheme() {
        return real.getDropDownViewTheme();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(real.getFilter());
    }

    public com.micklab.dcg.wrapper.android.widget.FilterQueryProvider getFilterQueryProvider() {
        return com.micklab.dcg.wrapper.android.widget.FilterQueryProvider.wrap(real.getFilterQueryProvider());
    }

    public java.lang.Object getItem(int arg0) {
        return real.getItem(arg0);
    }

    public long getItemId(int arg0) {
        return real.getItemId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public boolean hasStableIds() {
        return real.hasStableIds();
    }

    public com.micklab.dcg.wrapper.android.view.View newDropDownView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newDropDownView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View newView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.newView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.runQueryOnBackgroundThread(arg0));
    }

    public void setDropDownViewTheme(android.content.res.Resources.Theme arg0) {
        real.setDropDownViewTheme(arg0);
    }

    public void setFilterQueryProvider(com.micklab.dcg.wrapper.android.widget.FilterQueryProvider arg0) {
        real.setFilterQueryProvider(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor swapCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.swapCursor(arg0 == null ? null : arg0.unwrap()));
    }

    public static final int FLAG_AUTO_REQUERY = android.widget.CursorAdapter.FLAG_AUTO_REQUERY;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = android.widget.CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER;

}
