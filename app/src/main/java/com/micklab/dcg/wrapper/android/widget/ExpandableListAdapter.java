// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ExpandableListAdapter {
    private final android.widget.ExpandableListAdapter real;

    public ExpandableListAdapter(android.widget.ExpandableListAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter wrap(android.widget.ExpandableListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter(real);
    }

    public android.widget.ExpandableListAdapter unwrap() {
        return real;
    }

    public boolean areAllItemsEnabled() {
        return real.areAllItemsEnabled();
    }

    public java.lang.Object getChild(int arg0, int arg1) {
        return real.getChild(arg0, arg1);
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

    public long getCombinedChildId(long arg0, long arg1) {
        return real.getCombinedChildId(arg0, arg1);
    }

    public long getCombinedGroupId(long arg0) {
        return real.getCombinedGroupId(arg0);
    }

    public java.lang.Object getGroup(int arg0) {
        return real.getGroup(arg0);
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

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void onGroupCollapsed(int arg0) {
        real.onGroupCollapsed(arg0);
    }

    public void onGroupExpanded(int arg0) {
        real.onGroupExpanded(arg0);
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.registerDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.unregisterDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

}
