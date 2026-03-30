// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class HeaderViewListAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HeaderViewListAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.HeaderViewListAdapter wrap(android.widget.HeaderViewListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.HeaderViewListAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.HeaderViewListAdapter getReal() {
        return (android.widget.HeaderViewListAdapter) real;
    }

    public android.widget.HeaderViewListAdapter unwrap() {
        return getReal();
    }

    public HeaderViewListAdapter(java.util.ArrayList arg0, java.util.ArrayList arg1, com.micklab.dcg.wrapper.android.widget.ListAdapter arg2) {
        this(new android.widget.HeaderViewListAdapter(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean areAllItemsEnabled() {
        return ((android.widget.HeaderViewListAdapter) real).areAllItemsEnabled();
    }

    public int getCount() {
        return ((android.widget.HeaderViewListAdapter) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(((android.widget.HeaderViewListAdapter) real).getFilter());
    }

    public int getFootersCount() {
        return ((android.widget.HeaderViewListAdapter) real).getFootersCount();
    }

    public int getHeadersCount() {
        return ((android.widget.HeaderViewListAdapter) real).getHeadersCount();
    }

    public java.lang.Object getItem(int arg0) {
        return ((android.widget.HeaderViewListAdapter) real).getItem(arg0);
    }

    public long getItemId(int arg0) {
        return ((android.widget.HeaderViewListAdapter) real).getItemId(arg0);
    }

    public int getItemViewType(int arg0) {
        return ((android.widget.HeaderViewListAdapter) real).getItemViewType(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.HeaderViewListAdapter) real).getView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public int getViewTypeCount() {
        return ((android.widget.HeaderViewListAdapter) real).getViewTypeCount();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getWrappedAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.widget.HeaderViewListAdapter) real).getWrappedAdapter());
    }

    public boolean hasStableIds() {
        return ((android.widget.HeaderViewListAdapter) real).hasStableIds();
    }

    public boolean isEmpty() {
        return ((android.widget.HeaderViewListAdapter) real).isEmpty();
    }

    public boolean isEnabled(int arg0) {
        return ((android.widget.HeaderViewListAdapter) real).isEnabled(arg0);
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.HeaderViewListAdapter) real).registerDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeFooter(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.HeaderViewListAdapter) real).removeFooter(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeHeader(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.HeaderViewListAdapter) real).removeHeader(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.HeaderViewListAdapter) real).unregisterDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

}
