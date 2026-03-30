// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ExpandableListActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExpandableListActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ExpandableListActivity wrap(android.app.ExpandableListActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ExpandableListActivity(real, (__DcgwBridgeToken) null);
    }

    public android.app.ExpandableListActivity getReal() {
        return (android.app.ExpandableListActivity) real;
    }

    public android.app.ExpandableListActivity unwrap() {
        return getReal();
    }

    public ExpandableListActivity() {
        this(new android.app.ExpandableListActivity(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter getExpandableListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter.wrap(((android.app.ExpandableListActivity) real).getExpandableListAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ExpandableListView getExpandableListView() {
        return com.micklab.dcg.wrapper.android.widget.ExpandableListView.wrap(((android.app.ExpandableListActivity) real).getExpandableListView());
    }

    public long getSelectedId() {
        return ((android.app.ExpandableListActivity) real).getSelectedId();
    }

    public long getSelectedPosition() {
        return ((android.app.ExpandableListActivity) real).getSelectedPosition();
    }

    public boolean onChildClick(com.micklab.dcg.wrapper.android.widget.ExpandableListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, int arg3, long arg4) {
        return ((android.app.ExpandableListActivity) real).onChildClick(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
    }

    public void onContentChanged() {
        ((android.app.ExpandableListActivity) real).onContentChanged();
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        ((android.app.ExpandableListActivity) real).onCreateContextMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onGroupCollapse(int arg0) {
        ((android.app.ExpandableListActivity) real).onGroupCollapse(arg0);
    }

    public void onGroupExpand(int arg0) {
        ((android.app.ExpandableListActivity) real).onGroupExpand(arg0);
    }

    public void setListAdapter(com.micklab.dcg.wrapper.android.widget.ExpandableListAdapter arg0) {
        ((android.app.ExpandableListActivity) real).setListAdapter(arg0 == null ? null : arg0.getReal());
    }

    public boolean setSelectedChild(int arg0, int arg1, boolean arg2) {
        return ((android.app.ExpandableListActivity) real).setSelectedChild(arg0, arg1, arg2);
    }

    public void setSelectedGroup(int arg0) {
        ((android.app.ExpandableListActivity) real).setSelectedGroup(arg0);
    }

}
