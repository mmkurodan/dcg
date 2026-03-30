// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CursorTreeAdapter {
    private final android.widget.CursorTreeAdapter real;

    public CursorTreeAdapter(android.widget.CursorTreeAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CursorTreeAdapter wrap(android.widget.CursorTreeAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CursorTreeAdapter(real);
    }

    public android.widget.CursorTreeAdapter unwrap() {
        return real;
    }

    public void changeCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.changeCursor(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return real.convertToString(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getChild(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.getChild(arg0, arg1));
    }

    public long getChildId(int arg0, int arg1) {
        return real.getChildId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View getChildView(int arg0, int arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.View arg3, com.micklab.dcg.wrapper.android.view.ViewGroup arg4) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getChildView(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
    }

    public int getChildrenCount(int arg0) {
        return real.getChildrenCount(arg0);
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getCursor() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.getCursor());
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(real.getFilter());
    }

    public com.micklab.dcg.wrapper.android.widget.FilterQueryProvider getFilterQueryProvider() {
        return com.micklab.dcg.wrapper.android.widget.FilterQueryProvider.wrap(real.getFilterQueryProvider());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getGroup(int arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.getGroup(arg0));
    }

    public int getGroupCount() {
        return real.getGroupCount();
    }

    public long getGroupId(int arg0) {
        return real.getGroupId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getGroupView(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getGroupView(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public boolean hasStableIds() {
        return real.hasStableIds();
    }

    public boolean isChildSelectable(int arg0, int arg1) {
        return real.isChildSelectable(arg0, arg1);
    }

    public void notifyDataSetChanged() {
        real.notifyDataSetChanged();
    }

    public void notifyDataSetChanged(boolean arg0) {
        real.notifyDataSetChanged(arg0);
    }

    public void notifyDataSetInvalidated() {
        real.notifyDataSetInvalidated();
    }

    public void onGroupCollapsed(int arg0) {
        real.onGroupCollapsed(arg0);
    }

    public com.micklab.dcg.wrapper.android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.runQueryOnBackgroundThread(arg0));
    }

    public void setChildrenCursor(int arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1) {
        real.setChildrenCursor(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setFilterQueryProvider(com.micklab.dcg.wrapper.android.widget.FilterQueryProvider arg0) {
        real.setFilterQueryProvider(arg0 == null ? null : arg0.unwrap());
    }

    public void setGroupCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.setGroupCursor(arg0 == null ? null : arg0.unwrap());
    }

}
