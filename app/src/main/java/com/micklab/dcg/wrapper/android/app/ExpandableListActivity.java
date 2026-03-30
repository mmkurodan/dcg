// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ExpandableListActivity {
    private final android.app.ExpandableListActivity real;

    public ExpandableListActivity(android.app.ExpandableListActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ExpandableListActivity wrap(android.app.ExpandableListActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ExpandableListActivity(real);
    }

    public android.app.ExpandableListActivity unwrap() {
        return real;
    }

    public ExpandableListActivity() {
        this(new android.app.ExpandableListActivity());
    }

    public com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter getExpandableListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter.wrap(real.getExpandableListAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ExpandableListView getExpandableListView() {
        return com.micklab.dcg.wrapper.android.widget.ExpandableListView.wrap(real.getExpandableListView());
    }

    public long getSelectedId() {
        return real.getSelectedId();
    }

    public long getSelectedPosition() {
        return real.getSelectedPosition();
    }

    public boolean onChildClick(com.micklab.dcg.wrapper.android.widget.ExpandableListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, int arg3, long arg4) {
        return real.onChildClick(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        real.onCreateContextMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onGroupCollapse(int arg0) {
        real.onGroupCollapse(arg0);
    }

    public void onGroupExpand(int arg0) {
        real.onGroupExpand(arg0);
    }

    public void setListAdapter(com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter arg0) {
        real.setListAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setSelectedChild(int arg0, int arg1, boolean arg2) {
        return real.setSelectedChild(arg0, arg1, arg2);
    }

    public void setSelectedGroup(int arg0) {
        real.setSelectedGroup(arg0);
    }

}
