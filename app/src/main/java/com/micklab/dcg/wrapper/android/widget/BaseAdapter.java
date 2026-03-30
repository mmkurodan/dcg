// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class BaseAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.BaseAdapter wrap(android.widget.BaseAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.BaseAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.widget.BaseAdapter getReal() {
        return (android.widget.BaseAdapter) real;
    }

    public android.widget.BaseAdapter unwrap() {
        return getReal();
    }

    public boolean areAllItemsEnabled() {
        return ((android.widget.BaseAdapter) real).areAllItemsEnabled();
    }

    public java.lang.CharSequence[] getAutofillOptions() {
        return ((android.widget.BaseAdapter) real).getAutofillOptions();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.BaseAdapter) real).getDropDownView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public int getItemViewType(int arg0) {
        return ((android.widget.BaseAdapter) real).getItemViewType(arg0);
    }

    public int getViewTypeCount() {
        return ((android.widget.BaseAdapter) real).getViewTypeCount();
    }

    public boolean hasStableIds() {
        return ((android.widget.BaseAdapter) real).hasStableIds();
    }

    public boolean isEmpty() {
        return ((android.widget.BaseAdapter) real).isEmpty();
    }

    public boolean isEnabled(int arg0) {
        return ((android.widget.BaseAdapter) real).isEnabled(arg0);
    }

    public void notifyDataSetChanged() {
        ((android.widget.BaseAdapter) real).notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        ((android.widget.BaseAdapter) real).notifyDataSetInvalidated();
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.BaseAdapter) real).registerDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

    public void setAutofillOptions(java.lang.CharSequence... arg0) {
        ((android.widget.BaseAdapter) real).setAutofillOptions(arg0);
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        ((android.widget.BaseAdapter) real).unregisterDataSetObserver(arg0 == null ? null : arg0.getReal());
    }

}
