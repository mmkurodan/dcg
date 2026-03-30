// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class BaseAdapter {
    private final android.widget.BaseAdapter real;

    public BaseAdapter(android.widget.BaseAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.BaseAdapter wrap(android.widget.BaseAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.BaseAdapter(real);
    }

    public android.widget.BaseAdapter unwrap() {
        return real;
    }

    public boolean areAllItemsEnabled() {
        return real.areAllItemsEnabled();
    }

    public java.lang.CharSequence[] getAutofillOptions() {
        return real.getAutofillOptions();
    }

    public com.micklab.dcg.wrapper.android.view.View getDropDownView(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getDropDownView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public int getItemViewType(int arg0) {
        return real.getItemViewType(arg0);
    }

    public int getViewTypeCount() {
        return real.getViewTypeCount();
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

    public void notifyDataSetChanged() {
        real.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        real.notifyDataSetInvalidated();
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.registerDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

    public void setAutofillOptions(java.lang.CharSequence... arg0) {
        real.setAutofillOptions(arg0);
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.unregisterDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

}
