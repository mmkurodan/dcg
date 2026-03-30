// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ListFragment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListFragment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ListFragment wrap(android.app.ListFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ListFragment(real, (__DcgwBridgeToken) null);
    }

    public android.app.ListFragment getReal() {
        return (android.app.ListFragment) real;
    }

    public android.app.ListFragment unwrap() {
        return getReal();
    }

    public ListFragment() {
        this(new android.app.ListFragment(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getListAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.app.ListFragment) real).getListAdapter());
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(((android.app.ListFragment) real).getListView());
    }

    public long getSelectedItemId() {
        return ((android.app.ListFragment) real).getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return ((android.app.ListFragment) real).getSelectedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.ListFragment) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void onDestroyView() {
        ((android.app.ListFragment) real).onDestroyView();
    }

    public void onListItemClick(com.micklab.dcg.wrapper.android.widget.ListView arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2, long arg3) {
        ((android.app.ListFragment) real).onListItemClick(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void onViewCreated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.ListFragment) real).onViewCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setEmptyText(java.lang.CharSequence arg0) {
        ((android.app.ListFragment) real).setEmptyText(arg0);
    }

    public void setListAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.app.ListFragment) real).setListAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setListShown(boolean arg0) {
        ((android.app.ListFragment) real).setListShown(arg0);
    }

    public void setListShownNoAnimation(boolean arg0) {
        ((android.app.ListFragment) real).setListShownNoAnimation(arg0);
    }

    public void setSelection(int arg0) {
        ((android.app.ListFragment) real).setSelection(arg0);
    }

}
