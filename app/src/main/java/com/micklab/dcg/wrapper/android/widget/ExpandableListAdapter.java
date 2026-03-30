// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ExpandableListAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExpandableListAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter wrap(android.widget.ExpandableListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ExpandableListAdapter getReal() {
        return (android.widget.ExpandableListAdapter) real;
    }

    public android.widget.ExpandableListAdapter unwrap() {
        return getReal();
    }

    public boolean areAllItemsEnabled() {
        return ((android.widget.ExpandableListAdapter) real).areAllItemsEnabled();
    }

    public java.lang.Object getChild(int arg0, int arg1) {
        return ((android.widget.ExpandableListAdapter) real).getChild(arg0, arg1);
    }

    public long getChildId(int arg0, int arg1) {
        return ((android.widget.ExpandableListAdapter) real).getChildId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View getChildView(int arg0, int arg1, boolean arg2, com.micklab.dcg.wrapper.android.view.View arg3, com.micklab.dcg.wrapper.android.view.ViewGroup arg4) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ExpandableListAdapter) real).getChildView(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal()));
    }

    public int getChildrenCount(int arg0) {
        return ((android.widget.ExpandableListAdapter) real).getChildrenCount(arg0);
    }

    public long getCombinedChildId(long arg0, long arg1) {
        return ((android.widget.ExpandableListAdapter) real).getCombinedChildId(arg0, arg1);
    }

    public long getCombinedGroupId(long arg0) {
        return ((android.widget.ExpandableListAdapter) real).getCombinedGroupId(arg0);
    }

    public java.lang.Object getGroup(int arg0) {
        return ((android.widget.ExpandableListAdapter) real).getGroup(arg0);
    }

    public int getGroupCount() {
        return ((android.widget.ExpandableListAdapter) real).getGroupCount();
    }

    public long getGroupId(int arg0) {
        return ((android.widget.ExpandableListAdapter) real).getGroupId(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getGroupView(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.view.ViewGroup arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ExpandableListAdapter) real).getGroupView(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public boolean hasStableIds() {
        return ((android.widget.ExpandableListAdapter) real).hasStableIds();
    }

    public boolean isChildSelectable(int arg0, int arg1) {
        return ((android.widget.ExpandableListAdapter) real).isChildSelectable(arg0, arg1);
    }

    public boolean isEmpty() {
        return ((android.widget.ExpandableListAdapter) real).isEmpty();
    }

    public void onGroupCollapsed(int arg0) {
        ((android.widget.ExpandableListAdapter) real).onGroupCollapsed(arg0);
    }

    public void onGroupExpanded(int arg0) {
        ((android.widget.ExpandableListAdapter) real).onGroupExpanded(arg0);
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.ExpandableListAdapter) real).registerDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.ExpandableListAdapter) real).unregisterDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

}
