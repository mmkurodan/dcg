// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ListActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ListActivity wrap(android.app.ListActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ListActivity(real, (__DcgwBridgeToken) null);
    }

    public android.app.ListActivity getReal() {
        return (android.app.ListActivity) real;
    }

    public android.app.ListActivity unwrap() {
        return getReal();
    }

    public ListActivity() {
        this(new android.app.ListActivity(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.app.ListActivity) real).getListAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(((android.app.ListActivity) real).getListView());
    }

    public long getSelectedItemId() {
        return ((android.app.ListActivity) real).getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return ((android.app.ListActivity) real).getSelectedItemPosition();
    }

    public void onContentChanged() {
        ((android.app.ListActivity) real).onContentChanged();
    }

    public void setListAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.app.ListActivity) real).setListAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.app.ListActivity) real).setSelection(arg0);
    }

}
