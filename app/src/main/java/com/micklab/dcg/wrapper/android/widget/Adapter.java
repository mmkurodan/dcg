// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Adapter {
    private final android.widget.Adapter real;

    public Adapter(android.widget.Adapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Adapter wrap(android.widget.Adapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Adapter(real);
    }

    public android.widget.Adapter unwrap() {
        return real;
    }

    public java.lang.CharSequence[] getAutofillOptions() {
        return real.getAutofillOptions();
    }

    public int getCount() {
        return real.getCount();
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

    public boolean hasStableIds() {
        return real.hasStableIds();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void registerDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.registerDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterDataSetObserver(com.micklab.dcg.wrapper.android.database.DataSetObserver arg0) {
        real.unregisterDataSetObserver(arg0 == null ? null : arg0.unwrap());
    }

    public static final int IGNORE_ITEM_VIEW_TYPE = android.widget.Adapter.IGNORE_ITEM_VIEW_TYPE;
    public static final int NO_SELECTION = android.widget.Adapter.NO_SELECTION;

}
