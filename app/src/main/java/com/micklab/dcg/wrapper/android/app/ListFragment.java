// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ListFragment {
    private final android.app.ListFragment real;

    public ListFragment(android.app.ListFragment real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ListFragment wrap(android.app.ListFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ListFragment(real);
    }

    public android.app.ListFragment unwrap() {
        return real;
    }

    public ListFragment() {
        this(new android.app.ListFragment());
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

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void onDestroyView() {
        real.onDestroyView();
    }

    public void onListItemClick(com.micklab.dcg.wrapper.android.widget.ListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, long arg3) {
        real.onListItemClick(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void onViewCreated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onViewCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setEmptyText(java.lang.CharSequence arg0) {
        real.setEmptyText(arg0);
    }

    public void setListAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setListAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setListShown(boolean arg0) {
        real.setListShown(arg0);
    }

    public void setListShownNoAnimation(boolean arg0) {
        real.setListShownNoAnimation(arg0);
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

}
