// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ListActivity {
    private final android.app.ListActivity real;

    public ListActivity(android.app.ListActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ListActivity wrap(android.app.ListActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ListActivity(real);
    }

    public android.app.ListActivity unwrap() {
        return real;
    }

    public ListActivity() {
        this(new android.app.ListActivity());
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getListAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(real.getListView());
    }

    public long getSelectedItemId() {
        return real.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return real.getSelectedItemPosition();
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public void setListAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setListAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

}
