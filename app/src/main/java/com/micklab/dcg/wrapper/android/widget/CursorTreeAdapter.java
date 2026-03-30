// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CursorTreeAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorTreeAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CursorTreeAdapter wrap(android.widget.CursorTreeAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CursorTreeAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.CursorTreeAdapter getReal() {
        return (android.widget.CursorTreeAdapter) real;
    }

    public android.widget.CursorTreeAdapter unwrap() {
        return getReal();
    }

    public void changeCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.widget.CursorTreeAdapter) real).changeCursor(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String convertToString(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        return ((android.widget.CursorTreeAdapter) real).convertToString(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getChild(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorTreeAdapter) real).getChild(arg0, arg1));
    }

    public long getChildId(int arg0, int arg1) {
        return ((android.widget.CursorTreeAdapter) real).getChildId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View getChildView(int arg0, int arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.View arg3, com.micklab.dcg.wrapper.android.view.ViewGroup arg4) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.CursorTreeAdapter) real).getChildView(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()));
    }

    public int getChildrenCount(int arg0) {
        return ((android.widget.CursorTreeAdapter) real).getChildrenCount(arg0);
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getCursor() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorTreeAdapter) real).getCursor());
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(((android.widget.CursorTreeAdapter) real).getFilter());
    }

    public com.micklab.dcg.wrapper.android.widget.FilterQueryProvider getFilterQueryProvider() {
        return com.micklab.dcg.wrapper.android.widget.FilterQueryProvider.wrap(((android.widget.CursorTreeAdapter) real).getFilterQueryProvider());
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getGroup(int arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorTreeAdapter) real).getGroup(arg0));
    }

    public int getGroupCount() {
        return ((android.widget.CursorTreeAdapter) real).getGroupCount();
    }

    public long getGroupId(int arg0) {
        return ((android.widget.CursorTreeAdapter) real).getGroupId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getGroupView(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.CursorTreeAdapter) real).getGroupView(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public boolean hasStableIds() {
        return ((android.widget.CursorTreeAdapter) real).hasStableIds();
    }

    public boolean isChildSelectable(int arg0, int arg1) {
        return ((android.widget.CursorTreeAdapter) real).isChildSelectable(arg0, arg1);
    }

    public void notifyDataSetChanged() {
        ((android.widget.CursorTreeAdapter) real).notifyDataSetChanged();
    }

    public void notifyDataSetChanged(boolean arg0) {
        ((android.widget.CursorTreeAdapter) real).notifyDataSetChanged(arg0);
    }

    public void notifyDataSetInvalidated() {
        ((android.widget.CursorTreeAdapter) real).notifyDataSetInvalidated();
    }

    public void onGroupCollapsed(int arg0) {
        ((android.widget.CursorTreeAdapter) real).onGroupCollapsed(arg0);
    }

    public com.micklab.dcg.wrapper.android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.widget.CursorTreeAdapter) real).runQueryOnBackgroundThread(arg0));
    }

    public void setChildrenCursor(int arg0, com.micklab.dcg.wrapper.android.database.Cursor arg1) {
        ((android.widget.CursorTreeAdapter) real).setChildrenCursor(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFilterQueryProvider(com.micklab.dcg.wrapper.android.widget.FilterQueryProvider arg0) {
        ((android.widget.CursorTreeAdapter) real).setFilterQueryProvider(arg0 == null ? null : arg0.getReal());
    }

    public void setGroupCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.widget.CursorTreeAdapter) real).setGroupCursor(arg0 == null ? null : arg0.getReal());
    }

}
