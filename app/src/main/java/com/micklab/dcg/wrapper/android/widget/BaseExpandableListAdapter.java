// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class BaseExpandableListAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseExpandableListAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.BaseExpandableListAdapter wrap(android.widget.BaseExpandableListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.BaseExpandableListAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.BaseExpandableListAdapter getReal() {
        return (android.widget.BaseExpandableListAdapter) real;
    }

    public android.widget.BaseExpandableListAdapter unwrap() {
        return getReal();
    }

    public boolean areAllItemsEnabled() {
        return ((android.widget.BaseExpandableListAdapter) real).areAllItemsEnabled();
    }

    public int getChildType(int arg0, int arg1) {
        return ((android.widget.BaseExpandableListAdapter) real).getChildType(arg0, arg1);
    }

    public int getChildTypeCount() {
        return ((android.widget.BaseExpandableListAdapter) real).getChildTypeCount();
    }

    public long getCombinedChildId(long arg0, long arg1) {
        return ((android.widget.BaseExpandableListAdapter) real).getCombinedChildId(arg0, arg1);
    }

    public long getCombinedGroupId(long arg0) {
        return ((android.widget.BaseExpandableListAdapter) real).getCombinedGroupId(arg0);
    }

    public int getGroupType(int arg0) {
        return ((android.widget.BaseExpandableListAdapter) real).getGroupType(arg0);
    }

    public int getGroupTypeCount() {
        return ((android.widget.BaseExpandableListAdapter) real).getGroupTypeCount();
    }

    public boolean isEmpty() {
        return ((android.widget.BaseExpandableListAdapter) real).isEmpty();
    }

    public void notifyDataSetChanged() {
        ((android.widget.BaseExpandableListAdapter) real).notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        ((android.widget.BaseExpandableListAdapter) real).notifyDataSetInvalidated();
    }

    public void onGroupCollapsed(int arg0) {
        ((android.widget.BaseExpandableListAdapter) real).onGroupCollapsed(arg0);
    }

    public void onGroupExpanded(int arg0) {
        ((android.widget.BaseExpandableListAdapter) real).onGroupExpanded(arg0);
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.BaseExpandableListAdapter) real).registerDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.BaseExpandableListAdapter) real).unregisterDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

}
