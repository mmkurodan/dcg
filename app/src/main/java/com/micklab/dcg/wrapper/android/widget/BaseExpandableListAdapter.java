// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class BaseExpandableListAdapter {
    private final android.widget.BaseExpandableListAdapter real;

    public BaseExpandableListAdapter(android.widget.BaseExpandableListAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.BaseExpandableListAdapter wrap(android.widget.BaseExpandableListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.BaseExpandableListAdapter(real);
    }

    public android.widget.BaseExpandableListAdapter unwrap() {
        return real;
    }

    public boolean areAllItemsEnabled() {
        return real.areAllItemsEnabled();
    }

    public int getChildType(int arg0, int arg1) {
        return real.getChildType(arg0, arg1);
    }

    public int getChildTypeCount() {
        return real.getChildTypeCount();
    }

    public long getCombinedChildId(long arg0, long arg1) {
        return real.getCombinedChildId(arg0, arg1);
    }

    public long getCombinedGroupId(long arg0) {
        return real.getCombinedGroupId(arg0);
    }

    public int getGroupType(int arg0) {
        return real.getGroupType(arg0);
    }

    public int getGroupTypeCount() {
        return real.getGroupTypeCount();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void notifyDataSetChanged() {
        real.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        real.notifyDataSetInvalidated();
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
