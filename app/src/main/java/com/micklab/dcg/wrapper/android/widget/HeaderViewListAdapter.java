// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class HeaderViewListAdapter {
    private final android.widget.HeaderViewListAdapter real;

    public HeaderViewListAdapter(android.widget.HeaderViewListAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.HeaderViewListAdapter wrap(android.widget.HeaderViewListAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.HeaderViewListAdapter(real);
    }

    public android.widget.HeaderViewListAdapter unwrap() {
        return real;
    }

    public HeaderViewListAdapter(java.util.ArrayList arg0, java.util.ArrayList arg1, com.micklab.dcg.wrapper.android.widget.ListAdapter arg2) {
        this(new android.widget.HeaderViewListAdapter(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public boolean areAllItemsEnabled() {
        return real.areAllItemsEnabled();
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.widget.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.widget.Filter.wrap(real.getFilter());
    }

    public int getFootersCount() {
        return real.getFootersCount();
    }

    public int getHeadersCount() {
        return real.getHeadersCount();
    }

    public java.lang.Object getItem(int arg0) {
        return real.getItem(arg0);
    }

    public long getItemId(int arg0) {
        return real.getItemId(arg0);
    }

    public int getItemViewType(int arg0) {
        return real.getItemViewType(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View getView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public int getViewTypeCount() {
        return real.getViewTypeCount();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getWrappedAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getWrappedAdapter());
    }

    public boolean hasStableIds() {
        return real.hasStableIds();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public boolean isEnabled(int arg0) {
        return real.isEnabled(arg0);
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.registerDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeFooter(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.removeFooter(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeHeader(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.removeHeader(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.unregisterDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

}
